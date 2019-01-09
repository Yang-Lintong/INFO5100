/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest.courseRequest;

import java.util.ArrayList;

/**
 *
 * @author Lintong
 */
public class CourseRequestHistory {
    private ArrayList<CourseRequest>  courseRequestHistory;

    public CourseRequestHistory(){
        courseRequestHistory = new ArrayList<CourseRequest>();
    }
    public ArrayList<CourseRequest> getCourseRequestHistory() {
        return courseRequestHistory;
    }
    
    public CourseRequest addCourseRequest(){
        CourseRequest cr= new CourseRequest();
        courseRequestHistory.add(cr);
        return cr;
        
    }
    
    
    
}
