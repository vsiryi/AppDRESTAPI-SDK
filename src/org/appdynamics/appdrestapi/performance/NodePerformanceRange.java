/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.performance;

import org.appdynamics.appdrestapi.util.TimeRange;
import org.appdynamics.appdrestapi.data.MetricValue;
import org.appdynamics.appdrestapi.data.MetricValues;
import org.appdynamics.appdrestapi.data.MetricDatas;

import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 */
public class NodePerformanceRange extends TimeRange{
    
    protected ArrayList<MetricValue> avgResponseTimeValues;
    protected ArrayList<MetricValue> callsPerMinuteValues;
    protected ArrayList<MetricValue> errorPageRedirectsPerMinuteValues;
    protected ArrayList<MetricValue> errorsPerMinuteValues;
    protected ArrayList<MetricValue> exceptionsPerMinuteValues;
    protected ArrayList<MetricValue> httpErrorCodesPerMinuteValues;
    protected ArrayList<MetricValue> infrastructureErrorsPerMinuteValues;
    protected ArrayList<MetricValue> numberOfSlowCallsValues;
    protected ArrayList<MetricValue> numberOfVerySlowCallsValues;
    protected ArrayList<MetricValue> stallCountValues;
    
    protected int avgResponseTime;
    protected int callsPerMinute;
    protected int errorPageRedirectsPerMinute;
    protected int errorsPerMinute;
    protected int exceptionsPerMinute;
    protected int httpErrorCodesPerMinute;
    protected int infrastructureErrorsPerMinute;
    protected int numberOfSlowCalls;
    protected int numberOfVerySlowCalls;
    protected int stallCount;
    
    public NodePerformanceRange(){
        super();
    }
    
    public NodePerformanceRange(TimeRange timeR){
        super();
        setStart(timeR.getStart());
        setEnd(timeR.getEnd());
    }

    public ArrayList<MetricValue> getAvgResponseTimeValues() {
        return avgResponseTimeValues;
    }

    public void setAvgResponseTimeValues(ArrayList<MetricValue> avgResponseTimeValues) {
        this.avgResponseTimeValues = avgResponseTimeValues;
    }

    public ArrayList<MetricValue> getCallsPerMinuteValues() {
        return callsPerMinuteValues;
    }

    public void setCallsPerMinuteValues(ArrayList<MetricValue> callsPerMinuteValues) {
        this.callsPerMinuteValues = callsPerMinuteValues;
    }

    public ArrayList<MetricValue> getErrorPageRedirectsPerMinuteValues() {
        return errorPageRedirectsPerMinuteValues;
    }

    public void setErrorPageRedirectsPerMinuteValues(ArrayList<MetricValue> errorPageRedirectsPerMinuteValues) {
        this.errorPageRedirectsPerMinuteValues = errorPageRedirectsPerMinuteValues;
    }

    public ArrayList<MetricValue> getErrorsPerMinuteValues() {
        return errorsPerMinuteValues;
    }

    public void setErrorsPerMinuteValues(ArrayList<MetricValue> errorsPerMinuteValues) {
        this.errorsPerMinuteValues = errorsPerMinuteValues;
    }

    public ArrayList<MetricValue> getExceptionsPerMinuteValues() {
        return exceptionsPerMinuteValues;
    }

    public void setExceptionsPerMinuteValues(ArrayList<MetricValue> exceptionsPerMinuteValues) {
        this.exceptionsPerMinuteValues = exceptionsPerMinuteValues;
    }

    public ArrayList<MetricValue> getHttpErrorCodesPerMinuteValues() {
        return httpErrorCodesPerMinuteValues;
    }

    public void setHttpErrorCodesPerMinuteValues(ArrayList<MetricValue> httpErrorCodesPerMinuteValues) {
        this.httpErrorCodesPerMinuteValues = httpErrorCodesPerMinuteValues;
    }

    public ArrayList<MetricValue> getInfrastructureErrorsPerMinuteValues() {
        return infrastructureErrorsPerMinuteValues;
    }

    public void setInfrastructureErrorsPerMinuteValues(ArrayList<MetricValue> infrastructureErrorsPerMinuteValues) {
        this.infrastructureErrorsPerMinuteValues = infrastructureErrorsPerMinuteValues;
    }

    public ArrayList<MetricValue> getNumberOfSlowCallsValues() {
        return numberOfSlowCallsValues;
    }

    public void setNumberOfSlowCallsValues(ArrayList<MetricValue> numberOfSlowCallsValues) {
        this.numberOfSlowCallsValues = numberOfSlowCallsValues;
    }

    public ArrayList<MetricValue> getNumberOfVerySlowCallsValues() {
        return numberOfVerySlowCallsValues;
    }

    public void setNumberOfVerySlowCallsValues(ArrayList<MetricValue> numberOfVerySlowCallsValues) {
        this.numberOfVerySlowCallsValues = numberOfVerySlowCallsValues;
    }

    public ArrayList<MetricValue> getStallCountValues() {
        return stallCountValues;
    }

    public void setStallCountValues(ArrayList<MetricValue> stallCountValues) {
        this.stallCountValues = stallCountValues;
    }
    
    public NodePerformanceRange(String name){
        super(name);
    }

    public int getAvgResponseTime() {
        return avgResponseTime;
    }

    public void setAvgResponseTime(int avgResponseTime) {
        this.avgResponseTime = avgResponseTime;
    }

    public int getCallsPerMinute() {
        return callsPerMinute;
    }

    public void setCallsPerMinute(int callsPerMinute) {
        this.callsPerMinute = callsPerMinute;
    }

