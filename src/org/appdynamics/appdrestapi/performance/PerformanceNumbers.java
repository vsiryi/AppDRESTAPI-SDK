/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.performance;

import org.appdynamics.appdrestapi.data.Applications;
import org.appdynamics.appdrestapi.data.Application;
import org.appdynamics.appdrestapi.RESTAccess;
import org.appdynamics.appdrestapi.resources.s;
import org.appdynamics.appdrestapi.util.TimeRangeHelper;

import java.util.logging.Logger;
import java.util.logging.Level;
/**
 *
 * @author gilbert.solorzano
 */
public class PerformanceNumbers {
    private static Logger logger=Logger.getLogger(PerformanceNumbers.class.getName());
    
    public static void main(String[] args){
        //String controller="appdyn02";
        String controller="ics.saas.appdynamics.com";
        boolean useSSL=true;
        String port="443";
        String tier="activemq-instance-mytrees";
        String node="hixj-activemq-instance-mytrees";
        String app="FamilySearch-production";
        String account="ics";
        
        //String user="soloink";
        String user="gsolorzano";
        user="tam";
        account="familysearch";
        controller="familysearch.saas.appdynamics.com";
        //String passwd="fival1to2";
        String passwd="FFival1to2";
        
        /*
         *  Options:
         *  controller |required
         *  controller port | required
         *  user |required
         *  passwd | required
         *  account | required
         *  useSSL | required
         *  --- with this we can start the conversation.
         *  interval
         *  debug
         *  
         * 
         */
        
        int interval=7;
        s.debugLevel=1;
        RESTAccess access = new RESTAccess(controller,port,useSSL,user,passwd,account);
        // This grabs all of the apps.
        Applications apps=access.getApplications();
        OAPCustomerPerformance customer=new OAPCustomerPerformance(account);
        customer.setTotalTimeRange(TimeRangeHelper.getTimeRange(interval));
        
        for(Application application:apps.getApplications()){
            OAPAppPerformance oapApp = new OAPAppPerformance(application.getName(),application.getId());
            oapApp.setTotalTimeRange(customer.getTotalTimeRange());          
            customer.getOapApps().add(oapApp);
        }
        
        
        
        
    }
}
