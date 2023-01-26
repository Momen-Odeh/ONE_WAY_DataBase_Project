/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Momen
 */
public class Maneger extends javax.swing.JFrame {

    ///////////////////////////////////////////////
   private class MyThread extends Thread{
public MyThread(String sn)
{
super(sn);
start();
}
public void run()
{
    
    while(true)
{
try {
Thread.sleep( 1000 );
Date date = new Date();
jlabelCLKdate.setText(dateFormat.format(date));
jlabelCLKtime.setText(dateFormat2.format(date));
  
}
catch ( InterruptedException interruptedException ) {

}
}
}
}
   ///////////////////
    MyThread t;
    void clock ()
    {
        Date date = new Date(); //jlabelCLKtime
        jlabelCLKdate.setText(dateFormat.format(date));
        jlabelCLKtime.setText(dateFormat2.format(date));
        t = new MyThread("Timer");
    }
    public DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public DateFormat dateFormat2 = new SimpleDateFormat("HH:mm:ss");
    public Maneger() { //////////////////////////////////////////////////////////constractor 
        initComponents();
          clock(); 
          jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(255,0,51)));
          ManegerPanel.setVisible(true);
         EmployeePanel.setVisible(false);
         ClientPanel.setVisible(false);
         PackagePanel.setVisible(false); 
         //table
         jTable1.getTableHeader().setFont(new Font ("American Typewriter",Font.BOLD+Font.ITALIC ,22));
         jTable1.getTableHeader().setOpaque(false);
         jTable1.getTableHeader().setBackground(new Color(200,0,51));
         jTable1.getTableHeader().setForeground(new Color (255,255,255));
         jTable1.setRowHeight(25);
         jTable1.setEnabled(true);
         jTable1.setDefaultEditor(Object.class, null);
        

    }
    Con_OOP.Employee mang ; 
     public Maneger(Con_OOP.Employee m) { //////////////////////////////////////////////////////////constractor 
        initComponents();
          clock(); 
          jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(255,0,51)));
          ManegerPanel.setVisible(true);
         EmployeePanel.setVisible(false);
         ClientPanel.setVisible(false);
         PackagePanel.setVisible(false); 
         //table
         jTable1.getTableHeader().setFont(new Font ("American Typewriter",Font.BOLD+Font.ITALIC ,22));
         jTable1.getTableHeader().setOpaque(false);
         jTable1.getTableHeader().setBackground(new Color(200,0,51));
         jTable1.getTableHeader().setForeground(new Color (255,255,255));
         jTable1.setRowHeight(25);
         jTable1.setEnabled(true);
         jTable1.setDefaultEditor(Object.class, null);
         this.mang = m ; 
         this.jTextField1.setText(String.valueOf(m.getSsn()));
         this.jTextField2.setText(m.getNameEmp());
         this.jTextField3.setText(String.valueOf(m.getPhone()));
         this.jTextField4.setText(m.getAddress());
         
         //
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("ONEWAY_PROJECTPU");
         EntityManager em =emf.createEntityManager();
         Query qry =em.createNamedQuery("Package.findByStatesp");
         List < Con_OOP.Package> PA =qry.setParameter("state","on waiting").getResultList();
         
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
            o[8] = p.getDriverSsn().getDriverSsn();
            o[9] = p.getCasherSsn().getCasherSsn();
            o[10] = p.getClientSsn().getClientSsn(); 
            o[11] = p.getRecipientSsn().getRecipientSsn();
            model1.addRow(o);
        }
        jTable1.setModel(model1);
         
   jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
    jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(6).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(7).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(8).setPreferredWidth(200);
    jTable1.getColumnModel().getColumn(9).setPreferredWidth(200);
    jTable1.getColumnModel().getColumn(10).setPreferredWidth(200);
    jTable1.getColumnModel().getColumn(11).setPreferredWidth(150);
    //

    }

 
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenueManegerPanel = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jlabelCLKdate = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jlabelCLKtime = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        ManegerPanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Cover1 = new javax.swing.JLabel();
        EmployeePanel = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Cover2 = new javax.swing.JLabel();
        ClientPanel = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        Cover3 = new javax.swing.JLabel();
        PackagePanel = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Cover4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1270, 770));
        setMinimumSize(new java.awt.Dimension(1270, 770));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenueManegerPanel.setBackground(new java.awt.Color(21, 21, 21));
        MenueManegerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(21, 21, 21));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("American Typewriter", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Show all Package");
        jLabel14.setAutoscrolls(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 60));

        MenueManegerPanel.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 280, 60));

        jLabel21.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_schedule_50px.png"))); // NOI18N
        MenueManegerPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jlabelCLKdate.setBackground(new java.awt.Color(255, 255, 255));
        jlabelCLKdate.setFont(new java.awt.Font("Academy Engraved LET", 3, 36)); // NOI18N
        jlabelCLKdate.setForeground(new java.awt.Color(255, 255, 255));
        jlabelCLKdate.setToolTipText("");
        MenueManegerPanel.add(jlabelCLKdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 260, 50));

        jLabel15.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_sand_timer_50px.png"))); // NOI18N
        jLabel15.setPreferredSize(new java.awt.Dimension(75, 75));
        MenueManegerPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, 50));

        jlabelCLKtime.setBackground(new java.awt.Color(255, 255, 255));
        jlabelCLKtime.setFont(new java.awt.Font("Academy Engraved LET", 3, 36)); // NOI18N
        jlabelCLKtime.setForeground(new java.awt.Color(255, 255, 255));
        MenueManegerPanel.add(jlabelCLKtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 260, 50));

        jPanel2.setBackground(new java.awt.Color(255, 0, 50));
        MenueManegerPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 270, 5));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sitting-Man-PNG-Image-19517.png"))); // NOI18N
        MenueManegerPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 250, 260));

        jPanel7.setBackground(new java.awt.Color(21, 21, 21));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("American Typewriter", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Maneger Profile ");
        jLabel13.setAutoscrolls(true);
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, -2, 270, 60));

        MenueManegerPanel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 280, 60));

        jPanel9.setBackground(new java.awt.Color(21, 21, 21));
        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("American Typewriter", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Emplyee information");
        jLabel12.setAutoscrolls(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 60));

        MenueManegerPanel.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 280, 60));

        jPanel11.setBackground(new java.awt.Color(21, 21, 21));
        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("American Typewriter", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Client information");
        jLabel16.setAutoscrolls(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        jPanel11.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 60));

        MenueManegerPanel.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 60));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log.png"))); // NOI18N
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        MenueManegerPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, 50, 50));

        jLabel32.setFont(new java.awt.Font("American Typewriter", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Logout");
        MenueManegerPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, -1, -1));

        getContentPane().add(MenueManegerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 770));

        ManegerPanel.setMaximumSize(new java.awt.Dimension(1270, 770));
        ManegerPanel.setMinimumSize(new java.awt.Dimension(1270, 770));
        ManegerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 1, new java.awt.Color(255, 0, 51)));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        ManegerPanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 180, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(51, 51, 51));
        jTextField2.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 1, new java.awt.Color(255, 0, 51)));
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        ManegerPanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 180, 30));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(51, 51, 51));
        jTextField3.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 1, new java.awt.Color(255, 0, 51)));
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        ManegerPanel.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 180, 30));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(51, 51, 51));
        jTextField4.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 1, new java.awt.Color(255, 0, 51)));
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField4.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        ManegerPanel.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 180, 30));

        jLabel7.setFont(new java.awt.Font("Zapfino", 3, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Maneger Profile ");
        ManegerPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -10, 520, 200));

        jLabel9.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("SSN");
        ManegerPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 70, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_touch_id_40px.png"))); // NOI18N
        ManegerPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 200, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_name_40px.png"))); // NOI18N
        ManegerPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Name ");
        ManegerPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 50, 30));

        jLabel4.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Phone ");
        ManegerPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_phone_40px.png"))); // NOI18N
        ManegerPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 310, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_address_40px.png"))); // NOI18N
        ManegerPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Address ");
        ManegerPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 70, 30));

        jLabel18.setFont(new java.awt.Font("Zapfino", 3, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Maneger information ");
        ManegerPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 350, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delevary.png"))); // NOI18N
        ManegerPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 450, 350));

        jLabel10.setFont(new java.awt.Font("Phosphate", 3, 80)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Welcome to ");
        ManegerPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 660, 80));

        jLabel19.setFont(new java.awt.Font("Phosphate", 2, 100)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("One Way");
        ManegerPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 630, 840, -1));

        jLabel25.setFont(new java.awt.Font("American Typewriter", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("View collections");
        ManegerPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 740, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money-box-4-820959.png"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        ManegerPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        Cover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cover3.jpg"))); // NOI18N
        Cover1.setPreferredSize(new java.awt.Dimension(1270, 770));
        ManegerPanel.add(Cover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 770));

        getContentPane().add(ManegerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 970, 770));

        EmployeePanel.setMaximumSize(new java.awt.Dimension(1270, 770));
        EmployeePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Zapfino", 3, 48)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Maneger Profile ");
        EmployeePanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -10, 520, 200));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clipboard-icon-14-256.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 51, 51)));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        EmployeePanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 230, 210));

        jButton1.setForeground(new java.awt.Color(204, 255, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 51, 51)));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        EmployeePanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 230, 210));

        jLabel20.setFont(new java.awt.Font("American Typewriter", 3, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Add Employee");
        jLabel20.setAutoscrolls(true);
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
        EmployeePanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 270, 60));

        jLabel22.setFont(new java.awt.Font("American Typewriter", 3, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Show All & Edit ");
        jLabel22.setAutoscrolls(true);
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });
        EmployeePanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 270, 60));

        Cover2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cover3.jpg"))); // NOI18N
        Cover2.setPreferredSize(new java.awt.Dimension(1270, 770));
        EmployeePanel.add(Cover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(EmployeePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 970, 770));

        ClientPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Zapfino", 3, 48)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Maneger Profile ");
        ClientPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -10, 520, 200));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clipboard-icon-14-256.png"))); // NOI18N
        jButton7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 51, 51)));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        ClientPanel.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 230, 210));

        jButton8.setForeground(new java.awt.Color(204, 255, 204));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 51, 51)));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        ClientPanel.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 230, 210));

        jLabel29.setFont(new java.awt.Font("American Typewriter", 3, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Add Client");
        jLabel29.setAutoscrolls(true);
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel29MouseExited(evt);
            }
        });
        ClientPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 230, 60));

        jLabel30.setFont(new java.awt.Font("American Typewriter", 3, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Show All & Edit");
        jLabel30.setAutoscrolls(true);
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel30MouseExited(evt);
            }
        });
        ClientPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 230, 60));

        Cover3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cover3.jpg"))); // NOI18N
        Cover3.setPreferredSize(new java.awt.Dimension(1270, 770));
        ClientPanel.add(Cover3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(ClientPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 970, 770));

        PackagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setBackground(new java.awt.Color(255, 204, 204));
        jLabel33.setFont(new java.awt.Font("Zapfino", 3, 48)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Maneger Profile ");
        PackagePanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -10, 520, 200));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "packageId", "Size", "Description", "State", "PriceProducer", "deliveryFee", "Sending Date", "Delivery date", "image", "Driver_SSN", "Client_SSN", "Recipient_SSN", "Casher_SSN"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setSelectionBackground(new java.awt.Color(255, 153, 153));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(12).setPreferredWidth(150);
        }

        PackagePanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 325, 860, 390));

        jDateChooser1.setBackground(new java.awt.Color(200, 0, 51));
        jDateChooser1.setDateFormatString("dd/MM/ yyyy");
        PackagePanel.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 320, 50));

        jLabel34.setFont(new java.awt.Font("American Typewriter", 3, 36)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Search :");
        jLabel34.setAutoscrolls(true);
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel34MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel34MouseExited(evt);
            }
        });
        PackagePanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 270, 60));

        jLabel35.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-package_search.png"))); // NOI18N
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        PackagePanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 80, 80));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("show all");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        PackagePanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 304, 70, 20));

        Cover4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cover3.jpg"))); // NOI18N
        Cover4.setPreferredSize(new java.awt.Dimension(1270, 770));
        PackagePanel.add(Cover4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PackagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 970, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        jPanel7.setBackground(new Color(255,0,51));
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        jPanel7.setBackground(new Color(21,21,21));
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jPanel9.setBackground(new Color(255,0,51));
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        jPanel9.setBackground(new Color(21,21,21));
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        jPanel11.setBackground(new Color(255,0,51));
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
       jPanel11.setBackground(new Color(21,21,21));
             
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
       jPanel10.setBackground(new Color(255,0,51));
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        jPanel10.setBackground(new Color(21,21,21));
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        //JOptionPane.showMessageDialog(null, "dfdfdf");////////////////////////////////////////////////////////////////////
        ManegerPanel.setVisible(true);
        EmployeePanel.setVisible(false);
        ClientPanel.setVisible(false);
        PackagePanel.setVisible(false);
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(255,0,51)));              
        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));                 
        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        ManegerPanel.setVisible(false);
        EmployeePanel.setVisible(true);
        ClientPanel.setVisible(false);
        PackagePanel.setVisible(false);
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));              
        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(255,0,51)));                 
        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        ManegerPanel.setVisible(false);
        EmployeePanel.setVisible(false);
        ClientPanel.setVisible(false);
        PackagePanel.setVisible(true);
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));              
        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));                 
        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(255,0,51)));
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseExited

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        ManegerPanel.setVisible(false);
        EmployeePanel.setVisible(false);
        ClientPanel.setVisible(true);
        PackagePanel.setVisible(false);
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(255,0,51)));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel29MouseEntered

    private void jLabel29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel29MouseExited

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel30MouseEntered

    private void jLabel30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel30MouseExited

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel34MouseEntered

    private void jLabel34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel34MouseExited

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        AddEmployee ee =new AddEmployee();
      ee.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
      ShowEmployee sss =new ShowEmployee(); 
      sss.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        AddClient dd =new AddClient(); 
        dd.setVisible(true);
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        ShowClient ccc =new ShowClient(); 
        ccc.setVisible(true);
        
    }//GEN-LAST:event_jButton7MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
 
        dialog k =new dialog ();
        k.setVisible(true);
        
      
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        this.setVisible(false);
        
        Sign_IN e =new Sign_IN();
        e.setVisible(true);
    
        
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        // TODO add your handling code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ONEWAY_PROJECTPU");
        EntityManager em1 =emf.createEntityManager();
        Query qry =em1.createNamedQuery("Package.findByDeliverydate"); //
        List < Con_OOP.Package> PA =qry.setParameter("deliverydate",this.jDateChooser1.getDate()).getResultList();
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
            o[8] = p.getDriverSsn().getDriverSsn();
            o[9] = p.getCasherSsn().getCasherSsn();
            o[10] = p.getClientSsn().getClientSsn(); 
            o[11] = p.getRecipientSsn().getRecipientSsn();
            model1.addRow(o);
        }
        jTable1.setModel(model1);
         
   jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
    jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(6).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(7).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(8).setPreferredWidth(200);
    jTable1.getColumnModel().getColumn(9).setPreferredWidth(200);
    jTable1.getColumnModel().getColumn(10).setPreferredWidth(200);
    jTable1.getColumnModel().getColumn(11).setPreferredWidth(150);
    //
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("ONEWAY_PROJECTPU");
         EntityManager em =emf.createEntityManager();
         Query qry =em.createNamedQuery("Package.findByStatesp");
         List < Con_OOP.Package> PA =qry.setParameter("state","on waiting").getResultList();
         
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
            o[8] = p.getDriverSsn().getDriverSsn();
            o[9] = p.getCasherSsn().getCasherSsn();
            o[10] = p.getClientSsn().getClientSsn(); 
            o[11] = p.getRecipientSsn().getRecipientSsn();
            model1.addRow(o);
        }
        jTable1.setModel(model1);
         
   jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
    jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(6).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(7).setPreferredWidth(150);
    jTable1.getColumnModel().getColumn(8).setPreferredWidth(200);
    jTable1.getColumnModel().getColumn(9).setPreferredWidth(200);
    jTable1.getColumnModel().getColumn(10).setPreferredWidth(200);
    jTable1.getColumnModel().getColumn(11).setPreferredWidth(150);
    //
    }//GEN-LAST:event_jLabel23MouseClicked

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ClientPanel;
    private javax.swing.JLabel Cover1;
    private javax.swing.JLabel Cover2;
    private javax.swing.JLabel Cover3;
    private javax.swing.JLabel Cover4;
    private javax.swing.JPanel EmployeePanel;
    private javax.swing.JPanel ManegerPanel;
    private javax.swing.JPanel MenueManegerPanel;
    private javax.swing.JPanel PackagePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel jlabelCLKdate;
    private javax.swing.JLabel jlabelCLKtime;
    // End of variables declaration//GEN-END:variables
}
