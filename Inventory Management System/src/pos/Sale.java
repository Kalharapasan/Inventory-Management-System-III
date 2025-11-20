package pos;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Sale extends javax.swing.JPanel {

    public static String barcode_c = "0" ;
    public static String cus_id = "0";
    
    public Double  Stcok_qty= 0.0 ;
    public Sale() {
        initComponents();
    }
    
    public void data_load(){
  
  // load customer
  
      try {
          
          Statement s= DB.mycon().createStatement();
          
          ResultSet rs = s.executeQuery("SELECT * FROM customer");
          Vector v = new Vector();
          
          while (rs.next()) {              
              v.add(rs.getString("customer_name"));
              
              DefaultComboBoxModel com = new DefaultComboBoxModel(v);
              saleCustumerComboBox.setModel(com);
               
          }
           
      } catch (SQLException e) {
            System.out.println(e);
      }
     
     // load Product
  
      try {
          
          Statement s= DB.mycon().createStatement();
          
          ResultSet rs = s.executeQuery("SELECT * FROM product");
          Vector v = new Vector();
          
          while (rs.next()) {              
              v.add(rs.getString("Product_Name"));
              
              DefaultComboBoxModel com = new DefaultComboBoxModel(v);
              saleProductComboBox.setModel(com);
               
          }
           
      } catch (SQLException e) {
            System.out.println(e);
      }  
      
      // load last invoice number
      
      try {
          
        Statement s = DB.mycon().createStatement();
          ResultSet rs = s.executeQuery("SELECT * FROM extra WHERE exid =1");
          
          if (rs.next()) {
              
              saleInvoIDLabel.setText(rs.getString("val"));
              
          }
          
      } catch (Exception e) {
      }
     
      // pluss new invoice
      int i = Integer.valueOf(saleInvoIDLabel.getText());
      i++;
      saleInvoIDLabel.setText(String.valueOf(i));
      
      
      
      
  }
    
 public void pro_tot_cal(){
 
  // product calculation
         
        Double qt = Double.valueOf(saleQtyText.getText());
        Double price = Double.valueOf(saleUnitPriceLabel.getText());
        Double tot ;
        
        tot = qt * price;
        
        saleTotalPriceLabel.setText(String.valueOf(tot));
 
 }   
 
 public void cart_total(){
 
 int numofrow = saleTable.getRowCount();
 
    double total = 0;
    
     for (int i = 0; i < numofrow; i++) {
         
         double value = Double.valueOf(saleTable.getValueAt(i, 5).toString());
         total += value ;
     }
    saleTotalAmountLabel.setText(Double.toString(total));
    
   /// total qty count 
   
   int numofrows = saleTable.getRowCount();
 
    double totals = 0;
    
     for (int i = 0; i < numofrows; i++) {
         
         double values = Double.valueOf(saleTable.getValueAt(i, 3).toString());
         totals += values ;
     }
    saleTotalQtyLable.setText(Double.toString(totals));
    
 
 
 
 }
 
 public void tot(){
     
 Double paid = Double.valueOf(salePaidAmountText.getText());
       Double tot = Double.valueOf(saleTotalAmountLabel.getText());
       Double due ;
       
       due =  paid -tot ;
       
       saleBalanceLable.setText(String.valueOf(due));
 
 }
 
 public void stckup(){
     
     //get all table product id and sell qty
     
     DefaultTableModel dt = (DefaultTableModel) saleTable.getModel();
     int rc  = dt.getRowCount();
     
     for (int i = 0; i < rc; i++) {
         
         String bcode = dt.getValueAt(i, 2).toString(); // id or barcode
         String sell_qty = dt.getValueAt(i, 3).toString(); // id or barcode
         
         System.out.println(bcode); 
         System.out.println(sell_qty); 
         
         try {
             
             Statement s= DB.mycon().createStatement();
             ResultSet rs = s.executeQuery("SELECT Qty From product WHERE Bar_code = '"+bcode+"'");
             
             if (rs.next()) {
                 
            Stcok_qty = Double.valueOf(rs.getString("Qty"));
                
             }
              
         } catch (Exception e) {
             System.out.println(e);
         }
   
        Double st_qty = Stcok_qty ;
        Double Sel_qty = Double.valueOf(sell_qty);
        
        Double new_qty = st_qty - Sel_qty ;  // new qyt = Stock Qty - Sell Qty 
        
        String nqty = String.valueOf(new_qty);
        
         try {
             
            Statement ss = DB.mycon().createStatement();
             ss.executeUpdate("UPDATE product SET Qty ='"+nqty+"' WHERE Bar_code ='"+bcode+"'   ");
             // update new qty in product table 
             
             
             
         } catch (Exception e) {
             System.out.println(e);
         }
        
        
         
         
         
         
         
     }
     
     
 
 
 
 
 }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        saleInvoIDLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        saleCustumerComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        saleProductComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        saleQtyText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        saleUnitPriceLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        saleTotalPriceLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        saleStockQtyLabel = new javax.swing.JLabel();
        saleBarCodeLable = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        saleTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        saleAddCartButton = new javax.swing.JButton();
        saleRemoveButton = new javax.swing.JButton();
        saleRemoveAllButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        saleTotalAmountLabel = new javax.swing.JLabel();
        saleBalanceLable = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        salePaidAmountText = new javax.swing.JTextField();
        saleTotalQtyLable = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        salePrintButton = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("INVOICE NO:");

        saleInvoIDLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saleInvoIDLabel.setText("00.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(saleInvoIDLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(saleInvoIDLabel))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Custemer:");

        saleCustumerComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saleCustumerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selete" }));
        saleCustumerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleCustumerComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Product");

        saleProductComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saleProductComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selete" }));
        saleProductComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleProductComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Qty:");

        saleQtyText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saleQtyText.setText("00");
        saleQtyText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                saleQtyTextKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Unit Price:");

        saleUnitPriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saleUnitPriceLabel.setText("00.00");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Total Price :");

        saleTotalPriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saleTotalPriceLabel.setText("00.00");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Stock Qty : ");

        saleStockQtyLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saleStockQtyLabel.setText("0");

        saleBarCodeLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saleBarCodeLable.setText("0");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Bar Code");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saleCustumerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(saleProductComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saleQtyText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saleUnitPriceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saleTotalPriceLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saleStockQtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saleBarCodeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(saleCustumerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(saleProductComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(saleQtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(saleUnitPriceLabel)
                    .addComponent(jLabel11)
                    .addComponent(saleTotalPriceLabel)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saleStockQtyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saleBarCodeLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        saleTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "IN ID", "Name", "Bar Code", "Qty", "Unite Price", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(saleTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        saleAddCartButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saleAddCartButton.setText("Add Cart");
        saleAddCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleAddCartButtonActionPerformed(evt);
            }
        });

        saleRemoveButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saleRemoveButton.setText("Remove");
        saleRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleRemoveButtonActionPerformed(evt);
            }
        });

        saleRemoveAllButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saleRemoveAllButton.setText("Remove All");
        saleRemoveAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleRemoveAllButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saleRemoveAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saleRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saleAddCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(saleAddCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saleRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saleRemoveAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Total Amount:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Balance/Deu: ");

        saleTotalAmountLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saleTotalAmountLabel.setText("00.00");

        saleBalanceLable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saleBalanceLable.setText("00.00");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saleTotalAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(saleBalanceLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saleTotalAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saleBalanceLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Paid Amount:");

        salePaidAmountText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salePaidAmountText.setText("00.00");
        salePaidAmountText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                salePaidAmountTextKeyReleased(evt);
            }
        });

        saleTotalQtyLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        saleTotalQtyLable.setText("00");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Total Qty :");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saleTotalQtyLable, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salePaidAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 377, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(salePaidAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saleTotalQtyLable, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        salePrintButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salePrintButton.setText("Play/Print");
        salePrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salePrintButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(salePrintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(salePrintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saleAddCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleAddCartButtonActionPerformed
        // TODO add your handling code here:
        
        Double sell_qty = Double.valueOf(saleQtyText.getText());
        Double stk_qty = Double.valueOf(saleStockQtyLabel.getText());
    
        if (sell_qty <stk_qty) {
            
          
       
       DefaultTableModel dt = (DefaultTableModel) saleTable.getModel();
        
        Vector v = new Vector();
        
        v.add(saleInvoIDLabel.getText()); // invoice id
        v.add(saleProductComboBox.getSelectedItem().toString()); // product name
        v.add(saleBarCodeLable.getText()); // barcode
        v.add(saleQtyText.getText()); // p qyt
        v.add(saleUnitPriceLabel.getText()); // unit price
        v.add(saleTotalAmountLabel.getText()); // get totle price
        v.add(saleTotalAmountLabel.getText()); // get totle price
        
        dt.addRow(v);
        
        cart_total();
         tot(); 
         
        }else {
    
        JOptionPane.showMessageDialog(saleBalanceLable, "Stock Have "+stk_qty+" Qty Only");
    }
    
    }//GEN-LAST:event_saleAddCartButtonActionPerformed

    private void saleRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleRemoveButtonActionPerformed
        // TODO add your handling code here:
        try {
            
            DefaultTableModel dt = (DefaultTableModel) saleTable.getModel();
            int rw = saleTable.getSelectedRow();
           
            dt.removeRow(rw);
            
            
        } catch (Exception e) {
        }
        
        cart_total(); 
         tot(); 
    }//GEN-LAST:event_saleRemoveButtonActionPerformed

    private void saleRemoveAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleRemoveAllButtonActionPerformed
        // TODO add your handling code here:
         DefaultTableModel dt = (DefaultTableModel) saleTable.getModel();
        dt.setRowCount(0);
        
         cart_total();
         tot();
    }//GEN-LAST:event_saleRemoveAllButtonActionPerformed

    private void salePrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salePrintButtonActionPerformed
        try {
          DefaultTableModel dt = (DefaultTableModel) saleTable.getModel();
          int rc = dt.getRowCount();
          
            for (int i = 0; i < rc; i++) {
                
                String inid = dt.getValueAt(i, 0).toString();
                String P_name = dt.getValueAt(i, 1).toString(); 
                String bar_code = dt.getValueAt(i, 2).toString(); 
                String qty = dt.getValueAt(i, 3).toString(); 
                String un_price = dt.getValueAt(i, 4).toString(); 
                String tot_price = dt.getValueAt(i, 5).toString(); 
             Statement s = DB.mycon().createStatement();
             s.executeUpdate(" INSERT INTO cart (INID, Product_Name, Bar_code, qty, Unit_Price, Total_Price) VALUES ('"+inid+"','"+P_name+"','"+bar_code+"','"+qty+"','"+un_price+"','"+tot_price+"') ");
           
            }
            
                JOptionPane.showMessageDialog(null, "Data Seved");
            
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }
  
        try {
            String inv_id = saleInvoIDLabel.getText();
            String cname  = saleCustumerComboBox.getSelectedItem().toString();
            String totqty = saleTotalQtyLable.getText();
            String tot_bil = saleTotalAmountLabel.getText();           
            String blnc = saleBalanceLable.getText();
            
             // paid check
             
             Double tot = Double.valueOf(saleTotalAmountLabel.getText());
             Double pid = Double.valueOf(salePaidAmountText.getText());
             String Status = null;
             if (pid.equals(0.0)) {
                 
                Status = "UnPaid";
                
            }else if (tot>pid) {
                 Status = "Partial";
                 
            }else if (tot<=pid) {
                Status = "Paid";
            }
             Statement ss = DB.mycon().createStatement();
             ss.executeUpdate("INSERT INTO sales(INID, Cid, Customer_Name, Total_Qty, Total_Bill, Status, Balance) VALUES('"+inv_id+"','"+cus_id+"','"+cname+"','"+totqty+"','"+tot_bil+"','"+Status+"','"+blnc+"')");

        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
        try {
            
           String id = saleInvoIDLabel.getText(); 
            Statement s = DB.mycon().createStatement();
            s.executeUpdate("UPDATE  extra SET val='"+id+"' WHERE exid = 1");
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }

        try {
        HashMap para = new HashMap();
        
        para.put("inv_id", saleInvoIDLabel.getText());  // inv_id  is ireport parameter name
        
        //ReportView r =new ReportView("src\\reports\\print.jasper", para);
        //r.setVisible(true);  
           
        } catch (Exception e) {
        }
        stckup();
    }//GEN-LAST:event_salePrintButtonActionPerformed

    private void salePaidAmountTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salePaidAmountTextKeyReleased
        // TODO add your handling code here:
        tot(); 
    }//GEN-LAST:event_salePaidAmountTextKeyReleased

    private void saleQtyTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saleQtyTextKeyReleased
        // TODO add your handling code here:
        pro_tot_cal();
    }//GEN-LAST:event_saleQtyTextKeyReleased

    private void saleProductComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleProductComboBoxActionPerformed
        // TODO add your handling code here:
        String  name =saleProductComboBox.getSelectedItem().toString();
        try {
            
            Statement s = DB.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT Bar_code,Price,Qty FROM product  WHERE Product_Name ='"+name+"'  ");
            if (rs.next()) {
                 
               
                saleUnitPriceLabel.setText(rs.getString("Price"));
                saleBarCodeLable.setText(rs.getString("Bar_code"));
                saleStockQtyLabel.setText(rs.getString("Qty"));
                
                
            }
             pro_tot_cal();
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_saleProductComboBoxActionPerformed

    private void saleCustumerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleCustumerComboBoxActionPerformed
        // TODO add your handling code here:
        String  name =saleCustumerComboBox.getSelectedItem().toString();
        try {
            
            Statement s = DB.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT cid,customer_name FROM customer  WHERE customer_name ='"+name+"'  ");
            if (rs.next()) {
                 
               
               cus_id = (rs.getString("cid"));
               
                
                
            }
          
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_saleCustumerComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saleAddCartButton;
    private javax.swing.JLabel saleBalanceLable;
    private javax.swing.JLabel saleBarCodeLable;
    private javax.swing.JComboBox<String> saleCustumerComboBox;
    private javax.swing.JLabel saleInvoIDLabel;
    private javax.swing.JTextField salePaidAmountText;
    private javax.swing.JButton salePrintButton;
    private javax.swing.JComboBox<String> saleProductComboBox;
    private javax.swing.JTextField saleQtyText;
    private javax.swing.JButton saleRemoveAllButton;
    private javax.swing.JButton saleRemoveButton;
    private javax.swing.JLabel saleStockQtyLabel;
    private javax.swing.JTable saleTable;
    private javax.swing.JLabel saleTotalAmountLabel;
    private javax.swing.JLabel saleTotalPriceLabel;
    private javax.swing.JLabel saleTotalQtyLable;
    private javax.swing.JLabel saleUnitPriceLabel;
    // End of variables declaration//GEN-END:variables
}
