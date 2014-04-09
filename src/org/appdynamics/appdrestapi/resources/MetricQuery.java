/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.resources;

/**
 *
 * @author soloink
 */
public class MetricQuery {
    protected String baseURL;
    protected String application;

    
    
    public MetricQuery(String baseURL, String application){
        this.baseURL=baseURL;
        this.application=application;
    }
    
    public String queryAgentTierAppAgentAvailability(String tier, long start, long end){
        return AgentAvailabilityMetricQuery.queryAgentTierAppAgentAvailability(baseURL, application, tier, start, end);
    }
    
    public String queryAgentNodeAppAgentAvailability(String tier, String node, long start, long end){
        return AgentAvailabilityMetricQuery.queryAgentNodeAppAgentAvailability(baseURL, application, tier, node, start, end);
    }
    
    public String queryAgentTierMachineAgentAvailability(String tier, long start, long end){
        return AgentAvailabilityMetricQuery.queryAgentTierMachineAgentAvailability( baseURL, application,tier,start, end);
    }
    
    public String queryAgentNodeMachineAgentAvailability(String tier, String node, long start, long end){
        return AgentAvailabilityMetricQuery.queryAgentNodeMachineAgentAvailability( baseURL, application,tier, node,start, end);
    }
    
    /* ************************* Hardware Resources CPU *******************************  */
    public String queryHDTierCPUBusy(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierCPUBusy(baseURL, application, tier, start, end);
    }
    
    public String queryHDNodeCPUBusy(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeCPUBusy(baseURL, application, tier, node, start, end);
    }
    
    public String queryHDTierCPUIdle(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierCPUIdle(baseURL, application, tier, start, end);
    }
    
    public String queryHDNodeCPUIdle(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeCPUIdle(baseURL, application, tier, node, start, end);
    }
    
    public String queryHDTierCPUStolen(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierCPUStolen(baseURL, application, tier, start, end);
    }
    
    public String queryHDNodeCPUStolen(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeCPUStolen(baseURL, application, tier, node, start, end);
    }
    
    /* ************************* Hardware Resources Disk *******************************   */
    public String queryHDTierDisksKBReadPerSec(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierDisksKBReadPerSec(baseURL, application, tier, start, end);
    }
    public String queryHDNodeDisksKBReadPerSec(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeDisksKBReadPerSec(baseURL, application, tier, node, start, end);
    }
    
    public String queryHDTierDisksKBWrittenPerSec(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierDisksKBWrittenPerSec(baseURL, application, tier, start, end);
    }
    
    public String queryHDNodeDisksKBWrittenPerSec(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeDisksKBWrittenPerSec(baseURL, application, tier, node,start, end);
    }
    
    public String queryHDTierDisksReadPerSec(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierDisksReadPerSec(baseURL, application, tier, start, end);
    }
    
    public String queryHDNodeDisksReadPerSec(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeDisksReadPerSec(baseURL, application, tier, node,start, end);
    }
    
    public String queryHDTierDisksWritesPerSec(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierDisksWritesPerSec(baseURL, application, tier, start, end);
    }
    
    public String queryHDNodeDisksWritesPerSec(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeDisksWritesPerSec(baseURL, application, tier, node,start, end);
    }
    
    /* ************************* Hardware Resources Memory *******************************   */
    public String queryHDTierMemoryFreePerc(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierMemoryFreePerc(baseURL, application, tier, start, end);
    }
    
    public String queryHDNodeMemoryFreePerc(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeMemoryFreePerc(baseURL, application, tier, node,start, end);
    }
    
    public String queryHDTierMemoryFreeMB(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierMemoryFreeMB(baseURL, application, tier, start, end);
    }
    
    public String queryHDNodeMemoryFreeMB(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeMemoryFreeMB(baseURL, application, tier, node,start, end);
    }
    
    public String queryHDTierMemoryTotalMB(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierMemoryTotalMB(baseURL, application, tier, start, end);
    }
    
    public String queryHDNodeMemoryTotalMB(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeMemoryTotalMB(baseURL, application, tier, node,start, end);
    }
    
    public String queryHDTierMemoryUsedPerc(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierMemoryUsedPerc(baseURL, application, tier, start, end);
    }
    
    public String queryHDNodeMemoryUsedPerc(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeMemoryUsedPerc(baseURL, application, tier, node,start, end);
    }
    
