/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Departments;

import Business.Role.HospitalAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jyoti
 */
public class HospitalAdminDepartment extends Departments{

    public HospitalAdminDepartment() {
        super(Type.HospitalAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HospitalAdminRole());
        return roles;
    }
     
}
