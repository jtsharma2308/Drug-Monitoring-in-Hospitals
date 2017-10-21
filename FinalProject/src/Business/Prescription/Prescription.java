/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Prescription;

import java.util.Date;

/**
 *
 * @author Jyoti
 */
public class Prescription {
    
    private int id;
    private int patientId;
    private int doctorId;
    private String details;
    private static int count = 0;
    private Date date;
    //private String prescriptionStatus;
    
    public Prescription(){
        id = count++;
    }

//    public String getPrescriptionStatus() {
//        return prescriptionStatus;
//    }
//
//    public void setPrescriptionStatus(String prescriptionStatus) {
//        this.prescriptionStatus = prescriptionStatus;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
//    @Override
//    public String toString() {
//        return prescriptionStatus;
//    }
}