    public String queryHDTierMemoryUsedMB(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierMemoryUsedMB(baseURL, application, tier, start, end);
    }
    
    public String queryHDNodeMemoryUsedMB(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeMemoryUsedMB(baseURL, application, tier, node,start, end);
    }
    
    /* ************************* Hardware Resources Network *******************************   */
    public String queryHDTierNetworkIncomingKB(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierNetworkIncomingKB(baseURL, application, tier, start, end);
    }
    
    public String queryHDNodeNetworkIncomingKB(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkIncomingKB(baseURL, application, tier, node,start, end);
    }
    
    public String queryHDTierNetworkIncomingKBPerSec(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierNetworkIncomingKBPerSec(baseURL, application, tier, start, end);
    }
    
    public String queryHDNodeNetworkIncomingKBPerSec(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkIncomingKBPerSec(baseURL, application, tier, node,start, end);
    }
    
    public String queryHDTierNetworkIncomingPackets(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierNetworkIncomingPackets(baseURL, application, tier, start, end);
    }
    
    public String queryHDNodeNetworkIncomingPackets(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkIncomingPackets(baseURL, application, tier, node,start, end);
    }
    
    public String queryHDTierNetworkIncomingPacketsPerSec(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierNetworkIncomingPacketsPerSec(baseURL, application, tier, start, end);
    }
    
    public String queryHDNodeNetworkIncomingPacketsPerSec(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkIncomingPacketsPerSec(baseURL, application, tier, node,start, end);
    }
    
    public String queryHDTierNetworkOutgoingKB(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierNetworkOutgoingKB(baseURL, application, tier, start, end);
    }
    
    public String queryHDNodeNetworkOutgoingKB(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkOutgoingKB(baseURL, application, tier, node,start, end);
    }
    
    public String queryHDTierNetworkOutgoingKBPerSec(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierNetworkOutgoingKBPerSec(baseURL, application, tier, start, end);
    }
    
    public String queryHDNodeNetworkOutgoingKBPerSec(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkOutgoingKBPerSec(baseURL, application, tier, node,start, end);
    }
    
    public String queryHDTierNetworkOutgoingPackets(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierNetworkOutgoingPackets(baseURL, application, tier, start, end);
    }
    
    public String queryHDNodeNetworkOutgoingPackets(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkOutgoingPackets(baseURL, application, tier, node,start, end);
    }
    
    public String queryHDTierNetworkOutgoingPacketsPerSec(String tier, long start, long end){
        return HardwareResourcesMetricQuery.queryHDTierNetworkOutgoingPacketsPerSec(baseURL, application, tier, start, end);
    }
    
    public String queryHDNodeNetworkOutgoingPacketsPerSec(String tier, String node, long start, long end){
        return HardwareResourcesMetricQuery.queryHDNodeNetworkOutgoingPacketsPerSec(baseURL, application, tier, node,start, end);
    }
    
    /*  JVM metrics */
    public String queryJVMTierProcessCPUBurntMSPerMin(String tier, long start, long end){
        return JVMMetricQuery.queryJVMTierProcessCPUBurntMSPerMin(baseURL, application, tier, start, end);
    }
    
    public String queryJVMNodeProcessCPUBurntMSPerMin(String tier, String node, long start, long end){
        return JVMMetricQuery.queryJVMNodeProcessCPUBurntMSPerMin(baseURL, application, tier, node,start, end);
    }
    
    public String queryJVMTierProcessCPUUsagePerc(String tier, long start, long end){
        return JVMMetricQuery.queryJVMTierProcessCPUUsagePerc(baseURL, application, tier, start, end);
    }
    
    public String queryJVMNodeProcessCPUUsagePerc(String tier, String node, long start, long end){
        return JVMMetricQuery.queryJVMNodeProcessCPUUsagePerc(baseURL, application, tier, node,start, end);
    }
    
    public String queryJVMTierGarbageCollectionGCTimeSpentPerMin(String tier, long start, long end){
        return JVMMetricQuery.queryJVMTierGarbageCollectionGCTimeSpentPerMin(baseURL, application, tier, start, end);
    }
    
    public String queryJVMNodeGarbageCollectionGCTimeSpentPerMin(String tier, String node, long start, long end){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionGCTimeSpentPerMin(baseURL, application, tier, node,start, end);
    }
    
    public String queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin(String tier, long start, long end){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin(baseURL, application, tier, start, end);
    }
    
