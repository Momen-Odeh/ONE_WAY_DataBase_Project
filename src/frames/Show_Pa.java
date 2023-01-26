/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author MMM
 */
public class Show_Pa extends javax.swing.JFrame {

    /**
     * Creates new form Show_Pa
     */
    Con_OOP.Client cl ; 
    public Show_Pa(Con_OOP.Client c ) {
        initComponents();
         jTable3.getTableHeader().setFont(new Font ("American Typewriter",Font.BOLD+Font.ITALIC ,22));
         jTable3.getTableHeader().setOpaque(false);
         jTable3.getTableHeader().setBackground(new Color(200,0,51));
         jTable3.getTableHeader().setForeground(new Color (255,255,255));
         jTable3.setRowHeight(25);
         jTable3.setEnabled(true);
         ////////////////////////////////////
         this.cl = c ; 
          //table 
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("ONEWAY_PROJECTPU");
         EntityManager em =emf.createEntityManager();
         Query qry =em.createNamedQuery("Package.findByCLISSN");
         List < Con_OOP.Package> PA =qry.setParameter("clissn",cl.getClientSsn()).getResultList();
         
         Object column [] ={"packageId","Size","Description","State","PriceProducer","deliveryFee","Sending Date","Delivery date","DRIVER_SSN","Casher_SSN","Client_SSN","Recipient_SSN"}; 
        DefaultTableModel model1 =new DefaultTableModel(new Object[0][0],column);
        
        for (Con_OOP.Package p :  PA )
        {
            
            Object[] o = new Object[12];
            o[0] = p.getPackageid();
            o[1] = p.getSizepackage();
            o[2] = p.getDescription();
            o[3] = p.getState();
            o[4] = p.getPriceProduct();
            o[5] = p.getDeliveryfee();
            o[6] = p.getSendingDate();
            o[7] = p.getDeliverydate();
            if(p.getDriverSsn() != null){
            o[8] = p.getDriverSsn().getDriverSsn();}
            if(p.getCasherSsn() != null){
            o[9] = p.getCasherSsn().getCasherSsn();}
            o[10] = p.getClientSsn().getClientSsn(); 
            o[11] = p.getRecipientSsn().getRecipientSsn();
            model1.addRow(o);
        }
        jTable3.setModel(model1);
         
   jTable3.getColumnModel().getColumn(0).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(1).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(2).setPreferredWidth(200);
    jTable3.getColumnModel().getColumn(3).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(4).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(5).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(6).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(7).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(8).setPreferredWidth(200);
    jTable3.getColumnModel().getColumn(9).setPreferredWidth(200);
    jTable3.getColumnModel().getColumn(10).setPreferredWidth(200);
    jTable3.getColumnModel().getColumn(11).setPreferredWidth(150);
    
    TableColumn testColumn44 = jTable3.getColumnModel().getColumn(1);
    JComboBox<String> comboBox44 = new JComboBox<>();
      //comboBox.addItem("on waiting");
      comboBox44.addItem("Small");
      comboBox44.addItem("Medium");
      comboBox44.addItem("Big");
      testColumn44.setCellEditor(new DefaultCellEditor(comboBox44));
    
    //
//    TableColumn testColumn = jTable3.getColumnModel().getColumn(3);
//    JComboBox<String> comboBox = new JComboBox<>();
//      comboBox.addItem("on waiting");
//      comboBox.addItem("Awaiting delivery");
//      comboBox.addItem("Delivered");
//      comboBox.addItem("Not delivered");
//      testColumn.setCellEditor(new DefaultCellEditor(comboBox));
      //
//      TableColumn testColumn1 = jTable3.getColumnModel().getColumn(8);
//     JComboBox<String> comboBox1 = new JComboBox();
//    // comboBox1.setEditable(true);
//        Query qry4 =em.createNamedQuery("Driver.findAll"); 
//        List < Con_OOP.Driver> res2 =qry4.getResultList();
//        for (Con_OOP.Driver ddd   : res2 )
//        {
//            comboBox1.addItem(ddd.getDriverSsn().toString()); 
//        }
//        testColumn1.setCellEditor(new DefaultCellEditor(comboBox1));
         
         //
         //
        
         //
         
         ///////////////////////////////////
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PackagePanel2 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        Cover4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PackagePanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setBackground(new java.awt.Color(255, 204, 204));
        jLabel37.setFont(new java.awt.Font("STSong", 3, 90)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("All  package");
        PackagePanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, -20, 480, 200));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "packageId", "Size", "Description", "State", "PriceProducer", "deliveryFee", "Sending Date", "Delivery date", "Recipient_SSN"
            }
        ));
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable3.setSelectionBackground(new java.awt.Color(255, 153, 153));
        jTable3.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable3.setShowGrid(false);
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable3.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable3.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTable3.getColumnModel().getColumn(5).setPreferredWidth(150);
            jTable3.getColumnModel().getColumn(6).setPreferredWidth(200);
            jTable3.getColumnModel().getColumn(7).setPreferredWidth(200);
            jTable3.getColumnModel().getColumn(8).setPreferredWidth(200);
        }

        PackagePanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 325, 720, 400));

        jDateChooser3.setBackground(new java.awt.Color(200, 0, 51));
        jDateChooser3.setDateFormatString("dd/MM/ yyyy");
        PackagePanel2.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 320, 50));

        jLabel38.setFont(new java.awt.Font("American Typewriter", 3, 36)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Search :");
        jLabel38.setAutoscrolls(true);
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel38MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel38MouseExited(evt);
            }
        });
        PackagePanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 270, 60));

        jLabel39.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-package_search.png"))); // NOI18N
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });
        PackagePanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 100, 90));

        jPanel14.setBackground(new java.awt.Color(21, 21, 21));
        jPanel14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("American Typewriter", 3, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Delete");
        jLabel20.setAutoscrolls(true);
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel20MouseExited(evt);
            }
        });
        jPanel14.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));

        PackagePanel2.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 200, 60));

        jPanel15.setBackground(new java.awt.Color(21, 21, 21));
        jPanel15.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("American Typewriter", 3, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Update");
        jLabel18.setAutoscrolls(true);
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });
        jPanel15.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));

        PackagePanel2.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 200, 60));

        Cover4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cover3.jpg"))); // NOI18N
        Cover4.setPreferredSize(new java.awt.Dimension(1270, 770));
        PackagePanel2.add(Cover4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel12.setBackground(new java.awt.Color(21, 21, 21));
        jPanel12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("American Typewriter", 3, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Update");
        jLabel17.setAutoscrolls(true);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 60));

        PackagePanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 590, 240, 60));

        jPanel13.setBackground(new java.awt.Color(21, 21, 21));
        jPanel13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("American Typewriter", 3, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Delete");
        jLabel19.setAutoscrolls(true);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });
        jPanel13.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 60));

        PackagePanel2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 660, 240, 60));

        getContentPane().add(PackagePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel38MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel38MouseEntered

    private void jLabel38MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel38MouseExited

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
try 
{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ONEWAY_PROJECTPU");
        EntityManager em1 =emf.createEntityManager();
         Query qry11 =em1.createNamedQuery("Package.findByPackageid"); //
        int idd =Integer.parseInt(jTable3.getModel().getValueAt(jTable3.getSelectedRow(),0).toString()); 
        List < Con_OOP.Package> ww =qry11.setParameter("packageid",idd).getResultList();
        Con_OOP.Package aa = em1.find(Con_OOP.Package.class,ww.get(0).getPackageid());
        em1.getTransaction().begin();
        //
        if(aa.getState().equals("on waiting"))
        {
                em1.remove(aa);
                em1.getTransaction().commit();
                
                
                
                
         EntityManagerFactory emf22 = Persistence.createEntityManagerFactory("ONEWAY_PROJECTPU");
         EntityManager em22 =emf22.createEntityManager();
         Query qry =em22.createNamedQuery("Package.findByCLISSN");
         List < Con_OOP.Package> PA =qry.setParameter("clissn",cl.getClientSsn()).getResultList();
         
         Object column [] ={"packageId","Size","Description","State","PriceProducer","deliveryFee","Sending Date","Delivery date","DRIVER_SSN","Casher_SSN","Client_SSN","Recipient_SSN"}; 
        DefaultTableModel model1 =new DefaultTableModel(new Object[0][0],column);
        
        for (Con_OOP.Package p :  PA )
        {
            
            Object[] o = new Object[12];
            o[0] = p.getPackageid();
            o[1] = p.getSizepackage();
            o[2] = p.getDescription();
            o[3] = p.getState();
            o[4] = p.getPriceProduct();
            o[5] = p.getDeliveryfee();
            o[6] = p.getSendingDate();
            o[7] = p.getDeliverydate();
            if(p.getDriverSsn() != null){
            o[8] = p.getDriverSsn().getDriverSsn();}
            if(p.getCasherSsn() != null){
            o[9] = p.getCasherSsn().getCasherSsn();}
            o[10] = p.getClientSsn().getClientSsn(); 
            o[11] = p.getRecipientSsn().getRecipientSsn();
            model1.addRow(o);
        }
        jTable3.setModel(model1);
         
   jTable3.getColumnModel().getColumn(0).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(1).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(2).setPreferredWidth(200);
    jTable3.getColumnModel().getColumn(3).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(4).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(5).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(6).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(7).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(8).setPreferredWidth(200);
    jTable3.getColumnModel().getColumn(9).setPreferredWidth(200);
    jTable3.getColumnModel().getColumn(10).setPreferredWidth(200);
    jTable3.getColumnModel().getColumn(11).setPreferredWidth(150);
    
    TableColumn testColumn44 = jTable3.getColumnModel().getColumn(1);
    JComboBox<String> comboBox44 = new JComboBox<>();
      //comboBox.addItem("on waiting");
      comboBox44.addItem("Small");
      comboBox44.addItem("Medium");
      comboBox44.addItem("Big");
      testColumn44.setCellEditor(new DefaultCellEditor(comboBox44));
                
                
                
                
                JOptionPane.showMessageDialog(null, "Delete sucessgully");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "we cant make Delete because the state not on waiting");
        }
        //
        
        //
}
catch (Exception e)
{
    JOptionPane.showMessageDialog(null, "please select Row !");
}
        
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
        jPanel14.setBackground(new Color(255,0,51)); 
    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
         jPanel14.setBackground(new Color(21,21,21));
    }//GEN-LAST:event_jLabel20MouseExited

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
try
{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ONEWAY_PROJECTPU");
        EntityManager em1 =emf.createEntityManager();
         Query qry11 =em1.createNamedQuery("Package.findByPackageid"); //
        int idd =Integer.parseInt(jTable3.getModel().getValueAt(jTable3.getSelectedRow(),0).toString()); 
        List < Con_OOP.Package> ww =qry11.setParameter("packageid",idd).getResultList();
        Con_OOP.Package aa = em1.find(Con_OOP.Package.class,ww.get(0).getPackageid());
        em1.getTransaction().begin();
        //
        if(aa.getState().equals("on waiting"))
        {
        aa.setSizepackage(jTable3.getModel().getValueAt(jTable3.getSelectedRow(),1).toString());
        aa.setDescription(jTable3.getModel().getValueAt(jTable3.getSelectedRow(),2).toString());
        //aa.setState(jTable3.getModel().getValueAt(jTable3.getSelectedRow(),3).toString());
        
        //
        aa.setPriceProduct(Integer.parseInt(jTable3.getModel().getValueAt(jTable3.getSelectedRow(),4).toString()));
         String str ;
	 Date date1;  
         try {
           str=jTable3.getModel().getValueAt(jTable3.getSelectedRow(),6).toString();
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(str);
            aa.setSendingDate(date1);
        } catch (Exception ex)
        {
        }
         em1.getTransaction().commit();
        em1.close();
        JOptionPane.showMessageDialog(null, "Successfully Update ");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "we cant make update because the state not on waiting");
        }
        //
        
        //
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null, "please select Row !");
}
        
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
      
       jPanel15.setBackground(new Color(255,0,51)); 
                     
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
         jPanel15.setBackground(new Color(21,21,21));
    }//GEN-LAST:event_jLabel18MouseExited

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseExited

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ONEWAY_PROJECTPU");
        EntityManager em1 =emf.createEntityManager();
        Query qry =em1.createNamedQuery("Package.findBySendingDate"); //
        List < Con_OOP.Package> PA =qry.setParameter("sendingDate",this.jDateChooser3.getDate()).getResultList();
        //
        Object column [] ={"packageId","Size","Description","State","PriceProducer","deliveryFee","Sending Date","Delivery date","DRIVER_SSN","Casher_SSN","Client_SSN","Recipient_SSN"}; 
        DefaultTableModel model1 =new DefaultTableModel(new Object[0][0],column);
        
        for (Con_OOP.Package p :  PA )
        {
            
            Object[] o = new Object[12];
            o[0] = p.getPackageid();
            o[1] = p.getSizepackage();
            o[2] = p.getDescription();
            o[3] = p.getState();
            o[4] = p.getPriceProduct();
            o[5] = p.getDeliveryfee();
            o[6] = p.getSendingDate();
            o[7] = p.getDeliverydate();
            if(p.getDriverSsn() != null){
            o[8] = p.getDriverSsn().getDriverSsn();}
            if(p.getCasherSsn() != null){
            o[9] = p.getCasherSsn().getCasherSsn();}
            o[10] = p.getClientSsn().getClientSsn(); 
            o[11] = p.getRecipientSsn().getRecipientSsn();
            model1.addRow(o);
        }
        jTable3.setModel(model1);
         
   jTable3.getColumnModel().getColumn(0).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(1).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(2).setPreferredWidth(200);
    jTable3.getColumnModel().getColumn(3).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(4).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(5).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(6).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(7).setPreferredWidth(150);
    jTable3.getColumnModel().getColumn(8).setPreferredWidth(200);
    jTable3.getColumnModel().getColumn(9).setPreferredWidth(200);
    jTable3.getColumnModel().getColumn(10).setPreferredWidth(200);
    jTable3.getColumnModel().getColumn(11).setPreferredWidth(150);
    
    TableColumn testColumn44 = jTable3.getColumnModel().getColumn(1);
    JComboBox<String> comboBox44 = new JComboBox<>();
      //comboBox.addItem("on waiting");
      comboBox44.addItem("Small");
      comboBox44.addItem("Medium");
      comboBox44.addItem("Big");
      testColumn44.setCellEditor(new DefaultCellEditor(comboBox44));
    }//GEN-LAST:event_jLabel39MouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cover4;
    private javax.swing.JPanel PackagePanel2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
