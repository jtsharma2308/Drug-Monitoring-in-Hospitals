/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Patient.Patient;
import Business.Role.Role;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jyoti
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public UserAccount authenticateUserName(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return ua;
            }
        }
        
        return null;
    }

    public UserAccount createUserAccount(String username, String password, Employee employee, Role role, String ipAddress, int pin, String email) {
        
        Boolean unique = checkIfUsernameIsUnique(username);
        
        if(unique){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setPerson(employee);
        userAccount.setRole(role);
        userAccount.setPin(pin);
        userAccount.getStoredIPAddressDirectory().addIPAddress(ipAddress);
        userAccount.getPerson().setEmail(email);
        userAccountList.add(userAccount);
        //JOptionPane.showMessageDialog(null, "Account created successfully!!");
        return userAccount;
        }else{
            JOptionPane.showMessageDialog(null, "Username is already taken. Please choose another Username.");
            return null;
        }
    }

    public UserAccount createUserAccount(String username, String password,Patient patient, Role role, String ipAddress, String email) {
       
        Boolean unique = checkIfUsernameIsUnique(username);
        
        if(unique){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        //userAccount.setEmployee(employee);
        userAccount.setPerson(patient);
        userAccount.setRole(role);
        userAccount.getPerson().setEmail(email);
        userAccount.getStoredIPAddressDirectory().addIPAddress(ipAddress);
        userAccountList.add(userAccount);
        JOptionPane.showMessageDialog(null, "Account created successfully!!");
        return userAccount;
        }else{
            JOptionPane.showMessageDialog(null, "Username is already taken. Please choose another Username.");
            return null;
        }
    }

    public boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
}
