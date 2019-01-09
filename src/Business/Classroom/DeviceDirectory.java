/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Classroom;

import java.util.ArrayList;

/**
 *
 * @author Lintong
 */
public class DeviceDirectory {
    private ArrayList<Device>  deviceDirectory;
    public DeviceDirectory(){
        deviceDirectory = new ArrayList<Device>();
    }

    public ArrayList<Device> getDeviceDirectory() {
        return deviceDirectory;
    }
    
    
}
