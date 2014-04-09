/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.s;
import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author gilbert.solorzano
 */
public class AffectedEntityDefinition {
    private String entityType;
    private int entityId;
    
    public AffectedEntityDefinition(){}

    @XmlElement(name=AppExportS.ENTITY_TYPE)
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @XmlElement(name=AppExportS.ENTITY_ID)
    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud=new StringBuilder();
        bud.append(AppExportS.L2).append(AppExportS.AFFECTED_ENTITY_DEFINITION);
        bud.append(AppExportS.L3).append("EntityType").append(AppExportS.VE).append(entityType);
        bud.append(AppExportS.L3).append("EntityId").append(AppExportS.VE).append(entityId);
        return bud.toString();
    }
    
}
