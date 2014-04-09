/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.performance;

import org.appdynamics.appdrestapi.RESTAccess;

import org.appdynamics.appdrestapi.data.Node;
import org.appdynamics.appdrestapi.data.Nodes;
import org.appdynamics.appdrestapi.util.TimeRange;
import java.util.ArrayList;
/**
 *
 * @author gilbert.solorzano
 * 
 * There might be additional metrics for this object, for now there will not be.
 */
public class OAPAppPerformance extends OAPTierPerformance{
    private ArrayList<ApplicationPerformanceRange> appRange=new ArrayList<ApplicationPerformanceRange>();
    private ArrayList<OAPTierPerformance> oapTiers=new ArrayList<OAPTierPerformance>();
    
    public OAPAppPerformance(){super();}
    
    public OAPAppPerformance(String name){super(name);}
    
    public OAPAppPerformance(String name, int id){super(name,id);}

    
    
    public ArrayList<ApplicationPerformanceRange> getAppRange() {
        return appRange;
    }

    public void setAppRange(ArrayList<ApplicationPerformanceRange> appRange) {
        this.appRange = appRange;
    }

    public ArrayList<OAPTierPerformance> getOapTiers() {
        return oapTiers;
    }

    public void setOapTiers(ArrayList<OAPTierPerformance> oapTiers) {
        this.oapTiers = oapTiers;
    }
    
    public void populatePerfMetrics(ArrayList<TimeRange> timeRanges, RESTAccess access ){
        Nodes nodes = access.getNodesForApplication(id);
        for(Node node:nodes.getNodes()){
            OAPTierPerformance tier=null;
            for(OAPTierPerformance oapTier: oapTiers){
                if(oapTier.getId() == node.getTierId()) tier=oapTier;
            }
            
            if(tier == null){ tier=new OAPTierPerformance(node.getTierName(),node.getTierId());oapTiers.add(tier);}
            
            tier.getOapNodePerf().add(new OAPNodePerformance(node));
        }
        
        for(OAPTierPerformance oapTier: oapTiers){
                //
        }
    }
    
}
