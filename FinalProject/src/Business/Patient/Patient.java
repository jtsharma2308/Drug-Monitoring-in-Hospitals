/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Person.Person;
import Business.Prescription.PrescriptionDirectory;

/**
 *
 * @author Jyoti
 */
public class Patient extends Person {
   // private String name;
    private String DOB;
    private String sex;
    private int ssn;
    private String status;
    private String phone;
    //private String email;
    private String policyNumber;
    private double creditCard;
    private PrescriptionDirectory prescriptionDirectory;
    //private int patientID;
    //private static int count = 0;
    
    public Patient(){
        //patientID = count++;
        prescriptionDirectory = new PrescriptionDirectory();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public double getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(double creditCard) {
        this.creditCard = creditCard;
    }

//    public int getPatientID() {
//        return patientID;
//    }
//
//    public void setPatientID(int patientID) {
//        this.patientID = patientID;
//    }

    public PrescriptionDirectory getPrescriptionDirectory() {
        return prescriptionDirectory;
    }
    
//    @Override
//    public String toString() {
//        return name;
//    }
}
