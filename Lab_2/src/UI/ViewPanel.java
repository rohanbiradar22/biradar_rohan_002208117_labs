/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import MODEL.VitalSigns;
import MODEL.VitalsSignHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rohan
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    
    VitalsSignHistory history;
    public ViewPanel(VitalsSignHistory history) {
        initComponents();
        this.history = history;
        
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vlabelBloodPressure = new javax.swing.JLabel();
        vlabelTemperature = new javax.swing.JLabel();
        vlabelPulse = new javax.swing.JLabel();
        vlabelDate = new javax.swing.JLabel();
        vtextTemperature = new javax.swing.JTextField();
        vtextBloodPrtessure = new javax.swing.JTextField();
        vtextPulse = new javax.swing.JTextField();
        vtextDate = new javax.swing.JTextField();
        vbuttonView = new javax.swing.JButton();
        vbuttonDelete = new javax.swing.JButton();
        vlabelViewVitalSignsTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableView = new javax.swing.JTable();

        vlabelBloodPressure.setText("Blood Pressure:");

        vlabelTemperature.setText("Temperature: ");

        vlabelPulse.setText("Pulse:");

        vlabelDate.setText("Date:");

        vbuttonView.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vbuttonView.setText("View");
        vbuttonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vbuttonViewActionPerformed(evt);
            }
        });

        vbuttonDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vbuttonDelete.setText("Delete");
        vbuttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vbuttonDeleteActionPerformed(evt);
            }
        });

        vlabelViewVitalSignsTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vlabelViewVitalSignsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vlabelViewVitalSignsTitle.setText("View Vital Signs");

        tableView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Temperature", "Pulse", "Date"
            }
        ));
        jScrollPane1.setViewportView(tableView);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vbuttonView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vbuttonDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vlabelBloodPressure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vlabelDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vlabelTemperature, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vlabelPulse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vtextTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vtextBloodPrtessure, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vtextPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vtextDate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(286, Short.MAX_VALUE))
            .addComponent(vlabelViewVitalSignsTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(vlabelViewVitalSignsTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(vbuttonView)
                        .addGap(59, 59, 59)
                        .addComponent(vbuttonDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vlabelTemperature)
                    .addComponent(vtextTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vlabelBloodPressure)
                    .addComponent(vtextBloodPrtessure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vlabelPulse)
                    .addComponent(vtextPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vlabelDate)
                    .addComponent(vtextDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void vbuttonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vbuttonViewActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex=tableView.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }
            DefaultTableModel model = (DefaultTableModel) tableView.getModel();
             VitalSigns selectedVital=(VitalSigns) model.getValueAt(selectedRowIndex, 2);
            
             
             vtextBloodPrtessure.setText(String.valueOf(selectedVital.getBloodPressure()));
             vtextPulse.setText(String.valueOf(selectedVital.getPulse()));
             vtextTemperature.setText(String.valueOf(selectedVital.getTemperature()));
             vtextDate.setText(selectedVital.getDate());
             
             
        
    }//GEN-LAST:event_vbuttonViewActionPerformed

    private void vbuttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vbuttonDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex=tableView.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
            DefaultTableModel model = (DefaultTableModel) tableView.getModel();
             VitalSigns selectedVital=(VitalSigns) model.getValueAt(selectedRowIndex, 2);
            
            history.deleteVitals(selectedVital);
            JOptionPane.showMessageDialog(this, "Vital signs deleted. ");
            
            populateTable();
        
        
    }//GEN-LAST:event_vbuttonDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableView;
    private javax.swing.JButton vbuttonDelete;
    private javax.swing.JButton vbuttonView;
    private javax.swing.JLabel vlabelBloodPressure;
    private javax.swing.JLabel vlabelDate;
    private javax.swing.JLabel vlabelPulse;
    private javax.swing.JLabel vlabelTemperature;
    private javax.swing.JLabel vlabelViewVitalSignsTitle;
    private javax.swing.JTextField vtextBloodPrtessure;
    private javax.swing.JTextField vtextDate;
    private javax.swing.JTextField vtextPulse;
    private javax.swing.JTextField vtextTemperature;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel model=(DefaultTableModel) tableView.getModel();
        model.setRowCount(0);
        
        for(VitalSigns vs: history.getHistory()){
            Object[] row=new Object[3];
            row[0]=vs.getTemperature();
            row[1]=vs.getPulse();
            row[2]=vs;
            
            model.addRow(row);  
        }
        
        
        
    }
}