    public String queryJVMNodeGarbageCollectionMajorCollectionTimeSpentPerMin(String tier, String node, long start, long end){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMajorCollectionTimeSpentPerMin(baseURL, application, tier, node,start, end);
    }
    
    public String queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin(String tier, long start, long end){
        return JVMMetricQuery.queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin(baseURL, application, tier, start, end);
    }
    
    public String queryJVMNodeGarbageCollectionMinorCollectionTimeSpentPerMin(String tier, String node, long start, long end){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMinorCollectionTimeSpentPerMin(baseURL, application, tier, node,start, end);
    }
    
    public String queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(String tier, long start, long end){
        return JVMMetricQuery.queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(baseURL, application, tier, start, end);
    }
    
    public String queryJVMNodeGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(String tier, String node, long start, long end){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(baseURL, application, tier, node,start, end);
    }
    
    public String queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(String tier, long start, long end){
        return JVMMetricQuery.queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(baseURL, application, tier, start, end);
    }
    
    public String queryJVMNodeGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(String tier, String node, long start, long end){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(baseURL, application, tier, node,start, end);
    }
    
    public String queryJVMTierMemoryHeapCommittedMB(String tier, long start, long end){
        return JVMMetricQuery.queryJVMTierMemoryHeapCommittedMB(baseURL, application, tier, start, end);
    }
    
    public String queryJVMNodeMemoryHeapCommittedMB(String tier, String node, long start, long end){
        return JVMMetricQuery.queryJVMNodeMemoryHeapCommittedMB(baseURL, application, tier, node,start, end);
    }
    
    public String queryJVMTierMemoryHeapCurrentUsageMB(String tier, long start, long end){
        return JVMMetricQuery.queryJVMTierMemoryHeapCurrentUsageMB(baseURL, application, tier, start, end);
    }
    
    public String queryJVMNodeMemoryHeapCurrentUsageMB(String tier, String node, long start, long end){
        return JVMMetricQuery.queryJVMNodeMemoryHeapCurrentUsageMB(baseURL, application, tier, node,start, end);
    }
    
    public String queryJVMTierMemoryHeapMaxAvailableMB(String tier, long start, long end){
        return JVMMetricQuery.queryJVMTierMemoryHeapMaxAvailableMB(baseURL, application, tier, start, end);
    }
    
    public String queryJVMNodeMemoryHeapMaxAvailableMB(String tier, String node, long start, long end){
        return JVMMetricQuery.queryJVMNodeMemoryHeapMaxAvailableMB(baseURL, application, tier, node,start, end);
    }
    
    public String queryJVMTierMemoryHeapUsedPerc(String tier, long start, long end){
        return JVMMetricQuery.queryJVMTierMemoryHeapUsedPerc(baseURL, application, tier, start, end);
    }
    
    public String queryJVMNodeMemoryHeapUsedPerc(String tier, String node, long start, long end){
        return JVMMetricQuery.queryJVMNodeMemoryHeapUsedPerc(baseURL, application, tier, node,start, end);
    }
    
    public String queryJVMTierMemoryNonHeapCommittedMB(String tier, long start, long end){
        return JVMMetricQuery.queryJVMTierMemoryNonHeapCommittedMB(baseURL, application, tier, start, end);
    }
    
    public String queryJVMNodeMemoryNonHeapCommittedMB(String tier, String node, long start, long end){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapCommittedMB(baseURL, application, tier, node,start, end);
    }
    
    public String queryJVMTierMemoryNonHeapCurrentUsageMB(String tier, long start, long end){
        return JVMMetricQuery.queryJVMTierMemoryNonHeapCurrentUsageMB(baseURL, application, tier, start, end);
    }
    
    public String queryJVMNodeMemoryNonHeapCurrentUsageMB(String tier, String node, long start, long end){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapCurrentUsageMB(baseURL, application, tier, node,start, end);
    }
    
    public String queryJVMTierMemoryNonHeapMaxAvailableMB(String tier, long start, long end){
        return JVMMetricQuery.queryJVMTierMemoryNonHeapMaxAvailableMB(baseURL, application, tier, start, end);
    }
    
    public String queryJVMNodeMemoryNonHeapMaxAvailableMB(String tier, String node, long start, long end){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapMaxAvailableMB(baseURL, application, tier, node,start, end);
    }
    
    public String queryJVMTierMemoryNonHeapUsedPerc(String tier, long start, long end){
        return JVMMetricQuery.queryJVMTierMemoryNonHeapUsedPerc(baseURL, application, tier, start, end);
    }
    
