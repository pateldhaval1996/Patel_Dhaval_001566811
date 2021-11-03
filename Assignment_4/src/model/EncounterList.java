/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dhaval
 */
public class EncounterList {
    
    Product person; 
    double temperature;
    double blood_pressure;
    Integer pulse;

    public EncounterList(Product person, double temperature, double blood_pressure, Integer pulse) {
        this.person = person;
        this.temperature = temperature;
        this.blood_pressure = blood_pressure;
        this.pulse = pulse;
    }

    public Product getProduct() {
        return person;
    }

    public void setProduct(Product person) {
        this.person = person;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getBlood_pressure() {
        return blood_pressure;
    }

    public void setBlood_pressure(double blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public Integer getPulse() {
        return pulse;
    }

    public void setPulse(Integer pulse) {
        this.pulse = pulse;
    }
    
    
    
}
