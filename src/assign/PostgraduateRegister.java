/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ayesh
 */
public class PostgraduateRegister extends javax.swing.JFrame {
   databases dbsu =new databases();

    /**
     * Creates new form PostgraduateRegister
     */
    public PostgraduateRegister() {
        initComponents();
        Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
        int width=(int) screensize.getWidth();
        int height=(int) screensize.getHeight();
        setSize(width,height);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public PostgraduateRegister(PostgraduateStudent pg1)  {
        
         initComponents();
        postgraduateNameText.setText(pg1.getName());
        courseCodeText.setText(pg1.getCourseCode()+"");
        postgraduateStudentIdText.setText(pg1.getPostgraduateId());
        postgraduateAddressText.setText(pg1.getAddress());
        qualificationTypeText.setText(pg1.getQualificationType());
       UniversityText.setText(pg1.getUniversity());
       yearOfGraduationText.setText(pg1.getYearOfGraduation()+"");
       userIdText.setText(pg1.getUserId()+"");
       
        undergraduateDegreeText.setText(pg1.getUndergraduateDegree());
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userIdLabel = new javax.swing.JLabel();
        userIdText = new javax.swing.JTextField();
        postgraduateNameLabel = new javax.swing.JLabel();
        postgraduateNameText = new javax.swing.JTextField();
        postgraduateDOBLabel = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        postgraduateAddressLabel = new javax.swing.JLabel();
        postgraduateAddressText = new javax.swing.JTextField();
        undergraduateDegreeLabel = new javax.swing.JLabel();
        undergraduateDegreeText = new javax.swing.JTextField();
        qualificationTypeLabel = new javax.swing.JLabel();
        qualificationTypeText = new javax.swing.JTextField();
        universityLabel = new javax.swing.JLabel();
        UniversityText = new javax.swing.JTextField();
        yearOfGraduationLabel = new javax.swing.JLabel();
        yearOfGraduationText = new javax.swing.JTextField();
        postgraduateStudentIdLabel = new javax.swing.JLabel();
        postgraduateStudentIdText = new javax.swing.JTextField();
        courseCodeLabel = new javax.swing.JLabel();
        courseCodeText = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        intakeComboBox = new javax.swing.JComboBox();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Postgraduate Student Register Form");

        userIdLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userIdLabel.setText("User Id");

        postgraduateNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        postgraduateNameLabel.setText("Name");

        postgraduateNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postgraduateNameTextActionPerformed(evt);
            }
        });

        postgraduateDOBLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        postgraduateDOBLabel.setText("Date of birth");

        postgraduateAddressLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        postgraduateAddressLabel.setText("Address");

        undergraduateDegreeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        undergraduateDegreeLabel.setText("Undergraduate degree");

        qualificationTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qualificationTypeLabel.setText("Qualification Type");

        universityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        universityLabel.setText("University");

        yearOfGraduationLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yearOfGraduationLabel.setText("Year of Graduation");

        postgraduateStudentIdLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        postgraduateStudentIdLabel.setText("Student Id");

        courseCodeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        courseCodeLabel.setText("Course Code");

        submitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        homeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nsbm 2.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shutterstock_236238829.jpg.640x480_q85_crop-center.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Intake");

        intakeComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        intakeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "February", "July" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addGap(209, 209, 209)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(courseCodeLabel)
                    .addComponent(yearOfGraduationLabel)
                    .addComponent(universityLabel)
                    .addComponent(qualificationTypeLabel)
                    .addComponent(postgraduateAddressLabel)
                    .addComponent(postgraduateDOBLabel)
                    .addComponent(undergraduateDegreeLabel)
                    .addComponent(postgraduateNameLabel)
                    .addComponent(userIdLabel)
                    .addComponent(postgraduateStudentIdLabel)
                    .addComponent(submitButton)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearOfGraduationText, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UniversityText, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postgraduateNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postgraduateAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qualificationTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(undergraduateDegreeText, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 363, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(253, 253, 253))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postgraduateStudentIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(homeButton)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(intakeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIdLabel))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(postgraduateStudentIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postgraduateStudentIdLabel))
                        .addGap(26, 26, 26)
                        .addComponent(postgraduateNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(postgraduateNameLabel))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postgraduateDOBLabel))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postgraduateAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postgraduateAddressLabel))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(undergraduateDegreeText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(undergraduateDegreeLabel))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qualificationTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qualificationTypeLabel))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UniversityText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(universityLabel))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearOfGraduationText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearOfGraduationLabel))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseCodeLabel))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(intakeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(homeButton))
                .addGap(87, 87, 87))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void postgraduateNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postgraduateNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postgraduateNameTextActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
      PostgraduateStudent ps1=new PostgraduateStudent();
       ps1.setUserId(Integer.parseInt(userIdText.getText()));
       ps1.setPostgraduateId(postgraduateStudentIdText.getText());
       ps1.setName(postgraduateNameText.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dob1 = sdf.format(dob.getDate());
        ps1.setDateOfBirth(dob1);
        ps1.setCourseCode(Integer.parseInt(courseCodeText.getText()));
       ps1.setQualificationType(qualificationTypeText.getText());
       ps1.setAddress(postgraduateAddressText.getText());
       ps1.setUndergraduateDegree(undergraduateDegreeText.getText());
       ps1.setUniversity(UniversityText.getText());
       ps1.setYearOfGraduation(Integer.parseInt(yearOfGraduationText.getText()));
       ps1.setEmail(emailText.getText());
       ps1.setIntake(intakeComboBox.getSelectedItem().toString());
       
        // TODO add your handling code here:
        boolean result=dbsu.addPostgraduateStudent(ps1);
        
        if(result==true){
            JOptionPane.showMessageDialog(this, "Successfully Inserted");
            //postgraduateClear();
            this.dispose();  //Jframe will dissapear after we click ok on the message
        }else{
            JOptionPane.showMessageDialog(this, "Sorry an error  occured while Inserteting");
        }
    

    }                                            

    private void updateRankTextActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }//GEN-LAST:event_submitButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
      MainFrame mf1=new MainFrame();
       mf1.setVisible(true);
       mf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();  
    }//GEN-LAST:event_homeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PostgraduateRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostgraduateRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostgraduateRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostgraduateRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostgraduateRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UniversityText;
    private javax.swing.JLabel courseCodeLabel;
    private javax.swing.JTextField courseCodeText;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton homeButton;
    private javax.swing.JComboBox intakeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel postgraduateAddressLabel;
    private javax.swing.JTextField postgraduateAddressText;
    private javax.swing.JLabel postgraduateDOBLabel;
    private javax.swing.JLabel postgraduateNameLabel;
    private javax.swing.JTextField postgraduateNameText;
    private javax.swing.JLabel postgraduateStudentIdLabel;
    private javax.swing.JTextField postgraduateStudentIdText;
    private javax.swing.JLabel qualificationTypeLabel;
    private javax.swing.JTextField qualificationTypeText;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel undergraduateDegreeLabel;
    private javax.swing.JTextField undergraduateDegreeText;
    private javax.swing.JLabel universityLabel;
    private javax.swing.JLabel userIdLabel;
    private javax.swing.JTextField userIdText;
    private javax.swing.JLabel yearOfGraduationLabel;
    private javax.swing.JTextField yearOfGraduationText;
    // End of variables declaration//GEN-END:variables
}
