/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.JobRequests.JobRequests;
import Business.WorkRequest.ClassroomRequest.ClassroomRequest;

import UserInterface.JobHR.JobHRRequest;
//import Business.WorkQueue.RecruitRequest;

import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author zhangqiumin
 */
public class WorkQueue {
    
//    private ArrayList<WorkRequest> workRequestList;
    
    private HashMap<WorkRequest.Type, ArrayList> workRequestMap;

    public WorkQueue() {
//        workRequestList = new ArrayList<>();
        workRequestMap = new HashMap<WorkRequest.Type, ArrayList>();
        
        // Every type has its own arrayList.
        workRequestMap.put(WorkRequest.Type.Job, new ArrayList<JobRequests>());
        workRequestMap.put(WorkRequest.Type.JobHRRequest, new ArrayList<JobHRRequest>());
        //workRequestMap.put(WorkRequest.Type.Recruit, new ArrayList<RecruitRequest>());
        workRequestMap.put(WorkRequest.Type.ClassroomRequest, new ArrayList<ClassroomRequest>());
        workRequestMap.put(WorkRequest.Type.VolunteerRequest, new ArrayList<ClassroomRequest>());
        workRequestMap.put(WorkRequest.Type.CourseRequest, new ArrayList<ClassroomRequest>());
        
    }

//    public ArrayList<WorkRequest> getWorkRequestList() {
//        return workRequestList;
//    }

    public HashMap<WorkRequest.Type, ArrayList> getWorkRequestMap() {
        return workRequestMap;
    }
    
    
    /***
     * Once a workrequest is created, you need to add the workRequest into the cooresponding organization. 
     * @param workRequest type
     * @return 
     */
    public WorkRequest createWorkRequest(WorkRequest.Type type) {
        
        WorkRequest wr = null;
        
        if(type.getValue().equals(WorkRequest.Type.Job.getValue())) {
            wr = new JobRequests();
        }
       // if(type.getValue().equals(WorkRequest.RequestType.Recruit.getValue())) {
       //     wr = new RecruitRequest();
       // }
        
        return wr;
    }
    


}