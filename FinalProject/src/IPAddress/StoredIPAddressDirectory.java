/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IPAddress;

import java.util.ArrayList;

/**
 *
 * @author Jyoti
 */
public class StoredIPAddressDirectory {
    
    private ArrayList<String> ipAddressList;
    
    public StoredIPAddressDirectory(){
        ipAddressList = new ArrayList<>();
    }

    public ArrayList<String> getIpAddressList() {
        return ipAddressList;
    }
    
    public String addIPAddress(String value){
        //String ipAddress = new Patient();
        ipAddressList.add(value);
        return value;
    }
}
