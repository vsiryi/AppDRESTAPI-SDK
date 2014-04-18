/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi;


import org.appdynamics.appdrestapi.data.*;
import org.appdynamics.appdrestapi.resources.*;
import org.appdynamics.appdrestapi.resources.s;
import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author soloink
 * <p>
 * The RESTAccess is a class that allows access to AppDynamics REST api. The intention
 * is to provide a easy method to to access the REST.
 * 
 * <p>
 * Metrics : 
 * 1 minute level data upto 4 hours
 * 10 minute level data after 4 hours upto 48 hours
 * 1 hour level data after 48 hours upto 365 days.
 * 
 * Working on the export
 */
public class RESTAccess {
    private static Logger logger=Logger.getLogger(RESTAccess.class.getName());
    private RESTBaseURL baseURL;
    private RESTAuth auth;
    
    
    /**
     * Returns a RESTAccess object that can be used to query the AppDynamics 
     * controller.
     * 
     * @param controllerURL FQDN of the controller
     * @param port Port the controller is using
     * @param username User to execute the query as
     * @param password Password to use with the connection
     */
    public RESTAccess(String controllerURL, String port, String username, String password){
        baseURL=new RESTBaseURL(controllerURL, port);
        auth=new RESTAuth(username, password);
    }
    
    /**
     * Returns a RESTAccess object that can be used to query the AppDynamics 
     * controller.
     * 
     * @param controllerURL FQDN of the controller
     * @param port Port the controller is using
     * @param ssl Use SSL
     * @param username User to execute the query as
     * @param password Password to use with the connection
     */
    public RESTAccess(String controllerURL, String port, boolean ssl, String username, String password){
        baseURL=new RESTBaseURL(controllerURL, port, ssl);
        auth=new RESTAuth(username,password);
    }
    
    /**
     * Returns a RESTAccess object that can be used to query the AppDynamics 
     * controller.
     * 
     * @param controllerURL FQDN of the controller
     * @param port Port the controller is using
     * @param username User to execute the query as
     * @param password Password to use with the connection
     * @param account Account name to use with the queries
     */
    public RESTAccess(String controllerURL, String port, String username, String password, String account){
        baseURL=new RESTBaseURL(controllerURL, port);
        auth=new RESTAuth(username, password, account, true);
    }
    
    /**
     * Returns a RESTAccess object that can be used to query the AppDynamics 
     * controller.
     * 
     * @param controllerURL FQDN of the controller
     * @param port Port the controller is using
     * @param ssl Use SSL
     * @param username User to execute the query as
     * @param password Password to use with the connection
     * @param account Account name to use with the queries
     */
    public RESTAccess(String controllerURL, String port, boolean ssl, String username, String password, String account){
        baseURL=new RESTBaseURL(controllerURL, port, ssl);
        auth=new RESTAuth(username, password, account, true);
        
    }
    
    /**
     * 
     * @param level Debug level 0-4, 0 being minimal logging
     */
    public void setDebugLevel(int level){
        if(level >= 0 || level < 4) s.debugLevel=level;
    }
    
