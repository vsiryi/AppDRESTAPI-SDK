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
public class AffectedEntities {
    
    private ArrayList<EntityDefinition> entityDefinition=new ArrayList<EntityDefinition>();
    
    public AffectedEntities(){}

    @XmlElement(name=AppExportS.ENTITY_DEFINITION)
    public ArrayList<EntityDefinition> getEntityDefinition() {
        return entityDefinition;
    }

    public void setEntityDefinition(ArrayList<EntityDefinition> entityDefinition) {
        this.entityDefinition = entityDefinition;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        for(EntityDefinition ed:entityDefinition) bud.append(AppExportS.L2).append(AppExportS.ENTITY_DEFINITION).append(ed.toString());
        return bud.toString();
    }
    
}
