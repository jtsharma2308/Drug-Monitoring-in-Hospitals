/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Location.LocationDirectory;

/**
 *
 * @author Jyoti
 */
public class Network {

    private String name;
    private LocationDirectory locationDirectory;

    public Network() {
        locationDirectory = new LocationDirectory();
    }

    public LocationDirectory getLocationDirectory() {
        return locationDirectory;
    }

    public void setLocationDirectory(LocationDirectory locationDirectory) {
        this.locationDirectory = locationDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
