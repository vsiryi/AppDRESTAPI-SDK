/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.s;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;



/**
 *
 * @author soloink
 */

@XmlRootElement(name=s.APPLICATIONS)
@XmlSeeAlso(Application.class)
public class Applications {
    private ArrayList<Application> applications=new ArrayList<Application>();
    
    public Applications(){}
    
    @XmlElement(name=s.APPLICATION)
    public ArrayList<Application> getApplications(){
        return applications;
    }
    
    public void setApplications(ArrayList<Application> applications){
        this.applications=applications;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        for(Application app: applications){
            bud.append(app.toString());
        }
        return bud.toString();
    }
    
}
