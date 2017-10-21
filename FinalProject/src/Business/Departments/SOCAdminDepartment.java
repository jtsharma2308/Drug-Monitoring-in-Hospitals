/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Departments;

import Business.Role.HospitalAdminRole;
import Business.Role.Role;
import Business.Role.SOCAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Jyoti
 */
public class SOCAdminDepartment extends Departments{

    public SOCAdminDepartment() {
        super(Type.SOCAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SOCAdminRole());
        return roles;
    }
     
}
