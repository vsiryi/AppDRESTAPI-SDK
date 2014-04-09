/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.performance;

import org.appdynamics.appdrestapi.data.Node;
import org.appdynamics.appdrestapi.util.TimeRange;
import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 * Overall Application Performance|activemq-instance-mytrees|Average Response Time (ms)
    Overall Application Performance|activemq-instance-mytrees|Calls per Minute
    Overall Application Performance|activemq-instance-mytrees|Error Page Redirects per Minute
    Overall Application Performance|activemq-instance-mytrees|Errors per Minute
    Overall Application Performance|activemq-instance-mytrees|Exceptions per Minute
    Overall Application Performance|activemq-instance-mytrees|HTTP Error Codes per Minute
    Overall Application Performance|activemq-instance-mytrees|Infrastructure Errors per Minute
    Overall Application Performance|activemq-instance-mytrees|Number of Slow Calls
    Overall Application Performance|activemq-instance-mytrees|Number of Very Slow Calls
    Overall Application Performance|activemq-instance-mytrees|Stall Count
 */
public class OAPNodePerformance {
    private ArrayList<NodePerformanceRange> nodePerfRange=new ArrayList<NodePerformanceRange>();
    private Node node;
    
    protected TimeRange totalTimeRange;
    
    
    public OAPNodePerformance(){}
    
    public OAPNodePerformance(Node node){this.node=node;}
    

    public ArrayList<NodePerformanceRange> getNodePerfRange() {
        return nodePerfRange;
    }

    public void setNodePerfRange(ArrayList<NodePerformanceRange> nodePerfRange) {
        this.nodePerfRange = nodePerfRange;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }


    public TimeRange getTotalTimeRange() {
        return totalTimeRange;
    }

    public void setTotalTimeRange(TimeRange totalTimeRange) {
        this.totalTimeRange = totalTimeRange;
    }
    
    
    
}
