/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Sponsor;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import UserInterface.EducationProvider.Advertising.AdvertisingRoleWorkArea;
import UserInterface.Sponsor.Advertising;
import javax.swing.JPanel;

/**
 *
 * @author Lintong
 */
public class AdvertisingRole extends Role{
    
   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new Advertising(userProcessContainer, account, organization, enterprise,system);
    }
    
}
