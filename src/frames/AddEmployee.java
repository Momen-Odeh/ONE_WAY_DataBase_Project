/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;
import java.sql.*; 
import oracle.jdbc.*;
import oracle.sql.*; 
import java.awt.Color;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Con_OOP.*; 
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Query;
import javax.swing.*; 
/**
 *
 * @author MMM
 */
public class AddEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel10 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        txtSize = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        txtBrand = new javax.swing.JLabel();
        txtViId = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel10UP = new javax.swing.JPanel();
        jLabel32UP = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(795, 565));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("STSong", 2, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Add Employee information ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 470, 90));

        jLabel9.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("SSN");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 60, 30));

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 1, new java.awt.Color(255, 0, 51)));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 180, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_name_40px.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jTextField2.setBackground(new java.awt.Color(51, 51, 51));
        jTextField2.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 1, new java.awt.Color(255, 0, 51)));
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 180, 30));

        jLabel3.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Name ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 50, 30));

        jLabel4.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Phone ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 30));

        jTextField3.setBackground(new java.awt.Color(51, 51, 51));
        jTextField3.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 1, new java.awt.Color(255, 0, 51)));
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 180, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_phone_40px.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_address_40px.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jTextField4.setBackground(new java.awt.Color(51, 51, 51));
        jTextField4.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 1, new java.awt.Color(255, 0, 51)));
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField4.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 180, 30));

        jLabel5.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Address ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 70, 30));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_name_40px.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, -1, -1));

        jPasswordField1.setBackground(jTextField4.getBackground());
        jPasswordField1.setFont(jTextField4.getFont());
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setToolTipText("");
        jPasswordField1.setBorder(jTextField4.getBorder());
        jPasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 180, 30));

        jDateChooser1.setBackground(new java.awt.Color(255, 0, 51));
        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 180, 30));

        jLabel12.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Passowrd ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 80, 30));

        jLabel13.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Birth Date");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 80, 30));

        jLabel16.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Employ Date ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 100, 30));

        jDateChooser2.setBackground(new java.awt.Color(255, 0, 51));
        jDateChooser2.setDateFormatString("dd/MM/yyyy");
        jDateChooser2.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 180, 30));

        jPanel10.setBackground(new java.awt.Color(21, 21, 21));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("American Typewriter", 3, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Save");
        jLabel32.setAutoscrolls(true);
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel32MouseExited(evt);
            }
        });
        jPanel10.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 60));

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 260, 60));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("American Typewriter", 3, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Casher");
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                N(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 150, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("American Typewriter", 3, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Driver");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                m(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        txtSize.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        txtSize.setForeground(new java.awt.Color(255, 255, 255));
        txtSize.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSize.setText("size");
        getContentPane().add(txtSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, 30));

        jTextField6.setBackground(new java.awt.Color(51, 51, 51));
        jTextField6.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 1, new java.awt.Color(255, 0, 51)));
        jTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField6.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 110, 30));

        jTextField7.setBackground(new java.awt.Color(51, 51, 51));
        jTextField7.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 1, new java.awt.Color(255, 0, 51)));
        jTextField7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField7.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 110, 30));

        txtBrand.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        txtBrand.setForeground(new java.awt.Color(255, 255, 255));
        txtBrand.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtBrand.setText("brand ");
        getContentPane().add(txtBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 70, 30));

        txtViId.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        txtViId.setForeground(new java.awt.Color(255, 255, 255));
        txtViId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtViId.setText("Vecel_Id");
        getContentPane().add(txtViId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 110, 30));

        jTextField8.setBackground(new java.awt.Color(51, 51, 51));
        jTextField8.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 1, new java.awt.Color(255, 0, 51)));
        jTextField8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField8.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 110, 30));

        jPanel10UP.setBackground(new java.awt.Color(21, 21, 21));
        jPanel10UP.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
        jPanel10UP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32UP.setFont(new java.awt.Font("American Typewriter", 3, 24)); // NOI18N
        jLabel32UP.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32UP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32UP.setText("Update");
        jLabel32UP.setAutoscrolls(true);
        jLabel32UP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32UPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel32UPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel32UPMouseExited(evt);
            }
        });
        jPanel10UP.add(jLabel32UP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 60));

        getContentPane().add(jPanel10UP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 260, 60));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_property_40px.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 40, 30));

        jLabel1.setFont(new java.awt.Font("American Typewriter", 3, 13)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wp3470526.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 875, 565));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseEntered
        jPanel10.setBackground(new Color(255,0,51));
    }//GEN-LAST:event_jLabel32MouseEntered

    private void jLabel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseExited
        jPanel10.setBackground(new Color(21,21,21));
    }//GEN-LAST:event_jLabel32MouseExited

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void m(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_m
              
               if(evt.getStateChange()== evt.SELECTED)
               {
                   txtViId.setText("Vecel_Id");
                     txtSize.setVisible(true);
                   txtBrand.setVisible(true);
                   jTextField6.setVisible(true);
                   jTextField8.setVisible(true);
                    jTextField7.setVisible(true);
               }
    }//GEN-LAST:event_m

    private void N(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_N
       
         if(evt.getStateChange()== evt.SELECTED)
               {
                   txtViId.setText("Scientific degree");
                   txtSize.setVisible(false);
                   txtBrand.setVisible(false);
                   jTextField6.setVisible(false);
                   
                    jTextField7.setVisible(false);
               }
        
    }//GEN-LAST:event_N
       Con_OOP.Employee EFU =null; 
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       try{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ONEWAY_PROJECTPU");
        EntityManager em =emf.createEntityManager();
        Query qry =em.createNamedQuery("Employee.findBySsn"); //
        
        List < Con_OOP.Employee> ES =qry.setParameter("ssn",Integer.parseInt(jTextField1.getText())).getResultList();
         
        if(ES.isEmpty())
        {
            EFU=null; 
            JOptionPane.showMessageDialog(null, "Not found the Emplyee");
        }
        else
        { 
            Con_OOP.Employee EF =ES.get(0);
            EFU=EF ; 
            jTextField1.setText(String.valueOf(EF.getSsn()));
            jTextField2.setText(EF.getNameEmp());
            jTextField3.setText(String.valueOf(EF.getPhone()));
            jTextField4.setText(EF.getAddress());
            jPasswordField1.setText(EF.getPassword());
            jDateChooser2.setDate(EF.getBirthDate());
            jDateChooser1.setDate(EF.getEmploymentDate());
            //
            System.out.println(EF.getDriver());
             Con_OOP.Driver D1 =EF.getDriver(); 
             Con_OOP.Casher C1 =EF.getCasher(); 
            if(D1 != null)
            {
                jRadioButton1.setSelected(true);
                jTextField8.setText(D1.getVehicleId());
                jTextField7.setText(D1.getBrand());
                jTextField6.setText(D1.getSizevecel());
            }
            else if(C1 != null)
            {
                jRadioButton2.setSelected(true);
                jTextField8.setText(C1.getScientificDegree()); 
            }
            else
            {
                  JOptionPane.showMessageDialog(null, "Welcome Manager");
            }
            //
            
        }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,"Please Try again and cheack your information");
       }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel32UPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32UPMouseEntered
        jPanel10UP.setBackground(new Color(255,0,51));
    }//GEN-LAST:event_jLabel32UPMouseEntered

    private void jLabel32UPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32UPMouseExited
        jPanel10UP.setBackground(new Color(21,21,21));
    }//GEN-LAST:event_jLabel32UPMouseExited

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        try {
            java.util.Date D2 =jDateChooser2.getDate() ; //birth 
            java.util.Date D1 =jDateChooser1.getDate() ; // employment
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","c##onewayproject","654321"); 
            Statement stmt =con.createStatement(); 
            String sqlstr = 
"INSERT into employee values("
                    + ""
                    + jTextField1.getText()
                    + " ,"
                    + "EMPIDSEQ.nextval"
                    + ","
                    + "'"
                    + jTextField2.getText()
                    + "'"
                    + ","
                    + jTextField3.getText()
                    + ","
                    + "'"
                    + jTextField4.getText()
                    + "'"
                    + ","
                    +" TO_DATE('"+String.valueOf(D2.getYear()+1900)+"/"+String.valueOf(D2.getMonth()+1)+"/"+String.valueOf(D2.getDate())+"','yyyy/mm/dd')"
                    + ","
                    + "TO_DATE('"+String.valueOf(D1.getYear()+1900)+"/"+String.valueOf(D1.getMonth()+1)+"/"+String.valueOf(D1.getDate())+"','yyyy/mm/dd')"
                    + ","
                    + "'"
                    + jPasswordField1.getText()
                    + "'"
                    + ")"
                    ;
            stmt.executeUpdate(sqlstr);
            con.close();
            
            if(jRadioButton1.isSelected())
            {
                
                Con_OOP.Driver d = new Con_OOP.Driver(); 
                d.setDriverSsn(Integer.parseInt(jTextField1.getText()));
                d.setVehicleId(jTextField8.getText());
                d.setBrand(jTextField7.getText());
                d.setSizevecel(jTextField6.getText());
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("ONEWAY_PROJECTPU");
                EntityManager em =emf.createEntityManager();
                em.getTransaction().begin();
                em.persist(d);
                em.getTransaction().commit();
                em.close();
                JOptionPane.showMessageDialog(null,"Add Driver Successfully");
                
            }
            else if (jRadioButton2.isSelected())
            {
                Con_OOP.Casher ca = new Con_OOP.Casher(); 
                ca.setCasherSsn(Integer.parseInt(jTextField1.getText()));
                ca.setScientificDegree(jTextField8.getText());
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("ONEWAY_PROJECTPU");
                EntityManager em =emf.createEntityManager();
                em.getTransaction().begin();
                em.persist(ca);
                em.getTransaction().commit();
                em.close();
                JOptionPane.showMessageDialog(null,"Add Casher Successfully");
            }
            
            
        } catch (Exception ex) {
          //  Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Please Try again and cheack your information");
        }
         
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel32UPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32UPMouseClicked
        // TODO add your handling code here:////////////////////////////
        try {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ONEWAY_PROJECTPU");
        EntityManager em =emf.createEntityManager();
        Con_OOP.Employee dd = em.find(Con_OOP.Employee.class,EFU.getSsn());
        em.getTransaction().begin();
        //
        dd.setNameEmp(jTextField2.getText());
        dd.setPhone(Integer.parseInt(jTextField3.getText()));
        dd.setAddress(jTextField4.getText());
        dd.setPassword(jPasswordField1.getText());
        dd.setBirthDate(jDateChooser2.getDate());
        dd.setEmploymentDate(jDateChooser1.getDate());
        if(dd.getDriver() != null)
        {
            dd.getDriver().setVehicleId(jTextField8.getText());
            dd.getDriver().setBrand(jTextField7.getText());
            dd.getDriver().setSizevecel(jTextField6.getText());
        }
        else if(dd.getCasher()!= null)
        {
            dd.getCasher().setScientificDegree(jTextField8.getText());
        }
        //
        em.getTransaction().commit();
        em.close();
        JOptionPane.showMessageDialog(null,"Update Employee Successfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Please Try again and cheack your information");
        }
    }//GEN-LAST:event_jLabel32UPMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel32UP;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel10UP;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel txtBrand;
    private javax.swing.JLabel txtSize;
    private javax.swing.JLabel txtViId;
    // End of variables declaration//GEN-END:variables
}