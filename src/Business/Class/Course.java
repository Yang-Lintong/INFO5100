/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Class;

import java.util.Date;

/**
 *
 * @author Lintong
 */
public class Course {
    private int ID;
    private static int con;
    private String description;
    private Date startDate;
    private Date endDate;
    private String weekDay;

    public Course() {
        ID = con;
        con++;
    }

    public int getID() {
        return ID;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }
    
    
    
            
    
}
