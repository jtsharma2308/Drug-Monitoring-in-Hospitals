/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Location.Location;
import Business.Departments.Departments;
import Business.Departments.Tier1Department;
import Business.UserAccount.UserAccount;
import UserInterface.Tier1Role.Tier1WorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Jyoti
 */
public class Tier1Role extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Departments organization, Location enterprise, EcoSystem business) {
        return new Tier1WorkAreaJPanel(userProcessContainer, account, (Tier1Department) organization, enterprise);
    }
    
}
