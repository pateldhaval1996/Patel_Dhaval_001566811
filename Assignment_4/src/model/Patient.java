/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Dhaval
 */
public class Patient {

    
    ArrayList<Encounter> orderList;
    
    public Patient() {
      orderList = new ArrayList<Encounter>();
 
    }

    public ArrayList<Encounter> getEncounterList() {
        return orderList;
    }

    public void setEncounterList(ArrayList<Encounter> orderList) {
        this.orderList = orderList;
    }
    

    
}
