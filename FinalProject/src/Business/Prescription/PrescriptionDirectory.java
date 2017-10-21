/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Prescription;

import java.util.ArrayList;

/**
 *
 * @author Jyoti
 */
public class PrescriptionDirectory {
    private ArrayList<Prescription> prescriptionList;
    
    public PrescriptionDirectory(){
        prescriptionList = new ArrayList<>();
        
    }

    public ArrayList<Prescription> getPrescriptionList() {
        return prescriptionList;
    }
    
    public Prescription addPrescription(){
        Prescription prescription = new Prescription();
        prescriptionList.add(prescription);
        return prescription;
    }
}
