/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Location.Location;
import Business.Departments.Departments;
import Business.Departments.PatientDepartment;
import Business.UserAccount.UserAccount;
import UserInterface.PatientRole.PatientWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Jyoti
 */
public class PatientRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Departments organization, Location enterprise, EcoSystem business) {
        return new PatientWorkAreaJPanel(userProcessContainer, account, (PatientDepartment) organization, enterprise);
    }
        
}
