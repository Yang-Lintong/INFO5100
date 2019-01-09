/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Class;

import java.util.ArrayList;

/**
 *
 * @author Lintong
 */

public class CourseList {
    private ArrayList<Course> courseList;
    public CourseList(){
        courseList=new ArrayList();
        
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }
    public Course addClass(){
        Course cl=new Course();
        courseList.add(cl);
        return cl;
    }
    
    
    
}
