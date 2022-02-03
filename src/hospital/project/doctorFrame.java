/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.project;

import java.awt.Menu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author amine
 */
public class doctorFrame extends javax.swing.JFrame {

    /**
     * Creates new form doctorFrame
     */
    public doctorFrame() {
        initComponents();
     
    }
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SSNL = new javax.swing.JLabel();
        firstNameL = new javax.swing.JLabel();
        lastNameL = new javax.swing.JLabel();
        specilizationL = new javax.swing.JLabel();
        SSNT = new javax.swing.JTextField();
        firstNameT = new javax.swing.JTextField();
        lastNameT = new javax.swing.JTextField();
        specilizationT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorTable = new javax.swing.JTable();
        insertDoctorB = new javax.swing.JButton();
        selectDoctorB = new javax.swing.JButton();
        deleteDoctorB = new javax.swing.JButton();
        homeB = new javax.swing.JButton();
        updateDoctorB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doctor");
        setLocation(new java.awt.Point(360, 80));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        SSNL.setText("SSN");

        firstNameL.setText("first name");

        lastNameL.setText("last name");

        specilizationL.setText("specilization");

        SSNT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SSNTMouseClicked(evt);
            }
        });

        firstNameT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTActionPerformed(evt);
            }
        });

        specilizationT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specilizationTActionPerformed(evt);
            }
        });

        doctorTable.setAutoCreateRowSorter(true);
        doctorTable.setBackground(new java.awt.Color(242, 240, 240));
        doctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SSN", "first name", "last name", "specilization"
            }
        ));
        jScrollPane1.setViewportView(doctorTable);

        insertDoctorB.setText("Insert");
        insertDoctorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertDoctorBActionPerformed(evt);
            }
        });

        selectDoctorB.setText("Select");
        selectDoctorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDoctorBActionPerformed(evt);
            }
        });

        deleteDoctorB.setText("Delete");
        deleteDoctorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDoctorBActionPerformed(evt);
            }
        });

        homeB.setText("Home");
        homeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBActionPerformed(evt);
            }
        });

        updateDoctorB.setText("Ubdate");
        updateDoctorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDoctorBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(firstNameT, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(homeB)
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameL, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SSNL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameL, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(specilizationL))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(SSNT, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lastNameT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(specilizationT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(insertDoctorB, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(selectDoctorB, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(deleteDoctorB, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(updateDoctorB, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SSNL, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SSNT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(homeB, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specilizationL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(specilizationT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectDoctorB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertDoctorB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteDoctorB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateDoctorB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTActionPerformed

    private void specilizationTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specilizationTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specilizationTActionPerformed

    private void homeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBActionPerformed
      if (evt.getSource() == homeB)
      {
          home h = new home ();
          this.setVisible(false);
          h.setVisible(true);
      }
    }//GEN-LAST:event_homeBActionPerformed

    private void updateDoctorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDoctorBActionPerformed
        try {
            connection c = new connection();
            //String sql = " update doctor set first name = " +firstNameT.getText()+ ", last name = " + lastNameT.getText() + ", specilization = " + specilizationT.getText()+ "where SSN = " +SSNT.getText()+";" ;
           String sql = " update doctor set firstName = ?, lastName = ?, specilization = ? where SSN = ?;" ;

            PreparedStatement pstm = c.con.prepareStatement(sql);
            
           pstm.setString (4 , SSNT.getText());
           pstm.setString(1 ,firstNameT.getText());
           pstm.setString(2 , lastNameT.getText());
           pstm.setString(3 , specilizationT.getText());
          

            pstm.executeUpdate();
            
            c.con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateDoctorBActionPerformed

    private void selectDoctorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDoctorBActionPerformed
       // show_doctor();
       
       
        try {
            ((DefaultTableModel)doctorTable.getModel()).setNumRows(0);
        connection c = new connection();
            String query = "Select * from doctor";
            Statement st = c.con.createStatement();
            ResultSet rs = st.executeQuery(query);
           
       DefaultTableModel model = (DefaultTableModel) doctorTable.getModel();
        Object []row = new Object[4];
 
            while (rs.next())
            {
                row[0] = rs.getString("SSN");
                row[1] = rs.getString("firstName");
                row[2] = rs.getString("lastName");
                row[3] = rs.getString("specilization");
                          model.addRow(row);

            }
        } catch (SQLException ex) {
            
            Logger.getLogger(doctorFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_selectDoctorBActionPerformed

    private void insertDoctorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertDoctorBActionPerformed
              try {      
          connection c = new connection();
         
         String sql = " insert into doctor values(? , ? , ? , ? );";
         PreparedStatement pstm = c.con.prepareStatement(sql);
         pstm.setString(1 ,SSNT.getText() );
         pstm.setString(2 , firstNameT.getText());
         pstm.setString(3 , lastNameT.getText() );
         pstm.setString(4 , specilizationT.getText() );
            
         
         pstm.executeUpdate();
         
         //JOptionPane.showMessageDialog(null,"doctor added Successfully");
         c.con.close();

         
        } catch ( SQLException ex) {

            JOptionPane.showMessageDialog(null,ex);
        }
        catch(NumberFormatException e){
              JOptionPane.showMessageDialog(null,"Type a right values");
        } 

    }//GEN-LAST:event_insertDoctorBActionPerformed

    private void deleteDoctorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDoctorBActionPerformed
                                               
        try {
            connection c = new connection();
            String sql = " Delete from doctor where SSN = ?;";
            PreparedStatement pstm = c.con.prepareStatement(sql);
            pstm.setString(1 , SSNT.getText() );
            
            pstm.executeUpdate();
            c.con.close();
           // JOptionPane.showMessageDialog(null, "Book Deleted Successfully");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_deleteDoctorBActionPerformed

    private void SSNTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SSNTMouseClicked
        
    }//GEN-LAST:event_SSNTMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(doctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SSNL;
    private javax.swing.JTextField SSNT;
    private javax.swing.JButton deleteDoctorB;
    private javax.swing.JTable doctorTable;
    private javax.swing.JLabel firstNameL;
    private javax.swing.JTextField firstNameT;
    private javax.swing.JButton homeB;
    private javax.swing.JButton insertDoctorB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameL;
    private javax.swing.JTextField lastNameT;
    private javax.swing.JButton selectDoctorB;
    private javax.swing.JLabel specilizationL;
    private javax.swing.JTextField specilizationT;
    private javax.swing.JButton updateDoctorB;
    // End of variables declaration//GEN-END:variables
}
