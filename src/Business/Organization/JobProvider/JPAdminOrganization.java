/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.JobProvider;

import Business.Organization.Organization;
import Business.Role.JopProvider.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 * Job Provider Admin Role Organization
 * @author zhangqiumin
 */
public class JPAdminOrganization extends Organization {

    public JPAdminOrganization() {
        super(Organization.Type.JobProviderAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
}
