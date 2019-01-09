/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.ClassHistory.Piece;
import Business.JobRequests.JobRequests;
import java.util.ArrayList;

/**
 *
 * @author zhangchi
 */
public class Customer extends Person {
    private int CustomerID;
    private ArrayList<Piece> ClassHistory;
    private ArrayList<JobRequests> JobRequestsList;
    private static int count;

    public Customer() {
        super(Person.Type.Customer.getValue());
        CustomerID = count;
        this.ClassHistory = new ArrayList();
        this.JobRequestsList = new ArrayList();
        count++;
        
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public ArrayList<Piece> getClassHistory() {
        return ClassHistory;
    }

    public void setClassHistory(ArrayList<Piece> ClassHistory) {
        this.ClassHistory = ClassHistory;
    }

    public ArrayList<JobRequests> getJobRequestsList() {
        return JobRequestsList;
    }

    public void setJobRequestsList(ArrayList<JobRequests> JobRequestsList) {
        this.JobRequestsList = JobRequestsList;
    }
    
    
}
