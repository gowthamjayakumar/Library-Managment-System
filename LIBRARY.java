/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library2;

/**
 *
 * @author GOWTHAM STARk
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class LIBRARY extends javax.swing.JFrame{
    /**
     * Creates new form LIBRARY3
     */
Connection con;
Statement stmt;
ResultSet rs;
int curRow = 0;
    
    public LIBRARY() {
        initComponents();
        DoConnect();
    }
    public void DoConnect( ) {
        
        
        try  {
            
            String host = "jdbc:derby://localhost:1527/Library2";
                String uName = "gowtham";
                String uPass = "gowtham";
                con = DriverManager.getConnection(host, uName, uPass);
                
                stmt = con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE );
                String sql ="SELECT * from LIBRARY";
                rs = stmt.executeQuery(sql);
                
            rs.next();
                           
                int Book_id = rs.getInt("BOOK_ID");
                String bid = Integer.toString(Book_id);
                int Edition =rs.getInt("EDITION");
                String edition = Integer.toString(Edition);
                String Department=rs.getString("DEPARTMENT");
                String Bname =rs.getString("BOOK_NAME");
                String Author =rs.getString("AUTHOR_NAME");
                String Availability =rs.getString("AVAILABILITY");
        
            jTextField1.setText(bid);

        jTextField2.setText(Bname);

        jTextField3.setText(Author);

        jTextField4.setText(edition);

        jTextField5.setText(Department);

        jTextField6.setText(Availability);
        
        }
        catch (SQLException err) 
                {
            JOptionPane.showMessageDialog(LIBRARY.this, err.getMessage());
        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings({"unchecked", "Convert2Lambda"})
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnUpdateRecord = new javax.swing.JButton();
        btnNewRecord = new javax.swing.JButton();
        btnDeleteRecord = new javax.swing.JButton();
        btnSaveRecord = new javax.swing.JButton();
        btnCancelNewRecord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("textbookid");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("textbookname");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setText("textauthorname");

        jTextField4.setText("textedition");

        jTextField5.setText("textdepartment");

        jTextField6.setText("textavailability");

        jLabel1.setText("Book ID");

        jLabel2.setText("Book name");

        jLabel3.setText("Author name");

        jLabel4.setText("Edition");

        jLabel5.setText("Department");

        jLabel6.setText("availability");

        jButton1.setText("next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("previous");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButton2)
                .addGap(78, 78, 78)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(90, 90, 90))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(109, 109, 109)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(146, 146, 146)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(43, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(56, 56, 56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnUpdateRecord.setText("Update");
        btnUpdateRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRecordActionPerformed(evt);
            }
        });

        btnNewRecord.setText("New");
        btnNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRecordActionPerformed(evt);
            }
        });

        btnDeleteRecord.setText("Delete");
        btnDeleteRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRecordActionPerformed(evt);
            }
        });

        btnSaveRecord.setText("Save");
        btnSaveRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveRecordActionPerformed(evt);
            }
        });

        btnCancelNewRecord.setText("cancel");
        btnCancelNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelNewRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateRecord)
                    .addComponent(btnNewRecord)
                    .addComponent(btnDeleteRecord)
                    .addComponent(btnSaveRecord)
                    .addComponent(btnCancelNewRecord))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnUpdateRecord)
                .addGap(18, 18, 18)
                .addComponent(btnNewRecord)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteRecord)
                .addGap(26, 26, 26)
                .addComponent(btnSaveRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelNewRecord)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
