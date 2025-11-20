package pos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

 class Product extends javax.swing.JPanel {

    
    public Product() {
        initComponents();
        tb_load();
    }
    
    public void tb_load() {
        try {

            DefaultTableModel dataTable = (DefaultTableModel) productTable.getModel();
            dataTable.setRowCount(0);

            Statement statement = DB.mycon().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM product");

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1)); // pid
                v.add(rs.getString(2)); // Product_Name
                v.add(rs.getString(3)); // Bar_code
                v.add(rs.getString(4)); // Price
                v.add(rs.getString(5)); // Qty
                v.add(rs.getString(6)); // Sid
                dataTable.addRow(v);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void clearProductFields() {
        productSearchText.setText("");
        productNameText.setText("");
        productBarCodeText.setText("");
        productPriceText.setText("");
        productQtyText.setText("");
        productSupIDText.setText("");
    }



    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        productSupIDText = new javax.swing.JTextField();
        productNameText = new javax.swing.JTextField();
        productAddButton = new javax.swing.JButton();
        productUpdateButton = new javax.swing.JButton();
        productDeleteButton = new javax.swing.JButton();
        productBarCodeText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        productPriceText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        productQtyText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        productPriceText1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        productSearchText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        productSearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Supplier ID:");

        productSupIDText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        productNameText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        productAddButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        productAddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/img/save.png"))); // NOI18N
        productAddButton.setText("Save");
        productAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productAddButtonActionPerformed(evt);
            }
        });

        productUpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        productUpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/img/update.png"))); // NOI18N
        productUpdateButton.setText("Update");
        productUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productUpdateButtonActionPerformed(evt);
            }
        });

        productDeleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        productDeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/img/delete.png"))); // NOI18N
        productDeleteButton.setText("Delete");
        productDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productDeleteButtonActionPerformed(evt);
            }
        });

        productBarCodeText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        productBarCodeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productBarCodeTextActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Bar Code:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Cost Price :");

        productPriceText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Qty:");

        productQtyText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Sell Price :");

        productPriceText1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Supplier Name:");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selete" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(productAddButton)
                        .addGap(18, 18, 18)
                        .addComponent(productUpdateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(productDeleteButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, 0, 323, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(43, 43, 43)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(productBarCodeText, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                                    .addComponent(productNameText)
                                    .addComponent(productPriceText)
                                    .addComponent(productPriceText1)
                                    .addComponent(productQtyText)
                                    .addComponent(productSupIDText))))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productBarCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(productPriceText1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(productQtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(productSupIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        productSearchText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Search ID:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Product Infomation");

        productSearchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        productSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/img/search x30.png"))); // NOI18N
        productSearchButton.setText("Search");
        productSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productSearchButton)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        productTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Product Name", "Bar Code", "Cost Price", "Sell Price", "Qty", "Supplier ID", "Supplier Name"
            }
        ));
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void productBarCodeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productBarCodeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productBarCodeTextActionPerformed

    private void productAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productAddButtonActionPerformed

        String pName = productNameText.getText();
        String barCode = productBarCodeText.getText();
        String price = productPriceText.getText();
        String qty = productQtyText.getText();
        String sIDText = productSupIDText.getText();   // FIX (sID was int, cannot call isEmpty)

        // validate empty fields
        try {
            if (pName.isEmpty() || barCode.isEmpty() || price.isEmpty() || qty.isEmpty() || sIDText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields.");
                return;
            }

            int sID = Integer.parseInt(sIDText);   // FIX (convert supplier ID to integer)

            Statement statement = DB.mycon().createStatement();

            // FIX SQL + variable names
            statement.executeUpdate(
                "INSERT INTO product (Product_Name, Bar_code, Price, Qty, Sid) VALUES ('"
                + pName + "','" + barCode + "','" + price + "','" + qty + "'," + sID + ")"
            );

            JOptionPane.showMessageDialog(this, "Product Added Successfully");

        } catch (SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(this, "Error adding Product");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Supplier ID must be a number");
        }
        tb_load();
        clearProductFields();

    }//GEN-LAST:event_productAddButtonActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        // TODO add your handling code here:
        int r = productTable.getSelectedRow();

        String pid = productTable.getValueAt(r, 0).toString();
        String pName = productTable.getValueAt(r, 1).toString();
        String barCode = productTable.getValueAt(r, 2).toString();
        String price = productTable.getValueAt(r, 3).toString();
        String qty = productTable.getValueAt(r, 4).toString();
        String sid = productTable.getValueAt(r, 5).toString();

        productSearchText.setText(pid);
        productNameText.setText(pName);
        productBarCodeText.setText(barCode);
        productPriceText.setText(price);
        productQtyText.setText(qty);
        productSupIDText.setText(sid);
        
    }//GEN-LAST:event_productTableMouseClicked

    private void productSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productSearchButtonActionPerformed
        // TODO add your handling code here:
        String search = productSearchText.getText();
        try {
            Statement s = DB.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM product WHERE pid = '" + search + "'");

            if (!search.isEmpty()) {
                if (rs.next()) {

                    productNameText.setText(rs.getString("Product_Name"));
                    productBarCodeText.setText(rs.getString("Bar_code"));
                    productPriceText.setText(rs.getString("Price"));
                    productQtyText.setText(rs.getString("Qty"));
                    productSupIDText.setText(rs.getString("Sid"));

                    JOptionPane.showMessageDialog(null, "Product Found");

                } else {
                    JOptionPane.showMessageDialog(null, "No Product Found in Database");

                    productNameText.setText("");
                    productBarCodeText.setText("");
                    productPriceText.setText("");
                    productQtyText.setText("");
                    productSupIDText.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Enter Product ID");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_productSearchButtonActionPerformed

    private void productUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productUpdateButtonActionPerformed
        // TODO add your handling code here:
        String pName = productNameText.getText();
        String barCode = productBarCodeText.getText();
        String price = productPriceText.getText();
        String qty = productQtyText.getText();
        String sid = productSupIDText.getText();
        String pid = productSearchText.getText();

        try {
            if (pid.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter Product ID to update");
                return;
            } else {
                Statement s = DB.mycon().createStatement();
                s.executeUpdate(
                    "UPDATE product SET "
                    + "Product_Name = '" + pName + "', "
                    + "Bar_code = '" + barCode + "', "
                    + "Price = '" + price + "', "
                    + "Qty = '" + qty + "', "
                    + "Sid = '" + sid + "' "
                    + "WHERE pid = '" + pid + "'"
                );

                JOptionPane.showMessageDialog(null, "Product Updated Successfully!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        tb_load();
        clearProductFields();

    }//GEN-LAST:event_productUpdateButtonActionPerformed

    private void productDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productDeleteButtonActionPerformed
        // TODO add your handling code here:
        String id = productSearchText.getText();
        try {
            if (id.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter Product ID");
            } else {
                Statement s = DB.mycon().createStatement();
                s.executeUpdate("DELETE FROM product WHERE pid = '" + id + "'");
                JOptionPane.showMessageDialog(null, "Product Deleted");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        tb_load();
        clearProductFields();

    }//GEN-LAST:event_productDeleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton productAddButton;
    private javax.swing.JTextField productBarCodeText;
    private javax.swing.JButton productDeleteButton;
    private javax.swing.JTextField productNameText;
    private javax.swing.JTextField productPriceText;
    private javax.swing.JTextField productPriceText1;
    private javax.swing.JTextField productQtyText;
    private javax.swing.JButton productSearchButton;
    private javax.swing.JTextField productSearchText;
    private javax.swing.JTextField productSupIDText;
    private javax.swing.JTable productTable;
    private javax.swing.JButton productUpdateButton;
    // End of variables declaration//GEN-END:variables
}
