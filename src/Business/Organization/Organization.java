/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkRequest.WorkQueue;

/**
 *
 * @author zhaojiyuan
 */
public class Organization {
    private String name;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    private static int count = 1;
    private int organizationID;
    
    public Organization() {
        this.name = name;
        organizationID = count++;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        workQueue = new WorkQueue();
        
    }
}