    /**
     * 
     * @return {@link Applications}
     */
    public Applications getApplications(){
        try{
            return RESTExecuter.executeApplicationQuery(auth, ApplicationQuery.queryAllApplications(baseURL.getControllerURL()));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * 
     * @param appId Id of the application 
     * @return String
     */
    public String getApplicationExportById(int appId){
        try{
            return RESTExecuter.executeApplicationExportByIdQuery(auth, ApplicationExportQuery.queryApplicationExportByID(baseURL.getControllerURL(), appId));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    

    
    /**
     * 
     * @param application Name of the application
     * @return {@link BusinessTransactions}
     */
    public BusinessTransactions getBTSForApplication(String application){
        try{
            return RESTExecuter.executeBusinessTransactionQuery(auth, BusinessTransactionQuery.queryBTSFromApps(baseURL.getControllerURL(), application));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * 
     * @param appId The id for the application
     * @return {@link BusinessTransactions}
     */
    public BusinessTransactions getBTSForApplication(int appId){
        try{
            return RESTExecuter.executeBusinessTransactionQuery(auth, BusinessTransactionQuery.queryBTSFromApps(baseURL.getControllerURL(), appId));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     *
     * @param application Name of the application
     * @param btId Id of the Business Transaction
     * @return {@link BusinessTransactions}
     */
    public BusinessTransactions getBTForApplication(String application,int btId){
        try{
            return RESTExecuter.executeBusinessTransactionQuery(auth, BusinessTransactionQuery.queryBTFromApps(baseURL.getControllerURL(), application, btId));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     *
     * @param appId The id for the application
     * @param btId Id of the Business Transaction
     * @return {@link BusinessTransactions}
     */
    public BusinessTransactions getBTForApplication(int appId,int btId){
        try{
            return RESTExecuter.executeBusinessTransactionQuery(auth, BusinessTransactionQuery.queryBTFromApps(baseURL.getControllerURL(), appId, btId));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     * 
     * @param application Name of the application
     * @return {@link Tiers}
     */
    public Tiers getTiersForApplication(String application){
        try{
            return RESTExecuter.executeTierQuery(auth, TierQuery.queryTiersFromApps(baseURL.getControllerURL(), application));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * 
     * @param application ExApplication id
     * @return {@link Tiers}
     */
    public Tiers getTiersForApplication(int application){
        try{
            return RESTExecuter.executeTierQuery(auth, TierQuery.queryTiersFromApps(baseURL.getControllerURL(), application));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     *
     * @param application Name of the application
     * @param tierId ID of the Tier
     * @return {@link Tiers}
     */
    public Tiers getTierForApplication(String application, int tierId){
        try{
            return RESTExecuter.executeTierQuery(auth, TierQuery.queryTierFromApps(baseURL.getControllerURL(), application,tierId));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     *
     * @param application ExApplication id
     * @param tierId ID of the Tier
     * @return {@link Tiers}
     */
    public Tiers getTierForApplication(int application, int tierId){
        try{
            return RESTExecuter.executeTierQuery(auth, TierQuery.queryTierFromApps(baseURL.getControllerURL(), application, tierId));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     * 
     * @param application Name of the application
     * @return {@link Nodes}
     */
    public Nodes getNodesForApplication(String application){
        try{
            return RESTExecuter.executeNodeQuery(auth, NodeQuery.queryNodesFromApps(baseURL.getControllerURL(), application));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * 
     * @param application Id of the application 
     * @return {@link Nodes}
     */
    public Nodes getNodesForApplication(int application){
        try{
            return RESTExecuter.executeNodeQuery(auth, NodeQuery.queryNodesFromApps(baseURL.getControllerURL(), application));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     *
     * @param application Name of the application
     * @param nodeId id of the Node
     * @return {@link Nodes}
     */
    public Nodes getNodeForApplication(String application, int nodeId){
        try{
            return RESTExecuter.executeNodeQuery(auth, NodeQuery.queryNodeFromApps(baseURL.getControllerURL(), application,nodeId));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     *
     * @param application Id of the application
     * @param nodeId Id of the Node
     * @return {@link Nodes}
     */
    public Nodes getNodeForApplication(int application,int nodeId){
        try{
            return RESTExecuter.executeNodeQuery(auth, NodeQuery.queryNodeFromApps(baseURL.getControllerURL(), application, nodeId));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }

    /**
     * 
     * @param application
     * @return 
     */
    public Backends getBackendsForApplication(String application){
        try{
            return RESTExecuter.executeBackends(auth, BackendsQuery.queryBackendsFromApps(baseURL.getControllerURL(), application));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * 
     * @param application
     * @param start
     * @param end
     * @return {@link PolicyViolations}
     */
    public PolicyViolations getHealthRuleViolations(String application, long start, long end){
        try{
            return RESTExecuter.executePolicyViolations(auth, PolicyViolationQuery.queryHealthRuleViolationsFromApps(baseURL.getControllerURL(), application,start,end));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * 
     * @param application
     * @param start
     * @param end
     * @return {@link PolicyViolations}
     */
    public PolicyViolations getPolicyViolations(String application, long start, long end){
        try{
            return RESTExecuter.executePolicyViolations(auth, PolicyViolationQuery.queryPolicyViolationsFromApps(baseURL.getControllerURL(), application, start, end));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * 
     * @param application
     * @param eventTypes
     * @param severities
     * @param start
     * @param end
     * @return 
     */
    public Events getEvents(String application, String eventTypes, String severities, long start, long end){
        try{
            return RESTExecuter.executeEvents(auth, EventsQuery.queryPolicyViolationsSFromApps(baseURL.getControllerURL(), application, eventTypes, severities, start, end));
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * Returns MetricData that can be parsed 
     * Case statement to determine Query string. Possible Results
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metric
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @return {@link MetricDatas}
     * 
     * <p>
     * <br/>Index 0  : queyrAgentTierAppAgentAvailability
     * <br/>Index 1  : queryAgentTierMachineAgentAvailability
     * <br/>Index 2  : queryHDTierCPUBusy
     * <br/>Index 3  : queryHDTierCPUIdle
     * <br/>Index 4  : queryHDTierCPUStolen
     * <br/>Index 5  : queryHDTierDisksKBReadPerSec
     * <br/>Index 6  : queryHDTierDisksKBWrittenPerSec
     * <br/>Index 7  : queryHDTierDisksReadPerSec
     * <br/>Index 8  : queryHDTierDisksWritesPerSec
     * <br/>Index 9  : queryHDTierMemoryFreePerc
     * <br/>Index 10 : queryHDTierMemoryFreeMB
     * <br/>Index 11 : queryHDTierMemoryTotalMB
     * <br/>Index 12 : queryHDTierMemoryUsedPerc
     * <br/>Index 13 : queryHDTierMemoryUsedMB
     * <br/>Index 14 : queryHDTierNetworkIncomingKB
     * <br/>Index 15 : queryHDTierNetworkIncomingKBPerSec
     * <br/>Index 16 : queryHDTierNetworkIncomingPackets
     * <br/>Index 17 : queryHDTierNetworkIncomingPacketsPerSec
     * <br/>Index 18 : queryHDTierNetworkOutgoingKB
     * <br/>Index 19 : queryHDTierNetworkOutgoingKBPerSec
     * <br/>Index 20 : queryHDTierNetworkOutgoingPackets
     * <br/>Index 21 : queryHDTierNetworkOutgoingPacketsPerSec
     * <br/>Index 22 : queryJVMTierProcessCPUBurntMSPerMin
     * <br/>Index 23 : queryJVMTierProcessCPUUsagePerc
     * <br/>Index 24 : queryJVMTierGarbageCollectionGCTimeSpentPerMin
     * <br/>Index 25 : queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin
     * <br/>Index 26 : queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin
     * <br/>Index 27 : queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin
     * <br/>Index 28 : queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin
     * <br/>Index 29 : queryJVMTierMemoryHeapCommittedMB
     * <br/>Index 30 : queryJVMTierMemoryHeapCurrentUsageMB
     * <br/>Index 31 : queryJVMTierMemoryHeapMaxAvailableMB
     * <br/>Index 32 : queryJVMTierMemoryHeapUsedPerc
     * <br/>Index 33 : queryJVMTierMemoryNonHeapCommittedMB
     * <br/>Index 34 : queryJVMTierMemoryNonHeapCurrentUsageMB
     * <br/>Index 35 : queryJVMTierMemoryNonHeapMaxAvailableMB
     * <br/>Index 36 : queryJVMTierMemoryNonHeapUsedPerc
     * <br/>Index 37 : queryJVMTierThreadsCurrentNoOfThreads
     * <br/>Index 38 : queryOAPTierStallCount
     * <br/>Index 39 : queryOAPTierNumberOfVerySlowCalls
     * <br/>Index 40 : queryOAPTierNumberOfSlowCalls
     * <br/>Index 41 : queryOAPTierInfrastructureErrorsPerMinute
     * <br/>Index 42 : queryOAPTierHttpErrorCodesPerMinute
     * <br/>Index 43 : queryOAPTierExceptionsPerMinute
     * <br/>Index 44 : queryOAPTierErrorsPerMinute
     * <br/>Index 45 : queryOAPTierErrorPageRedirectsPerMinute
     * <br/>Index 46 : queryOAPTierCallsPerMinute
     * <br/>Index 47 : queryOAPTierAvgResponseTimeMS
     * <p>
     */
    public MetricDatas getRESTMetricQuery(int queryIndex, String application, String tier, long start, long end){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).append(" tier ").append(tier).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                query=mq.queryAgentTierAppAgentAvailability(tier, start, end);
                break;
            case 1:
                query=mq.queryAgentTierMachineAgentAvailability(tier, start, end);
                break;
            case 2:
                query=mq.queryHDTierCPUBusy(tier, start, end);
                break;
            case 3:
                query=mq.queryHDTierCPUIdle(tier, start, end);
                break;
            case 4:
                query=mq.queryHDTierCPUStolen(tier, start, end);
                break;
            case 5:
                query=mq.queryHDTierDisksKBReadPerSec(tier, start, end);
                break;
            case 6:
                query=mq.queryHDTierDisksKBWrittenPerSec(tier, start, end);
                break;
            case 7:
                query=mq.queryHDTierDisksReadPerSec(tier, start, end);
                break;
            case 8:
                query=mq.queryHDTierDisksWritesPerSec(tier, start, end);
                break;
            case 9:
                query=mq.queryHDTierMemoryFreePerc(tier, start, end);
                break;
            case 10:
                query=mq.queryHDTierMemoryFreeMB(tier, start, end);
                break;
            case 11:
                query=mq.queryHDTierMemoryTotalMB(tier, start, end);
                break;
            case 12:
                query=mq.queryHDTierMemoryUsedPerc(tier, start, end);
                break;
            case 13:
                query=mq.queryHDTierMemoryUsedMB(tier, start, end);
                break;
            case 14:
                query=mq.queryHDTierNetworkIncomingKB(tier, start, end);
                break;
            case 15:
                query=mq.queryHDTierNetworkIncomingKBPerSec(tier, start, end);
                break;
            case 16:
                query=mq.queryHDTierNetworkIncomingPackets(tier, start, end);
                break;
            case 17:
                query=mq.queryHDTierNetworkIncomingPacketsPerSec(tier, start, end);
                break;
            case 18:
                query=mq.queryHDTierNetworkOutgoingKB(tier, start, end);
                break;
            case 19:
                query=mq.queryHDTierNetworkOutgoingKBPerSec(tier, start, end);
                break;
            case 20:
                query=mq.queryHDTierNetworkOutgoingPackets(tier, start, end);
                break;
            case 21:
                query=mq.queryHDTierNetworkOutgoingPacketsPerSec(tier, start, end);
                break;
            case 22:
                query=mq.queryJVMTierProcessCPUBurntMSPerMin(tier, start, end);
                break;
            case 23:
                query=mq.queryJVMTierProcessCPUUsagePerc(tier, start, end);
                break;
            case 24:
                query=mq.queryJVMTierGarbageCollectionGCTimeSpentPerMin(tier, start, end);
                break;
            case 25:
                query=mq.queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin(tier, start, end);
                break;
            case 26:
                query=mq.queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin(tier, start, end);
                break;
            case 27:
                query=mq.queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(tier, start, end);
                break;
            case 28:
                query=mq.queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(tier, start, end);
                break;
            case 29:
                query=mq.queryJVMTierMemoryHeapCommittedMB(tier, start, end);
                break;
            case 30:
                query=mq.queryJVMTierMemoryHeapCurrentUsageMB(tier, start, end);
                break;
            case 31:
                query=mq.queryJVMTierMemoryHeapMaxAvailableMB(tier, start, end);
                break;
            case 32:
                query=mq.queryJVMTierMemoryHeapUsedPerc(tier, start, end);
                break;
            case 33:
                query=mq.queryJVMTierMemoryNonHeapCommittedMB(tier, start, end);
                break;
            case 34:
                query=mq.queryJVMTierMemoryNonHeapCurrentUsageMB(tier, start, end);
                break;
            case 35:
                query=mq.queryJVMTierMemoryNonHeapMaxAvailableMB(tier, start, end);
                break;
            case 36:
                query=mq.queryJVMTierMemoryNonHeapUsedPerc(tier, start, end);
                break;
            case 37:
                query=mq.queryJVMTierThreadsCurrentNoOfThreads(tier, start, end);
                break;
            case 38 :
		query=mq.queryOAPTierStallCount(tier, start, end);
		break;
	    case 39 :
		query=mq.queryOAPTierNumberOfVerySlowCalls(tier, start, end);
		break;
	    case 40 :
		query=mq.queryOAPTierNumberOfSlowCalls(tier, start, end);
		break;
	    case 41 :
		query=mq.queryOAPTierInfrastructureErrorsPerMinute(tier, start, end);
		break;
	    case 42 :
		query=mq.queryOAPTierHttpErrorCodesPerMinute(tier, start, end);
		break;
	    case 43 :
		query=mq.queryOAPTierExceptionsPerMinute(tier, start, end);
		break;
	    case 44 :
		query=mq.queryOAPTierErrorsPerMinute(tier, start, end);
		break;
	    case 45 :
		query=mq.queryOAPTierErrorPageRedirectsPerMinute(tier, start, end);
		break;
	    case 46 :
		query=mq.queryOAPTierCallsPerMinute(tier, start, end);
		break;
	    case 47 :
		query=mq.queryOAPTierAvgResponseTimeMS(tier, start, end);
		break;
            
            default:
                break;
        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).append(" tier ").append(tier).toString());
            return null;
        }
        
        try{
            return RESTExecuter.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
        
    }
    
    /**
     * Returns MetricData that can be parsed 
     * Case statement to determine Query string. Possible Results
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metric
     * @param node Name of the node which holds the metric
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @return {@link MetricDatas}
     * <p>
     * <br/>Index 0  : queyrAgentTierAppAgentAvailability
     * <br/>Index 1  : queryAgentTierMachineAgentAvailability
     * <br/>Index 2  : queryHDTierCPUBusy
     * <br/>Index 3  : queryHDTierCPUIdle
     * <br/>Index 4  : queryHDTierCPUStolen
     * <br/>Index 5  : queryHDTierDisksKBReadPerSec
     * <br/>Index 6  : queryHDTierDisksKBWrittenPerSec
     * <br/>Index 7  : queryHDTierDisksReadPerSec
     * <br/>Index 8  : queryHDTierDisksWritesPerSec
     * <br/>Index 9  : queryHDTierMemoryFreePerc
     * <br/>Index 10 : queryHDTierMemoryFreeMB
     * <br/>Index 11 : queryHDTierMemoryTotalMB
     * <br/>Index 12 : queryHDTierMemoryUsedPerc
     * <br/>Index 13 : queryHDTierMemoryUsedMB
     * <br/>Index 14 : queryHDTierNetworkIncomingKB
     * <br/>Index 15 : queryHDTierNetworkIncomingKBPerSec
     * <br/>Index 16 : queryHDTierNetworkIncomingPackets
     * <br/>Index 17 : queryHDTierNetworkIncomingPacketsPerSec
     * <br/>Index 18 : queryHDTierNetworkOutgoingKB
     * <br/>Index 19 : queryHDTierNetworkOutgoingKBPerSec
     * <br/>Index 20 : queryHDTierNetworkOutgoingPackets
     * <br/>Index 21 : queryHDTierNetworkOutgoingPacketsPerSec
     * <br/>Index 22 : queryJVMTierProcessCPUBurntMSPerMin
     * <br/>Index 23 : queryJVMTierProcessCPUUsagePerc
     * <br/>Index 24 : queryJVMTierGarbageCollectionGCTimeSpentPerMin
     * <br/>Index 25 : queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin
     * <br/>Index 26 : queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin
     * <br/>Index 27 : queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin
     * <br/>Index 28 : queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin
     * <br/>Index 29 : queryJVMTierMemoryHeapCommittedMB
     * <br/>Index 30 : queryJVMTierMemoryHeapCurrentUsageMB
     * <br/>Index 31 : queryJVMTierMemoryHeapMaxAvailableMB
     * <br/>Index 32 : queryJVMTierMemoryHeapUsedPerc
     * <br/>Index 33 : queryJVMTierMemoryNonHeapCommittedMB
     * <br/>Index 34 : queryJVMTierMemoryNonHeapCurrentUsageMB
     * <br/>Index 35 : queryJVMTierMemoryNonHeapMaxAvailableMB
     * <br/>Index 36 : queryJVMTierMemoryNonHeapUsedPerc
     * <br/>Index 37 : queryJVMTierThreadsCurrentNoOfThreads
     * <br/>Index 38 : queryOAPTierStallCount
     * <br/>Index 39 : queryOAPTierNumberOfVerySlowCalls
     * <br/>Index 40 : queryOAPTierNumberOfSlowCalls
     * <br/>Index 41 : queryOAPTierInfrastructureErrorsPerMinute
     * <br/>Index 42 : queryOAPTierHttpErrorCodesPerMinute
     * <br/>Index 43 : queryOAPTierExceptionsPerMinute
     * <br/>Index 44 : queryOAPTierErrorsPerMinute
     * <br/>Index 45 : queryOAPTierErrorPageRedirectsPerMinute
     * <br/>Index 46 : queryOAPTierCallsPerMinute
     * <br/>Index 47 : queryOAPTierAvgResponseTimeMS
     * <p>
     */
    public MetricDatas getRESTMetricQuery(int queryIndex, String application, String tier, String node, long start, long end){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.INFO,new StringBuilder().append("\nQueryIndex sent ").append(queryIndex).append(" application ").append(application).append(" tier ").append(tier).append(" node ").append(node).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                // Agent query
                query=mq.queryAgentNodeAppAgentAvailability(tier, node, start, end);
                break;
            case 1:
                query=mq.queryAgentNodeMachineAgentAvailability(tier, node, start, end);
                break;
            case 2:
                query=mq.queryHDNodeCPUBusy(tier, node, start, end);
                break;
            case 3:
                query=mq.queryHDNodeCPUIdle(tier, node, start, end);
                break;
            case 4:
                query=mq.queryHDNodeCPUStolen(tier, node, start, end);
                break;
            case 5:    
                query=mq.queryHDNodeDisksKBReadPerSec(tier, node, start, end);
                break;
            case 6:
                query=mq.queryHDNodeDisksKBWrittenPerSec(tier, node, start, end);
                break;
            case 7:
                query=mq.queryHDNodeDisksReadPerSec(tier, node, start, end);
                break;
            case 8:
                query=mq.queryHDNodeDisksWritesPerSec(tier, node, start, end);
                break;
            case 9:
                query=mq.queryHDNodeMemoryFreePerc(tier, node, start, end);
                break;
            case 10:
                query=mq.queryHDNodeMemoryFreeMB(tier, node, start, end);
                break;
            case 11:
                query=mq.queryHDNodeMemoryTotalMB(tier, node, start, end);
                break;
            case 12:
                query=mq.queryHDNodeMemoryUsedPerc(tier, node, start, end);
                break;
            case 13:
                query=mq.queryHDNodeMemoryUsedMB(tier, node, start, end);
                break;
            case 14:
                query=mq.queryHDNodeNetworkIncomingKB(tier, node, start, end);
                break;
            case 15:
                query=mq.queryHDNodeNetworkIncomingKBPerSec(tier, node, start, end);
                break;
            case 16:
                query=mq.queryHDNodeNetworkIncomingPackets(tier, node, start, end);
                break;
            case 17:
                query=mq.queryHDNodeNetworkIncomingPacketsPerSec(tier, node, start, end);
                break;
            case 18:
                query=mq.queryHDNodeNetworkOutgoingKB(tier, node, start, end);
                break;
            case 19:
                query=mq.queryHDNodeNetworkOutgoingKBPerSec(tier, node, start, end);
                break;
            case 20:
                query=mq.queryHDNodeNetworkOutgoingPackets(tier, node, start, end);
                break;
            case 21:
                query=mq.queryHDNodeNetworkOutgoingPacketsPerSec(tier, node, start, end);
                break;
            case 22:
                query=mq.queryJVMNodeProcessCPUBurntMSPerMin(tier, node, start, end);
                break;
            case 23:
                query=mq.queryJVMNodeProcessCPUUsagePerc(tier, node, start, end);
                break;
            case 24:
                query=mq.queryJVMNodeGarbageCollectionGCTimeSpentPerMin(tier, node, start, end);
                break;
            case 25:
                query=mq.queryJVMNodeGarbageCollectionMajorCollectionTimeSpentPerMin(tier, node, start, end);
                break;
            case 26:
                query=mq.queryJVMNodeGarbageCollectionMinorCollectionTimeSpentPerMin(tier, node, start, end);
                break;
            case 27:
                query=mq.queryJVMNodeGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(tier, node, start, end);
                break;
            case 28:
                query=mq.queryJVMNodeGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(tier, node, start, end);
                break;
            case 29:
                query=mq.queryJVMNodeMemoryHeapCommittedMB(tier, node, start, end);
                break;
            case 30:
                query=mq.queryJVMNodeMemoryHeapCurrentUsageMB(tier, node, start, end);
                break;
            case 31:
                query=mq.queryJVMNodeMemoryHeapMaxAvailableMB(tier, node, start, end);
                break;
            case 32:
                query=mq.queryJVMNodeMemoryHeapUsedPerc(tier, node, start, end);
                break;
            case 33:
                query=mq.queryJVMNodeMemoryNonHeapCommittedMB(tier, node, start, end);
                break;
            case 34:
                query=mq.queryJVMNodeMemoryNonHeapCurrentUsageMB(tier, node, start, end);
                break;
            case 35:
                query=mq.queryJVMNodeMemoryNonHeapMaxAvailableMB(tier, node, start, end);
                break;
            case 36:
                query=mq.queryJVMNodeMemoryNonHeapUsedPerc(tier, node, start, end);
                break;
            case 37:
                query=mq.queryJVMNodeThreadsCurrentNoOfThreads(tier, node, start, end);
                break;
            case 38 :
		query=mq.queryOAPNodeStallCount(tier,node, start, end);
		break;
	    case 39 :
		query=mq.queryOAPNodeNumberOfVerySlowCalls(tier,node, start, end);
		break;
	    case 40 :
		query=mq.queryOAPNodeNumberOfSlowCalls(tier,node, start, end);
		break;
	    case 41 :
		query=mq.queryOAPNodeInfrastructureErrorsPerMinute(tier,node, start, end);
		break;
	    case 42 :
		query=mq.queryOAPNodeHttpErrorCodesPerMinute(tier,node, start, end);
		break;
	    case 43 :
		query=mq.queryOAPNodeExceptionsPerMinute(tier,node, start, end);
		break;
	    case 44 :
		query=mq.queryOAPNodeErrorsPerMinute(tier,node, start, end);
		break;
	    case 45 :
		query=mq.queryOAPNodeErrorPageRedirectsPerMinute(tier,node, start, end);
		break;
	    case 46 :
		query=mq.queryOAPNodeCallsPerMinute(tier,node, start, end);
		break;
	    case 47 :
		query=mq.queryOAPNodeAvgResponseTimeMS(tier,node, start, end);
		break;
            default:
                
                break;
        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex sent ")
                    .append(queryIndex).append(" application ").append(application)
                    .append(" tier ").append(tier).append(" node ").append(node).toString());
            return null;
        }
        
        try{
            return RESTExecuter.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
    }
    
    /**
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param urlPath URL path that was captured
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @return {@link MetricDatas}
     * 
     * <p>
     * <br/>Index  0 : queryEUM_AJAX_REQUESTS_PER_MIN
     * <br/>Index  1 : queryEUM_AJAX_REQUESTS_ERRORS_PER_MIN
     * <br/>Index  2 : queryEUM_AJAX_DOC_DOWNLOAD_TIME
     * <br/>Index  3 : queryEUM_AJAX_DOC_PROCESSING_TIME
     * <br/>Index  4 : queryEUM_AJAX_END_USER_RESPONSE_TIME
     * <br/>Index  5 : queryEUM_AJAX_FIRST_BYTE_TIME_MS
     * <br/>Index  6 : queryEUM_BASE_PAGES_REQUESTS_PER_MIN
     * <br/>Index  7 : queryEUM_BASE_PAGES_DOC_READY_TIME_MS
     * <br/>Index  8 : queryEUM_BASE_PAGES_DOC_DOWNLOAD_TIME
     * <br/>Index  9 : queryEUM_BASE_PAGES_DOC_PROCESSING_TIME
     * <br/>Index 10 : queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME
     * <br/>Index 11 : queryEUM_BASE_PAGES_FIRST_BYTE_TIME_MS
     * <br/>Index 12 : queryEUM_BASE_PAGES_FRONT_END_TIME_MS
     * <br/>Index 13 : queryEUM_BASE_PAGES_PAGE_RENDER_TIME_MS
     * <br/>Index 14 : queryEUM_BASE_PAGES_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE
     * <br/>Index 15 : queryEUM_BASE_PAGES_RESPONSE_AVAILABLE_TIME_MS
     * <br/>Index 16 : queryEUM_BASE_PAGES_SERVER_CONNECTION_TIME_MS
     * <br/>Index 17 : queryEUM_BASE_PAGES_SYNTHETIC_REQUESTS_PER_MINUTE(urlPath, start, end);
     * </p>
     */
    public MetricDatas getRESTEUMMetricQuery(int queryIndex, String application, String urlPath, long start, long end){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex ")
                    .append(queryIndex).append(" application ").append(application).append(" url ").append(urlPath).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                // Agent query
                query=mq.queryEUM_AJAX_REQUESTS_PER_MIN(urlPath, start, end);
                break;
            case 1: 
                // Agent query
                query=mq.queryEUM_AJAX_REQUESTS_ERRORS_PER_MIN(urlPath, start, end);
                break;
            case 2: 
                // Agent query
                query=mq.queryEUM_AJAX_DOC_DOWNLOAD_TIME(urlPath, start, end);
                break;
            case 3: 
                // Agent query
                query=mq.queryEUM_AJAX_DOC_PROCESSING_TIME(urlPath, start, end);
                break;
            case 4: 
                // Agent query
                query=mq.queryEUM_AJAX_END_USER_RESPONSE_TIME(urlPath, start, end);
                break;
            case 5: 
                // Agent query
                query=mq.queryEUM_AJAX_FIRST_BYTE_TIME_MS(urlPath, start, end);
                break;
            case 6: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_REQUESTS_PER_MIN(urlPath, start, end);
                break;
            case 7: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOC_READY_TIME_MS(urlPath, start, end);
                break;
            case 8: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOC_DOWNLOAD_TIME(urlPath, start, end);
                break;    
            case 9: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_DOC_PROCESSING_TIME(urlPath, start, end);
                break;
            case 10: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME(urlPath, start, end);
                break;
            case 11: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_MS(urlPath, start, end);
                break;
            case 12: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_FRONT_END_TIME_MS(urlPath, start, end);
                break;
            case 13: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_PAGE_RENDER_TIME_MS(urlPath, start, end);
                break;
            case 14: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE(urlPath, start, end);
                break;
            case 15: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_RESPONSE_AVAILABLE_TIME_MS(urlPath, start, end);
                break;
            case 16: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_SERVER_CONNECTION_TIME_MS(urlPath, start, end);
                break;
            case 17: 
                // Agent query
                query=mq.queryEUM_BASE_PAGES_SYNTHETIC_REQUESTS_PER_MINUTE(urlPath, start, end);
                break;
            default:
                
                break;
                
        }
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder().append("\nMatching query was not found for queryIndex ")
                    .append(queryIndex).append(" application ").append(application).append(" url ").append(urlPath).toString());
            return null;
        }
        
        try{
            return RESTExecuter.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        
        return null;
    }
    
    /**
     * 
     * @param queryIndex Index of the type of query to run
     * @param application Name of the application which holds the metric
     * @param tier Name of the tier which holds the metric
     * @param site Business transaction name
     * @param start Timestamp in milliseconds for the start time for the query
     * @param end Timestamp in milliseconds for the end time for the query
     * @return {@link MetricDatas}
     * 
     * <p>
     * <br/>Index  0 : queryBTAVERAGE_BLOCK_TIME_MS
     * <br/>Index  1 : queryBTAVERAGE_CPU_USED_MS
     * <br/>Index  2 : queryBTAVERAGE_REQUEST_SIZE
     * <br/>Index  3 : queryBTAVERAGE_RESPONSE_TIME
     * <br/>Index  4 : queryBTAVERAGE_WAIT_TIME_MS
     * <br/>Index  5 : queryBTCALL_PER_MINUTE
     * <br/>Index  6 : queryBTERRORS_PER_MINUTE
     * <br/>Index  7 : queryBTNORMAL_AVERAGE_RESPONSE_TIME_MS
     * <br/>Index  8 : queryBTNUMBER_OF_SLOW_CALLS
     * <br/>Index  9 : queryBTNUMBER_OF_VERY_SLOW_CALLS
     * <br/>Index 10 : queryBTSTALL_COUNT
     * </p>
     */
    public MetricDatas getRESTBTMetricQuery(int queryIndex, String application, String tier, String site, long start, long end){
        String query=null;
        if(s.debugLevel >= 2){logger.log(Level.WARNING,new StringBuilder().append("\nQueryIndex ")
                    .append(queryIndex).append(" application ").append(application).append(" tier ").append(tier).append(" site ").append(site).toString());}
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),application);
        switch(queryIndex){
            case 0:
                query=mq.queryBTAVERAGE_BLOCK_TIME_MS(application, tier, site, start, end);
                break;
            case 1:
                query=mq.queryBTAVERAGE_CPU_USED_MS(application, tier, site, start, end);
                break;
            case 2:
                query=mq.queryBTAVERAGE_REQUEST_SIZE(application, tier, site, start, end);
                break;
            case 3:
                query=mq.queryBTAVERAGE_RESPONSE_TIME(application, tier, site, start, end);
                break;
            case 4:
                query=mq.queryBTAVERAGE_WAIT_TIME_MS(application, tier, site, start, end);
                break;
            case 5:
                query=mq.queryBTCALL_PER_MINUTE(application, tier, site, start, end);
                break;
            case 6:
                query=mq.queryBTERRORS_PER_MINUTE(application, tier, site, start, end);
                break;
            case 7:
                query=mq.queryBTNORMAL_AVERAGE_RESPONSE_TIME_MS(application, tier, site, start, end);
                break;
            case 8:
                query=mq.queryBTNUMBER_OF_SLOW_CALLS(application, tier, site, start, end);
                break;
            case 9:
                query=mq.queryBTNUMBER_OF_VERY_SLOW_CALLS(application, tier, site, start, end);
                break;
            case 10:
                query=mq.queryBTSTALL_COUNT(application, tier, site, start, end);
                break;
            default:
                break;
        }
        
        //This will be the final check, to insure that we don't send a bad query.
        if(query==null){ 
            logger.log(Level.WARNING,new StringBuilder()
                    .append("\nQueryIndex sent ").append(queryIndex).append(" application ")
                    .append(application).append(" tier ").append(tier).append(" site ").append(site).toString());
            return null;
        }
        
        try{
            return RESTExecuter.executeMetricQuery(auth, query);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred executing REST query::\n").append(e.getMessage()).append("\n").toString());
        }
        return null;
        
    }
}
