/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sudhakar
 */
public class Deposit extends javax.swing.JFrame {

    /**
     * Creates new form Main_page
     */
    public Deposit() {
        initComponents();
    }
     public Deposit(String msg) {
        initComponents();
        
        ac.setText(msg);
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
        jPanel2 = new javax.swing.JPanel();
        ac = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bal = new javax.swing.JLabel();
        dep = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tot = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
        });
        jPanel2.setLayout(null);

        ac.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(ac);
        ac.setBounds(300, 10, 40, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ENTER DEPOSIT AMOUNT:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(70, 150, 160, 30);

        jLabel18.setBackground(new java.awt.Color(153, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Deposit");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(310, 260, 60, 20);

        jLabel19.setBackground(new java.awt.Color(153, 255, 255));
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/arrow-right.png"))); // NOI18N
        jPanel2.add(jLabel19);
        jLabel19.setBounds(370, 260, 20, 20);

        jLabel26.setBackground(new java.awt.Color(153, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Back");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(20, 260, 100, 20);

        jLabel27.setBackground(new java.awt.Color(153, 255, 255));
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/arrow-left.png"))); // NOI18N
        jPanel2.add(jLabel27);
        jLabel27.setBounds(0, 260, 20, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("YOUR CURRENT BALANCE :");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(80, 80, 170, 30);

        bal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bal.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(bal);
        bal.setBounds(130, 110, 160, 30);

        dep.setBackground(new java.awt.Color(0, 0, 102));
        dep.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(dep);
        dep.setBounds(130, 180, 140, 30);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("deposit");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 10, 100, 20);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("hgs1231");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(260, 10, 50, 20);

        tot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tot.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(tot);
        tot.setBounds(100, 230, 160, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(80, 60, 390, 300);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("     <");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(480, 320, 50, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("     <");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(480, 190, 40, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("     <");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(480, 230, 50, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("     <");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(480, 280, 50, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("     >");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 320, 40, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("     >");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 280, 40, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("     >");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 230, 40, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("    >");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 190, 40, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Capture.JPG"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 550, 420);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1, 1, 550, 420);

        setSize(new java.awt.Dimension(551, 421));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
          String msg=ac.getText();
        
        Main_page mp=new Main_page(msg);
        
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
        String info=ac.getText();
        String details[]=null;
        
       String driver = "com.mysql.cj.jdbc.Driver";
    Connection con = null;
    PreparedStatement pstmt1,pstmt2,pstmt3,pstmt4 = null;
       
        try{
            Class.forName(driver);
            String url = "jdbc:mysql://localhost:3306/atm";
            con =DriverManager.getConnection(url,"root","");
            pstmt1 = con.prepareStatement("select amount from balance where pin=?;");
           
            pstmt1.setString(1,ac.getText());
          
           
            ResultSet rs1=pstmt1.executeQuery();
           
            while(rs1.next())
            {
            
                String amount=rs1.getString("amount");
            
                bal.setText(amount);
                
             
         
            
            
            
            }
           
        
            
            
           
           
           
             
           
            
        }
        catch(Exception e)
        {
            System.out.println("SQL Exception "+e);
        }
        
        
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        if(dep.getText().equals(""))
        {
        
            JOptionPane.showMessageDialog(rootPane,"please enter amount to deposit");
        
        }
        else{
        
        
        String baln=bal.getText();
        
        if(bal.getText().equals("0"))
        {
            JOptionPane.showMessageDialog(rootPane,"acount has no amount");
            
        }
        else
        {
        int b=Integer.parseInt(baln);
        
        String depo=dep.getText();
        
        int d=Integer.parseInt(depo);
        
        int t=b+d;
        
        String upd=String.valueOf(t);
        
        tot.setText(upd);
        
        String in=tot.getText();
           
       String driver = "com.mysql.cj.jdbc.Driver";
    Connection con = null;
    PreparedStatement pstmt1;
       
        
          try{
            Class.forName(driver);
            String url = "jdbc:mysql://localhost:3306/atm";
            con =DriverManager.getConnection(url,"root","");
            pstmt1 = con.prepareStatement("update balance set amount=? where pin=?;");
           
              pstmt1.setString(1,tot.getText());
              pstmt1.setString(2,ac.getText());
              
              pstmt1.executeUpdate();
           
              
              JOptionPane.showMessageDialog(rootPane,"Deposit sucessfully");
              
           
            
              
                  String msg=ac.getText();
        
        Main_page mp=new Main_page(msg);
        
        mp.setVisible(true);
        dispose();
            
           
        
            
            
           
           
           
             
           
            
        }
        catch(Exception e)
        {
            System.out.println("SQL Exception "+e);
        }
        
        }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ac;
    private javax.swing.JLabel bal;
    private javax.swing.JTextField dep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel tot;
    // End of variables declaration//GEN-END:variables
}
