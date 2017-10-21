/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Person.Person;
import Business.Role.Role;
import Business.Session.SessionHistory;
import Business.WorkQueue.WorkQueue;
import IPAddress.StoredIPAddressDirectory;

/**
 *
 * @author Jyoti
 */
public class UserAccount {

    private String username;
    private String password;
    private int pin;
    private StoredIPAddressDirectory storedIPAddressDirectory;
    //private Employee employee;
    private Person person;
    public static long maximumDuration = 2;
    //private long loginDuration;
    private SessionHistory sessionHistory;
    private Role role;
    private WorkQueue workQueue;
    private int wrongCounter;
    //private Patient patient;

    public UserAccount() {
        workQueue = new WorkQueue();
        storedIPAddressDirectory = new StoredIPAddressDirectory();
        sessionHistory = new SessionHistory();
    }

    public StoredIPAddressDirectory getStoredIPAddressDirectory() {
        return storedIPAddressDirectory;
    }

    public SessionHistory getSessionHistory() {
        return sessionHistory;
    }

    public void setSessionHistory(SessionHistory sessionHistory) {
        this.sessionHistory = sessionHistory;
    }

    public int getWrongCounter() {
        return wrongCounter;
    }

    public void setWrongCounter(int wrongCounter) {
        this.wrongCounter = wrongCounter;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

//    public String getEnteredIP() {
//        return enteredIP;
//    }
//
//    public void setEnteredIP(String enteredIP) {
//        this.enteredIP = enteredIP;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public Patient getPatient() {
//        return patient;
//    }
//
//    public void setPatient(Patient patient) {
//        this.patient = patient;
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }

    public void setRole(Role role) {
        this.role = role;
    }

//    public Employee getEmployee() {
//        return employee;
//    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    @Override
    public String toString() {
        return username;
    }

}
