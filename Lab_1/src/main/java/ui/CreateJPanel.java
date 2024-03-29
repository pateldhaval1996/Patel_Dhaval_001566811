/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.File;
import java.awt.Image; 
import javax.swing.ImageIcon;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import profile_info.User;

/**
 *
 * @author Dhaval
 */
public class CreateJPanel extends javax.swing.JPanel {
    
    User user;
    Image image;
    ImageIcon icon;
    
    int tel_flag;
    int fax_flag;
    int ssn_flag;
    int email_flag;
    int linkedin_flag;
    int IP_flag;
    int Veh_Ser_No_Flag;
    int HPBN_Flag;

    /**
     * Creates new form CreateJPanel
     * @param user
     */

    public CreateJPanel(User user) {
        initComponents();
        this.user= user;
    }

    CreateJPanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPlace = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblTelNo = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPlace = new javax.swing.JTextField();
        txtTelNo = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        userInfo = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblFaxNo = new javax.swing.JLabel();
        txtFaxNo = new javax.swing.JTextField();
        lblEmailId = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        lblSSN = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblMedRecNo = new javax.swing.JLabel();
        txtMedRecNo = new javax.swing.JTextField();
        lblHPBN = new javax.swing.JLabel();
        txtHPBN = new javax.swing.JTextField();
        lblBankAccountNo = new javax.swing.JLabel();
        txtBankAccountNo = new javax.swing.JTextField();
        lblLicenseNo = new javax.swing.JLabel();
        txtLicenseNo = new javax.swing.JTextField();
        lblVehicleSerialNo = new javax.swing.JLabel();
        txtVehicleSerialNo = new javax.swing.JTextField();
        lblLinkedin = new javax.swing.JLabel();
        txtLinkedin = new javax.swing.JTextField();
        lblDeviceSerialNo = new javax.swing.JLabel();
        txtDeviceSerialNo = new javax.swing.JTextField();
        lblIPAddress = new javax.swing.JLabel();
        txtIPAddress = new javax.swing.JTextField();
        lblUniqueIdentifier = new javax.swing.JLabel();
        txtUniqueIdentifier = new javax.swing.JTextField();
        BtnUpload = new javax.swing.JButton();
        JDOBChooser = new com.toedter.calendar.JDateChooser();

        lblPlace.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPlace.setText("Place:");

        lblDOB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDOB.setText("DOB:");

        lblTelNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTelNo.setText("Tel No:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        txtPlace.setToolTipText("");
        txtPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlaceActionPerformed(evt);
            }
        });
        txtPlace.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPlaceKeyPressed(evt);
            }
        });

        txtTelNo.setToolTipText("");
        txtTelNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelNoActionPerformed(evt);
            }
        });
        txtTelNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelNoKeyPressed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setAutoscrolls(true);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        userInfo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userInfo.setText("Create Profile");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");

        lblFaxNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFaxNo.setText("FAX No:");

        txtFaxNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaxNoActionPerformed(evt);
            }
        });
        txtFaxNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFaxNoKeyPressed(evt);
            }
        });

        lblEmailId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmailId.setText("Email_id:");

        txtEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIdActionPerformed(evt);
            }
        });
        txtEmailId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailIdKeyPressed(evt);
            }
        });

        lblSSN.setText("SSN:");

        txtSSN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSSNKeyPressed(evt);
            }
        });

        lblMedRecNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMedRecNo.setText("Medical Record No:");

        txtMedRecNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedRecNoActionPerformed(evt);
            }
        });
        txtMedRecNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMedRecNoKeyPressed(evt);
            }
        });

        lblHPBN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHPBN.setText("Health Plan Beneficary Number:");

        txtHPBN.setToolTipText("");
        txtHPBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHPBNKeyPressed(evt);
            }
        });

        lblBankAccountNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBankAccountNo.setText("Bank Account Number:");

        txtBankAccountNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBankAccountNoKeyPressed(evt);
            }
        });

        lblLicenseNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLicenseNo.setText("License No:");

        txtLicenseNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLicenseNoKeyPressed(evt);
            }
        });

        lblVehicleSerialNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVehicleSerialNo.setText("Vehicle Serial No:");

        txtVehicleSerialNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehicleSerialNoActionPerformed(evt);
            }
        });
        txtVehicleSerialNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVehicleSerialNoKeyPressed(evt);
            }
        });

        lblLinkedin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLinkedin.setText("Linkedin:");

        txtLinkedin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLinkedinKeyPressed(evt);
            }
        });

        lblDeviceSerialNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDeviceSerialNo.setText("Device Serial No:");

        txtDeviceSerialNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeviceSerialNoActionPerformed(evt);
            }
        });
        txtDeviceSerialNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDeviceSerialNoKeyPressed(evt);
            }
        });

        lblIPAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIPAddress.setText("IP Address:");

        txtIPAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIPAddressKeyPressed(evt);
            }
        });

        lblUniqueIdentifier.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUniqueIdentifier.setText("Unique identifier:");

        txtUniqueIdentifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniqueIdentifierActionPerformed(evt);
            }
        });

        BtnUpload.setText("Upload Image");
        BtnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(lblSSN)
                                .addGap(18, 18, 18)
                                .addComponent(txtSSN))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTelNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelNo)
                                    .addComponent(txtName)
                                    .addComponent(JDOBChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHPBN, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBankAccountNo)
                            .addComponent(lblDeviceSerialNo)
                            .addComponent(lblLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHPBN, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBankAccountNo)
                            .addComponent(txtLinkedin)
                            .addComponent(txtDeviceSerialNo))))
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPlace)
                    .addComponent(lblFaxNo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIPAddress)
                    .addComponent(lblUniqueIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVehicleSerialNo)
                    .addComponent(lblMedRecNo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblEmailId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIPAddress)
                    .addComponent(txtUniqueIdentifier)
                    .addComponent(txtVehicleSerialNo)
                    .addComponent(txtMedRecNo)
                    .addComponent(txtPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFaxNo)
                    .addComponent(txtLicenseNo))
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(BtnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(userInfo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlace)
                    .addComponent(txtPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDOB)
                        .addComponent(lblEmailId)
                        .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JDOBChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelNo)
                    .addComponent(lblFaxNo)
                    .addComponent(txtFaxNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSSN)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLicenseNo)
                    .addComponent(txtLicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinkedin)
                    .addComponent(txtLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIPAddress)
                    .addComponent(txtIPAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeviceSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeviceSerialNo)
                    .addComponent(lblUniqueIdentifier)
                    .addComponent(txtUniqueIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBankAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBankAccountNo)
                    .addComponent(lblVehicleSerialNo)
                    .addComponent(txtVehicleSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHPBN)
                    .addComponent(txtHPBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedRecNo)
                    .addComponent(txtMedRecNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(BtnUpload)
                .addGap(73, 73, 73)
                .addComponent(btnSave)
                .addGap(38, 38, 38))
        );

        txtTelNo.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:tz
        if ( txtName.getText().isEmpty() || txtPlace.getText().isEmpty() || JDOBChooser.getDateFormatString().isEmpty() 
            /*|| txtTelNo.getText().isEmpty() ||
            txtEmailId.getText().isEmpty() || txtFaxNo.getText().isEmpty() || txtSSN.getText().isEmpty() || txtLicenseNo.getText().isEmpty() ||
            txtLinkedin.getText().isEmpty() || txtHPBN.getText().isEmpty() || txtMedRecNo.getText().isEmpty() || txtBankAccountNo.getText().isEmpty() ||
            txtVehicleSerialNo.getText().isEmpty() || txtDeviceSerialNo.getText().isEmpty() || txtIPAddress.getText().isEmpty() || txtUniqueIdentifier.getText().isEmpty()*/
                ){
            JOptionPane.showMessageDialog(this, " Any of the fields cannot be empty ");
        }
        
        else if(tel_flag == 1){
            JOptionPane.showMessageDialog(this, " Please enter 10 digits for Telephone Number ");
        }
        
        else if(fax_flag == 1){
            JOptionPane.showMessageDialog(this, " Please enter 10 digits for Fax Number ");
        }
        
        else if(ssn_flag == 1){
            JOptionPane.showMessageDialog(this, " Please enter 10 digits for Fax Number ");
        }
        
        else if(email_flag == 1){
            JOptionPane.showMessageDialog(this, " Please enter valid Email address ");
        }
        
        else if(linkedin_flag == 1){
            JOptionPane.showMessageDialog(this, " Please enter valid Linkedin Address ");
        }
        
        else if(Veh_Ser_No_Flag == 1){
            JOptionPane.showMessageDialog(this, " Alphasbet and digit combination is only allowed in Vehicle Serial Number ");
        }
        
        else if(HPBN_Flag == 1){
            JOptionPane.showMessageDialog(this, " Alphasbet and digit combination is only allowed in Health Plan Beneficary Number ");
        }
        
        else{
        user.setName(txtName.getText());
        user.setPlace(txtPlace.getText());
        user.setDate(JDOBChooser.getDate());
        user.setTel_no(Integer.parseInt(txtTelNo.getText()));
        user.setEmail(txtEmailId.getText());
        user.setFax_no(Integer.parseInt(txtFaxNo.getText()));
        user.setSsn(Integer.parseInt(txtSSN.getText()));
        user.setCertificate_license_number(Integer.parseInt(txtLicenseNo.getText()));
        user.setLinkedin(txtLinkedin.getText());
        user.setHealth_plan_beneficary_number(txtHPBN.getText());
        user.setMedical_record_number(Integer.parseInt(txtMedRecNo.getText()));
        user.setBank_account_number(Integer.parseInt(txtBankAccountNo.getText()));
        user.setVehicle_license_number(txtVehicleSerialNo.getText());
        user.setDevice_serial_number(Integer.parseInt(txtDeviceSerialNo.getText()));
        user.setInternet_protocal_address(txtIPAddress.getText());
        user.setUnique_person_identifier(txtUniqueIdentifier.getText());
        
        
        JOptionPane.showMessageDialog(this, "User Information Saved!");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtTelNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelNoActionPerformed

    private void txtEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIdActionPerformed

    private void txtMedRecNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedRecNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedRecNoActionPerformed

    private void txtVehicleSerialNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehicleSerialNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehicleSerialNoActionPerformed

    private void txtPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlaceActionPerformed

    private void BtnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUploadActionPerformed
        // TODO add your handling code here:
        int upload;
        JFileChooser uploadImage = new JFileChooser();
        FileNameExtensionFilter filtr = new FileNameExtensionFilter("Images","jpg","png");
        
        uploadImage.setFileFilter(filtr);
        
        upload = uploadImage.showSaveDialog(null);
        
        if (upload == JFileChooser.APPROVE_OPTION){
            File currentImg = uploadImage.getSelectedFile();
            user.setFull_face_photo(currentImg);
            
            String[] validateImageName = currentImg.toString().split("/");
            
            BtnUpload.setText(validateImageName[validateImageName.length-1]);
        }
        
        /*chose.showOpenDialog(null);
        File f = chose.getSelectedFile();
        String fileName = f.getAbsolutePath();
        Image getAbsolutePath = null;
        icon = new ImageIcon(fileName);
        image = icon.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);*/
        
    }//GEN-LAST:event_BtnUploadActionPerformed

    private void txtDeviceSerialNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeviceSerialNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeviceSerialNoActionPerformed

    private void txtFaxNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaxNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaxNoActionPerformed

    private void txtTelNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelNoKeyPressed
        // TODO add your handling code here:
        /*char num = evt.getKeyChar();
        if(Character.isDigit(num) || Character.isISOControl(num)){
            txtTelNo.setEditable(true);
        }
        else{
            txtTelNo.setEditable(false);
        }*/
        String telNumber = txtTelNo.getText();
        int tel_number_length = telNumber.length();
        char num = evt.getKeyChar();
        if(Character.isDigit(num) || Character.isISOControl(num)){
            if ( tel_number_length < 9){
                tel_flag=1;
                txtTelNo.setEditable(true);
            }
            else if(tel_number_length==9){
                txtTelNo.setEditable(true);
                tel_flag=0;
            }
            else {
                txtTelNo.setEditable(false);
            }
        }
        else{
            txtTelNo.setEditable(false);
        }
        /*String telNumber = txtTelNo.getText();
        tel_number_length = telNumber.length();
        //System.out.println(tel_number_length);
        char c = evt.getKeyChar();
        //System.out.println("c= "+ c);
        if (c >= '0' && c <= '9')
        {
            if ( tel_number_length < 10){
                txtTelNo.setEditable(true);
                //System.out.println(tel_number_length);
            }
            else{
                txtTelNo.setEditable(false);
            }
            tel_flag = 0;
        }
        else
        {
            tel_flag = 1;
        }*/
        
    }//GEN-LAST:event_txtTelNoKeyPressed

    private void txtEmailIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailIdKeyPressed
        // TODO add your handling code here:
        String mail = txtEmailId.getText();
        String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPat = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPat.matcher(mail);
        if ( matcher.find() == false){
            email_flag=1;   
        }
        else{
            email_flag=0;
        }
    }//GEN-LAST:event_txtEmailIdKeyPressed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        // to check if only characters are there
        
        char name = evt.getKeyChar();
        if(Character.isLetter(name) || Character.isWhitespace(name) || Character.isISOControl(name)){
            txtName.setEditable(true);
        }
        else{
            txtName.setEditable(false);
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtFaxNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFaxNoKeyPressed
        // TODO add your handling code here:
        // fax number should only be digits
        String FaxNumber = txtFaxNo.getText();
        int fax_number_length = FaxNumber.length();
        char fax = evt.getKeyChar();
        if(Character.isDigit(fax) || Character.isISOControl(fax)){
            if ( fax_number_length < 9){
            txtFaxNo.setEditable(true);
            fax_flag=1;
            }
            else if(fax_number_length==9){
                txtFaxNo.setEditable(true);
                fax_flag=0;
            }
            else {
                txtFaxNo.setEditable(false);
            }
        }
        else{
            txtFaxNo.setEditable(false);
        }
    }//GEN-LAST:event_txtFaxNoKeyPressed

    private void txtSSNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSSNKeyPressed
        // TODO add your handling code here:
        String SSN = txtSSN.getText();
        int ssn_number_length = SSN.length();
        char ssn_char = evt.getKeyChar();
        if(Character.isDigit(ssn_char) || Character.isISOControl(ssn_char)){
            if ( ssn_number_length < 8){
            txtSSN.setEditable(true);
            ssn_flag=1;
            }
            else if(ssn_number_length==8){
                txtSSN.setEditable(true);
                ssn_flag=0;
            }
            else {
                txtSSN.setEditable(false);
            }
        }
        else{
            txtSSN.setEditable(false);
        }
    }//GEN-LAST:event_txtSSNKeyPressed

    private void txtPlaceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlaceKeyPressed
        // TODO add your handling code here:
        //Places cannot have digits 
        char place = evt.getKeyChar();
        if(Character.isLetter(place) || Character.isWhitespace(place) || Character.isISOControl(place)){
            txtPlace.setEditable(true);
        }
        else{
            txtPlace.setEditable(false);
        }
    }//GEN-LAST:event_txtPlaceKeyPressed

    private void txtLicenseNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLicenseNoKeyPressed
        // TODO add your handling code here:
        // license number should be digits
        char license_no = evt.getKeyChar();
        if(Character.isDigit(license_no) || Character.isISOControl(license_no)){
            txtLicenseNo.setEditable(true);
        }
        else{
            txtLicenseNo.setEditable(false);
        }
    }//GEN-LAST:event_txtLicenseNoKeyPressed

    private void txtUniqueIdentifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniqueIdentifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniqueIdentifierActionPerformed

    private void txtLinkedinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLinkedinKeyPressed
        // TODO add your handling code here:
        //check linkedin website is there
        String linkd = txtLinkedin.getText();
        String linkedinRegex = "^https:\\/\\/www\\.linkedin\\.com\\/.*$";
        Pattern linkPat = Pattern.compile(linkedinRegex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = linkPat.matcher(linkd);
        if ( matcher.find() ){
            linkedin_flag=0;
            //System.out.println(linkedin_flag);
        }
        else{
            linkedin_flag=1;
            //System.out.println(linkedin_flag);
        }
    }//GEN-LAST:event_txtLinkedinKeyPressed

    private void txtIPAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIPAddressKeyPressed
        // TODO add your handling code here:
        // IP address should be digits with 3 dots in between
        String IP = txtIPAddress.getText();
        String IPRegex ="(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])" + "\\." 
              + "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])" + "\\." 
              + "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])" + "\\." 
              + "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
        Pattern IP_Pat = Pattern.compile(IPRegex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = IP_Pat.matcher(IP);
        if ( matcher.find()){
            IP_flag=0;   
        }
        else{
            IP_flag=1;
        }
    }//GEN-LAST:event_txtIPAddressKeyPressed

    private void txtDeviceSerialNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeviceSerialNoKeyPressed
        // TODO add your handling code here:
        // checing Device Serial Number are digits
        char dev_ser_no = evt.getKeyChar();
        if(Character.isDigit(dev_ser_no) || Character.isISOControl(dev_ser_no)){
            txtDeviceSerialNo.setEditable(true);
        }
        else{
            txtDeviceSerialNo.setEditable(false);
        }
    }//GEN-LAST:event_txtDeviceSerialNoKeyPressed

    private void txtBankAccountNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBankAccountNoKeyPressed
        // TODO add your handling code here:        
        // checing Bank Account Number are digits
        char acc_num = evt.getKeyChar();
        if(Character.isDigit(acc_num) || Character.isISOControl(acc_num)){
            txtBankAccountNo.setEditable(true);
        }
        else{
            txtBankAccountNo.setEditable(false);
        }
    }//GEN-LAST:event_txtBankAccountNoKeyPressed

    private void txtVehicleSerialNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVehicleSerialNoKeyPressed
        // TODO add your handling code here:
        // checking Vehicle serial number is alphanumeric
        String Veh_ser_no = txtVehicleSerialNo.getText();
        String Serial_No = "^[a-zA-Z0-9]*$";
        Pattern Serial_Pattern = Pattern.compile(Serial_No,Pattern.CASE_INSENSITIVE);
        Matcher matcher = Serial_Pattern.matcher(Veh_ser_no);
        if ( matcher.find()){
            Veh_Ser_No_Flag=0;   
        }
        else{
            Veh_Ser_No_Flag=1;
        }
    }//GEN-LAST:event_txtVehicleSerialNoKeyPressed

    private void txtHPBNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHPBNKeyPressed
        // TODO add your handling code here:
        // checking Health Plan beneficary number is alphanumeric
        String health_no = txtHPBN.getText();
        String beneficary_no = "^[a-zA-Z0-9]*$";
        Pattern Serial_Pattern = Pattern.compile(beneficary_no,Pattern.CASE_INSENSITIVE);
        Matcher matcher = Serial_Pattern.matcher(health_no);
        if ( matcher.find()){
            HPBN_Flag=0;   
        }
        else{
            HPBN_Flag=1;
        }
    }//GEN-LAST:event_txtHPBNKeyPressed

    private void txtMedRecNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMedRecNoKeyPressed
        // TODO add your handling code here:
        // checing Bank Medical Record Number are digits
        char med_num = evt.getKeyChar();
        if(Character.isDigit(med_num) || Character.isISOControl(med_num)){
            txtMedRecNo.setEditable(true);
        }
        else{
            txtMedRecNo.setEditable(false);
        }
    }//GEN-LAST:event_txtMedRecNoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnUpload;
    private com.toedter.calendar.JDateChooser JDOBChooser;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblBankAccountNo;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDeviceSerialNo;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblFaxNo;
    private javax.swing.JLabel lblHPBN;
    private javax.swing.JLabel lblIPAddress;
    private javax.swing.JLabel lblLicenseNo;
    private javax.swing.JLabel lblLinkedin;
    private javax.swing.JLabel lblMedRecNo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPlace;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTelNo;
    private javax.swing.JLabel lblUniqueIdentifier;
    private javax.swing.JLabel lblVehicleSerialNo;
    private javax.swing.JTextField txtBankAccountNo;
    private javax.swing.JTextField txtDeviceSerialNo;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtFaxNo;
    private javax.swing.JTextField txtHPBN;
    private javax.swing.JTextField txtIPAddress;
    private javax.swing.JTextField txtLicenseNo;
    private javax.swing.JTextField txtLinkedin;
    private javax.swing.JTextField txtMedRecNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPlace;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtTelNo;
    private javax.swing.JTextField txtUniqueIdentifier;
    private javax.swing.JTextField txtVehicleSerialNo;
    private javax.swing.JLabel userInfo;
    // End of variables declaration//GEN-END:variables
}


