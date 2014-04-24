/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.s;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 *
 * @author gilbert.solorzano
 */

@XmlRootElement(name=s.REQUEST_SEGMENT_DATAS)
@XmlSeeAlso(Snapshot.class)
public class Snapshots {
    private ArrayList<Snapshot> requestDatas=new ArrayList<Snapshot>();
    
    public Snapshots(){}

    @XmlElement(name=s.REQUEST_SEGMENT_DATA)
    public ArrayList<Snapshot> getRequestDatas() {
        return requestDatas;
    }

    public void setRequestDatas(ArrayList<Snapshot> requestDatas) {
        this.requestDatas = requestDatas;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(s.REQUEST_SEGMENT_DATAS);
        for(Snapshot ss: requestDatas) bud.append(ss.toString());
        return bud.toString();
    }
}
