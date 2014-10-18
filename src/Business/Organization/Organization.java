/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkRequest.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author zhaojiyuan
 */
public abstract class Organization {
    private String name;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    private static int count = 1;
    private int organizationID;
    
    public Organization(String name) {
        this.name = name;
        organizationID = count++;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        workQueue = new WorkQueue();
        
    }
    
    public enum TypeOfOrg {
        Admin("Admin Organization"),
        Doctor("Doctor Organization"),
        Lab("Lab Organization");
        
        private String value;
        
        private TypeOfOrg(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
        
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
    
    
}
