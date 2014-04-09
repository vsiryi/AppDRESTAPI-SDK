/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.performance;

import org.appdynamics.appdrestapi.RESTAccess;
import org.appdynamics.appdrestapi.data.Node;
import org.appdynamics.appdrestapi.util.TimeRange;
import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 */
public class OAPCustomerPerformance extends OAPTierPerformance{
    private ArrayList<CustomerPerformanceRange> cusRange=new ArrayList<CustomerPerformanceRange>();
    private ArrayList<OAPAppPerformance> oapApps=new ArrayList<OAPAppPerformance>();
    
    public OAPCustomerPerformance(){super();}
    
    public OAPCustomerPerformance(String name){super(name);}

    public ArrayList<CustomerPerformanceRange> getCusRange() {
        return cusRange;
    }

    public void setCusRange(ArrayList<CustomerPerformanceRange> cusRange) {
        this.cusRange = cusRange;
    }

    public ArrayList<OAPAppPerformance> getOapApps() {
        return oapApps;
    }

    public void setOapApps(ArrayList<OAPAppPerformance> oapApps) {
        this.oapApps = oapApps;
    }
    
    public void populatePerfMetrics(ArrayList<TimeRange> timeRanges, RESTAccess access ){
        for(OAPAppPerformance oapApp:oapApps){
            oapApp.populatePerfMetrics(timeRanges, access);
        }
        
    }
    
}
