package pos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

 class Supplier extends javax.swing.JPanel {

    
    public Supplier() {
        initComponents();
        tb_load();
    }
    
    public void tb_load(){
        try {

            DefaultTableModel dataTable = (DefaultTableModel) supplierTable.getModel();
            dataTable.setRowCount(0);

            Statement statement = DB.mycon().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM supplier");

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1)); 
                v.add(rs.getString(2)); 
                v.add(rs.getString(3)); 
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
        supplierTPText = new javax.swing.JTextField();
        supplierNameText = new javax.swing.JTextField();
        supplierAddButton = new javax.swing.JButton();
        supplierSearchButton = new javax.swing.JButton();
        supplierUpdateButton = new javax.swing.JButton();
        supplierDeleteButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        supplierSearchText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierTable = new javax.swing.JTable();

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("T.P Number: ");

        supplierTPText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        supplierNameText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        supplierAddButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        supplierAddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/img/save.png"))); // NOI18N
        supplierAddButton.setText("Save");
        supplierAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierAddButtonActionPerformed(evt);
            }
        });

        supplierSearchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        supplierSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/img/search x30.png"))); // NOI18N
        supplierSearchButton.setText("Search");
        supplierSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierSearchButtonActionPerformed(evt);
            }
        });

        supplierUpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        supplierUpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/img/update.png"))); // NOI18N
        supplierUpdateButton.setText("Update");
        supplierUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierUpdateButtonActionPerformed(evt);
            }
        });

        supplierDeleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        supplierDeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/img/delete.png"))); // NOI18N
        supplierDeleteButton.setText("Delete");
        supplierDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierDeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supplierNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierTPText, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(supplierAddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplierSearchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplierUpdateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(supplierDeleteButton)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplierNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(supplierTPText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplierAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        supplierSearchText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Search ID:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Supplier Infomation");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(supplierSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplierSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        supplierTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Supplier Name", "T.P Number"
            }
        ));
        supplierTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(supplierTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void supplierAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierAddButtonActionPerformed
        String Name = supplierNameText.getText();
        String TNumber = supplierTPText.getText();
        
        try {
            if (Name.isEmpty() || TNumber.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter Supplier Name and Telephone Number");
                return; 
            }
            Statement statement = DB.mycon().createStatement();
            statement.executeUpdate("INSERT INTO supplier (supplier_Name, Tp_Number) VALUES('" + Name + "','" + TNumber + "')");

            JOptionPane.showMessageDialog(this, "Supplier Added Successfully");

            tb_load();

        } catch (SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(this, "Error adding customer");
        }
    }//GEN-LAST:event_supplierAddButtonActionPerformed

    private void supplierTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierTableMouseClicked
         int r = supplierTable.getSelectedRow();

        String id = supplierTable.getValueAt(r, 0).toString();
        String name = supplierTable.getValueAt(r, 1).toString();
        String tp = supplierTable.getValueAt(r, 2).toString();
     

        supplierSearchText.setText(id);
        supplierNameText.setText(name);
        supplierTPText.setText(tp);
    }//GEN-LAST:event_supplierTableMouseClicked

    private void supplierSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierSearchButtonActionPerformed
        String search = supplierSearchText.getText();
        try {
            Statement s = DB.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM supplier WHERE sid = '"+search+"'");
            if (!search.isEmpty()){
                if (rs.next()) {
                    supplierNameText.setText(rs.getString("supplier_Name"));
                    supplierTPText.setText(rs.getString("Tp_Number"));
                    JOptionPane.showMessageDialog(null, "Supplier Was Found");
               
                }else{
                    JOptionPane.showMessageDialog(null, "No Avilabel Supplier In Databse");
                    supplierNameText.setText("");
                    supplierTPText.setText("");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Enter Supplier ID");
            }
        } catch (SQLException e) {
            System.out.println(e);
            
        } 
    }//GEN-LAST:event_supplierSearchButtonActionPerformed

    private void supplierUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierUpdateButtonActionPerformed
        String name = supplierNameText.getText();
        String tp = supplierTPText.getText();
        String id = supplierSearchText.getText();
        try {
            if (id.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter Supplier Name and Telephone Number");
                return; 
            }else{
                Statement s = DB.mycon().createStatement();
                s.executeUpdate(" UPDATE supplier SET supplier_Name ='"+name+"' ,Tp_Number ='"+tp+"' WHERE sid = '"+id+"' ");
                JOptionPane.showMessageDialog(null, "Data Updated");
            }  
        } catch (Exception e) {
            System.out.println(e);
        }
        
         tb_load();
    }//GEN-LAST:event_supplierUpdateButtonActionPerformed

    private void supplierDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierDeleteButtonActionPerformed
        String id = supplierSearchText.getText();
        try {
            if(id.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Supplier ID");
            }else{
                Statement s = DB.mycon().createStatement();
                s.executeUpdate("DELETE FROM supplier WHERE sid = '"+id+"'");
                JOptionPane.showMessageDialog(null, "Data Deleted");
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
         tb_load();
    }//GEN-LAST:event_supplierDeleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton supplierAddButton;
    private javax.swing.JButton supplierDeleteButton;
    private javax.swing.JTextField supplierNameText;
    private javax.swing.JButton supplierSearchButton;
    private javax.swing.JTextField supplierSearchText;
    private javax.swing.JTextField supplierTPText;
    private javax.swing.JTable supplierTable;
    private javax.swing.JButton supplierUpdateButton;
    // End of variables declaration//GEN-END:variables
}
