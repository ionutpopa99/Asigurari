
package proiect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Persoana extends javax.swing.JFrame {


    public Persoana() {
        initComponents();
    }

     public Connection getConnection()
    {
    
        try{  
  
    Class.forName("oracle.jdbc.driver.OracleDriver");  
    
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","stud","ionut");  
    return con;
  
}catch(Exception e){ System.out.println(e);}
        return null;
        
        
    }
     
     public boolean checkInputs()
	 {
		 if(CNPT.getText()==null||NUMET.getText()==null||PRENUMET.getText()==null||LOCALITATET.getText()==null||STRADAT.getText()==null || NUMART.getText()==null ) {
			 return false;
		 
		 }
		 else {
		 try {
			 Float.parseFloat(NUMART.getText());
			 return true;
		 }catch(Exception eX){
			 return false;
		 }
		 }
			 
	 }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CNPL = new javax.swing.JLabel();
        NUMEL = new javax.swing.JLabel();
        PRENUMEL = new javax.swing.JLabel();
        LOCALITATEL = new javax.swing.JLabel();
        STRADAL = new javax.swing.JLabel();
        NUMARL = new javax.swing.JLabel();
        CNPT = new javax.swing.JTextField();
        NUMET = new javax.swing.JTextField();
        STRADAT = new javax.swing.JTextField();
        LOCALITATET = new javax.swing.JTextField();
        NUMART = new javax.swing.JTextField();
        PRENUMET = new javax.swing.JTextField();
        BACK = new javax.swing.JButton();
        NEXT = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1360, 730));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Introduceti datele personale");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(520, 50, 370, 40);

        CNPL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CNPL.setText("CNP");
        jPanel1.add(CNPL);
        CNPL.setBounds(240, 160, 70, 22);

        NUMEL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NUMEL.setText("Nume");
        jPanel1.add(NUMEL);
        NUMEL.setBounds(240, 290, 90, 22);

        PRENUMEL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PRENUMEL.setText("Prenume");
        jPanel1.add(PRENUMEL);
        PRENUMEL.setBounds(240, 420, 90, 22);

        LOCALITATEL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LOCALITATEL.setText("Localitate");
        jPanel1.add(LOCALITATEL);
        LOCALITATEL.setBounds(820, 160, 90, 22);

        STRADAL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        STRADAL.setText("Strada");
        jPanel1.add(STRADAL);
        STRADAL.setBounds(820, 280, 70, 22);

        NUMARL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NUMARL.setText("Numar");
        jPanel1.add(NUMARL);
        NUMARL.setBounds(820, 420, 80, 22);

        CNPT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CNPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNPTActionPerformed(evt);
            }
        });
        jPanel1.add(CNPT);
        CNPT.setBounds(340, 160, 220, 40);

        NUMET.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(NUMET);
        NUMET.setBounds(340, 290, 220, 40);

        STRADAT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(STRADAT);
        STRADAT.setBounds(920, 280, 220, 40);

        LOCALITATET.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(LOCALITATET);
        LOCALITATET.setBounds(920, 160, 220, 40);

        NUMART.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(NUMART);
        NUMART.setBounds(920, 420, 220, 40);

        PRENUMET.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(PRENUMET);
        PRENUMET.setBounds(340, 420, 220, 40);

        BACK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BACK.setText("Back");
        jPanel1.add(BACK);
        BACK.setBounds(380, 600, 110, 40);

        NEXT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NEXT.setText("Next");
        NEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEXTActionPerformed(evt);
            }
        });
        jPanel1.add(NEXT);
        NEXT.setBounds(860, 590, 110, 40);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(20, 100, 1320, 10);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Proiect baze de date\\Proiect\\image.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 760);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CNPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNPTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNPTActionPerformed

    private void NEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEXTActionPerformed
        
        
        if(checkInputs())
        {
            try {
                Connection con = getConnection();
                PreparedStatement ps = con.prepareStatement("INSERT INTO PERSOANA(CNP,NUME,PRENUME,LOCALITATE,STRADA,NUMAR)"
                    + "values(?,?,?,?,?,?) ");  
                ps.setString(1, CNPT.getText());
                ps.setString(2, NUMET.getText());
                ps.setString(3, PRENUMET.getText());
                ps.setString(4, LOCALITATET.getText());
                ps.setString(5, STRADAT.getText());
                ps.setString(6, NUMART.getText());

                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Asigurare creata cu succes!");
                
                this.hide();
                Pagina_de_pornire.main(null);

                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Unul sau mai multe campuri nu au fost introduse");
        }
        
    }//GEN-LAST:event_NEXTActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Persoana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Persoana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Persoana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Persoana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Persoana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JLabel CNPL;
    private javax.swing.JTextField CNPT;
    private javax.swing.JLabel LOCALITATEL;
    private javax.swing.JTextField LOCALITATET;
    private javax.swing.JButton NEXT;
    private javax.swing.JLabel NUMARL;
    private javax.swing.JTextField NUMART;
    private javax.swing.JLabel NUMEL;
    private javax.swing.JTextField NUMET;
    private javax.swing.JLabel PRENUMEL;
    private javax.swing.JTextField PRENUMET;
    private javax.swing.JLabel STRADAL;
    private javax.swing.JTextField STRADAT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
