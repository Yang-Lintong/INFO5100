/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.EducationProvider;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import UserInterface.EducationProvider.AssignVolunteer.AssignVolunteer;
import javax.swing.JPanel;

/**
 *
 * @author Lintong
 */
public class AssignVolunteerRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new AssignVolunteer(userProcessContainer, account, organization, enterprise,system);
    }
    
}
