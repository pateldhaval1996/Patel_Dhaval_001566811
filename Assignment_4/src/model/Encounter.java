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
public class Encounter {
    
    ArrayList<EncounterList> encountterList;
    
    public Encounter() {
        
        this.encountterList = new ArrayList<EncounterList>();
    }

    public ArrayList<EncounterList> getEncountterList() {
        return encountterList;
    }

    public void setEncountterList(ArrayList<EncounterList> encountterList) {
        this.encountterList = encountterList;
    }
    
    public void addNewPatient(Product person, double temperature, double blood_pressure, Integer pulse) {
        EncounterList encounter = new EncounterList(person, temperature, blood_pressure, pulse);
        encountterList.add(encounter) ;
    }
    
}
