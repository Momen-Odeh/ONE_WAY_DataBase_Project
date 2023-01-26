/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;
import com.toedter.calendar.JDateChooser;
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
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import com.toedter.calendar.JDateChooser; 
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableCellEditor;
/**

import java.util.Date;

/**
 *
 * @author MMM
 */
public class Casher extends javax.swing.JFrame {

    /**
     * Creates new form Casher
     */
    public Casher() {
        
        initComponents();
        clock(); 
         jTable3.getTableHeader().setFont(new Font ("American Typewriter",Font.BOLD+Font.ITALIC ,22));
         jTable3.getTableHeader().setOpaque(false);
         jTable3.getTableHeader().setBackground(new Color(200,0,51));
         jTable3.getTableHeader().setForeground(new Color (255,255,255));
         jTable3.setRowHeight(25);
         jTable3.setEnabled(true);
    }
    Con_OOP.Employee chasher ;
    public Casher(Con_OOP.Employee c) {
        
        initComponents();
        clock(); 
         jTable3.getTableHeader().setFont(new Font ("American Typewriter",Font.BOLD+Font.ITALIC ,22));
         jTable3.getTableHeader().setOpaque(false);
         jTable3.getTableHeader().setBackground(new Color(200,0,51));
         jTable3.getTableHeader().setForeground(new Color (255,255,255));
         jTable3.setRowHeight(25);
         jTable3.setEnabled(true);
         this.chasher =c ; 
         this.jTextField1.setText(String.valueOf(c.getSsn()));
         this.jTextField2.setText(c.getNameEmp());
         this.jTextField3.setText(String.valueOf(c.getPhone()));
         this.jTextField4.setText(c.getAddress());
         
         // table 
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("ONEWAY_PROJECTPU");
         EntityManager em =emf.createEntityManager();
         Query qry =em.createNamedQuery("Package.findByState"); //
        
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
    //
    TableColumn testColumn = jTable3.getColumnModel().getColumn(3);
    JComboBox<String> comboBox = new JComboBox<>();
      comboBox.addItem("on waiting");
      comboBox.addItem("Awaiting delivery");
      comboBox.addItem("Delivered");
      comboBox.addItem("Not delivered");
      testColumn.setCellEditor(new DefaultCellEditor(comboBox));
      //
      TableColumn testColumn1 = jTable3.getColumnModel().getColumn(8);
     JComboBox<String> comboBox1 = new JComboBox();
    // comboBox1.setEditable(true);
        Query qry4 =em.createNamedQuery("Driver.findAll"); 
        List < Con_OOP.Driver> res2 =qry4.getResultList();
        for (Con_OOP.Driver ddd   : res2 )
        {
            comboBox1.addItem(ddd.getDriverSsn().toString()); 
        }
        testColumn1.setCellEditor(new DefaultCellEditor(comboBox1));
        
    }
    
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
System.err.println( interruptedException.toString() );
}
}
}
}
       Casher.MyThread t;
    void clock ()
    {
        Date date = new Date(); //jlabelCLKtime
        jlabelCLKdate.setText(dateFormat.format(date));
        jlabelCLKtime.setText(dateFormat2.format(date));
        t = new Casher.MyThread("Timer");
    }
    public DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public DateFormat dateFormat2 = new SimpleDateFormat("HH:mm:ss");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jlabelCLKdate = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jlabelCLKtime = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        Cover1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("SSN");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 70, 30));

        jLabel3.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Name ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 50, 30));

        jLabel4.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Phone ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, 30));

        jLabel5.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Address ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 70, 30));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(51, 51, 51));
        jTextField4.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 1, new java.awt.Color(255, 0, 51)));
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField4.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 180, 30));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(51, 51, 51));
        jTextField3.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 1, new java.awt.Color(255, 0, 51)));
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 180, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(51, 51, 51));
        jTextField2.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 1, new java.awt.Color(255, 0, 51)));
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 180, 30));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 1, new java.awt.Color(255, 0, 51)));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 180, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log.png"))); // NOI18N
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, 50, 50));

        jLabel32.setFont(new java.awt.Font("American Typewriter", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Logout");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 770, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_touch_id_40px.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_name_40px.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_phone_40px.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_address_40px.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        jLabel18.setFont(new java.awt.Font("Zapfino", 3, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Casher information ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 350, 80));

        jLabel2.setFont(new java.awt.Font("Zapfino", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Casher Profile ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 640, 200));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/favpng_clip-art-vector-graphics-businessperson-illustration-stock-photography copy.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 350, 350));

        jLabel21.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_schedule_50px.png"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jlabelCLKdate.setBackground(new java.awt.Color(255, 255, 255));
        jlabelCLKdate.setFont(new java.awt.Font("Academy Engraved LET", 3, 36)); // NOI18N
        jlabelCLKdate.setForeground(new java.awt.Color(255, 255, 255));
        jlabelCLKdate.setToolTipText("");
        getContentPane().add(jlabelCLKdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 260, 50));

        jLabel15.setFont(new java.awt.Font("Apple Chancery", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_sand_timer_50px.png"))); // NOI18N
        jLabel15.setPreferredSize(new java.awt.Dimension(75, 75));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, 50));

        jlabelCLKtime.setBackground(new java.awt.Color(255, 255, 255));
        jlabelCLKtime.setFont(new java.awt.Font("Academy Engraved LET", 3, 36)); // NOI18N
        jlabelCLKtime.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jlabelCLKtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 260, 50));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable3.setAutoCreateRowSorter(true);
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "packageId", "Size", "Description", "State", "PriceProducer", "deliveryFee", "Sending Date", "Delivery date", "DRIVER_SSN", "Client_SSN", "Recipient_SSN", "Casher_SSN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable3.setEnabled(false);
        jTable3.setSelectionBackground(new java.awt.Color(255, 153, 153));
        jTable3.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable3.setShowGrid(false);
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
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
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 810, 300));

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
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 60));

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 690, 640, 60));

        jPanel11.setBackground(new java.awt.Color(21, 21, 21));
        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("American Typewriter", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Receive Package");
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
        jPanel11.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 60));

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 610, 310, 60));

        jLabel38.setBackground(new java.awt.Color(255, 204, 204));
        jLabel38.setFont(new java.awt.Font("STSong", 3, 48)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("New packages");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 340, 120));

        jPanel13.setBackground(new java.awt.Color(21, 21, 21));
        jPanel13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(102, 102, 102)));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("American Typewriter", 3, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("print report");
        jLabel22.setAutoscrolls(true);
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
        jPanel13.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 60));

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 610, 310, 60));

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

        getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 220, 200, 60));

        Cover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cover3.jpg"))); // NOI18N
        getContentPane().add(Cover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -10, -1, 820));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
       Show_all_pakage rr =new Show_all_pakage(this.chasher);
       rr.setVisible(true);
       
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        jPanel10.setBackground(new Color(255,0,51));
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        jPanel10.setBackground(new Color(21,21,21));
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
      try 
      {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ONEWAY_PROJECTPU");
        EntityManager em =emf.createEntityManager();
        Query qry1 =em.createNamedQuery("Package.findByPackageid"); //
        int id =Integer.parseInt(jTable3.getModel().getValueAt(jTable3.getSelectedRow(),0).toString()); 
        List < Con_OOP.Package> Es =qry1.setParameter("packageid",id).getResultList();
        Con_OOP.Package pp = em.find(Con_OOP.Package.class,Es.get(0).getPackageid());
        em.getTransaction().begin();
        pp.setState(jTable3.getModel().getValueAt(jTable3.getSelectedRow(),3).toString());
        pp.setDeliveryfee(Integer.parseInt(jTable3.getModel().getValueAt(jTable3.getSelectedRow(),5).toString()));
         String str ;
	 Date date1;  
        try {
           str=jTable3.getModel().getValueAt(jTable3.getSelectedRow(),7).toString();
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(str);
            pp.setDeliverydate(date1);
        } catch (Exception ex) {
        }
        
       Query qry2 =em.createNamedQuery("Driver.findByDriverSsn");
//       Con_OOP.Driver  yy =( Con_OOP.Driver)() ; 
//        System.out.println(yy);
List < Con_OOP.Driver> dr = null ; 
//        try {
      //  int y = Integer.parseInt((String) jTable3.getModel().getValueAt(jTable3.getSelectedRow(),8)) ; 
        dr =qry2.setParameter("driverSsn",Integer.parseInt(jTable3.getModel().getValueAt(jTable3.getSelectedRow(),8).toString())).getResultList();
//        }
//        catch(Exception e)
//        {
//            Con_OOP.Driver  yy =( Con_OOP.Driver)(jTable3.getModel().getValueAt(jTable3.getSelectedRow(),8)) ; 
//           System.out.println(yy);
//        }
       pp.setDriverSsn(dr.get(0));
       pp.setCasherSsn(this.chasher.getCasher());
        em.getTransaction().commit();
        em.close();
        //new table
        // table 
         EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("ONEWAY_PROJECTPU");
         EntityManager em1 =emf.createEntityManager();
         Query qry =em1.createNamedQuery("Package.findByState"); //
        
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
            if(p.getDriverSsn() != null){
            o[8] = p.getDriverSsn().getDriverSsn();}
            if(p.getCasherSsn() != null) {
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
    //
    TableColumn testColumn = jTable3.getColumnModel().getColumn(3);
    JComboBox<String> comboBox = new JComboBox<>();
      comboBox.addItem("on waiting");
      comboBox.addItem("Awaiting delivery");
      comboBox.addItem("Delivered");
      comboBox.addItem("Not delivered");
      testColumn.setCellEditor(new DefaultCellEditor(comboBox));
      //
      TableColumn testColumn1 = jTable3.getColumnModel().getColumn(8);
     JComboBox<String> comboBox1 = new JComboBox();
    // comboBox1.setEditable(true);
        Query qry4 =em1.createNamedQuery("Driver.findAll"); 
        List < Con_OOP.Driver> res2 =qry4.getResultList();
        for (Con_OOP.Driver ddd   : res2 )
        {
            comboBox1.addItem(ddd.getDriverSsn().toString()); 
        }
        testColumn1.setCellEditor(new DefaultCellEditor(comboBox1));
        //
        JOptionPane.showMessageDialog(null,"Receive Package Successfully");
      }
      catch (NullPointerException ee)
      {
          JOptionPane.showMessageDialog(null, "please fill all filed ");
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null, "Some thing wrong please try agian!");
         // e.printStackTrace();
      }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        jPanel11.setBackground(new Color(255,0,51));
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        jPanel11.setBackground(new Color(21,21,21));
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        jPanel13.setBackground(new Color(255,0,51));
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        jPanel13.setBackground(new Color(21,21,21));
    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        this.setVisible(false);

        Sign_IN e =new Sign_IN();
        e.setVisible(true);
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        try{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ONEWAY_PROJECTPU");
        EntityManager em =emf.createEntityManager();
        Query qry1 =em.createNamedQuery("Package.findByPackageid"); //
        int id =Integer.parseInt(jTable3.getModel().getValueAt(jTable3.getSelectedRow(),0).toString()); 
        List < Con_OOP.Package> Es =qry1.setParameter("packageid",id).getResultList();
        Con_OOP.Package pp = em.find(Con_OOP.Package.class,Es.get(0).getPackageid());
        em.getTransaction().begin();
        em.remove(pp);
        em.getTransaction().commit();
        //
        
        // table 
         EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("ONEWAY_PROJECTPU");
         EntityManager em1 =emf1.createEntityManager();
         Query qry11 =em1.createNamedQuery("Package.findByState"); //
        
         List < Con_OOP.Package> PA =qry11.setParameter("state","on waiting").getResultList();
         
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
            o[8] = p.getDriverSsn();
            o[9] = p.getCasherSsn();
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
    //
    TableColumn testColumn = jTable3.getColumnModel().getColumn(3);
    JComboBox<String> comboBox = new JComboBox<>();
      comboBox.addItem("on waiting");
      comboBox.addItem("Awaiting delivery");
      comboBox.addItem("Delivered");
      comboBox.addItem("Not delivered");
      testColumn.setCellEditor(new DefaultCellEditor(comboBox));
      //
      TableColumn testColumn1 = jTable3.getColumnModel().getColumn(8);
     JComboBox<String> comboBox1 = new JComboBox();
    // comboBox1.setEditable(true);
        Query qry4 =em.createNamedQuery("Driver.findAll"); 
        List < Con_OOP.Driver> res2 =qry4.getResultList();
        for (Con_OOP.Driver ddd   : res2 )
        {
            comboBox1.addItem(ddd.getDriverSsn().toString()); 
        }
        testColumn1.setCellEditor(new DefaultCellEditor(comboBox1));
        
        ///
        JOptionPane.showMessageDialog(null, "Remove succesfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please select row to delete it");
        }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
        jPanel14.setBackground(new Color(255,0,51));
    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
        jPanel14.setBackground(new Color(21,21,21));
    }//GEN-LAST:event_jLabel20MouseExited

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cover1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel jlabelCLKdate;
    private javax.swing.JLabel jlabelCLKtime;
    // End of variables declaration//GEN-END:variables
}
