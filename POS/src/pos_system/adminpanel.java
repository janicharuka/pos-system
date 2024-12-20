/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos_system;

import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.sql.* ;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Wimukthi
 */
public class adminpanel extends javax.swing.JFrame {

    /**
     * 
     */
    public adminpanel() {
        initComponents();
    }
    Connection con ;
    PreparedStatement pst;
    ResultSet rs;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnsaveback = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtproductcode = new javax.swing.JTextField();
        txtproductname = new javax.swing.JTextField();
        txtproductprice = new javax.swing.JTextField();
        btnaddp = new javax.swing.JButton();
        btnupp = new javax.swing.JButton();
        btndelp = new javax.swing.JButton();
        btnview = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnsaveback.setBackground(new java.awt.Color(0, 102, 102));
        btnsaveback.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnsaveback.setForeground(new java.awt.Color(255, 255, 255));
        btnsaveback.setText("SAVE");
        btnsaveback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsavebackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "STOCKS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRODUCT CODE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRODUCT NAME");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRICE");

        txtproductprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductpriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtproductcode, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtproductname, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtproductprice, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtproductcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtproductname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtproductprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnaddp.setBackground(new java.awt.Color(0, 153, 153));
        btnaddp.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnaddp.setForeground(new java.awt.Color(0, 255, 255));
        btnaddp.setText("ADD PRODUCT");
        btnaddp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddpActionPerformed(evt);
            }
        });

        btnupp.setBackground(new java.awt.Color(0, 153, 153));
        btnupp.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnupp.setForeground(new java.awt.Color(0, 255, 255));
        btnupp.setText("UPDATE PRODUCT");
        btnupp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuppActionPerformed(evt);
            }
        });

        btndelp.setBackground(new java.awt.Color(0, 153, 153));
        btndelp.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btndelp.setForeground(new java.awt.Color(0, 255, 255));
        btndelp.setText("DELETE PRODUCT");
        btndelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelpActionPerformed(evt);
            }
        });

        btnview.setBackground(new java.awt.Color(0, 153, 153));
        btnview.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnview.setForeground(new java.awt.Color(51, 255, 255));
        btnview.setText("VIEW PRODUCTS");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btnsaveback))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnview)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnaddp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnupp)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndelp)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddp)
                    .addComponent(btnupp)
                    .addComponent(btndelp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsaveback)
                .addGap(18, 18, 18)
                .addComponent(btnview)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsavebackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavebackActionPerformed
        // TODO add your handling code here:
        sales salesframe = new sales();  // Create an instance of the AdminForm class
        salesframe.setVisible(true);            // Set the admin frame visible
        dispose();

    }//GEN-LAST:event_btnsavebackActionPerformed

    private void btnaddpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddpActionPerformed
        // TODO add your handling code here:
        String productName = txtproductname.getText();
        String productCode = txtproductcode.getText();
        int productprice =Integer.parseInt(txtproductprice.getText());
        
        try {
            // Prepare the SQL insert statement
            try ( // Establish the database connection
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/salespos", "root", "")) {
                // Prepare the SQL insert statement
                String sql = "INSERT INTO product (id, product_name, price) VALUES (?, ?, ?)";
                // Set the parameter values
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    // Set the parameter values
                    statement.setString(1, productCode);
                    statement.setString(2, productName);
                    statement.setDouble(3, productprice);
                    // Execute the SQL statement
                    int rowsInserted = statement.executeUpdate();
                    if (rowsInserted > 0) {
                        JOptionPane.showMessageDialog(null, "Data added successfully!");
                    }
                    // Close the database connection and statement
                }
            }

        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error adding data to the database", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnaddpActionPerformed

    private void txtproductpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductpriceActionPerformed

    private void btnuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuppActionPerformed
        // TODO add your handling code here:
        String productName = txtproductname.getText();
        String productCode = txtproductcode.getText();
        int productprice =Integer.parseInt(txtproductprice.getText());

        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/salespos", "root", "");

            // Prepare the SQL update statement
            String sql = "UPDATE product SET product_name = ?, price = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);

            // Set the parameter values
            statement.setString(1, productName);
            statement.setDouble(2, productprice);
            statement.setString(3, productCode);

            // Execute the SQL statement
            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Data updated successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "No data found for the given product code.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Close the database connection and statement
            statement.close();
            connection.close();

        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null, "Error updating data in the database", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnuppActionPerformed

    private void btndelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelpActionPerformed
        // TODO add your handling code here:
        
        String productName = txtproductname.getText();
        String productCode = txtproductcode.getText();
        int productprice =Integer.parseInt(txtproductprice.getText());
        
        
         try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/salespos", "root", "");

            // Prepare the SQL delete statement
            String sql = "DELETE FROM product WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);

            // Set the parameter value
            statement.setString(1, productCode);

            // Execute the SQL statement
            int rowsDeleted = statement.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Data deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "No data found for the given product code.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Close the database connection and statement
            statement.close();
            connection.close();

        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error deleting data from the database", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btndelpActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        
        
try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/salespos", "root", "");

            // Prepare the SQL query
            String sql = "SELECT * FROM product";
            PreparedStatement statement = connection.prepareStatement(sql);

            // Execute the SQL query
            ResultSet resultSet = statement.executeQuery();

            // Create a StringBuilder to hold the item list
            StringBuilder itemList = new StringBuilder();

            // Iterate through the result set and append items to the list
            while (resultSet.next()) {
                int Id = resultSet.getInt("id");
                String ProductName = resultSet.getString("product_name");
                String Price = resultSet.getString("price");

                // Append the item details to the list
                itemList.append("ID: ").append(Id).append("\n");
                itemList.append("Product Name: ").append(ProductName).append("\n");
                itemList.append("Price: ").append(Price).append("\n\n");
            }

            // Close the result set, statement, and connection
            resultSet.close();
            statement.close();
            connection.close();

            // Display the item list in a message box
            JOptionPane.showMessageDialog(null, itemList.toString(), "Item List", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error retrieving data from the database", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_btnviewActionPerformed

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
            java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminpanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddp;
    private javax.swing.JButton btndelp;
    private javax.swing.JButton btnsaveback;
    private javax.swing.JButton btnupp;
    private javax.swing.JButton btnview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtproductcode;
    private javax.swing.JTextField txtproductname;
    private javax.swing.JTextField txtproductprice;
    // End of variables declaration//GEN-END:variables
}