    public String queryJVMNodeMemoryNonHeapUsedPerc(String tier, String node, long start, long end){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapUsedPerc(baseURL, application, tier, node,start, end);
    }
    
    public String queryJVMTierThreadsCurrentNoOfThreads(String tier, long start, long end){
        return JVMMetricQuery.queryJVMTierMemoryNonHeapCurrentUsageMB(baseURL, application, tier, start, end);
    }
    
    public String queryJVMNodeThreadsCurrentNoOfThreads(String tier, String node, long start, long end){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapCurrentUsageMB(baseURL, application, tier, node,start, end);
    }
    
    /*  Overall Application Performance */
    //Stall Count
    public String queryOAPAppStallCount(long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPAppStallCount(baseURL, application, start, end);
    }
    
    public String queryOAPTierStallCount(String tier, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPTierStallCount(baseURL, application, tier, start, end);
    }
    
    public String queryOAPNodeStallCount(String tier, String node, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPNodeStallCount(baseURL, application, tier, node, start, end);
    }
    
    //Number of Very Slow Call
    public String queryOAPAppNumberOfVerySlowCalls(long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPAppNumberOfVerySlowCalls(baseURL, application, start, end);
    }
    
    public String queryOAPTierNumberOfVerySlowCalls(String tier, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPTierNumberOfVerySlowCalls(baseURL, application, tier, start, end);
    }
    
    public String queryOAPNodeNumberOfVerySlowCalls(String tier, String node, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPNodeStallCount(baseURL, application, tier, node, start, end);
    }
    //Number of Slow Calls
    public String queryOAPAppNumberOfSlowCalls(long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPAppNumberOfSlowCalls(baseURL, application, start, end);
    }
    
    public String queryOAPTierNumberOfSlowCalls(String tier, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPTierNumberOfSlowCalls(baseURL, application, tier, start, end);
    }
    
    public String queryOAPNodeNumberOfSlowCalls(String tier, String node, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPNodeNumberOfSlowCalls(baseURL, application, tier, node, start, end);
    }
    //Infrastructure Errors per Minute
    public String queryOAPAppInfrastructureErrorsPerMinute(String tier, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPAppInfrastructureErrorsPerMinute(baseURL, application,start, end);
    }
    
    public  String queryOAPTierInfrastructureErrorsPerMinute(String tier, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPTierInfrastructureErrorsPerMinute(baseURL, application,tier,start, end);
    }
    
    public String queryOAPNodeInfrastructureErrorsPerMinute(String tier, String node, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPNodeInfrastructureErrorsPerMinute(baseURL, application,tier,node,start, end);
    }
    //HTTP Error Codes per Minute
    public String queryOAPAppHttpErrorCodesPerMinute( long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPAppHttpErrorCodesPerMinute(baseURL, application,start, end);
    }
    
    public String queryOAPTierHttpErrorCodesPerMinute(String tier, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPTierHttpErrorCodesPerMinute(baseURL, application,tier,start, end);
    }
    
    public String queryOAPNodeHttpErrorCodesPerMinute(String tier, String node, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPNodeHttpErrorCodesPerMinute(baseURL, application,tier,node,start, end);
    }
    //Exceptions per Minute
    public String queryOAPAppExceptionsPerMinute(long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPAppExceptionsPerMinute(baseURL, application,start, end);
    }
    
    public String queryOAPTierExceptionsPerMinute(String tier, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPTierExceptionsPerMinute(baseURL, application,tier,start, end);
    }
    
    public String queryOAPNodeExceptionsPerMinute(String tier, String node, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPNodeExceptionsPerMinute(baseURL, application,tier,node,start, end);
    }
    
    //Errors per Minute
    public String queryOAPAppErrorsPerMinute(String tier, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPAppErrorsPerMinute(baseURL, application,start, end);
    }
    
    public String queryOAPTierErrorsPerMinute(String tier, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPTierErrorsPerMinute(baseURL, application,tier,start, end);
    }
    
    public String queryOAPNodeErrorsPerMinute(String tier, String node, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPNodeErrorsPerMinute(baseURL, application,tier,node,start, end);
    }
    
    //Error Page Redirects per Minute
    public String queryOAPAppErrorPageRedirectsPerMinute(String tier, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPAppErrorPageRedirectsPerMinute(baseURL, application,start, end);
    }
    
