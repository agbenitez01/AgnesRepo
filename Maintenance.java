/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.piratehawks;
//import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File; 
import java.io.ObjectInputFilter.Status;
import javax.swing.*;
import javax.swing.JFileChooser;
import java.time.LocalDate;


//import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author Agnes B
 */

public class Maintenance extends javax.swing.JFrame {
    
    Connection connection = null; 
    //private Object table;
    //private Object sqliteConnection2;
    /**
     * Creates new form Maintenance
     //* //@throws java.sql.SQLException*/
    public Maintenance(){
        initComponents();
        newquery();
        //newCount();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        FilenameTable = new javax.swing.JTable();
        AddButton = new java.awt.Button();
        RebuildButton = new java.awt.Button();
        RemoveButton = new java.awt.Button();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        jTextDir = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        counter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Engine Index Maintenance");

        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setText("Search Engine - Index Maintenance");

        FilenameTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "PathName", "Status"
            }
        ));
        FilenameTable.setColumnSelectionAllowed(true);
        FilenameTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilenameTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FilenameTable);
        FilenameTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        AddButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AddButton.setLabel("Add File");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        RebuildButton.setLabel("Rebuild Out-of-Date");
        RebuildButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RebuildButtonActionPerformed(evt);
            }
        });

        RemoveButton.setLabel("Remove Selected Files");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        label2.setText("Number of files indexed:");

        label3.setText("Search Engine Version 1.0");

        jTextDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDirActionPerformed(evt);
            }
        });

        jLabel1.setText("Pathname:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RebuildButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextDir, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(176, 176, 176)
                                .addComponent(counter, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RebuildButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(counter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        
        LocalDate today = LocalDate.now();
        String indexStatus = "Indexed";
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        jTextDir.setText(filename);     
         
    try { 
         
    String query = "Insert into SearchEngine (rowid,PathName,DateAdded,Status) values (NULL,?,CURRENT_TIMESTAMP,?)" ;
    
    //pst.setInt (1, default);
            try (PreparedStatement pst = connection.prepareStatement(query)) {
                pst.setString(1, jTextDir.getText());              
                pst.setString(2,indexStatus);
                              
                pst.execute();
                JOptionPane.showMessageDialog(null,"Pathname Added!");
                pst.close();
                
                newquery();
            }
    }catch (SQLException e)
    {
    }
        
         /**/
    }//GEN-LAST:event_AddButtonActionPerformed

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButtonMouseClicked

    private void jTextDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDirActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        // TODO add your handling code here:
        String query = "delete from SearchEngine where Pathname=?";
        try (PreparedStatement pst = connection.prepareStatement(query)) {
                     
            pst.setString(1, jTextDir.getText()); 
                              
            pst.execute();
            JOptionPane.showMessageDialog(null,"Filename Deleted!");
            String TextDir="";
            String text = jTextDir.getText();
            newquery();
             //pst.close();
                
               
    }catch (SQLException e)
    {
    }
    
        //pst.setString(1, jTextDir.getText());
      // String query = "delete from SearchEngine where Pathname=?";
       // try {
      //     PreparedStatement pst = connection.prepareStatement(query));  
      //     pst.execute();
      //  }
      //  } catch (SQLException ex) {
      //      Logger.getLogger(Maintenance.class.getName()).log(Level.SEVERE, null, ex);
       // }
     
        
        
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void FilenameTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilenameTableMouseClicked
        // TODO add your handling code here:
        try{
	    int row=FilenameTable.getSelectedRow(); 		
	    String Table_Click=(FilenameTable.getModel().getValueAt(row, 0)).toString();
	    String query="select * from SearchEngine where Pathname='"+Table_Click+"' ";
	    PreparedStatement pst=connection.prepareStatement(query);
	    ResultSet rs=pst.executeQuery();
	    while (rs.next())
	    {
                String dir1;
                dir1 = rs.getString("Pathname");
                jTextDir.setText(dir1);    
	     }
            // pst.close(); //<editor-fold defaultstate="collapsed" desc="comment">
            
        }catch (SQLException e)
//</editor-fold>
	 {
    }	         
        
        
        
    }//GEN-LAST:event_FilenameTableMouseClicked

    private void RebuildButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RebuildButtonActionPerformed
        // TODO add your handling code here:
        newquery();
        JOptionPane.showMessageDialog(null,"Rebuild Index!");
    }//GEN-LAST:event_RebuildButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("Convert2Lambda")
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Maintenance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button AddButton;
    private javax.swing.JTable FilenameTable;
    private java.awt.Button RebuildButton;
    private java.awt.Button RemoveButton;
    private javax.swing.JLabel counter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextDir;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    // End of variables declaration//GEN-END:variables

    private void newquery() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {
           // initComponents();
            connection=sqliteConnection2.dbConnector();
                String query;
                query = "select PathName, Status from SearchEngine";
                PreparedStatement pst = null;
                
            try {
                pst = connection.prepareStatement(query);
            } catch (SQLException ex) {
                Logger.getLogger(Maintenance.class.getName()).log(Level.SEVERE, null, ex);
            }
                ResultSet rs = null;
            try {
                rs = pst.executeQuery();
            } catch (SQLException ex) {
                Logger.getLogger(Maintenance.class.getName()).log(Level.SEVERE, null, ex);
            }
               FilenameTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Maintenance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void newCount() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
     
    }

 
}
