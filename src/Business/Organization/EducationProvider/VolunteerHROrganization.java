/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.EducationProvider;

import Business.Organization.Organization;
import Business.Person.VolunteerDirectory;
import Business.Role.EducationProvider.HRRole;
import Business.Role.Role;
import Business.WorkRequest.courseRequest.CourseRequestHistory;
import java.util.ArrayList;

/**
 *
 * @author Lintong
 */
public class VolunteerHROrganization extends  Organization{
    private VolunteerDirectory volunteerDirectory;
    private CourseRequestHistory courseRequestHistory;
    
    public VolunteerHROrganization() {
        super(Organization.Type.VolunteerHR.getValue());
        volunteerDirectory = new VolunteerDirectory();
        courseRequestHistory = new CourseRequestHistory();
        
    }

    public VolunteerDirectory getVolunteerDirectory() {
        return volunteerDirectory;
    }
     
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HRRole());
        return roles;
    }

    
}
