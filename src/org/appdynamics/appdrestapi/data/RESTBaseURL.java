/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import java.net.URLEncoder;
import org.appdynamics.appdrestapi.resources.s;

import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author soloink
 * 
 * This is going to be the main class that will supply the REST url.
 */
public class RESTBaseURL {
    private String controller="localhost";
    private String port="8090";
    private boolean useSSL=true;
    
    public String getControllerURL(){
        StringBuilder bud=new StringBuilder();
        if(useSSL){ bud.append(s.HTTPS);}
        else{bud.append(s.HTTP);}
        
        bud.append(controller).append(s.COLON).append(port);
        
        return bud.toString();
    }

    /*
     * @param controller The controller
     * @param port The controller port
     * 
     */
    public RESTBaseURL(String controller, String port){
        this.controller=controller;
        this.port=port;
    }
    
    /*
     * @param controller The controller
     * @param port The controller port
     * @param useSSL Use SSL in the query
     * 
     */
    public RESTBaseURL(String controller, String port, boolean useSSL){
        this.controller=controller;
        this.port=port;
        this.useSSL=useSSL;
    }
    
    


    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public boolean isUseSSL() {
        return useSSL;
    }

    public void setUseSSL(boolean useSSL) {
        this.useSSL = useSSL;
    }
    
    

    
}
