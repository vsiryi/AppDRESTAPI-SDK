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
 */
@XmlRootElement(name=s.METRIC_DATAS)
@XmlSeeAlso({MetricData.class,MetricValues.class,MetricValue.class})
public class MetricDatas {
    private ArrayList<MetricData> metric_data=new ArrayList<MetricData>();

    @XmlElement(name=s.METRIC_DATA)
    public ArrayList<MetricData> getMetric_data() {
        return metric_data;
    }

    public void setMetric_data(ArrayList<MetricData> metric_data) {
        this.metric_data = metric_data;
    }
    
    
    public MetricValue getSingleRollUpMetricValue(){
        if(metric_data.size() > 0 && metric_data.get(0) != null 
                && metric_data.get(0).getMetricValues().size() > 0 
                && metric_data.get(0).getMetricValues().get(0).getMetricValue().size() > 0){
            return metric_data.get(0).getMetricValues().get(0).getMetricValue().get(0);
        }
        return null;
    }
    
    public ArrayList<MetricValue> getSingleMetricValues(){
        if(metric_data.size() > 0 && metric_data.get(0) != null 
                && metric_data.get(0).getMetricValues().size() > 0 
                && metric_data.get(0).getMetricValues().get(0).getMetricValue().size() > 0){
            return metric_data.get(0).getMetricValues().get(0).getMetricValue();
        }
        return null;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        for(MetricData data: metric_data) bud.append("\nMetric Datas --\n").append(data.toString());
        return bud.toString();
    }
}
