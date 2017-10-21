/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Location;

import Business.Patient.PatientDirectory;
import java.util.ArrayList;

/**
 *
 * @author Jyoti
 */
public class LocationDirectory {
    
    private ArrayList<Location> locationList;
    

    public LocationDirectory() {
        locationList = new ArrayList<>();
    }

    public ArrayList<Location> getLocationList() {
        return locationList;
    }

    
    
    public Location createAndAddLocation(String name, Location.EnterpriseType type){
        Location enterprise = null;
        if (type == Location.EnterpriseType.Hospital){
            enterprise = new Hospitallocations(name);
            locationList.add(enterprise);
        }
        if (type == Location.EnterpriseType.SOC){
            enterprise = new SOCLocations(name);
            locationList.add(enterprise);
        }
        return enterprise;
    }
    
}
