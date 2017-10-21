/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Prescription.Prescription;

/**
 *
 * @author raunak
 */
public class DoctorWorkRequest extends WorkRequest{
    
    private String workProgress;
    
//    private Prescription prescription;
//
//    public DoctorWorkRequest(){
//        
//        prescription = new Prescription();
//    }
//
//    public Prescription getPrescription() {
//        return prescription;
//    }
//
//    public void setPrescription(Prescription prescription) {
//        this.prescription = prescription;
//    }
    
    public String getWorkProgress() {
        return workProgress;
    }

    public void setWorkProgress(String workProgress) {
        this.workProgress = workProgress;
    }
    
    
}
