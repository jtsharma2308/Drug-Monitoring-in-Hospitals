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
public class Hospitallocations extends Location{

    public Hospitallocations(String name) {
        super(name, EnterpriseType.Hospital);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
