/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.JobProvider;

import Business.Job.JobList;
import Business.Organization.Organization;
import Business.Role.JopProvider.HRRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author zhangqiumin
 */
public class JPHROrganization extends Organization {
    
    private JobList positionList;

    public JPHROrganization() {
        super(Organization.Type.JobHR.getValue());
        positionList=new JobList();
    }

    public JobList getPositionList() {
        return positionList;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HRRole());
        return roles;
    }
}