    public String queryOAPTierErrorPageRedirectsPerMinute(String tier, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPTierErrorPageRedirectsPerMinute(baseURL, application,tier,start, end);
    }
    
    public String queryOAPNodeErrorPageRedirectsPerMinute(String tier, String node, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPNodeErrorPageRedirectsPerMinute(baseURL, application,tier,node,start, end);
    }
    //CallsPerMinute
    public  String queryOAPAppCallsPerMinute(long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPAppCallsPerMinute(baseURL, application,start, end);
    }
    
    public String queryOAPTierCallsPerMinute(String tier, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPTierCallsPerMinute(baseURL, application,tier,start, end);
    }
    
    public String queryOAPNodeCallsPerMinute(String tier, String node, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPNodeCallsPerMinute(baseURL, application,tier,node,start, end);
    }
     // Avg Response Time
    public String queryOAPAppAvgResponseTimeMS(long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPAppAvgResponseTimeMS(baseURL, application,start, end);
    }
    
    public  String queryOAPTierAvgResponseTimeMS(String tier, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPTierAvgResponseTimeMS(baseURL, application,tier,start, end);
    }
    
    public String queryOAPNodeAvgResponseTimeMS(String tier, String node, long start, long end){
        return OverAllPerformanceMetricQuery.queryOAPNodeAvgResponseTimeMS(baseURL, application,tier,node,start, end);
    }
    
    /* EUM AJAX */
    public String queryEUM_AJAX_REQUESTS_PER_MIN(String urlPath, long start, long end){
        return EUMMetricQuery.queryEUM_AJAX_REQUESTS_PER_MIN(baseURL, application, urlPath, start, end);
    }
    
    public String queryEUM_AJAX_REQUESTS_ERRORS_PER_MIN(String urlPath, long start, long end){
        return EUMMetricQuery.queryEUM_AJAX_REQUESTS_ERRORS_PER_MIN(baseURL, application, urlPath, start, end);
    }
    
    public String queryEUM_AJAX_DOC_DOWNLOAD_TIME(String urlPath, long start, long end){
        return EUMMetricQuery.queryEUM_AJAX_DOC_DOWNLOAD_TIME(baseURL, application, urlPath, start, end);
    }
    
    public String queryEUM_AJAX_DOC_PROCESSING_TIME(String urlPath, long start, long end){
        return EUMMetricQuery.queryEUM_AJAX_DOC_PROCESSING_TIME(baseURL, application, urlPath, start, end);
    }
    
    public String queryEUM_AJAX_END_USER_RESPONSE_TIME(String urlPath, long start, long end){
        return EUMMetricQuery.queryEUM_AJAX_END_USER_RESPONSE_TIME(baseURL, application, urlPath, start, end);
    }
    
    public String queryEUM_AJAX_FIRST_BYTE_TIME_MS(String urlPath, long start, long end){
        return EUMMetricQuery.queryEUM_AJAX_FIRST_BYTE_TIME_MS(baseURL, application, urlPath, start, end);
    }
    
    /* EUM BASE PAGES */
    public String queryEUM_BASE_PAGES_REQUESTS_PER_MIN(String urlPath, long start, long end){
        return EUMMetricQuery.queryEUM_BASE_PAGES_REQUESTS_PER_MIN(baseURL, application, urlPath, start, end);
    }
    
    public String queryEUM_BASE_PAGES_DOC_READY_TIME_MS(String urlPath, long start, long end){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOC_READY_TIME_MS(baseURL, application, urlPath, start, end);
    }
    
    public String queryEUM_BASE_PAGES_DOC_DOWNLOAD_TIME(String urlPath, long start, long end){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOC_DOWNLOAD_TIME(baseURL, application, urlPath, start, end);
    }
    
    public String queryEUM_BASE_PAGES_DOC_PROCESSING_TIME(String urlPath, long start, long end){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOC_PROCESSING_TIME(baseURL, application, urlPath, start, end);
    }
    
    public String queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME(String urlPath, long start, long end){
        return EUMMetricQuery.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME(baseURL, application, urlPath, start, end);
    }
    
    public String queryEUM_BASE_PAGES_FIRST_BYTE_TIME_MS(String urlPath, long start, long end){
        return EUMMetricQuery.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_MS(baseURL, application, urlPath, start, end);
    }
    
    public String queryEUM_BASE_PAGES_FRONT_END_TIME_MS(String urlPath, long start, long end){
        return EUMMetricQuery.queryEUM_BASE_PAGES_FRONT_END_TIME_MS(baseURL, application, urlPath, start, end);
    }
    
