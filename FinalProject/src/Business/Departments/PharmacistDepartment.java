/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Departments;

import Business.Role.PharmacistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jyoti
 */
public class PharmacistDepartment extends Departments{

    public PharmacistDepartment() {
        super(Departments.Type.Pharmacist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PharmacistRole());
        return roles;
    }
     
   
    
    
}
