package proiect;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Creare_asigurare extends javax.swing.JFrame {

   
    public Creare_asigurare() {
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
		 if(NR_ASIGT.getText()==null||TIP_ASIGT.getText()==null||VAL_ASIGT.getText()==null||DATA_PLATII_D.getDate()==null||SUMAT.getText()==null ) {
			 return false;
		 
		 }
		 else {
		 try {
			 Float.parseFloat(SUMAT.getText());
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
        NR_ASIGL = new javax.swing.JLabel();
        NR_ASIGT = new javax.swing.JTextField();
        TIP_ASIGL = new javax.swing.JLabel();
        TIP_ASIGT = new javax.swing.JTextField();
        VAL_ASIGL = new javax.swing.JLabel();
        VAL_ASIGT = new javax.swing.JTextField();
        SUMAL = new javax.swing.JLabel();
        SUMAT = new javax.swing.JTextField();
        DATA_PLATIIL = new javax.swing.JLabel();
        DATA_PLATII_D = new com.toedter.calendar.JDateChooser();
        NEXTB = new javax.swing.JButton();
        BACKB = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        BACKGROUND = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Creare asigurare");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(560, 60, 230, 50);

        NR_ASIGL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NR_ASIGL.setText("Numar asigurare");
        jPanel1.add(NR_ASIGL);
        NR_ASIGL.setBounds(320, 140, 190, 40);

        NR_ASIGT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NR_ASIGT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NR_ASIGTActionPerformed(evt);
            }
        });
        jPanel1.add(NR_ASIGT);
        NR_ASIGT.setBounds(320, 190, 260, 40);

        TIP_ASIGL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TIP_ASIGL.setText("Tip asigurare");
        jPanel1.add(TIP_ASIGL);
        TIP_ASIGL.setBounds(740, 140, 180, 40);

        TIP_ASIGT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(TIP_ASIGT);
        TIP_ASIGT.setBounds(740, 190, 290, 40);

        VAL_ASIGL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        VAL_ASIGL.setText("Valoare asigurare");
        jPanel1.add(VAL_ASIGL);
        VAL_ASIGL.setBounds(320, 270, 250, 40);

        VAL_ASIGT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(VAL_ASIGT);
        VAL_ASIGT.setBounds(320, 320, 260, 40);

        SUMAL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SUMAL.setText("Total de plata");
        jPanel1.add(SUMAL);
        SUMAL.setBounds(550, 420, 170, 40);

        SUMAT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SUMAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUMATActionPerformed(evt);
            }
        });
        jPanel1.add(SUMAT);
        SUMAT.setBounds(550, 470, 220, 40);

        DATA_PLATIIL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DATA_PLATIIL.setText("Data platii");
        jPanel1.add(DATA_PLATIIL);
        DATA_PLATIIL.setBounds(740, 270, 190, 40);

        DATA_PLATII_D.setDateFormatString("dd/MM/yyyy");
        DATA_PLATII_D.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(DATA_PLATII_D);
        DATA_PLATII_D.setBounds(740, 320, 290, 40);

        NEXTB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NEXTB.setText("Next");
        NEXTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEXTBActionPerformed(evt);
            }
        });
        jPanel1.add(NEXTB);
        NEXTB.setBounds(850, 580, 110, 40);

        BACKB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BACKB.setText("Back");
        BACKB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKBActionPerformed(evt);
            }
        });
        jPanel1.add(BACKB);
        BACKB.setBounds(400, 590, 110, 40);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(20, 120, 1320, 10);

        BACKGROUND.setBackground(new java.awt.Color(255, 255, 255));
        BACKGROUND.setIcon(new javax.swing.ImageIcon("D:\\Proiect baze de date\\Proiect\\image.png")); // NOI18N
        jPanel1.add(BACKGROUND);
        BACKGROUND.setBounds(0, 0, 1360, 740);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1361, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NR_ASIGTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NR_ASIGTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NR_ASIGTActionPerformed

    private void SUMATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUMATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SUMATActionPerformed

    private void BACKBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKBActionPerformed
        this.hide();
        Pagina_de_pornire.main(null);
    }//GEN-LAST:event_BACKBActionPerformed

   
    
    
    private void NEXTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEXTBActionPerformed
        
        Date date=new Date(DATA_PLATII_D.getDate().getTime());
        
        if(checkInputs())
        {
            try {
                Connection con = getConnection();
                PreparedStatement ps = con.prepareStatement("INSERT INTO ASIGURARI(NR_ASIG,TIP_ASIG,VALOARE_ASIG,SUMA,DATA_PLATII)"
                    + "values(?,?,?,?,?) ");
                ps.setString(1, NR_ASIGT.getText());
                ps.setString(2, TIP_ASIGT.getText());
                ps.setString(3, VAL_ASIGT.getText());
                ps.setString(4, SUMAT.getText());
                ps.setDate(5,  date);
                

                
                ps.executeUpdate();
                
                this.hide();
                Pagina_de_pornire.main(null);

                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Unul sau mai multe campuri nu au fost introduse");
        }
        
        
    }//GEN-LAST:event_NEXTBActionPerformed

    
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
            java.util.logging.Logger.getLogger(Creare_asigurare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Creare_asigurare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Creare_asigurare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Creare_asigurare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Creare_asigurare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACKB;
    private javax.swing.JLabel BACKGROUND;
    private javax.swing.JLabel DATA_PLATIIL;
    private com.toedter.calendar.JDateChooser DATA_PLATII_D;
    private javax.swing.JButton NEXTB;
    private javax.swing.JLabel NR_ASIGL;
    private javax.swing.JTextField NR_ASIGT;
    private javax.swing.JLabel SUMAL;
    private javax.swing.JTextField SUMAT;
    private javax.swing.JLabel TIP_ASIGL;
    private javax.swing.JTextField TIP_ASIGT;
    private javax.swing.JLabel VAL_ASIGL;
    private javax.swing.JTextField VAL_ASIGT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
