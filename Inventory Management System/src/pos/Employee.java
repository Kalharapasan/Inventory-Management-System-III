package pos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

 class Employee extends javax.swing.JPanel {

    
    public Employee() {
        initComponents();
        tb_load();
    }
    
    public void clearProductFields() {
        employyeSearchText.setText("");
        employyeNameText.setText("");
        employyeTPText.setText("");
    }
    
    public void tb_load(){
        try {

            DefaultTableModel dataTable = (DefaultTableModel) employyeTable.getModel();
            dataTable.setRowCount(0);

            Statement statement = DB.mycon().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employee");

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
        employyeTPText = new javax.swing.JTextField();
        employyeNameText = new javax.swing.JTextField();
        employyeAddButton = new javax.swing.JButton();
        employyeUpdateButton = new javax.swing.JButton();
        employyeDeleteButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        employyeNameText1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        employyeTPText1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        employyeNameText2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        employyeTPText2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        employyeSearchText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        employyeSearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        employyeTable = new javax.swing.JTable();

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("T.P Number: ");

        employyeTPText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        employyeNameText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        employyeAddButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        employyeAddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/img/save.png"))); // NOI18N
        employyeAddButton.setText("Save");
        employyeAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employyeAddButtonActionPerformed(evt);
            }
        });

        employyeUpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        employyeUpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/img/update.png"))); // NOI18N
        employyeUpdateButton.setText("Update");
        employyeUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employyeUpdateButtonActionPerformed(evt);
            }
        });

        employyeDeleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        employyeDeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/img/delete.png"))); // NOI18N
        employyeDeleteButton.setText("Delete");
        employyeDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employyeDeleteButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Address :");

        employyeNameText1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Type :");

        employyeTPText1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Contact Person :");

        employyeNameText2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Mobile :");

        employyeTPText2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(employyeAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employyeUpdateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employyeDeleteButton)
                .addGap(143, 143, 143))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(9, 9, 9))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(employyeNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employyeTPText, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employyeNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employyeNameText2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employyeTPText1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employyeTPText2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employyeNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(employyeTPText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employyeNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(employyeTPText1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employyeNameText2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(employyeTPText2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employyeAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employyeUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employyeDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        employyeSearchText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Search ID:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Employee  Infomation");

        employyeSearchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        employyeSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/img/search x30.png"))); // NOI18N
        employyeSearchButton.setText("Search");
        employyeSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employyeSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(employyeSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(employyeSearchButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employyeSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(employyeSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGap(26, 26, 26))
        );

        employyeTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        employyeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Employee  Name", "T.P Number", "Address", "Type", "Contct Person", "Mobile"
            }
        ));
        employyeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employyeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employyeTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void employyeAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employyeAddButtonActionPerformed
        // TODO add your handling code here:
        
        String Name = employyeNameText.getText();
        String TNumber = employyeTPText.getText();
        
        try {
            if (Name.isEmpty() || TNumber.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter Employye Name and Telephone Number");
                return; 
            }
            Statement statement = DB.mycon().createStatement();
            statement.executeUpdate("INSERT INTO employee (Employee_Name, Tp_Number) VALUES('" + Name + "','" + TNumber + "')");

            JOptionPane.showMessageDialog(this, "Employye Added Successfully");

            tb_load();
            clearProductFields();

        } catch (SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(this, "Error adding Employye");
        }
        
    }//GEN-LAST:event_employyeAddButtonActionPerformed

    private void employyeSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employyeSearchButtonActionPerformed
        String search = employyeSearchText.getText();
        try {
            Statement s = DB.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM employee WHERE eid = '"+search+"'");
            if (!search.isEmpty()){
                if (rs.next()) {
                    employyeNameText.setText(rs.getString("Employee_Name"));
                    employyeTPText.setText(rs.getString("Tp_Number"));
                    JOptionPane.showMessageDialog(null, "Supplier Was Found");
               
                }else{
                    JOptionPane.showMessageDialog(null, "No Avilabel Supplier In Databse");
                    employyeNameText.setText("");
                    employyeTPText.setText("");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Enter Supplier ID");
            }
        } catch (SQLException e) {
            System.out.println(e);
            
        } 
    }//GEN-LAST:event_employyeSearchButtonActionPerformed

    private void employyeUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employyeUpdateButtonActionPerformed
        String name = employyeNameText.getText();
        String tp = employyeTPText.getText();
        String id = employyeSearchText.getText();
        try {
            if (id.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter Supplier Name and Telephone Number");
                return; 
            }else{
                Statement s = DB.mycon().createStatement();
                s.executeUpdate(" UPDATE employee SET Employee_Name ='"+name+"' ,Tp_Number ='"+tp+"' WHERE eid = '"+id+"' ");
                JOptionPane.showMessageDialog(null, "Data Updated");
            }  
        } catch (Exception e) {
            System.out.println(e);
        }
        
         tb_load();
         clearProductFields();
    }//GEN-LAST:event_employyeUpdateButtonActionPerformed

    private void employyeDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employyeDeleteButtonActionPerformed
        String id = employyeSearchText.getText();
        try {
            if(id.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Supplier ID");
            }else{
                Statement s = DB.mycon().createStatement();
                s.executeUpdate("DELETE FROM employee WHERE eid = '"+id+"'");
                JOptionPane.showMessageDialog(null, "Data Deleted");
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
         tb_load();
         clearProductFields();
    }//GEN-LAST:event_employyeDeleteButtonActionPerformed

    private void employyeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employyeTableMouseClicked
        int r = employyeTable.getSelectedRow();

        String id = employyeTable.getValueAt(r, 0).toString();
        String name = employyeTable.getValueAt(r, 1).toString();
        String tp = employyeTable.getValueAt(r, 2).toString();
     

        employyeSearchText.setText(id);
        employyeNameText.setText(name);
        employyeTPText.setText(tp);
    }//GEN-LAST:event_employyeTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton employyeAddButton;
    private javax.swing.JButton employyeDeleteButton;
    private javax.swing.JTextField employyeNameText;
    private javax.swing.JTextField employyeNameText1;
    private javax.swing.JTextField employyeNameText2;
    private javax.swing.JButton employyeSearchButton;
    private javax.swing.JTextField employyeSearchText;
    private javax.swing.JTextField employyeTPText;
    private javax.swing.JTextField employyeTPText1;
    private javax.swing.JTextField employyeTPText2;
    private javax.swing.JTable employyeTable;
    private javax.swing.JButton employyeUpdateButton;
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