    public String queryEUM_BASE_PAGES_PAGE_RENDER_TIME_MS(String urlPath, long start, long end){
        return EUMMetricQuery.queryEUM_BASE_PAGES_PAGE_RENDER_TIME_MS(baseURL, application, urlPath, start, end);
    }
    
    public String queryEUM_BASE_PAGES_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE(String urlPath, long start, long end){
        return EUMMetricQuery.queryEUM_BASE_PAGES_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE(baseURL, application, urlPath, start, end);
    }
    
    public String queryEUM_BASE_PAGES_RESPONSE_AVAILABLE_TIME_MS(String urlPath, long start, long end){
        return EUMMetricQuery.queryEUM_BASE_PAGES_RESPONSE_AVAILABLE_TIME_MS(baseURL, application, urlPath, start, end);
    }
    
    public String queryEUM_BASE_PAGES_SERVER_CONNECTION_TIME_MS(String urlPath, long start, long end){
        return EUMMetricQuery.queryEUM_BASE_PAGES_SERVER_CONNECTION_TIME_MS(baseURL, application, urlPath, start, end);
    }
    
    public String queryEUM_BASE_PAGES_SYNTHETIC_REQUESTS_PER_MINUTE(String urlPath, long start, long end){
        return EUMMetricQuery.queryEUM_BASE_PAGES_SYNTHETIC_REQUESTS_PER_MINUTE(baseURL, application, urlPath, start, end);
    }
    
    /*
     *  ***********************************************************************
     *    Business Transaction Metric Querys 
     */
    public String queryBTAVERAGE_BLOCK_TIME_MS(String application, String tier, String site, long start, long end){
        return BusinessTransactionQuery.queryBTAVERAGE_BLOCK_TIME_MS(baseURL, application, tier, site, start, end);
    }
    
    public String queryBTAVERAGE_CPU_USED_MS(String application, String tier, String site, long start, long end){
        return BusinessTransactionQuery.queryBTAVERAGE_CPU_USED_MS(baseURL, application, tier, site, start, end);
    }
    
    public String queryBTAVERAGE_REQUEST_SIZE(String application, String tier, String site, long start, long end){
        return BusinessTransactionQuery.queryBTAVERAGE_REQUEST_SIZE(baseURL, application, tier, site, start, end);
    }
    
    public String queryBTAVERAGE_RESPONSE_TIME(String application, String tier, String site, long start, long end){
        return BusinessTransactionQuery.queryBTAVERAGE_RESPONSE_TIME(baseURL, application, tier, site, start, end);
    }
    
    public String queryBTAVERAGE_WAIT_TIME_MS(String application, String tier, String site, long start, long end){
        return BusinessTransactionQuery.queryBTAVERAGE_WAIT_TIME_MS(baseURL, application, tier, site, start, end);
    }
    
    public String queryBTCALL_PER_MINUTE(String application, String tier, String site, long start, long end){
        return BusinessTransactionQuery.queryBTCALL_PER_MINUTE(baseURL, application, tier, site, start, end);
    }
    
    public String queryBTERRORS_PER_MINUTE(String application, String tier, String site, long start, long end){
        return BusinessTransactionQuery.queryBTERRORS_PER_MINUTE(baseURL, application, tier, site, start, end);
    }
    
    public String queryBTNORMAL_AVERAGE_RESPONSE_TIME_MS(String application, String tier, String site, long start, long end){
        return BusinessTransactionQuery.queryBTNORMAL_AVERAGE_RESPONSE_TIME_MS(baseURL, application, tier, site, start, end);
    }
    
    public String queryBTNUMBER_OF_SLOW_CALLS(String application, String tier, String site, long start, long end){
        return BusinessTransactionQuery.queryBTNUMBER_OF_SLOW_CALLS(baseURL, application, tier, site, start, end);
    }
    
    public String queryBTNUMBER_OF_VERY_SLOW_CALLS(String application, String tier, String site, long start, long end){
        return BusinessTransactionQuery.queryBTNUMBER_OF_VERY_SLOW_CALLS(baseURL, application, tier, site, start, end);
    }
    
    public String queryBTSTALL_COUNT(String application, String tier, String site, long start, long end){
        return BusinessTransactionQuery.queryBTSTALL_COUNT(baseURL, application, tier, site, start, end);
    }
    
    
}
