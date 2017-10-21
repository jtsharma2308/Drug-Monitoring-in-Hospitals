/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Prescription.Prescription;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Jyoti
 */
public abstract class WorkRequest {

    //private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private Prescription prescription;

//    public enum Type {
//
//        ToDoctor("Pending Doctor Review"),
//        FromDoctor("Prescribed"),
//        FromPharmacist("Prescription Completed by Pharmacist"),
//        ByPatient("Completed");
//
//        private String value;
//
//        private Type(String value) {
//            this.value = value;
//        }
//
//        public String getValue() {
//            return value;
//        }
//    }

    public WorkRequest() {
        requestDate = new Date();
        prescription = new Prescription();
    }

//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    @Override
    public String toString() {
        return status;
    }
}
