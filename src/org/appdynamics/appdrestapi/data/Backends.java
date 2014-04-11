/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.s;
import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 */

@XmlRootElement(name=AppExportS.BACKENDS)
@XmlSeeAlso({Backend.class,Properties.class,NameValue.class})
public class Backends {
    private ArrayList<Backend> backend=new ArrayList<Backend>();
    
    public Backends(){}

    @XmlElement(name=AppExportS.BACKEND)
    public ArrayList<Backend> getBackend() {
        return backend;
    }

    public void setBackend(ArrayList<Backend> backend) {
        this.backend = backend;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.BACKENDS);
        for(Backend bc : backend) bud.append(bc.toString());
        return bud.toString();
    }
}
