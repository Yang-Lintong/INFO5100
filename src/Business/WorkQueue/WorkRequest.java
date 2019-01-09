/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Lintong
 */
public abstract class WorkRequest {
    private int workRequestID;
    
    private Date RequestDate;
    private String message;
    
    private Date ResponseDate;
    private String status;
    private UserAccount sender;         //不需要实例化？
    private UserAccount reciever;
    private static int con;
    
    public enum Type{
        Job("Job"),
        Recruit("Recruit"),
        JobHRRequest("JobHRRequest"),
        ClassroomRequest("ClassroomRequest"),
        VolunteerRequest("VolunteerRequest"),
        CourseRequest("CourseRequest")
        ;
        
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public WorkRequest(){
        RequestDate = new Date();
        ResponseDate = new Date();
        workRequestID = con;
        con++;
        
        
    }
   
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
    public int getWorkRequestID() {
        return workRequestID;
    }

    public void setWorkRequestID(int workRequestID) {
        this.workRequestID = workRequestID;
    }

    public Date getRequestDate() {
        return RequestDate;
    }

    public void setRequestDate(Date RequestDate) {
        this.RequestDate = RequestDate;
    }

    public Date getResponseDate() {
        return ResponseDate;
    }

    public void setResponseDate(Date ResponseDate) {
        this.ResponseDate = ResponseDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReciever() {
        return reciever;
    }

    public void setReciever(UserAccount reciever) {
        this.reciever = reciever;
    }
    
    
    
    
}
