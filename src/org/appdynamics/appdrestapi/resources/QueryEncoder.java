/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.resources;

import java.net.URLEncoder;
import java.net.URLDecoder;


import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author soloink
 */
public class QueryEncoder {
    private static final Logger logger=Logger.getLogger(QueryEncoder.class.getName());
    
    public QueryEncoder(){}
    
    public static String decode(String url){
        try{
            return URLDecoder.decode(url, "ISO-8859-1");
        }catch(Exception e){
          logger.log(Level.SEVERE,new StringBuilder().append("URL dencoding exception occurred: ").append(e.getMessage()).toString());  
        }
        return url;
    }
    
    public static String encode(String url){
        try{
           
            return URLEncoder.encode(url, "ISO-8859-1").replaceAll("\\+", "%20");
        }catch(Exception e){
          logger.log(Level.SEVERE,new StringBuilder().append("URL encoding exception occurred: ").append(e.getMessage()).toString());
        }
        return url;
    }
    
    public static String encodeSpaces(String url){
        try{
           
            return url.replaceAll(" ", "%20").replace("|", "%7C");
        }catch(Exception e){
          logger.log(Level.SEVERE,new StringBuilder().append("URL encoding exception occurred: ").append(e.getMessage()).toString());
        }
        return url;
    }
}
