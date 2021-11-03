/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Dhaval
 */
public class Person {

    //private String personName;
    private String personName;
    private int blood_pressure;
    private double temperature;
    private double pulse;
    private String date;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    
    //private static int count = 0;
/*
    @Override
    public String toString() {
        return personName; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPersonName() {
        return personName;
    }
    
    @Override
    public void setPersonName(String personName) {
        this.personName = personName;
    }*/
    
    
    public int getBP() {
        return blood_pressure;
    }

    public void setBP(int blood_pressure) {
        this.blood_pressure = blood_pressure;
    }
    
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPulse() {
        return pulse;
    }

    public void setPulse(double pulse) {
        this.pulse = pulse;
    }
    
    
    public Person(int blood_pressure, double temperature, double pulse,String date) {
        
        this.blood_pressure = blood_pressure;
        this.temperature = temperature;
        this.pulse = pulse;
        this.date = date;
    }

}
