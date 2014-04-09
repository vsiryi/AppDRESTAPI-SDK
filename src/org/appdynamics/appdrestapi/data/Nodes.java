/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.s;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author soloink
 */

@XmlRootElement(name=s.NODES)
@XmlSeeAlso({Node.class, IPAddresses.class, IPAddress.class})
public class Nodes {
    private ArrayList<Node> node=new ArrayList<Node>();

    @XmlElement(name=s.NODE)
    public ArrayList<Node> getNodes() {
        return node;
    }

    public void setNode(ArrayList<Node> node) {
        this.node = node;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        
        bud.append("\tNode\n").append(node.toString());
        
        return bud.toString();
    }
    
    
}
