/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Location;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jyoti
 */
public class SOCLocations extends Location{

    public SOCLocations(String name) {
        super(name, EnterpriseType.SOC);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
