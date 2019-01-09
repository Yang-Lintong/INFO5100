/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Classroom;

import java.util.Date;

/**
 *
 * @author Lintong
 */
public class Classroom {
    private int ID;
    private String roomNum;
    private static int con;
    private String availWeekday;
    private Date availStart;
    private Date availEnd;
    private DeviceDirectory deviceDirectory;
    
    private String sponsorName;
    
    private boolean avil;
    private int accomodation;
    
    
    public Classroom(){
        ID = con;
        con++;
        deviceDirectory = new DeviceDirectory();
        
    }

    public int getID() {
        return ID;
    }

   

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public String getAvailWeekday() {
        return availWeekday;
    }

    public void setAvailWeekday(String availWeekday) {
        this.availWeekday = availWeekday;
    }

   

    public void setAvil(boolean avil) {
        this.avil = avil;
    }

    public boolean isAvil() {
        return avil;
    }

    public int getAccomodation() {
        return accomodation;
    }

    public void setAccomodation(int accomodation) {
        this.accomodation = accomodation;
    }

    public Date getAvailStart() {
        return availStart;
    }

    public void setAvailStart(Date availStart) {
        this.availStart = availStart;
    }

    public Date getAvailEnd() {
        return availEnd;
    }

    public void setAvailEnd(Date availEnd) {
        this.availEnd = availEnd;
    }

    public DeviceDirectory getDeviceDirectory() {
        return deviceDirectory;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }
    
     
    
}
