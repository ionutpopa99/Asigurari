
package proiect;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Vehicul extends javax.swing.JFrame {

    public Vehicul() {
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
		 if(CAT_VEHICULT.getText()==null||NR_VEHICULT.getText()==null||MARCAT.getText()==null||SERIET.getText()==null||CAP_CILINDRICAT.getText()==null || CULOARET.getText()==null) {
			 return false;
		 
		 }
		 else {
		 try {
			 Float.parseFloat(CAP_CILINDRICAT.getText());
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
        NR_VEHICULL = new javax.swing.JLabel();
        MARCAL = new javax.swing.JLabel();
        CAT_VEHICULL = new javax.swing.JLabel();
        SERIEL = new javax.swing.JLabel();
        CULOAREL = new javax.swing.JLabel();
        CAP_CILIDRICAL = new javax.swing.JLabel();
        NR_VEHICULT = new javax.swing.JTextField();
        MARCAT = new javax.swing.JTextField();
        CAT_VEHICULT = new javax.swing.JTextField();
        SERIET = new javax.swing.JTextField();
        CULOARET = new javax.swing.JTextField();
        CAP_CILINDRICAT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        CNPL = new javax.swing.JLabel();
        NUMEL = new javax.swing.JLabel();
        PRENUMEL = new javax.swing.JLabel();
        CNPT = new javax.swing.JTextField();
        NUMET = new javax.swing.JTextField();
        PRENUMET = new javax.swing.JTextField();
        NUMART = new javax.swing.JTextField();
        NUMARL = new javax.swing.JLabel();
        STRADAT = new javax.swing.JTextField();
        STRADAL = new javax.swing.JLabel();
        LOCALITATET = new javax.swing.JTextField();
        LOCALITATEL = new javax.swing.JLabel();
        DATA_CUMPARARII = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PRETT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1360, 730));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Introduceti datele vehiculului");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(480, 40, 390, 60);

        NR_VEHICULL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NR_VEHICULL.setText("Numar autovehicul");
        jPanel1.add(NR_VEHICULL);
        NR_VEHICULL.setBounds(100, 130, 190, 30);

        MARCAL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MARCAL.setText("Marca autovehicul");
        jPanel1.add(MARCAL);
        MARCAL.setBounds(420, 130, 210, 30);

        CAT_VEHICULL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CAT_VEHICULL.setText("Categorie autovehicul");
        jPanel1.add(CAT_VEHICULL);
        CAT_VEHICULL.setBounds(750, 130, 220, 30);

        SERIEL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SERIEL.setText("Serie sasiu");
        jPanel1.add(SERIEL);
        SERIEL.setBounds(100, 240, 170, 30);

        CULOAREL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CULOAREL.setText("Culoare");
        jPanel1.add(CULOAREL);
        CULOAREL.setBounds(420, 240, 240, 30);

        CAP_CILIDRICAL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CAP_CILIDRICAL.setText("Capacitate cilindrica");
        jPanel1.add(CAP_CILIDRICAL);
        CAP_CILIDRICAL.setBounds(750, 240, 230, 30);

        NR_VEHICULT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(NR_VEHICULT);
        NR_VEHICULT.setBounds(100, 180, 250, 40);

        MARCAT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(MARCAT);
        MARCAT.setBounds(420, 180, 280, 40);

        CAT_VEHICULT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(CAT_VEHICULT);
        CAT_VEHICULT.setBounds(750, 180, 290, 40);

        SERIET.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(SERIET);
        SERIET.setBounds(100, 290, 250, 40);

        CULOARET.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CULOARET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CULOARETActionPerformed(evt);
            }
        });
        jPanel1.add(CULOARET);
        CULOARET.setBounds(420, 290, 280, 40);

        CAP_CILINDRICAT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(CAP_CILINDRICAT);
        CAP_CILINDRICAT.setBounds(750, 290, 290, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(370, 580, 130, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(850, 580, 140, 40);

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(20, 100, 1320, 10);

        CNPL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CNPL.setText("CNP");
        jPanel1.add(CNPL);
        CNPL.setBounds(100, 350, 70, 22);

        NUMEL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NUMEL.setText("Nume");
        jPanel1.add(NUMEL);
        NUMEL.setBounds(420, 350, 90, 22);

        PRENUMEL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PRENUMEL.setText("Prenume");
        jPanel1.add(PRENUMEL);
        PRENUMEL.setBounds(750, 350, 90, 22);

        CNPT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CNPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNPTActionPerformed(evt);
            }
        });
        jPanel1.add(CNPT);
        CNPT.setBounds(100, 390, 250, 40);

        NUMET.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(NUMET);
        NUMET.setBounds(420, 390, 280, 40);

        PRENUMET.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(PRENUMET);
        PRENUMET.setBounds(750, 390, 290, 40);

        NUMART.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(NUMART);
        NUMART.setBounds(750, 490, 290, 40);

        NUMARL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NUMARL.setText("Numar");
        jPanel1.add(NUMARL);
        NUMARL.setBounds(750, 450, 80, 22);

        STRADAT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(STRADAT);
        STRADAT.setBounds(420, 490, 280, 40);

        STRADAL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        STRADAL.setText("Strada");
        jPanel1.add(STRADAL);
        STRADAL.setBounds(420, 450, 70, 22);

        LOCALITATET.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(LOCALITATET);
        LOCALITATET.setBounds(100, 490, 250, 40);

        LOCALITATEL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LOCALITATEL.setText("Localitate");
        jPanel1.add(LOCALITATEL);
        LOCALITATEL.setBounds(100, 450, 90, 22);

        DATA_CUMPARARII.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(DATA_CUMPARARII);
        DATA_CUMPARARII.setBounds(1080, 180, 190, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Data cumpararii");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1080, 130, 180, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Pret");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1080, 244, 190, 30);

        PRETT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PRETT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRETTActionPerformed(evt);
            }
        });
        jPanel1.add(PRETT);
        PRETT.setBounds(1080, 290, 190, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Proiect baze de date\\Proiect\\image.png")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1360, 730));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1360, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CULOARETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CULOARETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CULOARETActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Date date=new Date(DATA_CUMPARARII.getDate().getTime());
        if(checkInputs())
        {
            try {
                Connection con = getConnection();
                PreparedStatement ps = con.prepareStatement("INSERT INTO VEHICULE(NR_VEHICUL,MARCA,TIP,SERIE,CULOARE,CAPACIT_CIL)"
                    + "values(?,?,?,?,?,?)"); 
                PreparedStatement ps1 = con.prepareStatement("INSERT INTO PERSOANA(CNP,NUME,PRENUME,LOCALITATE,STRADA,NUMAR)"
                    + "values(?,?,?,?,?,?) "); 
                PreparedStatement ps2 = con.prepareStatement("INSERT INTO PROPRIETATE(CNP,NR_VEHICUL,DATA_CUMPARARII,PRET)"
                    + "values(?,?,?,?) "); 
                ps1.setString(1, CNPT.getText());
                ps1.setString(2, NUMET.getText());
                ps1.setString(3, PRENUMET.getText());
                ps1.setString(4, LOCALITATET.getText());
                ps1.setString(5, STRADAT.getText());
                ps1.setString(6, NUMART.getText());
                
                ps.setString(1, NR_VEHICULT.getText());
                ps.setString(2, MARCAT.getText());
                ps.setString(3, CAT_VEHICULT.getText());
                ps.setString(4, SERIET.getText());
                ps.setString(5, CULOARET.getText());
                ps.setString(6, CAP_CILINDRICAT.getText());
                
                ps2.setString(1, CNPT.getText());
                ps2.setString(2, NR_VEHICULT.getText());
                ps2.setDate(3,date);
                ps2.setString(4, PRETT.getText());
                
                ps.executeUpdate();
                ps1.executeUpdate();
                ps2.executeUpdate();
                this.hide();
                Creare_asigurare.main(null);

                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Unul sau mai multe campuri nu au fost introduse");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CNPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNPTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNPTActionPerformed

    private void PRETTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRETTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRETTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        Pagina_de_pornire.main(null);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Vehicul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vehicul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vehicul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vehicul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vehicul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CAP_CILIDRICAL;
    private javax.swing.JTextField CAP_CILINDRICAT;
    private javax.swing.JLabel CAT_VEHICULL;
    private javax.swing.JTextField CAT_VEHICULT;
    private javax.swing.JLabel CNPL;
    private javax.swing.JTextField CNPT;
    private javax.swing.JLabel CULOAREL;
    private javax.swing.JTextField CULOARET;
    private com.toedter.calendar.JDateChooser DATA_CUMPARARII;
    private javax.swing.JLabel LOCALITATEL;
    private javax.swing.JTextField LOCALITATET;
    private javax.swing.JLabel MARCAL;
    private javax.swing.JTextField MARCAT;
    private javax.swing.JLabel NR_VEHICULL;
    private javax.swing.JTextField NR_VEHICULT;
    private javax.swing.JLabel NUMARL;
    private javax.swing.JTextField NUMART;
    private javax.swing.JLabel NUMEL;
    private javax.swing.JTextField NUMET;
    private javax.swing.JLabel PRENUMEL;
    private javax.swing.JTextField PRENUMET;
    private javax.swing.JTextField PRETT;
    private javax.swing.JLabel SERIEL;
    private javax.swing.JTextField SERIET;
    private javax.swing.JLabel STRADAL;
    private javax.swing.JTextField STRADAT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
