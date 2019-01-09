/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import Business.Organization.FBPI.CustomerOrganizaiton;
//import Business.Organization.FBPI.FBPIAdminOrganizaiton;
//import Business.Organization.FBPI.FBPIInfoDepartmentOrganization;
//import Business.Organization.FBPI.PIOrganization;
import Business.Organization.JobProvider.JPAdminOrganization;
import Business.Organization.JobProvider.JPHROrganization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
//    public Organization createOrganization(Type type){
//        Organization organization = null;
//        if (type.getValue().equals(Type.FBPIAdmin.getValue())) {
//            organization = new FBPIAdminOrganizaiton();
//            organizationList.add(organization);
//        }
//        else if (type.getValue().equals(Type.Customer.getValue())) {
//            organization = new CustomerOrganizaiton();
//            organizationList.add(organization);
//        }
//        else if (type.getValue().equals(Type.InfoDepartment.getValue())) {
//            organization = new FBPIInfoDepartmentOrganization();
//            organizationList.add(organization);
//        }
//        else if (type.getValue().equals(Type.PI.getValue())) {
//            organization = new PIOrganization();
//            organizationList.add(organization);
//        }
//        else if (type.getValue().equals(Type.JobProviderAdmin.getValue())) {
//            organization = new JPAdminOrganization();
//            organizationList.add(organization);
//        }
//        else if (type.getValue().equals(Type.JobHR.getValue())) {
//            organization = new JPHROrganization();
//            organizationList.add(organization);
//        }
//        
//        return organization;
//    }
}