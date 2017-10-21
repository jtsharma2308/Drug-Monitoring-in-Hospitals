/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Location.Location;
import Business.Departments.Departments;
import static Business.Departments.Departments.Type.Patient;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Jyoti
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        Patient("Patient"),
        Pharmacist("Pharmacist");
        
        private String value;
        private RoleType(String value){
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
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Departments organization, 
            Location enterprise, 
            EcoSystem business);
    


    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}