package ui.Encounter;

import ui.SupplierRole.*;
import model.EncounterList;
import model.Product;
import model.Supplier;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeRegExp.test;
import model.Person;

/**
 *
 * @author Rushabh
 */
public class ManageEncounterCatalogJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageProductCatalogJPanel
     */
    private JPanel userProcessContainer;
    private Supplier supplier;
    private Product product;

    public ManageEncounterCatalogJPanel(JPanel upc, Supplier s) {
        initComponents();
        userProcessContainer = upc;
        supplier = s;
        lblSupplier.setText("Supplier : " + s.getSupplyName());
        refreshTable();
    }

    public void refreshTable() {

        DefaultTableModel model = (DefaultTableModel) tblProductCatalog.getModel();
        model.setRowCount(0);

        for (Product p : supplier.getProductCatalog().getProductcatalog()) {
            Object row[] = new Object[3];
            row[0] = p;
            row[1] = p.getAge();
            row[2] = p.getContactNumber();
            
            model.addRow(row);
        }
    }
    
    public void refreshPatientTable(Long age) {

        DefaultTableModel model = (DefaultTableModel) tblEncounterCatalog.getModel();
        model.setRowCount(0);

        Product curr_record= supplier.getProductCatalog().searchProduct(age);
        for (Person p : curr_record.getRecordsList()) {
            Object row[] = new Object[4];
            //row[0] = p;
            row[0] = p.getBP();
            row[1] = p.getPulse();
            row[2] = p.getTemperature();
            row[3] = p.getDate();
            
            model.addRow(row);
        }
    }
    
    public void getPatientStatus(Integer age, Integer bp) {

        /*DefaultTableModel model = (DefaultTableModel) tblEncounterCatalog.getModel();
        model.setRowCount(0);*/
        //Product patient = supplier.getProductCatalog().getProductcatalog();
        if ( age <= 18 && (60 <= bp || bp <= 120)){
            
            JOptionPane.showMessageDialog(null, "Excellent! Person is in normal condition", "Message", JOptionPane.CLOSED_OPTION);
            
        }
        else if ( (18 < age && age <=60) && (80 <= bp && bp <= 120)){
            JOptionPane.showMessageDialog(null, "Excellent! Person is in normal condition", "Message", JOptionPane.CLOSED_OPTION);
            
        }
         else if ( 60 < age && (80 <= bp  && bp <= 135)){
            JOptionPane.showMessageDialog(null, "Excellent! Person is in normal condition", "Message", JOptionPane.CLOSED_OPTION);
            
        }       
        else{
            JOptionPane.showMessageDialog(null, "Warning! Person is in abnormal condition", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
        //Product curr_record= supplier.getProductCatalog().searchProduct(age);
        // age 1-18 --> bp --> temp --> pulse -->
        // age 18-60 --> bp --> temp --> pulse -->  ///pulse - 60-100
        // age 60+ --> bp --> temp --> pulse --> temp - 36.1 --> 37.2 
       
                
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblSupplier = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductCatalog = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEncounterCatalog = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(650, 600));

        lblTitle.setFont(new java.awt.Font("Agency FB", 1, 28)); // NOI18N
        lblTitle.setText("Manage Encounter Catalog");

        lblSupplier.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        lblSupplier.setText("Supplier:");

        tblProductCatalog.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        tblProductCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Person Name", "Age", "Contact No"
            }
        ));
        jScrollPane1.setViewportView(tblProductCatalog);

        btnView.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        btnView.setText("View Details...");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnCreate.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        btnCreate.setText("Add Encounter.");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        btnSearch.setText("Condition");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblEncounterCatalog.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        tblEncounterCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Blood Pressure", "Temperature", "Pulse", "Date"
            }
        ));
        jScrollPane2.setViewportView(tblEncounterCatalog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(lblTitle))
                    .addComponent(lblSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(18, 18, 18)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addComponent(lblSupplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnView)
                    .addComponent(btnSearch)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        int selectedRowIndex = tblProductCatalog.getSelectedRow();
        
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Product p = (Product) tblProductCatalog.getValueAt(selectedRowIndex, 0);
        Long age = p.getContactNumber();
        refreshPatientTable(age);
        
        
        /*ViewProductDetailJPanel vpdjp = new ViewProductDetailJPanel(userProcessContainer, p);
        userProcessContainer.add("ViewProductDetailJPanel", vpdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);*/
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        
        int selectedRowIndex = tblProductCatalog.getSelectedRow();
        
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Product p = (Product) tblProductCatalog.getValueAt(selectedRowIndex, 0);
        
        CreateNewEncounterJPanel cnpjp = new CreateNewEncounterJPanel(userProcessContainer, p);
        userProcessContainer.add("CreateNewEncounterJPanel", cnpjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        int selectedRowIndex = tblProductCatalog.getSelectedRow();
        
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Product p = (Product) tblProductCatalog.getValueAt(selectedRowIndex, 0);
        
        Integer age = p.getAge();
        Integer bp = p.getBP();
        
        if (bp == 0) {
            JOptionPane.showMessageDialog(null, "There is no encounter record present!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //Double temp = p.getTemperature();
        //Double pulse = p.getPulse();
        getPatientStatus(age,bp);
       
        
        /*SearchForProductJPanel sfpjp = new SearchForProductJPanel(userProcessContainer, supplier);
        userProcessContainer.add("SearchForProductJPanel", sfpjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);*/
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int selectedRowIndex = tblProductCatalog.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Product s = (Product) tblProductCatalog.getValueAt(selectedRowIndex, 0);
        supplier.getProductCatalog().removeProduct(s);
        refreshTable();
    }//GEN-LAST:event_btnDeleteActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEncounterCatalog;
    private javax.swing.JTable tblProductCatalog;
    // End of variables declaration//GEN-END:variables
}
