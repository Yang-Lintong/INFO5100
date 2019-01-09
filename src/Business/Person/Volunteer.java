/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author zhangchi
 */
public class Volunteer extends Person {
    private int VolunteerID;
    private String School;
    private String FirstChoice;
    private String SecondChoice;
    private boolean Experienced;
    private String TimeTable;
    private String availableWeekday;
    private static int counte;
    
    public Volunteer() {
        super(Person.Type.Volunteer.getValue());
        this.VolunteerID = counte;
        this.School = new String();
        this.FirstChoice = new String();
        this.SecondChoice = new String();
        counte++;
    }

    public int getVolunteerID() {
        return VolunteerID;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String School) {
        this.School = School;
    }

    public String getFirstChoice() {
        return FirstChoice;
    }

    public void setFirstChoice(String FirstChoice) {
        this.FirstChoice = FirstChoice;
    }

    public String getSecondChoice() {
        return SecondChoice;
    }

    public void setSecondChoice(String SecondChoice) {
        this.SecondChoice = SecondChoice;
    }

    public boolean isExperienced() {
        return Experienced;
    }

    public void setExperienced(boolean Experienced) {
        this.Experienced = Experienced;
    }

    public String getTimeTable() {
        return TimeTable;
    }

    public void setTimeTable(String TimeTable) {
        this.TimeTable = TimeTable;
    }

    public String getAvailableWeekday() {
        return availableWeekday;
    }

    public void setAvailableWeekday(String availableWeekday) {
        this.availableWeekday = availableWeekday;
    }
    
    
    
}
