/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author zhaojiyuan
 */
public class EmployeeDirectory {
    private ArrayList<Employee> empList;
    public EmployeeDirectory(){
        empList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }
    
    public Employee createEmployee(String employeeName) {
        Employee employee = new Employee();
        employee.setEmployeeName(employeeName);
        empList.add(employee);
        return employee;
    }
}
