/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Location.Location;
import Business.Departments.Departments;
import Business.UserAccount.UserAccount;
import UserInterface.AdministrativeRole.HospitalAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Jyoti
 */
public class HospitalAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Departments organization, Location enterprise, EcoSystem business) {
        return new HospitalAdminWorkAreaJPanel(userProcessContainer, organization, enterprise);
    }

    
    
}
