package Business;

import Business.Network.Network;
import Business.Departments.Departments;
import Business.Location.Location;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Jyoti
 */
public class EcoSystem extends Departments {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private Location location;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
    }

  
    
    public ArrayList<Network> getNetworkList() {
        if (networkList.size() == 0){
        
        Network network = new Network();
        network.setName("Hospital");
        networkList.add(network);
        
        Network network1 = new Network();
        network1.setName("SOC");
        
        networkList.add(network1);
        }
        
        return networkList;
    }

//    ArrayList<String> hospitalList = new ArrayList<String>();
//    
//    public ArrayList<String> getHospitalList(){
//       hospitalList.add("123");
//       
//       return hospitalList;
//    }
//    
//    ArrayList<String> socList = new ArrayList<String>();
//    
//    public ArrayList<String> getSOCList(){
//        socList.add("F5 Security Operations Center");
//        
//        return socList;
//    }
//    public Network createAndAddNetwork() {
//        Network network = new Network();
//        networkList.add(network);
//        return network;
    
    
//    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

        for (Network network : networkList) {
        }

        return true;
    }
}
