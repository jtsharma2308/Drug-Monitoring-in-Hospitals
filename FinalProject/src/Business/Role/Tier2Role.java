/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Location.Location;
import Business.Departments.Departments;
import Business.Departments.Tier2Department;
import Business.UserAccount.UserAccount;
import UserInterface.Tier2Role.Tier2WorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Jyoti
 */
public class Tier2Role extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Departments organization, Location enterprise, EcoSystem business) {
        return new Tier2WorkAreaJPanel(userProcessContainer, account, (Tier2Department) organization, business);
    }
    
}
