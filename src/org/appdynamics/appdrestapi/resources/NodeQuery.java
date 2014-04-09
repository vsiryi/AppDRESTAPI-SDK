/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.resources;


import org.appdynamics.appdrestapi.data.RESTBaseURL;
import org.appdynamics.appdrestapi.data.Application;
import org.appdynamics.appdrestapi.data.Applications;
import org.appdynamics.appdrestapi.resources.s;

import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author soloink
 */
public class NodeQuery {
    private static Logger logger=Logger.getLogger(NodeQuery.class.getName());
    
    public static String queryNodesFromApps(String baseURL, String application){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_APPS).append(QueryEncoder.encode(application)).append(s.URL_NODES);
        return bud.toString();
    }
    
    public static String queryNodesFromApps(String baseURL, int appID){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_APPS).append(appID).append(s.URL_NODES);
        return bud.toString();
    }
    
}
