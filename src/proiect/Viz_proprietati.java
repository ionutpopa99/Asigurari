
package proiect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Viz_proprietati extends javax.swing.JFrame {

    public Viz_proprietati() {
        initComponents();
        Show_Products_In_JTable();
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
    public ArrayList<Proprietati> getProductList()
    {
            ArrayList<Proprietati> productList  = new ArrayList<Proprietati>();
            Connection con = getConnection();
            
            String query2 = "select PERSOANA.CNP, PERSOANA.NUME,PERSOANA.PRENUME,PERSOANA.LOCALITATE,VEHICULE.NR_VEHICUL,VEHICULE.MARCA,VEHICULE.SERIE,VEHICULE.CULOARE,VEHICULE.CAPACIT_CIL,PROPRIETATE.DATA_CUMPARARII,PROPRIETATE.PRET from PERSOANA,VEHICULE,PROPRIETATE WHERE (PERSOANA.CNP=PROPRIETATE.CNP) AND (VEHICULE.NR_VEHICUL=PROPRIETATE.NR_VEHICUL)";
            
            Statement st;
        
            ResultSet rs2;
        try {
            
            st = con.createStatement();
            
            rs2 = st.executeQuery(query2);
            
            Proprietati asig;
            
            while(rs2.next())
            {
                asig = new Proprietati(rs2.getLong("CNP"),rs2.getString("NUME"),rs2.getString("PRENUME"),rs2.getString("LOCALITATE"),rs2.getInt("NR_VEHICUL"),rs2.getString("MARCA"),rs2.getLong("SERIE"),rs2.getString("CULOARE"),Float.parseFloat(rs2.getString("CAPACIT_CIL")),rs2.getDate("DATA_CUMPARARII"),Float.parseFloat(rs2.getString("PRET")));
                productList.add(asig);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Proprietati.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return productList; 
                
    }
    
         public void Show_Products_In_JTable()
    {
        ArrayList<Proprietati> list = getProductList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        // clear jtable content
        model.setRowCount(0);
        Object[] row = new Object[11];
        for(int i = 0; i < list.size(); i++)
        {
            
            row[0] = list.get(i).getCNP();
            row[1] = list.get(i).getNUME();
            row[2] = list.get(i).getPRENUME();
            row[3] = list.get(i).getLOCALITATE();
            row[4] = list.get(i).getNR_VEHICUL();
            row[5] = list.get(i).getMARCA();
            row[6] = list.get(i).getSERIE();
            row[7] = list.get(i).getCULOARE();
            row[8] = list.get(i).getCAPACIT_CIL();
            row[9] = list.get(i).getDATA_CUMPARARII();
            row[10] = list.get(i).getPRET();
            model.addRow(row);
        }
    
    }
     

    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 760));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CNP", "NUME", "PRENUME", "LOCALITATE", "NUMAR VEHICUL", "MARCA VEHICUL", "SERIE", "CULOARE", "CAPACITATE CILINDRICA", "DATA CUMPARARII", "PRET"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 120, 1280, 410);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(373, 590, 90, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(810, 590, 90, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Proiect baze de date\\Proiect\\image.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1366, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        Pagina_de_pornire.main(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFrame frmLogin_System = new JFrame("Exit");
	if(JOptionPane.showConfirmDialog(frmLogin_System, "Confirmati daca vreti sa iesiti!", "Login Systems", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Viz_proprietati.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viz_proprietati.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viz_proprietati.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viz_proprietati.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viz_proprietati().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
