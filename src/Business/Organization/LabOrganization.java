/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.LabRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author zhaojiyuan
 */
public class LabOrganization extends Organization{
    public LabOrganization() {
        super(Organization.TypeOfOrg.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList<>();
        
        role.add(new LabRole());
        return role;
    }
}
