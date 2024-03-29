/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Car_Info;
import model.Uber_Go;

/**
 *
 * @author Dhaval
 */

     

public class ListCarJPanel extends javax.swing.JPanel {

    Car_Info history;
    /**
     * Creates new form ListCarJPanel
     */
    public ListCarJPanel(Car_Info history) {
        initComponents();
        
        this.history=history;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFindbyCar = new javax.swing.JLabel();
        txtListbyCar = new javax.swing.JTextField();
        lblManuYear = new javax.swing.JLabel();
        txtListbyManuYear = new javax.swing.JTextField();
        lblSerialNo = new javax.swing.JLabel();
        txtListbySerialNo = new javax.swing.JTextField();
        lblModelNo = new javax.swing.JLabel();
        txtListbyModelNo = new javax.swing.JTextField();
        lblCarCity = new javax.swing.JLabel();
        txtListbyCity = new javax.swing.JTextField();
        btnFirstAvailCar = new javax.swing.JButton();
        btnTotalAvailCar = new javax.swing.JButton();
        btnNotAvailCar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListCar = new javax.swing.JTable();
        lblListCarbySeats = new javax.swing.JLabel();
        lblListManu = new javax.swing.JLabel();
        btnSearchCarSeat = new javax.swing.JButton();
        spinMin = new javax.swing.JSpinner();
        spinMax = new javax.swing.JSpinner();
        lblUber = new javax.swing.JLabel();
        lblListCarDetails = new javax.swing.JLabel();
        txtListManu = new javax.swing.JTextField();
        btnExp = new javax.swing.JButton();

        lblFindbyCar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFindbyCar.setText("Find by Model:");

        txtListbyCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtListbyCarActionPerformed(evt);
            }
        });
        txtListbyCar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtListbyCarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtListbyCarKeyReleased(evt);
            }
        });

        lblManuYear.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblManuYear.setText("Manufacturer Year:");

        txtListbyManuYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtListbyManuYearKeyPressed(evt);
            }
        });

        lblSerialNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSerialNo.setText("Serial Number:");

        txtListbySerialNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtListbySerialNoKeyPressed(evt);
            }
        });

        lblModelNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblModelNo.setText("Model Number:");

        txtListbyModelNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtListbyModelNoKeyPressed(evt);
            }
        });

        lblCarCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCarCity.setText("City:");

        txtListbyCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtListbyCityKeyPressed(evt);
            }
        });

        btnFirstAvailCar.setText("First Available Car");
        btnFirstAvailCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstAvailCarActionPerformed(evt);
            }
        });

        btnTotalAvailCar.setText("Available Cars");
        btnTotalAvailCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalAvailCarActionPerformed(evt);
            }
        });

        btnNotAvailCar.setText("Not Available Cars");
        btnNotAvailCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotAvailCarActionPerformed(evt);
            }
        });

        tblListCar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Manufacturer", "Model Name", "Manu Year", "No. of Seats", "Serial Number", "Model Number", "Last Maintained", "City", "Availablity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListCar);

        lblListCarbySeats.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblListCarbySeats.setText("No. of Seats:");

        lblListManu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblListManu.setText("List of Manufacturers:");

        btnSearchCarSeat.setText("Search");
        btnSearchCarSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCarSeatActionPerformed(evt);
            }
        });

        lblUber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/r3brbjf6y7thcnqhchq2.png"))); // NOI18N

        lblListCarDetails.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        lblListCarDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListCarDetails.setText("LIST CAR DETAILS");

        txtListManu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtListManuActionPerformed(evt);
            }
        });
        txtListManu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtListManuKeyPressed(evt);
            }
        });

        btnExp.setText("Expired Maintance Certificate");
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnFirstAvailCar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnTotalAvailCar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNotAvailCar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblManuYear, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(lblCarCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblModelNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtListbyManuYear, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                .addComponent(txtListbyCity))
                            .addComponent(txtListbyModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSerialNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFindbyCar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblListManu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtListbySerialNo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtListbyCar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtListManu, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lblListCarbySeats, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(spinMin, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(spinMax, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchCarSeat)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(131, 131, 131))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblListCarDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(417, 417, 417)
                        .addComponent(lblUber, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblUber, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblListCarDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCarCity)
                            .addComponent(txtListbyCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblManuYear)
                            .addComponent(txtListbyManuYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModelNo)
                            .addComponent(txtListbyModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFindbyCar)
                            .addComponent(txtListbyCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSerialNo)
                            .addComponent(txtListbySerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblListManu)
                            .addComponent(txtListManu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblListCarbySeats)
                    .addComponent(spinMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchCarSeat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirstAvailCar)
                    .addComponent(btnTotalAvailCar)
                    .addComponent(btnNotAvailCar))
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnExp)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtListbyCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtListbyCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtListbyCarActionPerformed

    private void btnNotAvailCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotAvailCarActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) tblListCar.getModel();
        model.setRowCount(0);
        
        for (Uber_Go ug : history.getHistory()){
            String first_avail = ug.getCar_available();
            
            String not_avl= "No";
            
            if(first_avail.equalsIgnoreCase(not_avl)){
            Object [] row = new Object[10];
            row[0] = ug;
            row[1] = ug.getModel_name();
            row[2] = ug.getManu_year();
            row[3] = ug.getCar_seats();
            row[4] = ug.getCar_serial_number();
            row[5] = ug.getCar_model_number();
            row[6] = ug.getCar_maintenance_date();
            row[7] = ug.getCar_city();
            row[8] = ug.getCar_available();

            model.addRow(row);
            
          
            }
        }
    }//GEN-LAST:event_btnNotAvailCarActionPerformed

    private void txtListbyCityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtListbyCityKeyPressed
        // TODO add your handling code here:
        
        String city = txtListbyCity.getText();
        Search(city);
        
    }//GEN-LAST:event_txtListbyCityKeyPressed

    private void txtListbyCarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtListbyCarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtListbyCarKeyReleased

    private void txtListbyCarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtListbyCarKeyPressed
        // TODO add your handling code here:
        String car = txtListbyCar.getText();
        Search(car);
    }//GEN-LAST:event_txtListbyCarKeyPressed

    private void txtListbyManuYearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtListbyManuYearKeyPressed
        // TODO add your handling code here:
        String manu_year = txtListbyManuYear.getText();
        Search(manu_year);
    }//GEN-LAST:event_txtListbyManuYearKeyPressed

    private void txtListbySerialNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtListbySerialNoKeyPressed
        // TODO add your handling code here:
        String serial_no = txtListbySerialNo.getText();
        Search(serial_no);
    }//GEN-LAST:event_txtListbySerialNoKeyPressed

    private void txtListbyModelNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtListbyModelNoKeyPressed
        // TODO add your handling code here:
        String model_no = txtListbyModelNo.getText();
        Search(model_no);
    }//GEN-LAST:event_txtListbyModelNoKeyPressed

    private void btnFirstAvailCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstAvailCarActionPerformed
        // TODO add your handling code here:
        
        //String yes_available = (string) ug.class
        //int max = (int) spinMax.getValue();
        DefaultTableModel model = (DefaultTableModel) tblListCar.getModel();
        model.setRowCount(0);
        
        for (Uber_Go ug : history.getHistory()){
            String first_avail = ug.getCar_available();
            
            String avl= "Yes";
            
            if(first_avail.equalsIgnoreCase(avl)){
            Object [] row = new Object[10];
            row[0] = ug;
            row[1] = ug.getModel_name();
            row[2] = ug.getManu_year();
            row[3] = ug.getCar_seats();
            row[4] = ug.getCar_serial_number();
            row[5] = ug.getCar_model_number();
            row[6] = ug.getCar_maintenance_date();
            row[7] = ug.getCar_city();
            row[8] = ug.getCar_available();

            model.addRow(row);
            
            break;
            }
        }
        
        
    }//GEN-LAST:event_btnFirstAvailCarActionPerformed

    private void btnSearchCarSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCarSeatActionPerformed
        // TODO add your handling code here:
        
        int min = (int) spinMin.getValue();
        int max = (int) spinMax.getValue();
        DefaultTableModel model = (DefaultTableModel) tblListCar.getModel();
        model.setRowCount(0);
        for (Uber_Go ug :history.getHistory()){
            if(ug.getCar_seats()>= min && ug.getCar_seats()<= max){
            Object [] row = new Object[10];
            row[0] = ug;
            row[1] = ug.getModel_name();
            row[2] = ug.getManu_year();
            row[3] = ug.getCar_seats();
            row[4] = ug.getCar_serial_number();
            row[5] = ug.getCar_model_number();
            row[6] = ug.getCar_maintenance_date();
            row[7] = ug.getCar_city();
            row[8] = ug.getCar_available();

            model.addRow(row);
            }
        }
    }//GEN-LAST:event_btnSearchCarSeatActionPerformed

    private void btnTotalAvailCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalAvailCarActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) tblListCar.getModel();
        model.setRowCount(0);
        
        for (Uber_Go ug : history.getHistory()){
            String first_avail = ug.getCar_available();
            
            String avl= "Yes";
            
            if(first_avail.equalsIgnoreCase(avl)){
            Object [] row = new Object[10];
            row[0] = ug;
            row[1] = ug.getModel_name();
            row[2] = ug.getManu_year();
            row[3] = ug.getCar_seats();
            row[4] = ug.getCar_serial_number();
            row[5] = ug.getCar_model_number();
            row[6] = ug.getCar_maintenance_date();
            row[7] = ug.getCar_city();
            row[8] = ug.getCar_available();

            model.addRow(row);
            
            
            }
        }
    }//GEN-LAST:event_btnTotalAvailCarActionPerformed

    private void txtListManuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtListManuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtListManuActionPerformed

    private void txtListManuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtListManuKeyPressed
        // TODO add your handling code here:
        String manu_info = txtListManu.getText();
        Search(manu_info);
    }//GEN-LAST:event_txtListManuKeyPressed

    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
        // TODO add your handling code here:
        boolean exp_date = false;
        DefaultTableModel model = (DefaultTableModel) tblListCar.getModel();
        model.setRowCount(0);
        
        for (Uber_Go ug : history.getHistory()){
        try
        {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        String strcurrDate= formatter.format(date);
        Date date_new=formatter.parse(strcurrDate); 
        //System.out.println(date);
        //System.out.println(date_new);
        
        String maintanance_cert_expiry_date= ug.getCar_maintenance_date();
        //System.out.println(maintanance_cert_expiry_date);
        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
        Date date1=formatter1.parse(maintanance_cert_expiry_date); 
        
        //System.out.println(date1);
        exp_date = date_new.after(date1);
        //System.out.println(date_new.before(date1));
        }
        catch (Exception e){
            System.out.println("Error!");
        }
        
        
        
        
            //String first_avail = ug.getCar_available();
            
            //String avl= "Yes";
            
            if(exp_date){
            Object [] row = new Object[10];
            row[0] = ug;
            row[1] = ug.getModel_name();
            row[2] = ug.getManu_year();
            row[3] = ug.getCar_seats();
            row[4] = ug.getCar_serial_number();
            row[5] = ug.getCar_model_number();
            row[6] = ug.getCar_maintenance_date();
            row[7] = ug.getCar_city();
            row[8] = ug.getCar_available();

            model.addRow(row);
            
            
            }
        }
        
    }//GEN-LAST:event_btnExpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnFirstAvailCar;
    private javax.swing.JButton btnNotAvailCar;
    private javax.swing.JButton btnSearchCarSeat;
    private javax.swing.JButton btnTotalAvailCar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCarCity;
    private javax.swing.JLabel lblFindbyCar;
    private javax.swing.JLabel lblListCarDetails;
    private javax.swing.JLabel lblListCarbySeats;
    private javax.swing.JLabel lblListManu;
    private javax.swing.JLabel lblManuYear;
    private javax.swing.JLabel lblModelNo;
    private javax.swing.JLabel lblSerialNo;
    private javax.swing.JLabel lblUber;
    private javax.swing.JSpinner spinMax;
    private javax.swing.JSpinner spinMin;
    private javax.swing.JTable tblListCar;
    private javax.swing.JTextField txtListManu;
    private javax.swing.JTextField txtListbyCar;
    private javax.swing.JTextField txtListbyCity;
    private javax.swing.JTextField txtListbyManuYear;
    private javax.swing.JTextField txtListbyModelNo;
    private javax.swing.JTextField txtListbySerialNo;
    // End of variables declaration//GEN-END:variables

    
        private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblListCar.getModel();
        model.setRowCount(0);
        
        for (Uber_Go ug : history.getHistory()){  
            Object[] row = new Object[10];
            row[0] = ug;
            row[1] = ug.getModel_name();
            row[2] = ug.getManu_year();
            row[3] = ug.getCar_seats();
            row[4] = ug.getCar_serial_number();
            row[5] = ug.getCar_model_number();
            row[6] = ug.getCar_maintenance_date();
            row[7] = ug.getCar_city();
            row[8] = ug.getCar_available();
            
            model.addRow(row);
        }
        
    }
        
        private void Search(String str) {
            
            DefaultTableModel model = (DefaultTableModel) tblListCar.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
            tblListCar.setRowSorter(trs);
            trs.setRowFilter(RowFilter.regexFilter(str));
            
        }
        
        /*private void populateCombo(){
            
            comboCarNames.removeAllItems();
            comboCarNames.setSelectedIndex(1);
            //comboCarNames.addActionListener(comboCarNames);
            add(comboCarNames);
            add(lblCarCity);
            
            for (Uber_Go ug : history.getHistory()){
                comboCarNames.addItem(ug.getCar_city());
            }
            
        }*/
    
    
}
