/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.util.Date;
import javafx.scene.control.CheckBox;

/**
 *
 * @author Dhaval
 */
public class Uber_Go {
    
    private String manufacturer;
    private String model_name;
    private Integer manu_year;
    private Integer car_seats;
    private String car_serial_number;
    private String car_model_number;
    private String car_maintenance_date;
    private String car_city;
    private String car_available;
    //private CheckBox biometric_identifier;
    //private File full_face_photo;
    //private String unique_person_identifier;
    

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    @Override
    public String toString(){
    return manufacturer;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public Integer getManu_year() {
        return manu_year;
    }

    public void setManu_year(Integer manu_year) {
        this.manu_year = manu_year;
    }

    public Integer getCar_seats() {
        return car_seats;
    }

    public void setCar_seats(Integer car_seats) {
        this.car_seats = car_seats;
    }

    public String getCar_serial_number() {
        return car_serial_number;
    }

    public void setCar_serial_number(String car_serial_number) {
        this.car_serial_number = car_serial_number;
    }

    public String getCar_model_number() {
        return car_model_number;
    }

    public void setCar_model_number(String car_model_number) {
        this.car_model_number = car_model_number;
    }

    public String getCar_maintenance_date() {
        return car_maintenance_date;
    }

    public void setCar_maintenance_date(String car_maintenance_date) {
        this.car_maintenance_date = car_maintenance_date;
    }
    
    public String getCar_city() {
        return car_city;
    }

    public void setCar_city(String car_city) {
        this.car_city = car_city;
    }
    
    public String getCar_available() {
        return car_available;
    }

    public void setCar_available(String car_available) {
        this.car_available = car_available;
    }
    
    
    
}
