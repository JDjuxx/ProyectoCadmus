/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocadmus;

import com.placeholder.PlaceHolder;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author renatasanandres
 */
public class StaffMain extends javax.swing.JFrame {
    int option;
    JPanel panels[] = new JPanel[3];
    JPanel panelsD[] = new JPanel[3];
    JScrollPane tables[] = new JScrollPane[3];
    JScrollPane tablesD[] = new JScrollPane[3];
    
    /**
     * Creates new form StaffMain
     */
    public StaffMain() {
        initComponents();
        fillpanelD();
        fillpanel();
        filltable();
        filltableD();
        setFalse(panels,tables);
        setFalse(panelsD,tablesD);
        
    }
    
    public void setFalse(JPanel p[],JScrollPane t[]){
        for(int i=1;i<3;i++){
            p[i].setVisible(false);
            t[i].setVisible(false);
        }
    }
    
    public void fillpanelD(){
        panelsD[1]=this.deleteUser;
        panelsD[2]=this.deleteProduct;
    }
    
    public void filltableD(){
        tablesD[1]=this.userT;
        tablesD[2]=this.productT;
    }
    
    public void fillpanel(){
        panels[1]=this.userdata;
        panels[2]=this.productdata;
    }
    
    public void filltable(){
        tables[1]=this.userTable;
        tables[2]=this.productTable;
    }
    
    public void user(){
        PlaceHolder holder1 = new PlaceHolder(username,"Username");
        PlaceHolder holder2 = new PlaceHolder(password,"Password");
        PlaceHolder holder3 = new PlaceHolder(phone,"Phone");
        PlaceHolder holder4 = new PlaceHolder(name,"Name");
        PlaceHolder holder5 = new PlaceHolder(email,"Email");
        PlaceHolder holder6 = new PlaceHolder(address,"Address");
    }
    
    public void product(){
        PlaceHolder holder1 = new PlaceHolder(product,"Name Product");
        PlaceHolder holder2 = new PlaceHolder(value,"Value");
        PlaceHolder holder3 = new PlaceHolder(quantity,"Quantity");
    }
    
    public void deleteUser(){
        PlaceHolder holder1 = new PlaceHolder(emailname,"Username o Email");
    }
    
