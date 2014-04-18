/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.resources;

import org.appdynamics.appdrestapi.data.RESTBaseURL;
import org.appdynamics.appdrestapi.data.Tier;
import org.appdynamics.appdrestapi.data.Tiers;
import org.appdynamics.appdrestapi.resources.s;

import java.util.logging.Logger;
import java.util.logging.Level;
/**
 *
 * @author soloink
 */
public class TierQuery {
    private static Logger logger=Logger.getLogger(TierQuery.class.getName());
    
    public static String queryTiersFromApps(String baseURL, String application){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_APPS).append(QueryEncoder.encode(application)).append(s.URL_TIERS);
        return bud.toString();
    }
    
    public static String queryTiersFromApps(String baseURL, int appID){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_APPS).append(appID).append(s.URL_TIERS);
        return bud.toString();
    }

    public static String queryTierFromApps(String baseURL, String application,int tierId){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_APPS).append(QueryEncoder.encode(application)).append(s.URL_TIERS).append(s.F).append(tierId);
        return bud.toString();
    }

    public static String queryTierFromApps(String baseURL, int appID, int tierId){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_APPS).append(appID).append(s.URL_TIERS).append(s.F).append(tierId);
        return bud.toString();
    }
}
