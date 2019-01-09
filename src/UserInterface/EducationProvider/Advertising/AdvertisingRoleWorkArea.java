/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EducationProvider.Advertising;

import Business.Classroom.Classroom;
import Business.Classroom.Device;
import Business.Classroom.DeviceDirectory;
import Business.EcoSystem;


import Business.Enterprise.Enterprise;
import Business.Organization.EducationProvider.AdvertisingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import static Business.WorkQueue.WorkRequest.Type.ClassroomRequest;
import Business.WorkRequest.ClassroomRequest.ClassroomRequest;

import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lintong
 */
public class AdvertisingRoleWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form Advertising
     */
   
   
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private AdvertisingOrganization advertisingOrganization;
    

    public AdvertisingRoleWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.advertisingOrganization = (AdvertisingOrganization)organization;
        this.system = system;
        populateClassTable();
        populateClassroomTable();
        populateDeviceTable();
        //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void populateClassTable(){
        
        DefaultTableModel model = (DefaultTableModel) classroomRequestTbl.getModel();
        
        model.setRowCount(0);
        for (ClassroomRequest request :(ArrayList<ClassroomRequest>) organization.getWorkQueue().getWorkRequestMap().get(WorkRequest.Type.ClassroomRequest)){
            Object[] row = new Object[6];
            row[0] = request.getCourse().getID();
            row[1] = request.getClassroom().getID();
            row[2] = request.getPublishDate();
            row[3] = request.getSender();
            row[4] = request.getReciever();
            row[5] = request.getClassroom().getAccomodation();
         
            model.addRow(row);
        }
        
  
    }
    
    public void populateClassroomTable(){
        DefaultTableModel model = (DefaultTableModel) classroomRequestTbl.getModel();
        
        model.setRowCount(0);
        for (Classroom classroom : advertisingOrganization.getClassroomList().getClassroomList()){
            Object[] row = new Object[5];
            row[0] = classroom;
            row[1] = classroom.getAccomodation();
            row[2] = classroom.getAvailWeekday();
            row[3] = classroom.getAvailStart();
            row[4] = classroom.getAvailEnd();
            
         
            model.addRow(row);
        }
        
    }
    public void populateDeviceTable(){
        
        DefaultTableModel model = (DefaultTableModel) classroomRequestTbl.getModel();
        
        model.setRowCount(0);
        int selectedRow = ClassroomTbl.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        Classroom cr = (Classroom)ClassroomTbl.getValueAt(selectedRow, 0);
        DeviceDirectory dd = cr.getDeviceDirectory();
        for(Device device : dd.getDeviceDirectory()){
            Object[] row = new Object[3];
            row[0] = device;
            row[1] = device.getName();
            row[2] = device.getUseness();
            model.addRow(row);
            
        }
     
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        classroomRequestTbl = new javax.swing.JTable();
        SendRequestBtn = new javax.swing.JButton();
        AssignBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        EquipmentTbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ClassroomTbl = new javax.swing.JTable();
        ShowBtn = new javax.swing.JButton();

        classroomRequestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ClassID", "ClassRoomID", "PublishDate", "Sender", "Reciever", "accomodation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(classroomRequestTbl);
        if (classroomRequestTbl.getColumnModel().getColumnCount() > 0) {
            classroomRequestTbl.getColumnModel().getColumn(0).setResizable(false);
            classroomRequestTbl.getColumnModel().getColumn(1).setResizable(false);
            classroomRequestTbl.getColumnModel().getColumn(2).setResizable(false);
            classroomRequestTbl.getColumnModel().getColumn(3).setResizable(false);
            classroomRequestTbl.getColumnModel().getColumn(4).setResizable(false);
            classroomRequestTbl.getColumnModel().getColumn(5).setResizable(false);
        }

        SendRequestBtn.setText("Send Classroom Request");
        SendRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendRequestBtnActionPerformed(evt);
            }
        });

        AssignBtn.setText("Assign");
        AssignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignBtnActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(102, 51, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        EquipmentTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "useness"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(EquipmentTbl);
        if (EquipmentTbl.getColumnModel().getColumnCount() > 0) {
            EquipmentTbl.getColumnModel().getColumn(0).setResizable(false);
            EquipmentTbl.getColumnModel().getColumn(1).setResizable(false);
            EquipmentTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setText("Devices");

        ClassroomTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ClassroomID", "Accomdation", "AvailWeekDay", "AvailDayStart", "AvailDayEnd"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(ClassroomTbl);
        if (ClassroomTbl.getColumnModel().getColumnCount() > 0) {
            ClassroomTbl.getColumnModel().getColumn(0).setResizable(false);
            ClassroomTbl.getColumnModel().getColumn(1).setResizable(false);
            ClassroomTbl.getColumnModel().getColumn(2).setResizable(false);
            ClassroomTbl.getColumnModel().getColumn(3).setResizable(false);
            ClassroomTbl.getColumnModel().getColumn(4).setResizable(false);
        }

        ShowBtn.setText("Show Detail");
        ShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ShowBtn)
                                .addGap(36, 36, 36)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(AssignBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SendRequestBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3))))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SendRequestBtn)
                            .addComponent(AssignBtn))
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(ShowBtn)
                        .addGap(98, 98, 98))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AssignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignBtnActionPerformed
        int selectedRow1 = ClassroomTbl.getSelectedRow();
        if (selectedRow1 < 0){
            return;
        }  
        Classroom classroom = (Classroom)ClassroomTbl.getValueAt(selectedRow1, 0);
        
        int selectedRow2 = classroomRequestTbl.getSelectedRow();
        if (selectedRow2 < 0){
            return;
        }  
        ClassroomRequest cr = (ClassroomRequest)classroomRequestTbl.getValueAt(selectedRow2, 0);
        
        cr.setClassroom(classroom);
        cr.setEPAdvertising(account);
        cr.getCourseRequest().setClassroom(classroom);
// TODO add your handling code here:
    }//GEN-LAST:event_AssignBtnActionPerformed

    private void SendRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendRequestBtnActionPerformed
       
        int selectedRow = classroomRequestTbl.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        ClassroomRequest cr = (ClassroomRequest)classroomRequestTbl.getValueAt(selectedRow, 0);
        cr.setStatus("Pending");
        cr.setEPAdvertising(account);
       
        
        // TODO add your handling code here:
    }//GEN-LAST:event_SendRequestBtnActionPerformed

    private void ShowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowBtnActionPerformed
        populateDeviceTable();        // TODO add your handling code here:
    }//GEN-LAST:event_ShowBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignBtn;
    private javax.swing.JTable ClassroomTbl;
    private javax.swing.JTable EquipmentTbl;
    private javax.swing.JButton SendRequestBtn;
    private javax.swing.JButton ShowBtn;
    private javax.swing.JTable classroomRequestTbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
