/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.util;


import org.appdynamics.appdrestapi.data.MetricDatas;
import org.appdynamics.appdrestapi.data.MetricData;
import org.appdynamics.appdrestapi.data.MetricValue;
import org.appdynamics.appdrestapi.data.MetricValues;

/**
 *
 * @author soloink
 * 
 * The purpose of this class it return true or false if the node was available
 * within a specific time frame.
 */
public class NodeAvailable {
    
    /*
     *  This is going to return the 
     */
    public boolean nodeAvailable(MetricDatas md){
        if(md.getMetric_data().size() > 0){
            MetricData mData=md.getMetric_data().get(0);
            if(mData.getMetricValues().size() > 0){
                MetricValues mValues = mData.getMetricValues().get(0);
                for(MetricValue val:mValues.getMetricValue()){
                    if(val.getValue() > 0) return true;
                }
            }
            
        }
        
        return false;
    }
    
    public boolean nodeAvailable(MetricDatas md, long start, long end){
        if(md.getMetric_data().size() > 0){
            MetricData mData=md.getMetric_data().get(0);
            if(mData.getMetricValues().size() > 0){
                MetricValues mValues = mData.getMetricValues().get(0);
                for(MetricValue val:mValues.getMetricValue()){
                    if(val.getValue() > 0 && val.getStartTimeInMillis() <=end 
                            && val.getStartTimeInMillis() >= start) return true;
                }
            }
            
        }
        
        return false;
    }
}
