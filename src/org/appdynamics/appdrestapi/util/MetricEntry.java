/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.util;

import org.appdynamics.appdrestapi.data.MetricValue;

import java.util.ArrayList;


/**
 *
 * @author gilbert.solorzano
 * This is going to contain a name so that we can get the name of the metric.
 */
public class MetricEntry {
    private String name;
    private ArrayList<MetricValue> metrics=new ArrayList<MetricValue>();
    
    public MetricEntry(){}
    
    public MetricEntry(String name){this.name=name;}
    
    public MetricEntry(String name, ArrayList<MetricValue> metrics){
        this.name=name;
        this.metrics=metrics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<MetricValue> getMetrics() {
        return metrics;
    }

    public void setMetrics(ArrayList<MetricValue> metrics) {
        this.metrics = metrics;
    }
    
}