    public void deleteProduct(){
        PlaceHolder holder1 = new PlaceHolder(nameProduct,"Product Name");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        insertar = new javax.swing.JPanel();
        TypeInsert = new javax.swing.JComboBox<>();
        userdata = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        padlock = new javax.swing.JLabel();
        padlock3 = new javax.swing.JLabel();
        padlock4 = new javax.swing.JLabel();
        padlock5 = new javax.swing.JLabel();
        padlock7 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        province = new javax.swing.JComboBox<>();
        canton = new javax.swing.JComboBox<>();
        productdata = new javax.swing.JPanel();
        user1 = new javax.swing.JLabel();
        padlock1 = new javax.swing.JLabel();
        padlock6 = new javax.swing.JLabel();
        product = new javax.swing.JTextField();
        login1 = new javax.swing.JButton();
        value = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        productTable = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        userTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bginsert = new javax.swing.JLabel();
        eliminar = new javax.swing.JPanel();
        TypeDelete = new javax.swing.JComboBox<>();
        deleteProduct = new javax.swing.JPanel();
        padlock9 = new javax.swing.JLabel();
        padlock10 = new javax.swing.JLabel();
        nameProduct = new javax.swing.JTextField();
        find1 = new javax.swing.JButton();
        delete1 = new javax.swing.JButton();
        deleteUser = new javax.swing.JPanel();
        padlock2 = new javax.swing.JLabel();
        padlock8 = new javax.swing.JLabel();
        emailname = new javax.swing.JTextField();
        find = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        userT = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        productT = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        bgdelete = new javax.swing.JLabel();
        editar = new javax.swing.JPanel();
        TypeEdit = new javax.swing.JComboBox<>();
        bgedit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        insertar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TypeInsert.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        TypeInsert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoger Opción...", "Usuario\t", "Producto\t", " ", " " }));
        TypeInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeInsertActionPerformed(evt);
            }
        });
        insertar.add(TypeInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 220, 40));

        userdata.setBackground(new java.awt.Color(255, 255, 255));
        userdata.setForeground(new java.awt.Color(255, 255, 255));
        userdata.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usern.png"))); // NOI18N
        userdata.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 25, 40, 40));

        padlock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/padlocker.png"))); // NOI18N
        userdata.add(padlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        padlock3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phone.png"))); // NOI18N
        userdata.add(padlock3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        padlock4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/name.png"))); // NOI18N
        userdata.add(padlock4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        padlock5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/address.png"))); // NOI18N
        userdata.add(padlock5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        padlock7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/email.png"))); // NOI18N
        userdata.add(padlock7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        password.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        userdata.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 350, 50));

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
        userdata.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 350, 50));

        phone.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        userdata.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 350, 50));

        name.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        userdata.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 350, 50));

        address.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        userdata.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 350, 50));

        email.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        userdata.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 350, 50));

        login.setBackground(new java.awt.Color(9, 20, 104));
        login.setFont(new java.awt.Font("PT Mono", 0, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("REGISTER");
        login.setAlignmentY(0.0F);
        login.setContentAreaFilled(false);
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        userdata.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 350, 45));

        province.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", " " }));
        userdata.add(province, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 210, 30));

        canton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        userdata.add(canton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 150, 30));

        insertar.add(userdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 430, 580));

        productdata.setBackground(new java.awt.Color(255, 255, 255));
        productdata.setForeground(new java.awt.Color(255, 255, 255));
        productdata.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product.png"))); // NOI18N
        productdata.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 25, 40, 40));

        padlock1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quantity.png"))); // NOI18N
        productdata.add(padlock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        padlock6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/value.png"))); // NOI18N
        productdata.add(padlock6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        product.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productActionPerformed(evt);
            }
        });
        productdata.add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 350, 50));

        login1.setBackground(new java.awt.Color(9, 20, 104));
        login1.setFont(new java.awt.Font("PT Mono", 0, 18)); // NOI18N
        login1.setForeground(new java.awt.Color(255, 255, 255));
        login1.setText("REGISTER");
        login1.setAlignmentY(0.0F);
        login1.setContentAreaFilled(false);
        login1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login1ActionPerformed(evt);
            }
        });
        productdata.add(login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 350, 45));

        value.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        value.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                valueFocusLost(evt);
            }
        });
        value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueActionPerformed(evt);
            }
        });
        productdata.add(value, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 350, 50));

        quantity.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        productdata.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 350, 50));

        insertar.add(productdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 430, 310));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        productTable.setViewportView(jTable2);

        insertar.add(productTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 700, 560));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        userTable.setViewportView(jTable1);

        insertar.add(userTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 700, 560));

        bginsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ins.jpg"))); // NOI18N
        insertar.add(bginsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, 1400, 940));

        jTabbedPane1.addTab("Insertar", insertar);

        eliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TypeDelete.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        TypeDelete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoger Opción...", "Usuario\t", "Producto\t", " ", " " }));
        TypeDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeDeleteActionPerformed(evt);
            }
        });
        eliminar.add(TypeDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 210, 50));

        deleteProduct.setBackground(new java.awt.Color(255, 255, 255));
        deleteProduct.setForeground(new java.awt.Color(255, 255, 255));
        deleteProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        padlock9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usern.png"))); // NOI18N
        deleteProduct.add(padlock9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        padlock10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/email.png"))); // NOI18N
        deleteProduct.add(padlock10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        nameProduct.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        nameProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameProductActionPerformed(evt);
            }
        });
        deleteProduct.add(nameProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 350, 50));

        find1.setBackground(new java.awt.Color(9, 20, 104));
        find1.setFont(new java.awt.Font("PT Mono", 0, 18)); // NOI18N
        find1.setForeground(new java.awt.Color(255, 255, 255));
        find1.setText("FIND");
        find1.setAlignmentY(0.0F);
        find1.setContentAreaFilled(false);
        find1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        find1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        find1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                find1ActionPerformed(evt);
            }
        });
        deleteProduct.add(find1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 350, 45));

        delete1.setBackground(new java.awt.Color(9, 20, 104));
        delete1.setFont(new java.awt.Font("PT Mono", 0, 18)); // NOI18N
        delete1.setForeground(new java.awt.Color(255, 255, 255));
        delete1.setText("DELETE");
        delete1.setAlignmentY(0.0F);
        delete1.setContentAreaFilled(false);
        delete1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        deleteProduct.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 350, 45));

        eliminar.add(deleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 430, 250));

        deleteUser.setBackground(new java.awt.Color(255, 255, 255));
        deleteUser.setForeground(new java.awt.Color(255, 255, 255));
        deleteUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        padlock2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usern.png"))); // NOI18N
        deleteUser.add(padlock2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        padlock8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/email.png"))); // NOI18N
        deleteUser.add(padlock8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        emailname.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        emailname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailnameActionPerformed(evt);
            }
        });
        deleteUser.add(emailname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 350, 50));

        find.setBackground(new java.awt.Color(9, 20, 104));
        find.setFont(new java.awt.Font("PT Mono", 0, 18)); // NOI18N
        find.setForeground(new java.awt.Color(255, 255, 255));
        find.setText("FIND");
        find.setAlignmentY(0.0F);
        find.setContentAreaFilled(false);
        find.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        find.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        deleteUser.add(find, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 350, 45));

        delete.setBackground(new java.awt.Color(9, 20, 104));
        delete.setFont(new java.awt.Font("PT Mono", 0, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.setAlignmentY(0.0F);
        delete.setContentAreaFilled(false);
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        deleteUser.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 350, 45));

        eliminar.add(deleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 430, 250));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        userT.setViewportView(jTable3);

        eliminar.add(userT, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 700, 560));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        productT.setViewportView(jTable4);

        eliminar.add(productT, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 700, 560));

        bgdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ins.jpg"))); // NOI18N
        eliminar.add(bgdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Eliminar", eliminar);

        editar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TypeEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoger Opción...", "Usuario\t", "Producto\t", "Pedido", " " }));
        TypeEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeEditActionPerformed(evt);
            }
        });
        editar.add(TypeEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        bgedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ins.jpg"))); // NOI18N
        editar.add(bgedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Editar", editar);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TypeInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeInsertActionPerformed
        setFalse(panels,tables);
        option = this.TypeInsert.getSelectedIndex();
        tables[option].setVisible(true);
        panels[option].setVisible(true);
        panels[option].setBackground(new Color(255,255,255,85));
        panels[option].requestFocus();
        switch (option){
            case 1:
                user();
                break;
            case 2:
                product();
                break;
        }
            
    }//GEN-LAST:event_TypeInsertActionPerformed

    private void TypeDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeDeleteActionPerformed
        setFalse(panelsD,tablesD);
        option = this.TypeDelete.getSelectedIndex();
        tablesD[option].setVisible(true);
        panelsD[option].setVisible(true);
        panelsD[option].setBackground(new Color(255,255,255,85));
        panelsD[option].requestFocus();
        switch (option){
            case 1:
                deleteUser();
                break;
            case 2:
                deleteProduct();
                break;
        }
    }//GEN-LAST:event_TypeDeleteActionPerformed

    private void TypeEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeEditActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

    }//GEN-LAST:event_loginActionPerformed

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFocusLost

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productActionPerformed

    private void login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login1ActionPerformed

    private void valueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valueFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_valueFocusLost

    private void valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void nameProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameProductActionPerformed

    private void find1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_find1ActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_findActionPerformed

    private void emailnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailnameActionPerformed

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
            java.util.logging.Logger.getLogger(StaffMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TypeDelete;
    private javax.swing.JComboBox<String> TypeEdit;
    private javax.swing.JComboBox<String> TypeInsert;
    private javax.swing.JTextField address;
    private javax.swing.JLabel bgdelete;
    private javax.swing.JLabel bgedit;
    private javax.swing.JLabel bginsert;
    private javax.swing.JComboBox<String> canton;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    private javax.swing.JPanel deleteProduct;
    private javax.swing.JPanel deleteUser;
    private javax.swing.JPanel editar;
    private javax.swing.JPanel eliminar;
    private javax.swing.JTextField email;
    private javax.swing.JTextField emailname;
    private javax.swing.JButton find;
    private javax.swing.JButton find1;
    private javax.swing.JPanel insertar;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JButton login;
    private javax.swing.JButton login1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nameProduct;
    private javax.swing.JLabel padlock;
    private javax.swing.JLabel padlock1;
    private javax.swing.JLabel padlock10;
    private javax.swing.JLabel padlock2;
    private javax.swing.JLabel padlock3;
    private javax.swing.JLabel padlock4;
    private javax.swing.JLabel padlock5;
    private javax.swing.JLabel padlock6;
    private javax.swing.JLabel padlock7;
    private javax.swing.JLabel padlock8;
    private javax.swing.JLabel padlock9;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField product;
    private javax.swing.JScrollPane productT;
    private javax.swing.JScrollPane productTable;
    private javax.swing.JPanel productdata;
    private javax.swing.JComboBox<String> province;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel user;
    private javax.swing.JLabel user1;
    private javax.swing.JScrollPane userT;
    private javax.swing.JScrollPane userTable;
    private javax.swing.JPanel userdata;
    private javax.swing.JTextField username;
    private javax.swing.JTextField value;
    // End of variables declaration//GEN-END:variables
}