if ( rs.previous( ) ) {
 
    int Book_id = rs.getInt("BOOK_ID");
                String bid = Integer.toString(Book_id);
                int Edition =rs.getInt("EDITION");
                String edition = Integer.toString(Edition);
                String Department=rs.getString("DEPARTMENT");
                String Bname =rs.getString("BOOK_NAME");
                String Author =rs.getString("AUTHOR_NAME");
                String Availability =rs.getString("AVAILABILITY");
        
            jTextField1.setText(bid);

        jTextField2.setText(Bname);

        jTextField3.setText(Author);

        jTextField4.setText(edition);

        jTextField5.setText(Department);

        jTextField6.setText(Availability);
}
else {
rs.next( );
JOptionPane.showMessageDialog(LIBRARY.this, "Start of File");
}
}
catch (SQLException err) {
JOptionPane.showMessageDialog(LIBRARY.this, err.getMessage());
}
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
if ( rs.next( ) ) {
 
    int Book_id = rs.getInt("BOOK_ID");
                String bid = Integer.toString(Book_id);
                int Edition =rs.getInt("EDITION");
                String edition = Integer.toString(Edition);
                String Department=rs.getString("DEPARTMENT");
                String Bname =rs.getString("BOOK_NAME");
                String Author =rs.getString("AUTHOR_NAME");
                String Availability =rs.getString("AVAILABILITY");
        
            jTextField1.setText(bid);

        jTextField2.setText(Bname);

        jTextField3.setText(Author);

        jTextField4.setText(edition);

        jTextField5.setText(Department);

        jTextField6.setText(Availability);
}
else {
rs.previous( );
JOptionPane.showMessageDialog(LIBRARY.this, "End of File");
}
}
catch (SQLException err) {
JOptionPane.showMessageDialog(LIBRARY.this, err.getMessage());
}
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnUpdateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRecordActionPerformed
        // TODO add your handling code here:
                String bid = jTextField1.getText();
                String edition = jTextField4.getText();
                String Department=jTextField5.getText();
                String Bname =jTextField2.getText();
                String Author =jTextField3.getText();
                String Availability =jTextField6.getText();
        
                int newbid = Integer.parseInt(bid);
                int newedition = Integer.parseInt(edition);
                
                try {
rs.updateInt( "BOOK_ID", newbid );
rs.updateInt( "EDITION", newedition );
rs.updateString( "BOOK_NAME", Bname );
rs.updateString( "AUTHOR_NAME", Author );
rs.updateString( "DEPARTMENT", Department );
rs.updateString( "AVAILABILITY", Availability );
rs.updateRow( );
JOptionPane.showMessageDialog(LIBRARY.this, "Updated");
}
catch (SQLException err) {
System.out.println(err.getMessage() );
}
    }//GEN-LAST:event_btnUpdateRecordActionPerformed
                         
                
       
    private void btnNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRecordActionPerformed
        // TODO add your handling code here:
        try{
            curRow = rs.getRow( );

            jTextField1.setText("");

        jTextField2.setText("");

        jTextField3.setText("");

        jTextField4.setText("");

        jTextField5.setText("");

        jTextField6.setText("");
        
        
jButton2.setEnabled( false ) ;
jButton1.setEnabled( false );
btnUpdateRecord.setEnabled( false );
btnDeleteRecord.setEnabled( false );
btnNewRecord.setEnabled( false );

btnSaveRecord.setEnabled( true );
btnCancelNewRecord.setEnabled( true );
    }
        catch (SQLException err) {
System.out.println(err.getMessage() );

    } 
    }//GEN-LAST:event_btnNewRecordActionPerformed

    private void btnCancelNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelNewRecordActionPerformed
        // TODO add your handling code here:
       try{ 
        rs.absolute( curRow );
jTextField1.setText(rs.getString("BOOK_ID"));

        jTextField2.setText(rs.getString("BOOK_NAME"));

        jTextField3.setText(rs.getString("AUTHOR_NAME"));

        jTextField4.setText(rs.getString("EDITION"));

        jTextField5.setText(rs.getString("DEPARTMENT"));

        jTextField6.setText(rs.getString("AVAILABILITY"));
        
        

jButton2.setEnabled( true ) ;
jButton1.setEnabled( true );
btnUpdateRecord.setEnabled( true );
btnDeleteRecord.setEnabled( true );
btnNewRecord.setEnabled( true );

btnSaveRecord.setEnabled( false );
btnCancelNewRecord.setEnabled( false );
JOptionPane.showMessageDialog(LIBRARY.this, "INSERTION CANCELED");

       }
         catch (SQLException err) {
System.out.println(err.getMessage() );

    }
    }//GEN-LAST:event_btnCancelNewRecordActionPerformed

    private void btnSaveRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveRecordActionPerformed
        // TODO add your handling code here:
        
        String bid = jTextField1.getText();
                String edition = jTextField4.getText();
                String Department=jTextField5.getText();
                String Bname =jTextField2.getText();
                String Author =jTextField3.getText();
                String Availability =jTextField6.getText();
        
                int newbid = Integer.parseInt(bid);
                int newedition = Integer.parseInt(edition);
                
                try {
                    rs.moveToInsertRow( );
                
rs.updateInt( "BOOK_ID", newbid );
rs.updateInt( "EDITION", newedition );
rs.updateString( "BOOK_NAME", Bname );
rs.updateString( "AUTHOR_NAME", Author );
rs.updateString( "DEPARTMENT", Department );
rs.updateString( "AVAILABILITY", Availability );
rs.insertRow( );

stmt.close( );
rs.close( );

stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

String sql = "SELECT * FROM LIBRARY";
rs = stmt.executeQuery(sql);

rs.next( );
 
    
            jTextField1.setText(bid);

        jTextField2.setText(Bname);

        jTextField3.setText(Author);

        jTextField4.setText(edition);

        jTextField5.setText(Department);

        jTextField6.setText(Availability);
        
        jButton2.setEnabled( true ) ;
jButton1.setEnabled( true );
btnUpdateRecord.setEnabled( true );
btnDeleteRecord.setEnabled( true );
btnNewRecord.setEnabled( true );

btnSaveRecord.setEnabled( false );
btnCancelNewRecord.setEnabled( false );
JOptionPane.showMessageDialog(LIBRARY.this, "RECORD SAVED");

 }
         catch (SQLException err) {
System.out.println(err.getMessage() );

    }
    }//GEN-LAST:event_btnSaveRecordActionPerformed

    private void btnDeleteRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRecordActionPerformed
        // TODO add your handling code here:
        try{
            rs.deleteRow();
            stmt.close( );
rs.close( );
stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

String sql = "SELECT * FROM LIBRARY";
rs = stmt.executeQuery(sql);
rs.next( );
    int Book_id = rs.getInt("BOOK_ID");
                String bid = Integer.toString(Book_id);
                int Edition =rs.getInt("EDITION");
                String edition = Integer.toString(Edition);
                String Department=rs.getString("DEPARTMENT");
                String Bname =rs.getString("BOOK_NAME");
                String Author =rs.getString("AUTHOR_NAME");
                String Availability =rs.getString("AVAILABILITY");     
            jTextField1.setText(bid);
        jTextField2.setText(Bname);
        jTextField3.setText(Author);
        jTextField4.setText(edition);
        jTextField5.setText(Department);
        jTextField6.setText(Availability);
        JOptionPane.showMessageDialog(LIBRARY.this, "RECORD DELETED");

        }
               catch (SQLException err) {
JOptionPane.showMessageDialog(LIBRARY.this, err.getMessage());
    }
    }//GEN-LAST:event_btnDeleteRecordActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(LIBRARY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LIBRARY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LIBRARY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LIBRARY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LIBRARY().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelNewRecord;
    private javax.swing.JButton btnDeleteRecord;
    private javax.swing.JButton btnNewRecord;
    private javax.swing.JButton btnSaveRecord;
    private javax.swing.JButton btnUpdateRecord;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

    private static class JoptionPane {

        private static void showMessageDialog(LIBRARY aThis, String message) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public JoptionPane() {
        }
    }
}
