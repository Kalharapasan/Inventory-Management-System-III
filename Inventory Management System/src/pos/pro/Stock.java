
package pos.pro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Stock extends javax.swing.JPanel {

    Connection con = null;
    PreparedStatement pst =null;
    ResultSet rs = null;
    
    String id = "0";
    
    
    public Stock() {
        initComponents();
        
        con = db.mycon();
        tbload();
        
    }

    
  public void tbload(){
  
      try {
             String sql = "SELECT  *  FROM product ";
          
           
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            System.out.println(e);
        }
         
  
  }  
    
 public void paras(){
 
 //  table search
        
       String bcod = txt_bcode.getText(); // barcode  
       String pname = txt_pnaame.getText(); // product name
       String supp = txt_supp.getText(); // supplier name 
 
       try {

            String sql = " SELECT * from product where Product_Name  LIKE '%" + pname + "%' AND Supplier_Name  LIKE '%" + supp + "%' AND Bar_code   LIKE '%" + bcod + "%'    ";
           
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

              
        } catch (SQLException e) {
            System.out.println(e);
               
        }   
       cal();
 }  
    public  void cal(){
    
    int numberOfRaw = jTable1.getRowCount();
    
                double total = 0;
                for (int i = 0; i < numberOfRaw; i++) {               
                   //if checkbox is checked                    
                        double value = Double.valueOf(jTable1.getValueAt(i, 5).toString());
                        total += value;                    
                }
                
              
                date_new1.setText(Double.toString(total));
    }    
 
 
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        txt_bcode = new javax.swing.JTextField();
        txt_pnaame = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txt_cusid1 = new javax.swing.JLabel();
        txt_supp = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        date_new = new javax.swing.JLabel();
        date_new1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txt_bcode1 = new javax.swing.JTextField();
        txt_pnaame1 = new javax.swing.JTextField();
        txt_stkqty = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txt_newQTy = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText("Barcode :");

        txt_bcode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_bcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bcodeActionPerformed(evt);
            }
        });
        txt_bcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bcodeKeyReleased(evt);
            }
        });

        txt_pnaame.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_pnaame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pnaameKeyReleased(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel49.setText("Supplier Name :");

        txt_cusid1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_cusid1.setForeground(new java.awt.Color(240, 240, 240));
        txt_cusid1.setText("ID");
        txt_cusid1.setRequestFocusEnabled(false);

        txt_supp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_supp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_suppKeyReleased(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText("Product  Name :");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Product Name", "Bar code", "Cost Price", "Stock Qty", "Supplier_ID", "Supplier_Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        date_new.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        date_new.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        date_new.setText("Table QTY :");

        date_new1.setBackground(new java.awt.Color(204, 255, 204));
        date_new1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        date_new1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        date_new1.setText("0");
        date_new1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        date_new1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(date_new)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_new1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_new, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_new1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(1, 1, 1)
                        .addComponent(txt_cusid1))
                    .addComponent(txt_bcode, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pnaame, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(txt_supp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 309, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pnaame)
                            .addComponent(txt_supp)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(txt_cusid1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_bcode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(358, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap(74, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("View Stock", jPanel9);

        txt_bcode1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_bcode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bcode1ActionPerformed(evt);
            }
        });
        txt_bcode1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bcode1KeyReleased(evt);
            }
        });

        txt_pnaame1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_pnaame1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pnaame1KeyReleased(evt);
            }
        });

        txt_stkqty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_stkqty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_stkqtyKeyReleased(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel50.setText("Stock Qty");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText("Product  Name :");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("Barcode :");

        txt_newQTy.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_newQTy.setText("0");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setText("New Add /Less QTY");

        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(txt_bcode1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pnaame1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_stkqty, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel50))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_newQTy)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pnaame1)
                            .addComponent(txt_stkqty)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_bcode1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_newQTy, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 171, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ADD Stock", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_bcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bcodeActionPerformed

    private void txt_bcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bcodeKeyReleased
       paras();
    }//GEN-LAST:event_txt_bcodeKeyReleased

    private void txt_pnaameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pnaameKeyReleased
paras();       
    }//GEN-LAST:event_txt_pnaameKeyReleased

    private void txt_suppKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_suppKeyReleased
        paras();
    }//GEN-LAST:event_txt_suppKeyReleased

    private void txt_bcode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bcode1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bcode1ActionPerformed

    private void txt_bcode1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bcode1KeyReleased
        // load unit price
       
        String  name =txt_bcode1.getText();
        try {
            
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM product  WHERE Bar_code ='"+name+"'  ");
            if (rs.next()) {
                 
                id = rs.getString("pid");
                txt_pnaame1.setText(rs.getString("Product_Name"));
                txt_stkqty.setText(rs.getString("Qty"));
               
                
                
            }
          
         
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txt_bcode1KeyReleased

    private void txt_pnaame1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pnaame1KeyReleased
       // load unit price
       
        String  name =txt_pnaame1.getText();
        try {
            
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM product  WHERE Product_Name ='"+name+"'  ");
            if (rs.next()) {
                 
                id = rs.getString("pid");
                txt_bcode1.setText(rs.getString("Bar_code"));
                txt_stkqty.setText(rs.getString("Qty"));
               
                
                
            }
          
         
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txt_pnaame1KeyReleased

    private void txt_stkqtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stkqtyKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stkqtyKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // update Stock
        
        
        double newqty =Double.valueOf( txt_newQTy.getText());        
        double oldQty = Double.valueOf(txt_stkqty.getText());
        
        double up_qty = newqty+  oldQty ;
        
        try {
            
            Statement s = db.mycon().createStatement();
            s.executeUpdate(" UPDATE product SET Qty ='"+up_qty+"'  WHERE pid = '"+id+"' ");
             
            JOptionPane.showMessageDialog(null, "Data Updated");
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date_new;
    private javax.swing.JLabel date_new1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_bcode;
    private javax.swing.JTextField txt_bcode1;
    private javax.swing.JLabel txt_cusid1;
    private javax.swing.JTextField txt_newQTy;
    private javax.swing.JTextField txt_pnaame;
    private javax.swing.JTextField txt_pnaame1;
    private javax.swing.JTextField txt_stkqty;
    private javax.swing.JTextField txt_supp;
    // End of variables declaration//GEN-END:variables
}
