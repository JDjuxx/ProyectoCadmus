/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocadmus;

import com.placeholder.PlaceHolder;

import conexion.JDBC;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author renatasanandres
 */
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    public Customer() {
        initComponents();
        this.log.setBackground(new Color(255,255,255,35));
        this.log.requestFocus();
        PlaceHolder holder1 = new PlaceHolder(username,"Username");
        PlaceHolder holder2 = new PlaceHolder(password,"Password");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loger = new javax.swing.JLabel();
        log = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        padlock = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        home = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logg.png"))); // NOI18N
        getContentPane().add(loger, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 160, 170));

        log.setBackground(new java.awt.Color(255, 255, 255));
        log.setForeground(new java.awt.Color(255, 255, 255));
        log.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usern.png"))); // NOI18N
        log.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 135, 40, 40));

        padlock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/padlocker.png"))); // NOI18N
        log.add(padlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        password.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        log.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 350, 50));

        login.setBackground(new java.awt.Color(9, 20, 104));
        login.setFont(new java.awt.Font("PT Mono", 0, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setAlignmentY(0.0F);
        login.setContentAreaFilled(false);
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        login.setLabel("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
                /*
                System.out.println("Login Button Pressed");
                
                if(!username.getText().equals("")){
                	
                	conexion.openConection();
                	
					try {
						
						conexion.setStmt(conexion.getConn().createStatement());
						ResultSet rs = conexion.getStmt().executeQuery("SELECT * FROM `CLIENTE` WHERE id = '" + username.getText() + "' AND `password` = '" + password.getText() + "';");
						System.out.println("SELECT * FROM `CLIENTE` WHERE id = '" + username.getText() + "' AND `password` = '" + password.getText() + "';");
						
						if (rs.isBeforeFirst() ) {    
						     
							//boolean 
							
						} else
							System.out.println("Wrong User or password");
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					

                	
                }*/
                
            }
        });
        log.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 350, 45));

        username.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        log.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 350, 50));

        getContentPane().add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 200, 430, 370));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow.png"))); // NOI18N
        home.setBorder(null);
        home.setBorderPainted(false);
        home.setContentAreaFilled(false);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 90));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background-login.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        CustomerMain main = new CustomerMain();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFocusLost

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton home;
    private javax.swing.JPanel log;
    private javax.swing.JLabel loger;
    private javax.swing.JButton login;
    private javax.swing.JLabel padlock;
    private javax.swing.JTextField password;
    private javax.swing.JLabel user;
    private javax.swing.JTextField username;
    
    private JDBC conexion = new JDBC();
    // End of variables declaration//GEN-END:variables
}
