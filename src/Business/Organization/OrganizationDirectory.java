/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author zhaojiyuan
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
        
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.TypeOfOrg type) {
        Organization organization = null;
        
        if (type.getValue().equals(Organization.TypeOfOrg.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
               
        }
        else if (type.getValue().equals(Organization.TypeOfOrg.Lab.getValue())) {
            organization = new LabOrganization();
            organizationList.add(organization);
               
        }
        return organization;
    }
}
