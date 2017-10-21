/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Departments;

import Business.Departments.Departments.Type;
//import Business.Patient.PatientDirectory;
import java.util.ArrayList;

/**
 *
 * @author Jyoti
 */
public class DepartmentDirectory {
    
    private ArrayList<Departments> organizationList;
    

    public DepartmentDirectory() {
        organizationList = new ArrayList<>();
        
    }

    public ArrayList<Departments> getOrganizationList() {
        return organizationList;
    }
      
    public Departments createOrganization(Type type){
        Departments organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorDepartment();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pharmacist.getValue())){
            organization = new PharmacistDepartment();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Patient.getValue())){
            organization = new PatientDepartment();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Tier1.getValue())){
            organization = new Tier1Department();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Tier2.getValue())){
            organization = new Tier2Department();
            organizationList.add(organization);
        }
        return organization;
    }
}