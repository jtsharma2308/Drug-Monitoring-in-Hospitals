/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Person.Person;
import java.util.Date;

/**
 *
 * @author Jyoti
 */
public class Employee extends Person{
    
//    private Date DOB;
//    private int ssn;
//    private String phone;
//    private String email;
    
    private int id;
    private static int count = 1;

    public Employee() {
        id = count;
        count++;
    }

    

//    public Date getDOB() {
//        return DOB;
//    }
//
//    public void setDOB(Date DOB) {
//        this.DOB = DOB;
//    }
//
//    public int getSsn() {
//        return ssn;
//    }
//
//    public void setSsn(int ssn) {
//        this.ssn = ssn;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