    public int getErrorPageRedirectsPerMinute() {
        return errorPageRedirectsPerMinute;
    }

    public void setErrorPageRedirectsPerMinute(int errorPageRedirectsPerMinute) {
        this.errorPageRedirectsPerMinute = errorPageRedirectsPerMinute;
    }

    public int getErrorsPerMinute() {
        return errorsPerMinute;
    }

    public void setErrorsPerMinute(int errorsPerMinute) {
        this.errorsPerMinute = errorsPerMinute;
    }

    public int getExceptionsPerMinute() {
        return exceptionsPerMinute;
    }

    public void setExceptionsPerMinute(int exceptionsPerMinute) {
        this.exceptionsPerMinute = exceptionsPerMinute;
    }

    public int getHttpErrorCodesPerMinute() {
        return httpErrorCodesPerMinute;
    }

    public void setHttpErrorCodesPerMinute(int httpErrorCodesPerMinute) {
        this.httpErrorCodesPerMinute = httpErrorCodesPerMinute;
    }

    public int getInfrastructureErrorsPerMinute() {
        return infrastructureErrorsPerMinute;
    }

    public void setInfrastructureErrorsPerMinute(int infrastructureErrorsPerMinute) {
        this.infrastructureErrorsPerMinute = infrastructureErrorsPerMinute;
    }

    public int getNumberOfSlowCalls() {
        return numberOfSlowCalls;
    }

    public void setNumberOfSlowCalls(int numberOfSlowCalls) {
        this.numberOfSlowCalls = numberOfSlowCalls;
    }

    public int getNumberOfVerySlowCalls() {
        return numberOfVerySlowCalls;
    }

    public void setNumberOfVerySlowCalls(int numberOfVerySlowCalls) {
        this.numberOfVerySlowCalls = numberOfVerySlowCalls;
    }

    public int getStallCount() {
        return stallCount;
    }

    public void setStallCount(int stallCount) {
        this.stallCount = stallCount;
    }
    
    public void updateCounts(){
                for(MetricValue val:stallCountValues){
                    stallCount+=val.getValue();
                }
                if(stallCountValues.size() > 0) stallCount=stallCount/stallCountValues.size();
                
                for(MetricValue val:numberOfVerySlowCallsValues){
                    numberOfVerySlowCalls+=val.getValue();
                }
                if(numberOfVerySlowCallsValues.size() > 0) numberOfVerySlowCalls=numberOfVerySlowCalls/numberOfVerySlowCallsValues.size();
                
                for(MetricValue val:numberOfSlowCallsValues){
                    numberOfSlowCalls+=val.getValue();
                }
                if(numberOfSlowCallsValues.size() > 0 ) numberOfSlowCalls=numberOfSlowCalls/numberOfSlowCallsValues.size();
                
                for(MetricValue val:infrastructureErrorsPerMinuteValues){
                    infrastructureErrorsPerMinute+=val.getValue();
                }
                if(infrastructureErrorsPerMinuteValues.size() > 0) infrastructureErrorsPerMinute=infrastructureErrorsPerMinute/infrastructureErrorsPerMinuteValues.size();
                
                for(MetricValue val:httpErrorCodesPerMinuteValues){
                    httpErrorCodesPerMinute+=val.getValue();
                }
                if(httpErrorCodesPerMinuteValues.size() > 0) httpErrorCodesPerMinute=httpErrorCodesPerMinute/httpErrorCodesPerMinuteValues.size();
                
                for(MetricValue val:exceptionsPerMinuteValues){
                    exceptionsPerMinute+=val.getValue();
                }
                if(exceptionsPerMinuteValues.size() > 0) exceptionsPerMinute=exceptionsPerMinute/exceptionsPerMinuteValues.size();
                
                for(MetricValue val:errorsPerMinuteValues){
                    errorsPerMinute+=val.getValue();
                }
                if(errorsPerMinuteValues.size() > 0) errorsPerMinute=errorsPerMinute/errorsPerMinuteValues.size();
                
                for(MetricValue val:errorPageRedirectsPerMinuteValues){
                    errorPageRedirectsPerMinute+=val.getValue();
                }
                if(errorPageRedirectsPerMinuteValues.size() > 0) errorPageRedirectsPerMinute=errorPageRedirectsPerMinute/errorPageRedirectsPerMinuteValues.size();
                
                for(MetricValue val:callsPerMinuteValues){
                    callsPerMinute+=val.getValue();
                }
                
                for(MetricValue val:avgResponseTimeValues){
                    avgResponseTime+=val.getValue();
                }
                if(avgResponseTimeValues.size() > 0) avgResponseTime=avgResponseTime/avgResponseTimeValues.size();


    }
    
    @Override
    public String toString(){
        StringBuilder bud=new StringBuilder();
        bud.append("\tTime Range: ").append(name).append("\n");
        bud.append("\t").append(avgResponseTime).append("\n");
        bud.append("\t").append(callsPerMinute).append("\n");
        bud.append("\t").append(errorPageRedirectsPerMinute).append("\n");
        bud.append("\t").append(errorsPerMinute).append("\n");
        bud.append("\t").append(exceptionsPerMinute).append("\n");
        bud.append("\t").append(httpErrorCodesPerMinute).append("\n");
        bud.append("\t").append(infrastructureErrorsPerMinute).append("\n");
        bud.append("\t").append(numberOfSlowCalls).append("\n");
        bud.append("\t").append(numberOfVerySlowCalls).append("\n");
        bud.append("\t").append(stallCount).append("\n");
        return bud.toString();
    }
    
    
}
