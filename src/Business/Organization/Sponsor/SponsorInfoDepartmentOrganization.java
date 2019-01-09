/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Sponsor;

import Business.Classroom.ClassroomList;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.Sponsor.InfoDepartmentRole;
import Business.WorkRequest.courseRequest.CourseRequestHistory;
import java.util.ArrayList;


/**
 *
 * @author Lintong
 */
public class SponsorInfoDepartmentOrganization extends Organization{
    
    private ClassroomList classroomList;
    private CourseRequestHistory courseRequestHistory;
    
    public SponsorInfoDepartmentOrganization(){
        super(Organization.Type.SpInfoDepartment.getValue());
        classroomList = new ClassroomList(); 
        courseRequestHistory = new CourseRequestHistory();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InfoDepartmentRole());
        return roles;
    }

    public CourseRequestHistory getCourseRequestHistory() {
        return courseRequestHistory;
    }

    public ClassroomList getClassroomList() {
        return classroomList;
    }
    
    
}
