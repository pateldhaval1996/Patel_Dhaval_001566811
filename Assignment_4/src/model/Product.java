/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author archil
 */
public class Product {

    
    private String personName;
    private int age;
    private long contactNo;
    private int blood_pressure;
    private double temperature;
    private double pulse;
    private String date;
    private List<Person> recordsList;

    public List<Person> getRecordsList() {
        return recordsList;
    }

    public void setRecordsList(List<Person> recordsList) {
        this.recordsList = recordsList;
    }
    
    //private static int count = 0;

    public Product() {
        this.recordsList = new ArrayList();
    }

    
    @Override
    public String toString() {
        return personName; //To change body of generated methods, choose Tools | Templates.
    }

    /*public Product() {
        count++;
        personID = count;
    }*/

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getContactNumber() {
        return contactNo;
    }

    public void setContactNumber(long contactNo) {
        this.contactNo = contactNo;
    }

    
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
}
