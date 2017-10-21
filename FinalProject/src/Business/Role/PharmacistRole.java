/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Location.Location;
import Business.Departments.Departments;
import Business.Departments.PharmacistDepartment;
import Business.UserAccount.UserAccount;
import UserInterface.PharmacistRole.PharmacistWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Jyoti
 */
public class PharmacistRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Departments organization, Location enterprise, EcoSystem business) {
        return new PharmacistWorkAreaJPanel(userProcessContainer, account, (PharmacistDepartment)organization, enterprise);
    }
    
}
