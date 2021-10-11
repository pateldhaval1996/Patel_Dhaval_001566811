/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dhaval
 */
public class Car_Info {
    
    private ArrayList<Uber_Go> history;
    
    public Car_Info(){
        
        this.history = new ArrayList<Uber_Go>();
    }

    public ArrayList<Uber_Go> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Uber_Go> history) {
        this.history = history;
    }
    
    public Uber_Go addNewCar(){
        
        Uber_Go newCar = new Uber_Go();
        history.add(newCar);
        return newCar;
    }  
    
    public void deleteUberGo(Uber_Go ug){
        history.remove(ug);
        
    }
    /*public List<Uber_Go> parseList() {
        
        //List<Uber_Go> avaCar = new ArrayList<Uber_Go>();
        List<Uber_Go> unavaCar;
        unavaCar = new ArrayList<Uber_Go>();
        for(Uber_Go current : history) {*/
            /*
            1. if(current.isAvable) return current;
            2. avaCar.add(current);
            unavaCAr.add(current);
            3. 
                    
        
        
        //return new Arraylist<Uber_Go>();
        
    }*/
     
}