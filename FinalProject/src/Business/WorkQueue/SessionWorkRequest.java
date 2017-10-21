/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Prescription.Prescription;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Jyoti
 */
public class SessionWorkRequest extends WorkRequest {

    private String workProgress;
    private UserAccount user;
    private String ipAddress;
    private long lastUserLogin;
    
    
    public SessionWorkRequest(){
        user = new UserAccount();
    }

    public UserAccount getUser() {
        return user;
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public long getLastUserLogin() {
        return lastUserLogin;
    }

    public void setLastUserLogin(long lastUserLogin) {
        this.lastUserLogin = lastUserLogin;
    }

    public String getWorkProgress() {
        return workProgress;
    }

    public void setWorkProgress(String workProgress) {
        this.workProgress = workProgress;
    }

}
