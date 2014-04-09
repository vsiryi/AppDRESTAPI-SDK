/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.performance;

import org.appdynamics.appdrestapi.data.Node;
import org.appdynamics.appdrestapi.data.MetricDatas;
import org.appdynamics.appdrestapi.data.MetricValue;
import org.appdynamics.appdrestapi.util.TimeRange;
import java.util.ArrayList;
import org.appdynamics.appdrestapi.RESTAccess;
/**
 *
 * @author gilbert.solorzano
 */
public class OAPTierPerformance extends OAPNodePerformance{
    
    private ArrayList<TierPerformanceRange> tierPerfRange=new ArrayList<TierPerformanceRange>();
    private ArrayList<OAPNodePerformance> oapNodePerf=new ArrayList<OAPNodePerformance>();
    protected String name;
    protected int id;
    
    public OAPTierPerformance(){super();}
    
    public OAPTierPerformance(String name){super();this.name=name;}
    
    public OAPTierPerformance(String name, int id){super();this.name=name;this.id=id;}

    public ArrayList<TierPerformanceRange> getTierPerfRange() {
        return tierPerfRange;
    }

    public void setTierPerfRange(ArrayList<TierPerformanceRange> tierPerfRange) {
        this.tierPerfRange = tierPerfRange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<OAPNodePerformance> getOapNodePerf() {
        return oapNodePerf;
    }

    public void setOapNodePerf(ArrayList<OAPNodePerformance> oapNodePerf) {
        this.oapNodePerf = oapNodePerf;
    }
    
    /*
     *      case 38 : query=mq.queryOAPNodeStallCount(tier,node, start, end); 
	    case 39 : query=mq.queryOAPNodeNumberOfVerySlowCalls(tier,node, start, end);
	    case 40 : query=mq.queryOAPNodeNumberOfSlowCalls(tier,node, start, end); 
	    case 41 : query=mq.queryOAPNodeInfrastructureErrorsPerMinute(tier,node, start, end); 
	    case 42 : query=mq.queryOAPNodeHttpErrorCodesPerMinute(tier,node, start, end); 
	    case 43 : query=mq.queryOAPNodeExceptionsPerMinute(tier,node, start, end); 
	    case 44 : query=mq.queryOAPNodeErrorsPerMinute(tier,node, start, end); 
	    case 45 : query=mq.queryOAPNodeErrorPageRedirectsPerMinute(tier,node, start, end); 
	    case 46 : query=mq.queryOAPNodeCallsPerMinute(tier,node, start, end);
	    case 47 : query=mq.queryOAPNodeAvgResponseTimeMS(tier,node, start, end);
     * 
     */
    public void populatePerfMetrics(ArrayList<TimeRange> timeRanges, RESTAccess access, String app ){
        for(OAPNodePerformance node:oapNodePerf){
            for(TimeRange tRange: timeRanges){
                NodePerformanceRange nodeRange = new NodePerformanceRange(tRange);
                nodeRange.createName();
                node.getNodePerfRange().add(nodeRange);
            }
            
            
            ArrayList<MetricValue> stallCount = 
                    getMetricValues(access.getRESTMetricQuery(38, app, name, node.getNode().getName(), totalTimeRange.getStart(), totalTimeRange.getEnd()));

            ArrayList<MetricValue> numberOfVerySlowCalls = 
                    getMetricValues(access.getRESTMetricQuery(39, app, name, node.getNode().getName(), totalTimeRange.getStart(), totalTimeRange.getEnd()));

            ArrayList<MetricValue> numberOfSlowCalls = 
                    getMetricValues(access.getRESTMetricQuery(40, app, name, node.getNode().getName(), totalTimeRange.getStart(), totalTimeRange.getEnd()));

            ArrayList<MetricValue> infraErrorsPerMinute = 
                    getMetricValues(access.getRESTMetricQuery(41, app, name, node.getNode().getName(), totalTimeRange.getStart(), totalTimeRange.getEnd()));

            ArrayList<MetricValue> httpErrorCodesPerMinute = 
                    getMetricValues(access.getRESTMetricQuery(42, app, name, node.getNode().getName(), totalTimeRange.getStart(), totalTimeRange.getEnd()));

            ArrayList<MetricValue> exceptionsPerMinute = 
                    getMetricValues(access.getRESTMetricQuery(43, app, name, node.getNode().getName(), totalTimeRange.getStart(), totalTimeRange.getEnd()));

            ArrayList<MetricValue> errorsPerMinute = 
                    getMetricValues(access.getRESTMetricQuery(44, app, name, node.getNode().getName(), totalTimeRange.getStart(), totalTimeRange.getEnd()));

            ArrayList<MetricValue> errorPageRedirectPerMinute = 
                    getMetricValues(access.getRESTMetricQuery(45, app, name, node.getNode().getName(), totalTimeRange.getStart(), totalTimeRange.getEnd()));

            ArrayList<MetricValue> callsPerMinute = 
                    getMetricValues(access.getRESTMetricQuery(46, app, name, node.getNode().getName(), totalTimeRange.getStart(), totalTimeRange.getEnd()));
            
            ArrayList<MetricValue> avgResponseTime = 
                    getMetricValues(access.getRESTMetricQuery(47, app, name, node.getNode().getName(), totalTimeRange.getStart(), totalTimeRange.getEnd()));
            
            for(NodePerformanceRange nodeRange:node.getNodePerfRange()){
                for(MetricValue val:stallCount){
                    if(nodeRange.withIn(val.getStartTimeInMillis())) nodeRange.getStallCountValues().add(val);
                }
                
                for(MetricValue val:numberOfVerySlowCalls){
                    if(nodeRange.withIn(val.getStartTimeInMillis())) nodeRange.getNumberOfVerySlowCallsValues().add(val);
                }
                
                for(MetricValue val:numberOfSlowCalls){
                    if(nodeRange.withIn(val.getStartTimeInMillis())) nodeRange.getNumberOfSlowCallsValues().add(val);
                }
                
                for(MetricValue val:infraErrorsPerMinute){
                    if(nodeRange.withIn(val.getStartTimeInMillis())) nodeRange.getInfrastructureErrorsPerMinuteValues().add(val);
                }
                
                for(MetricValue val:httpErrorCodesPerMinute){
                    if(nodeRange.withIn(val.getStartTimeInMillis())) nodeRange.getHttpErrorCodesPerMinuteValues().add(val);
                }
                
                for(MetricValue val:exceptionsPerMinute){
                    if(nodeRange.withIn(val.getStartTimeInMillis())) nodeRange.getExceptionsPerMinuteValues().add(val);
                }
                
                for(MetricValue val:errorsPerMinute){
                    if(nodeRange.withIn(val.getStartTimeInMillis())) nodeRange.getErrorsPerMinuteValues().add(val);
                }
                
                for(MetricValue val:errorPageRedirectPerMinute){
                    if(nodeRange.withIn(val.getStartTimeInMillis())) nodeRange.getErrorPageRedirectsPerMinuteValues().add(val);
                }
                
                for(MetricValue val:callsPerMinute){
                    if(nodeRange.withIn(val.getStartTimeInMillis())) nodeRange.getCallsPerMinuteValues().add(val);
                }
                
                for(MetricValue val:avgResponseTime){
                    if(nodeRange.withIn(val.getStartTimeInMillis())) nodeRange.getAvgResponseTimeValues().add(val);
                }
                nodeRange.updateCounts();
            }
            
            
        }
    }
    
    public ArrayList<MetricValue> getMetricValues(MetricDatas mds){
        ArrayList<MetricValue> values=new ArrayList<MetricValue>();
        if(mds != null && mds.getMetric_data().size() > 0){
            if(mds.getMetric_data().get(0).getMetricValues().size() > 0){
                 values = mds.getMetric_data().get(0).getMetricValues().get(0).getMetricValue();
            }
        }
        return values;
    }
    
}
