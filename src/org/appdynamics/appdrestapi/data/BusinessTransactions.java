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
 * @author gilbert.solorzano
 */

@XmlRootElement(name=s.BUSINESS_TRANSACTIONS)
@XmlSeeAlso(BusinessTransaction.class)
public class BusinessTransactions {
    private ArrayList<BusinessTransaction> businessTransactions=new ArrayList<BusinessTransaction>();

    @XmlElement(name=s.BUSINESS_TRANSACTION)
    public ArrayList<BusinessTransaction> getBusinessTransactions() {
        return businessTransactions;
    }

    public void setBusinessTransactions(ArrayList<BusinessTransaction> businessTransactions) {
        this.businessTransactions = businessTransactions;
    }
    
    @Override
    public String toString(){
        StringBuilder bud=new StringBuilder();
        for(BusinessTransaction bt:businessTransactions) bud.append(bt.toString());
        return bud.toString();
    }
    
    
}
