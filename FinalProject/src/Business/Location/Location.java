/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Location;

import Business.Departments.Departments;
import Business.Departments.DepartmentDirectory;
import Business.Patient.PatientDirectory;
import Business.Prescription.PrescriptionDirectory;

/**
 *
 * @author Jyoti
 */
public abstract class Location extends Departments{

    private EnterpriseType enterpriseType;
    private DepartmentDirectory organizationDirectory;
    private PatientDirectory patientDirectory;
    private PrescriptionDirectory prescriptionDirectory; 
    
    public Location(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new DepartmentDirectory();
        patientDirectory = new PatientDirectory();
        prescriptionDirectory = new PrescriptionDirectory();
        
    }
    
    
    
    public enum EnterpriseType{
        Hospital("Apollo Hospital"){
            
        }, SOC("F5 Security Operations Center"){
            
        };
        
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public PrescriptionDirectory getPrescriptionDirectory() {
        return prescriptionDirectory;
    }

    public void setPrescriptionDirectory(PrescriptionDirectory prescriptionDirectory) {
        this.prescriptionDirectory = prescriptionDirectory;
    }
    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public DepartmentDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

}
