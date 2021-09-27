/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package profile_info;

/**
 *
 * @author Dhaval
 */

import java.io.File;
import java.util.Date;

public class User {
    
    private String name;
    private String place;
    private Date date;
    private Integer tel_no;
    private Integer fax_no;
    private String email;
    private Integer ssn;
    private Integer medical_record_number;
    private String health_plan_beneficary_number;
    private Integer bank_account_number;
    private Integer certificate_license_number;
    private String vehicle_license_number;
    private Integer device_serial_number;
    private String linkedin;
    private String internet_protocal_address;
    private File biometric_identifier;
    private File full_face_photo;
    private String unique_person_identifier;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getTel_no() {
        return tel_no;
    }

    public void setTel_no(Integer tel_no) {
        this.tel_no = tel_no;
    }

    public Integer getFax_no() {
        return fax_no;
    }

    public void setFax_no(Integer fax_no) {
        this.fax_no = fax_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }

    public Integer getMedical_record_number() {
        return medical_record_number;
    }

    public void setMedical_record_number(Integer medical_record_number) {
        this.medical_record_number = medical_record_number;
    }

    public String getHealth_plan_beneficary_number() {
        return health_plan_beneficary_number;
    }

    public void setHealth_plan_beneficary_number(String health_plan_beneficary_number) {
        this.health_plan_beneficary_number = health_plan_beneficary_number;
    }

    public Integer getBank_account_number() {
        return bank_account_number;
    }

    public void setBank_account_number(Integer bank_account_number) {
        this.bank_account_number = bank_account_number;
    }

    public Integer getCertificate_license_number() {
        return certificate_license_number;
    }

    public void setCertificate_license_number(Integer certificate_license_number) {
        this.certificate_license_number = certificate_license_number;
    }

    public String getVehicle_license_number() {
        return vehicle_license_number;
    }

    public void setVehicle_license_number(String vehicle_license_number) {
        this.vehicle_license_number = vehicle_license_number;
    }

    public Integer getDevice_serial_number() {
        return device_serial_number;
    }

    public void setDevice_serial_number(Integer device_serial_number) {
        this.device_serial_number = device_serial_number;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getInternet_protocal_address() {
        return internet_protocal_address;
    }

    public void setInternet_protocal_address(String internet_protocal_address) {
        this.internet_protocal_address = internet_protocal_address;
    }

    public File getBiometric_identifier() {
        return biometric_identifier;
    }

    public void setBiometric_identifier(File biometric_identifier) {
        this.biometric_identifier = biometric_identifier;
    }

    public File getFull_face_photo() {
        return full_face_photo;
    }

    public void setFull_face_photo(File full_face_photo) {
        this.full_face_photo = full_face_photo;
    }

    public String getUnique_person_identifier() {
        return unique_person_identifier;
    }

    public void setUnique_person_identifier(String unique_person_identifier) {
        this.unique_person_identifier = unique_person_identifier;
    }

    public Object getImage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
