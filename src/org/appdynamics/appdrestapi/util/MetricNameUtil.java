/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.util;

import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author gilbert.solorzano
 * 
 * The key for this function is to find the name of the metric and be able to 
 * return the proper name, title or identification for the 
 */
public class MetricNameUtil {
    private static final String INDIV_NODES="Individual Nodes";

    
    
    
    private static String[] parse(String metricPath){
        
        if(metricPath != null){
            return metricPath.split("|");
        }
        return null;
    }
    
    
    
    public static String getMetricName(String metricPath){
        
        String[] nameParts = parse(metricPath);
        
        if( nameParts == null) return "Default Name";
        
        boolean node=false;
        
        if(metricPath.contains(s.INDIVIDUAL_NODES)) node=true;

        
        // The problem, how can we determine which is the tier name because it will be hidden or will it?
        if(metricPath.startsWith(s.APPLICATION_INFRA_PERF) ){ 
            if(node) return nameParts[3];
            return nameParts[1];
        }
        if(metricPath.startsWith(s.BUSINESS_TRANSACTIONS)) return nameParts[3];
        if(metricPath.startsWith(s.EUM_USER_EXPERIENCE))  return nameParts[2];
        if(metricPath.startsWith(s.OVERALL_APPLICATION_PERF)){ if(nameParts.length == 3 ) return nameParts[1]; return nameParts[0];}
        // Need to add errors and informataion points

        
        return null;
    }
    
}
