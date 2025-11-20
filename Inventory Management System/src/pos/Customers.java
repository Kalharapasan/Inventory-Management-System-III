package pos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.DB;


 class Customers extends javax.swing.JPanel {

    
    public Customers() {
        initComponents();
        tb_load();
        
    }
    public void clearProductFields() {
        custermerSearchText.setText("");
        custermerNameText.setText("");
        custermerTPText.setText("");
    }
    
    public void tb_load(){
        try {

            DefaultTableModel dataTable = (DefaultTableModel) customerTable.getModel();
            dataTable.setRowCount(0);

            Statement statement = DB.mycon().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM customer");

            while (rs.next()) {

                Vector v = new Vector();

                v.add(rs.getString(1)); // ID
                v.add(rs.getString(2)); // Name
                v.add(rs.getString(3)); // TP
             

                dataTable.addRow(v);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
  
    } 
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        custermerTPText = new javax.swing.JTextField();
        custermerNameText = new javax.swing.JTextField();
        customerAddButton = new javax.swing.JButton();
        custemerUpdateButton = new javax.swing.JButton();
        custemerDeleteButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        custermerAddresText = new javax.swing.JTextField();
        custermerTypeText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        custermerContactPersonText = new javax.swing.JTextField();
        custermerMobileText = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        custermerSearchText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        custermerSearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("T.P Number: ");

        custermerTPText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        custermerNameText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        customerAddButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customerAddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/img/save.png"))); // NOI18N
        customerAddButton.setText("Save");
        customerAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerAddButtonActionPerformed(evt);
            }
        });

        custemerUpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        custemerUpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/img/update.png"))); // NOI18N
        custemerUpdateButton.setText("Update");
        custemerUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custemerUpdateButtonActionPerformed(evt);
            }
        });

        custemerDeleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        custemerDeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/img/delete.png"))); // NOI18N
        custemerDeleteButton.setText("Delete");
        custemerDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custemerDeleteButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Type :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Address :");

        custermerAddresText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        custermerTypeText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Mobile :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Contact Person :");

        custermerContactPersonText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        custermerMobileText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(customerAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(custemerUpdateButton)
                .addGap(18, 18, 18)
                .addComponent(custemerDeleteButton)
                .addGap(83, 83, 83))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(custermerContactPersonText, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(custermerMobileText))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custermerTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custermerAddresText, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(custermerNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(custermerTPText))
                        .addGap(77, 77, 77)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custermerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(custermerTPText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custermerAddresText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(custermerTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custermerContactPersonText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(custermerMobileText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custemerUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custemerDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        custermerSearchText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Search ID:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Customer Infomation");

        custermerSearchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        custermerSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/img/search x30.png"))); // NOI18N
        custermerSearchButton.setText("Search");
        custermerSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custermerSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addComponent(custermerSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(custermerSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(custermerSearchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(custermerSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(29, 29, 29))
        );

        customerTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Customer Name", "T.P Number", "Address", "Type", "Contact Person", "Mobile"
            }
        ));
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void customerAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerAddButtonActionPerformed
        String cName = custermerNameText.getText();
        String cTNumber = custermerTPText.getText();
        
        try {
            if (cName.isEmpty() || cTNumber.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter Customer Name and Telephone Number");
                return; 
            }
            Statement statement = DB.mycon().createStatement();
            statement.executeUpdate("INSERT INTO customer (customer_name, Tp_Number) VALUES('" + cName + "','" + cTNumber + "')");

            JOptionPane.showMessageDialog(this, "Customer Added Successfully");

            tb_load();
            clearProductFields();

        } catch (SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(this, "Error adding customer");
        }
    }//GEN-LAST:event_customerAddButtonActionPerformed

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
         int r = customerTable.getSelectedRow();

        String id = customerTable.getValueAt(r, 0).toString();
        String name = customerTable.getValueAt(r, 1).toString();
        String tp = customerTable.getValueAt(r, 2).toString();
     

        custermerSearchText.setText(id);
        custermerNameText.setText(name);
        custermerTPText.setText(tp);
    }//GEN-LAST:event_customerTableMouseClicked

    private void custermerSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custermerSearchButtonActionPerformed
        String search = custermerSearchText.getText();
        try {
            Statement s = DB.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM customer WHERE cid = '"+search+"'");
            if (!search.isEmpty()){
                if (rs.next()) {
                    custermerNameText.setText(rs.getString("customer_name"));
                    custermerTPText.setText(rs.getString("Tp_Number"));
                    JOptionPane.showMessageDialog(null, "Custemer Was Found");
               
                }else{
                    JOptionPane.showMessageDialog(null, "No Avilabel Custemer In Databse");
                    custermerSearchText.setText("");
                    custermerNameText.setText("");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Enter Custemer ID");
            }
        } catch (SQLException e) {
            System.out.println(e);
            
        }       
            
    }//GEN-LAST:event_custermerSearchButtonActionPerformed

    private void custemerUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custemerUpdateButtonActionPerformed
        String name = custermerNameText.getText();
        String tp = custermerTPText.getText();
        String id = custermerSearchText.getText();
        try {
            if (id.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter Customer Name and Telephone Number");
                return; 
            }else{
                Statement s = DB.mycon().createStatement();
                s.executeUpdate(" UPDATE customer SET customer_name ='"+name+"' ,Tp_Number ='"+tp+"' WHERE cid = '"+id+"' ");
                JOptionPane.showMessageDialog(null, "Data Updated");
            }  
        } catch (Exception e) {
            System.out.println(e);
        }
        
         tb_load();
         clearProductFields();
    }//GEN-LAST:event_custemerUpdateButtonActionPerformed

    private void custemerDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custemerDeleteButtonActionPerformed
        String id = custermerSearchText.getText();
        try {
            if(id.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Custemer ID");
            }else{
                Statement s = DB.mycon().createStatement();
                s.executeUpdate("DELETE FROM customer WHERE cid = '"+id+"'");
                JOptionPane.showMessageDialog(null, "Data Deleted");
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
         tb_load();
         clearProductFields();
    }//GEN-LAST:event_custemerDeleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton custemerDeleteButton;
    private javax.swing.JButton custemerUpdateButton;
    private javax.swing.JTextField custermerAddresText;
    private javax.swing.JTextField custermerContactPersonText;
    private javax.swing.JTextField custermerMobileText;
    private javax.swing.JTextField custermerNameText;
    private javax.swing.JButton custermerSearchButton;
    private javax.swing.JTextField custermerSearchText;
    private javax.swing.JTextField custermerTPText;
    private javax.swing.JTextField custermerTypeText;
    private javax.swing.JButton customerAddButton;
    private javax.swing.JTable customerTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
