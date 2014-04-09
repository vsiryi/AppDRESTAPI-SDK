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
@XmlRootElement(name=AppExportS.POLICY_VIOLATIONS)
@XmlSeeAlso({PolicyViolation.class,EntityDefinition.class})
public class PolicyViolations {
    private ArrayList<PolicyViolation> policyViolations=new ArrayList<PolicyViolation>();
    
    public PolicyViolations(){}

    @XmlElement(name=AppExportS.POLICY_VIOLATION)
    public ArrayList<PolicyViolation> getPolicyViolations() {
        return policyViolations;
    }

    public void setPolicyViolations(ArrayList<PolicyViolation> policyViolations) {
        this.policyViolations = policyViolations;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.POLICY_VIOLATIONS);
        for(PolicyViolation pv:policyViolations) bud.append(pv.toString());
        return bud.toString();
    }
}
