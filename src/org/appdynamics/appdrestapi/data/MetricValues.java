/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;


import org.appdynamics.appdrestapi.resources.s;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
/**
 *
 * @author soloink
 * 
 * <metricPath>Application Infrastructure Performance|activemq-instance-mytrees|JVM|Memory|Heap|Committed (MB)</metricPath>
  <frequency>ONE_MIN</frequency>
  <metricValues>
    <metric-value>
 * 
 */
@XmlSeeAlso(MetricValue.class)
public class MetricValues {
    private ArrayList<MetricValue> metricValue=new ArrayList<MetricValue>();
    
    public MetricValues(){}

    @XmlElement(name=s.METRIC_VALUE)
    public ArrayList<MetricValue> getMetricValue() {
        return metricValue;
    }

    public void setMetricValues(ArrayList<MetricValue> metricValue) {
        this.metricValue = metricValue;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append("\t\tMetric Value Size : ").append(metricValue.size()).append("\n");
        for(MetricValue val : metricValue) bud.append(val.toString());
        return bud.toString();
    }
    
}
