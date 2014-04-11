/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.AppExportS;
import org.appdynamics.appdrestapi.resources.s;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 */
public class Properties {
    private ArrayList<NameValue> properties=new ArrayList<NameValue>();
    
    public Properties(){}

    @XmlElement(name=AppExportS.NAME_VALUE)
    public ArrayList<NameValue> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<NameValue> properties) {
        this.properties = properties;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2).append(AppExportS.PROPERTIES);
        for(NameValue nv:properties) bud.append(nv.toString());
        
        return bud.toString();
    }
}
