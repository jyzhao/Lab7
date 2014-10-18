/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author zhaojiyuan
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    public UserAccount authenticateUser(String userName, String password) {
            for (UserAccount ua : userAccountList) {
                if (ua.getUserName().equals(userName) && ua.getPassword().equals(password)) {
                    return ua;
                }
            }
            return null;
    }
    
    public UserAccount createUserAccount(String username,String password,Employee employee,Role role) {
        UserAccount ua = new UserAccount();
        ua.setUserName(username);
        ua.setPassword(password);
        ua.setEmployee(employee);
        ua.setRole(role);
        
        userAccountList.add(ua);
        
        return ua;
    }
}
