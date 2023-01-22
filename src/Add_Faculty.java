
import java.io.File;
import java.io.FileWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author elizmariemanalo
 */
public class Add_Faculty extends javax.swing.JFrame {

    /**
     * Creates new form Add_Faculty
     */
    public Add_Faculty() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FacultyName = new javax.swing.JTextField();
        FacultyID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FacultyPw = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        FacultyEmailAd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        FacultyDept_Dropdown = new javax.swing.JComboBox<>();
        Submit_btn = new javax.swing.JButton();
        Back_Btn = new javax.swing.JButton();
        background_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo-small.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(930, 50, 233, 99);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(22, 0, 83));
        jLabel4.setText("Add Faculty");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 170, 250, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(115, 115, 115));
        jLabel5.setText("Faculty Name:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(130, 250, 180, 30);

        FacultyName.setBackground(new java.awt.Color(255, 255, 255));
        FacultyName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        FacultyName.setForeground(new java.awt.Color(22, 0, 83));
        FacultyName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        FacultyName.setOpaque(false);
        jPanel1.add(FacultyName);
        FacultyName.setBounds(130, 290, 260, 30);

        FacultyID.setBackground(new java.awt.Color(255, 255, 255));
        FacultyID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        FacultyID.setForeground(new java.awt.Color(22, 0, 83));
        FacultyID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        FacultyID.setOpaque(false);
        jPanel1.add(FacultyID);
        FacultyID.setBounds(450, 290, 250, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(115, 115, 115));
        jLabel6.setText("Password:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(760, 250, 180, 30);

        FacultyPw.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        FacultyPw.setForeground(new java.awt.Color(22, 0, 83));
        FacultyPw.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        FacultyPw.setOpaque(false);
        jPanel1.add(FacultyPw);
        FacultyPw.setBounds(760, 290, 250, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(115, 115, 115));
        jLabel7.setText("Faculty ID:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(450, 250, 180, 30);

        FacultyEmailAd.setBackground(new java.awt.Color(255, 255, 255));
        FacultyEmailAd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        FacultyEmailAd.setForeground(new java.awt.Color(22, 0, 83));
        FacultyEmailAd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        FacultyEmailAd.setOpaque(false);
        jPanel1.add(FacultyEmailAd);
        FacultyEmailAd.setBounds(130, 410, 260, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(115, 115, 115));
        jLabel8.setText("Email Address:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(130, 370, 180, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(115, 115, 115));
        jLabel9.setText("Department:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(450, 370, 180, 30);

        FacultyDept_Dropdown.setBackground(new java.awt.Color(255, 255, 255));
        FacultyDept_Dropdown.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        FacultyDept_Dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIT", "LIB", "ECE", "CCE" }));
        FacultyDept_Dropdown.setOpaque(false);
        jPanel1.add(FacultyDept_Dropdown);
        FacultyDept_Dropdown.setBounds(450, 410, 260, 30);

        Submit_btn.setBackground(new java.awt.Color(255, 255, 255));
        Submit_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Submit_btn.setForeground(new java.awt.Color(22, 0, 83));
        Submit_btn.setText("Submit");
        Submit_btn.setBorder(null);
        Submit_btn.setBorderPainted(false);
        Submit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Submit_btn.setFocusPainted(false);
        Submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_btnActionPerformed(evt);
            }
        });
        jPanel1.add(Submit_btn);
        Submit_btn.setBounds(130, 510, 100, 38);

        Back_Btn.setBackground(new java.awt.Color(38, 36, 36));
        Back_Btn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Back_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Back_Btn.setText("Go back");
        Back_Btn.setBorder(null);
        Back_Btn.setBorderPainted(false);
        Back_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Back_Btn.setFocusPainted(false);
        Back_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Back_Btn);
        Back_Btn.setBounds(1070, 620, 90, 30);

        background_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.png"))); // NOI18N
        background_image.setText("jLabel2");
        jPanel1.add(background_image);
        background_image.setBounds(0, 0, 1210, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1201, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_btnActionPerformed
        try {
		File f1 = new File( "/Users/elizmariemanalo/NetBeansProjects/AMS/Records/FacultyList.txt" );
		FileWriter fw = new FileWriter( f1, true );
                
		String facname = FacultyName.getText();
		String facid = FacultyID.getText();
		String facpass = FacultyPw.getText();
		String facdept = (String)FacultyDept_Dropdown.getSelectedItem();
		String facmail = FacultyEmailAd.getText();
                
		String total = facname + "," + facid + "," + facpass + "," + facdept + "," + facmail + "\n";
		fw.write( total );
		fw.close();
	}
	
        catch(Exception f) {
		JOptionPane.showMessageDialog( null, f );
	}
	
        JOptionPane.showMessageDialog( null, "Faculty Added !" );
        
	Add_Faculty ad = new Add_Faculty();
	ad.setVisible(true);
	dispose();
    }//GEN-LAST:event_Submit_btnActionPerformed

    private void Back_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_BtnActionPerformed
        Driver d = new Driver();
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_Back_BtnActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Faculty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Btn;
    private javax.swing.JComboBox<String> FacultyDept_Dropdown;
    private javax.swing.JTextField FacultyEmailAd;
    private javax.swing.JTextField FacultyID;
    private javax.swing.JTextField FacultyName;
    private javax.swing.JPasswordField FacultyPw;
    private javax.swing.JButton Submit_btn;
    private javax.swing.JLabel background_image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
