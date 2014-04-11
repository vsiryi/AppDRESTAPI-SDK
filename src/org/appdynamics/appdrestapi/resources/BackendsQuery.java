/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.resources;


import org.appdynamics.appdrestapi.resources.s;

import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author gilbert.solorzano
 */
public class BackendsQuery {
    private static Logger logger=Logger.getLogger(BackendsQuery.class.getName());
    
    public static String queryBackendsFromApps(String baseURL, String application){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_APPS).append(QueryEncoder.encode(application));
        bud.append(s.URL_BACKENDS);
        return bud.toString();
    }
    
}
