/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.ImageIcon;
import profile_info.User;
import java.lang.Object;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Dhaval
 */
public class ViewJPanel extends javax.swing.JPanel {

    User user;
    
    /**
     * Creates new form ViewJPanel
     * @param user
     */
    public ViewJPanel(User user) {
        initComponents();
        this.user = user;
        displayUser();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTelNo = new javax.swing.JLabel();
        lblMedRecNo = new javax.swing.JLabel();
        txtHPBN = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtMedRecNo = new javax.swing.JTextField();
        lblBankAccountNo = new javax.swing.JLabel();
        txtPlace = new javax.swing.JTextField();
        txtBankAccountNo = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        lblLicenseNo = new javax.swing.JLabel();
        txtTelNo = new javax.swing.JTextField();
        userInfo = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtLicenseNo = new javax.swing.JTextField();
        lblVehicleSerialNo = new javax.swing.JLabel();
        txtVehicleSerialNo = new javax.swing.JTextField();
        lblLinkedin = new javax.swing.JLabel();
        txtLinkedin = new javax.swing.JTextField();
        lblDeviceSerialNo = new javax.swing.JLabel();
        txtDeviceSerialNo = new javax.swing.JTextField();
        lblIPAddress = new javax.swing.JLabel();
        txtIPAddress = new javax.swing.JTextField();
        lblFaxNo = new javax.swing.JLabel();
        txtFaxNo = new javax.swing.JTextField();
        lblUniqueIdentifier = new javax.swing.JLabel();
        lblEmailId = new javax.swing.JLabel();
        txtUniqueIdentifier = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        lblPlace = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblHPBN = new javax.swing.JLabel();
        lblUpload_Image = new javax.swing.JLabel();
        lblBioMetric = new javax.swing.JLabel();

        lblTelNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTelNo.setText("Tel No:");

        lblMedRecNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMedRecNo.setText("Medical Record No:");

        txtHPBN.setToolTipText("");
        txtHPBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHPBNKeyPressed(evt);
            }
        });

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

        txtMedRecNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedRecNoActionPerformed(evt);
            }
        });

        lblBankAccountNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBankAccountNo.setText("Bank Account Number:");

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

        txtBankAccountNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBankAccountNoKeyPressed(evt);
            }
        });

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        lblLicenseNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLicenseNo.setText("License No:");

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

        userInfo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userInfo.setText("View Profile");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");

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

        lblUniqueIdentifier.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUniqueIdentifier.setText("Unique identifier:");

        lblEmailId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmailId.setText("Email_id:");

        txtUniqueIdentifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniqueIdentifierActionPerformed(evt);
            }
        });

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

        lblPlace.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPlace.setText("Place:");

        lblSSN.setText("SSN:");

        lblDOB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDOB.setText("DOB:");

        txtSSN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSSNKeyPressed(evt);
            }
        });

        lblHPBN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHPBN.setText("Health Plan Beneficary Number:");

        lblUpload_Image.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                lblUpload_ImageComponentShown(evt);
            }
        });

        lblBioMetric.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblBioMetricKeyPressed(evt);
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
                                .addComponent(txtSSN, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTelNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelNo)
                                    .addComponent(txtDOB)
                                    .addComponent(txtName)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHPBN, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBankAccountNo)
                            .addComponent(lblDeviceSerialNo)
                            .addComponent(lblLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBankAccountNo, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(txtDeviceSerialNo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLinkedin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtHPBN))))
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
                .addGap(156, 156, 156)
                .addComponent(lblUpload_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229)
                .addComponent(lblBioMetric, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDOB)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailId)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBioMetric, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUpload_Image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHPBNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHPBNKeyPressed
        // TODO add your handling code here:
        // checking Health Plan beneficary number is alphanumeric
    }//GEN-LAST:event_txtHPBNKeyPressed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        // to check if only characters are there

    }//GEN-LAST:event_txtNameKeyPressed

    private void txtMedRecNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedRecNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedRecNoActionPerformed

    private void txtPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlaceActionPerformed

    private void txtPlaceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlaceKeyPressed
        // TODO add your handling code here:
        //Places cannot have digits

    }//GEN-LAST:event_txtPlaceKeyPressed

    private void txtBankAccountNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBankAccountNoKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtBankAccountNoKeyPressed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
        //JDateChooser date_chooser = new JDateChooser();
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtTelNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelNoActionPerformed

    private void txtTelNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelNoKeyPressed

    private void txtLicenseNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLicenseNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicenseNoKeyPressed

    private void txtVehicleSerialNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehicleSerialNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehicleSerialNoActionPerformed

    private void txtVehicleSerialNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVehicleSerialNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehicleSerialNoKeyPressed

    private void txtLinkedinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLinkedinKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinkedinKeyPressed

    private void txtDeviceSerialNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeviceSerialNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeviceSerialNoActionPerformed

    private void txtDeviceSerialNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeviceSerialNoKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDeviceSerialNoKeyPressed

    private void txtIPAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIPAddressKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtIPAddressKeyPressed

    private void txtFaxNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaxNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaxNoActionPerformed

    private void txtFaxNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFaxNoKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFaxNoKeyPressed

    private void txtUniqueIdentifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniqueIdentifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniqueIdentifierActionPerformed

    private void txtEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIdActionPerformed

    private void txtEmailIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIdKeyPressed

    private void txtSSNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSSNKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNKeyPressed

    private void lblUpload_ImageComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_lblUpload_ImageComponentShown
        // TODO add your handling code here:
        //image=icon.getImage().getScaledInstance(lblUpload_Image.getWidth(), lblUpload_Image.getHeight(), Image.SCALE_SMOOTH);
        //lblUpload_Image.setIcon(icon);
               
    }//GEN-LAST:event_lblUpload_ImageComponentShown

    private void lblBioMetricKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblBioMetricKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBioMetricKeyPressed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBankAccountNo;
    private javax.swing.JLabel lblBioMetric;
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
    private javax.swing.JLabel lblUpload_Image;
    private javax.swing.JLabel lblVehicleSerialNo;
    private javax.swing.JTextField txtBankAccountNo;
    private javax.swing.JTextField txtDOB;
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

    private void displayUser() {
        
        Date DOB = user.getDate();
        int year = DOB.getYear()+1900;
        txtName.setText(user.getName());
        txtPlace.setText(user.getPlace());
        txtDOB.setText(DOB.getMonth()+1+"/"+DOB.getDate()+"/"+year+" ");
        txtTelNo.setText(Integer.toString(user.getTel_no()));
        txtEmailId.setText(user.getEmail());
        txtFaxNo.setText(Integer.toString(user.getFax_no()));
        txtSSN.setText(Integer.toString(user.getSsn()));
        txtLicenseNo.setText(Integer.toString(user.getCertificate_license_number()));
        txtLinkedin.setText(user.getLinkedin());
        txtHPBN.setText(user.getHealth_plan_beneficary_number());
        txtMedRecNo.setText(Integer.toString(user.getMedical_record_number()));
        txtBankAccountNo.setText(Integer.toString(user.getBank_account_number()));
        txtVehicleSerialNo.setText(user.getVehicle_license_number());
        txtDeviceSerialNo.setText(Integer.toString(user.getDevice_serial_number()));
        txtIPAddress.setText(user.getInternet_protocal_address());
        txtUniqueIdentifier.setText(user.getUnique_person_identifier());
        
        BufferedImage myPicture,bioPicture = null;
        
        if(user.getFull_face_photo() == null){
            ;
        }
        else{
            try {
                myPicture = ImageIO.read(user.getFull_face_photo());
                lblUpload_Image.setIcon(new ImageIcon(myPicture.getScaledInstance(myPicture.getWidth(), myPicture.getHeight(), Image.SCALE_SMOOTH)));
                bioPicture = myPicture;
            lblBioMetric.setIcon(new ImageIcon(bioPicture.getScaledInstance(bioPicture.getWidth(), bioPicture.getHeight(), Image.SCALE_SMOOTH)));
            } catch (IOException ex) {
                Logger.getLogger(ViewJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        }
       
         
        

    }
}