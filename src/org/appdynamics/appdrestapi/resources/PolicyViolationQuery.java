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
public class PolicyViolationQuery {
    
    private static Logger logger=Logger.getLogger(PolicyViolationQuery.class.getName());
    
    //https://familysearch.saas.appdynamics.com/controller/rest/applications/53/problems/
    //healthrule-violations?time-range-type=BEFORE_NOW&duration-in-mins=10&output=XML'
    public static String queryPolicyViolationsSFromApps(String baseURL, String application, long start, long end){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_APPS).append(QueryEncoder.encode(application)).append(s.URL_PROBLEMS);
        bud.append(s.URL_POLICY_VIOLATIONS);
        bud.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        bud.append(s.TIME_END_TIME).append(end).append(s.XML_OUTPUT);
        return bud.toString();
    }
    
    public static String queryHealthRuleViolationsSFromApps(String baseURL, String application, long start, long end){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_APPS).append(QueryEncoder.encode(application)).append(s.URL_PROBLEMS);
        bud.append(s.URL_HEALTH_RULE_VIOLATIONS).append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        bud.append(s.TIME_END_TIME).append(end).append(s.XML_OUTPUT);
        return bud.toString();
    }
    
}
