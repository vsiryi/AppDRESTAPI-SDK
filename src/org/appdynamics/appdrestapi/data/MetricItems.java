/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.AppExportS;
import org.appdynamics.appdrestapi.resources.s;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
/**
 *
 * @author gilbert.solorzano
 */
@XmlRootElement(name=s.METRIC_ITEMS)
public class MetricItems {
    ArrayList<MetricItem> metricItems=new ArrayList<MetricItem>();
    
    public MetricItems(){}

    @XmlElement(name=s.METRIC_ITEM)
    public ArrayList<MetricItem> getMetricItems() {
        return metricItems;
    }

    public void setMetricItems(ArrayList<MetricItem> metricItems) {
        this.metricItems = metricItems;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(s.METRIC_ITEMS);
        for(MetricItem mi: metricItems) bud.append(mi.toString());
        return bud.toString();
    }
}
