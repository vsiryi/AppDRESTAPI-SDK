/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;


import org.appdynamics.appdrestapi.resources.s;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 *
 * @author soloink
 */
public class MetricValue {
    
    private long current;
    private long max;
    private long min;
    private long startTimeInMillis;
    private long value;

    public MetricValue(){}
    
    @XmlElement(name=s.CURRENT)
    public long getCurrent() {
        return current;
    }

    public void setCurrent(long current) {
        this.current = current;
    }

    @XmlElement(name=s.MAX)
    public long getMax() {
        return max;
    }

    public void setMax(long max) {
        this.max = max;
    }

    @XmlElement(name=s.MIN)
    public long getMin() {
        return min;
    }

    public void setMin(long min) {
        this.min = min;
    }

    @XmlElement(name=s.START_TIME_IN_MILLIS)
    public long getStartTimeInMillis() {
        return startTimeInMillis;
    }

    public void setStartTimeInMillis(long startTimeInMillis) {
        this.startTimeInMillis = startTimeInMillis;
    }

    @XmlElement(name=s.VALUE)
    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append("\tCurrent ::").append(current).append("\n");
        bud.append("\tValue :: ").append(value).append("\n");
        bud.append("\tMin :: ").append(min).append("\n");
        bud.append("\tMax :: ").append(max).append("\n");
        bud.append("\tTimestamp :: ").append(startTimeInMillis).append("\n");
        bud.append("\tDateTime :: ").append(new java.util.Date(startTimeInMillis).toString()).append("\n");
        bud.append("\t ------------------------- End ------------------------------\n");
        
        
        return bud.toString();
    }
    
    
}
