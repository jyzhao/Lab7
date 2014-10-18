/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author zhaojiyuan
 */
public class ConfigureBusiness {
    public static Business configure() {
        Business business = Business.getInstance();
        
        AdminOrganization organization = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(organization);
        
        Employee employee = new Employee();
        employee.setEmployeeName("Yash");
        
        UserAccount ua = new UserAccount();
        ua.setUserName("admin");
        ua.setPassword("admin");
        ua.setRole(new AdminRole());
        ua.setEmployee(employee);
        
        organization.getUserAccountDirectory().getUserAccountList().add(ua);
        organization.getEmployeeDirectory().getEmpList().add(employee);
        
        return business;
    }
}
