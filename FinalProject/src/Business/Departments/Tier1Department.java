/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Departments;

import Business.Role.PatientRole;
//import Business.Role.PharmacistRole;
import Business.Role.Role;
import Business.Role.Tier1Role;
import java.util.ArrayList;

/**
 *
 * @author Jyoti
 */
public class Tier1Department extends Departments{

    public Tier1Department() {
        super(Departments.Type.Tier1.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Tier1Role());
        return roles;
    }
     
   
    
    
}
