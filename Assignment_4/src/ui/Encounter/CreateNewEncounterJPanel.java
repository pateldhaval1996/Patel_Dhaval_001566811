package ui.Encounter;

import ui.SupplierRole.*;
import model.Product;
import model.Supplier;
import java.awt.CardLayout;
import java.awt.Component;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Person;


/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class CreateNewEncounterJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Supplier supplier;
    private Product product;
    
    public CreateNewEncounterJPanel(JPanel upc, Product p){
        initComponents();
        userProcessContainer = upc;
        product = p;
        txtName.setText(p.getPersonName());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblPersonAge = new javax.swing.JLabel();
        txtTemp = new javax.swing.JTextField();
        lblContactNo = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblPersonName = new javax.swing.JLabel();
        txtBP = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        lblPersonName1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(650, 600));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 28)); // NOI18N
        jLabel1.setText("Add Vital Signs");

        lblPersonAge.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblPersonAge.setText("Temperature:");

        txtTemp.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempActionPerformed(evt);
            }
        });

        lblContactNo.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblContactNo.setText("Pulse Rate:");

        btnAdd.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        btnAdd.setText("Add Signs");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblPersonName.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblPersonName.setText("Blood Pressure:");

        lblDate.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblDate.setText("Date:");

        lblPersonName1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblPersonName1.setText("Person Name:");

        txtName.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnBack)
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPersonAge, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPersonName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblContactNo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDate, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtPulse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblPersonName1)
                                .addGap(31, 31, 31)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnBack)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPersonName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPersonAge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(btnAdd)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtBP, txtPulse, txtTemp});

    }// </editor-fold>//GEN-END:initComponents
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        int bp = 0;
        double temp = 0.0;
        double pulse = 0.0;
        String date;
        
        try{
            
            //bp = Integer.parseInt(txtBP.getText());
            //temp= Double.parseDouble(txtTemp.getText());
            //pulse = Double.parseDouble(txtPulse.getText());
            //date = LocalDate.parse(txtDate.getText());
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please check formats of values!", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        
        
        if(txtBP.getText().isEmpty() || txtTemp.getText().isEmpty() || txtPulse.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Please do not keep any fields empty!", "Info", JOptionPane.INFORMATION_MESSAGE);
            //return;
            
        }
        else{
            
            //Product p = supplier.getProductCatalog().addProduct();

            product.setBP(Integer.parseInt(txtBP.getText()));
            product.setTemperature(Double.parseDouble(txtTemp.getText()));
            product.setPulse(Double.parseDouble(txtPulse.getText()));
            product.setDate(txtDate.getText());
            
            //adding values in temporary array list
            Person temp1 = new Person(product.getBP(),product.getTemperature(), product.getPulse(),product.getDate());
            List<Person> test = product.getRecordsList();
            test.add(temp1);
            product.setRecordsList(test);
            
            
            JOptionPane.showMessageDialog(null, "Vital signs added!", "Info", JOptionPane.INFORMATION_MESSAGE);
            
            txtBP.setText("");
            txtTemp.setText("");
            txtPulse.setText("");
            txtDate.setText("");

        }
        
}//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageEncounterCatalogJPanel manageEncounterCatalogJPanel = (ManageEncounterCatalogJPanel) component;
        manageEncounterCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPersonAge;
    private javax.swing.JLabel lblPersonName;
    private javax.swing.JLabel lblPersonName1;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemp;
    // End of variables declaration//GEN-END:variables
}
