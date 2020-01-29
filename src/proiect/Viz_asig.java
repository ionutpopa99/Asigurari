
package proiect;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Viz_asig extends javax.swing.JFrame {

    public Viz_asig() {
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
    
        
        public boolean checkInputs()
	 {
		 if(NR_ASIGT.getText()==null||TIP_ASIGT.getText()==null||VAL_ASIGT.getText()==null||DATA_PLATII.getDate()==null||SUMAT.getText()==null ) {
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
        
    public ArrayList<Asigurare> getProductList()
    {
            ArrayList<Asigurare> productList  = new ArrayList<Asigurare>();
            Connection con = getConnection();
            
            String query2 = "SELECT * FROM ASIGURARI";
            
            Statement st;
        
            ResultSet rs2;
        try {
            
            st = con.createStatement();
            
            rs2 = st.executeQuery(query2);
            
            Asigurare product;
            
            while(rs2.next())
            {
                product = new Asigurare(rs2.getInt("NR_ASIG"),rs2.getString("TIP_ASIG"),Float.parseFloat(rs2.getString("VALOARE_ASIG")),Float.parseFloat(rs2.getString("SUMA")),rs2.getDate("DATA_PLATII"));
                productList.add(product);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Asigurare.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return productList; 
                
    }
    
     public void Show_Products_In_JTable()
    {
        ArrayList<Asigurare> list = getProductList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        // clear jtable content
        model.setRowCount(0);
        Object[] row = new Object[5];
        for(int i = 0; i < list.size(); i++)
        {
            
            row[0] = list.get(i).getNR_ASIG();
            row[1] = list.get(i).getTIP_ASIG();
            row[2] = list.get(i).getVALOARE_ASIG();
            row[3] = list.get(i).getSUMA();
            row[4] = list.get(i).getDATA_PLATII();
            model.addRow(row);
        }
    
    }
     
public void ShowItem(int index)
    {
            NR_ASIGT.setText(Integer.toString(getProductList().get(index).getNR_ASIG()));
            TIP_ASIGT.setText(getProductList().get(index).getTIP_ASIG());
            VAL_ASIGT.setText(Float.toString (getProductList().get(index).getVALOARE_ASIG()));
            SUMAT.setText(Float.toString (getProductList().get(index).getSUMA()));
            DATA_PLATII.setDate(getProductList().get(index).getDATA_PLATII());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NR_ASIGT = new javax.swing.JTextField();
        TIP_ASIGT = new javax.swing.JTextField();
        VAL_ASIGT = new javax.swing.JTextField();
        SUMAT = new javax.swing.JTextField();
        DATA_PLATII = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1360, 730));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numar asigurare", "Tip asigurare", "Valoare asigurare", "Total de plata", "Data platii"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(760, 70, 570, 430);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(370, 480, 100, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(110, 480, 100, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Numar asigurare");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 110, 160, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Tip Asigurare");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 160, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Valoare asigurare");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 210, 180, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Data platii");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(110, 310, 170, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Total de plata");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 260, 170, 30);

        NR_ASIGT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(NR_ASIGT);
        NR_ASIGT.setBounds(300, 110, 200, 30);

        TIP_ASIGT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(TIP_ASIGT);
        TIP_ASIGT.setBounds(300, 160, 200, 30);

        VAL_ASIGT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(VAL_ASIGT);
        VAL_ASIGT.setBounds(300, 210, 200, 30);

        SUMAT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(SUMAT);
        SUMAT.setBounds(300, 260, 200, 30);

        DATA_PLATII.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(DATA_PLATII);
        DATA_PLATII.setBounds(300, 310, 200, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(240, 480, 100, 40);

        Search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel1.add(Search);
        Search.setBounds(500, 480, 100, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Proiect baze de date\\Proiect\\image.png")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1360, 730));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1360, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        Date date=new Date(DATA_PLATII.getDate().getTime());
        
        if(checkInputs() && NR_ASIGT.getText() != null)
        {
            String UpdateQuery = null;
            PreparedStatement ps = null;
            Connection con = getConnection();
           
                try {
                    UpdateQuery = "UPDATE ASIGURARI SET TIP_ASIG = ?,VALOARE_ASIG = ?,SUMA = ?,DATA_PLATII = ?"
                    + "WHERE NR_ASIG = ?";
                    ps = con.prepareStatement(UpdateQuery);

                    ps.setString(1, TIP_ASIGT.getText());
                    ps.setString(2, VAL_ASIGT.getText());
                    ps.setString(3, SUMAT.getText());
                    ps.setDate(4,  date);
                    

                    ps.setInt(5, Integer.parseInt(NR_ASIGT.getText()));

                    ps.executeUpdate();
                    //Show_Products_In_JTable();
                    JOptionPane.showMessageDialog(null, "Asigurare actualizata!");

                } catch (SQLException ex) {
                    Logger.getLogger(Viz_asig.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            Show_Products_In_JTable();

    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(!NR_ASIGT.getText().equals(""))
        {
            try {
                Connection con = getConnection();
                PreparedStatement ps = con.prepareStatement("DELETE FROM ASIGURARI WHERE NR_ASIG = ?");
                int nr_asig = Integer.parseInt(NR_ASIGT.getText());
                ps.setInt(1, nr_asig);
                ps.executeUpdate();
                //Show_Products_In_JTable();
                JOptionPane.showMessageDialog(null, "Asigurare stearsa cu scucces!");
            } catch (SQLException ex) {
                Logger.getLogger(Viz_asig.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Asigurarea nu a fost stearsa!");
            }

        }else{
            JOptionPane.showMessageDialog(null, "Asigurarea nu a fost stearsa,nu ati introdus numarul de asigurare!");
        }
        Show_Products_In_JTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        
       
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("select * from ASIGURARI where NR_ASIG=?");
            ps.setString(1,NR_ASIGT.getText());
            ResultSet rs;
            rs=ps.executeQuery();
            if(rs.next()){
                TIP_ASIGT.setText(rs.getString("TIP_ASIG"));
                VAL_ASIGT.setText(rs.getString("VALOARE_ASIG"));
                SUMAT.setText(rs.getString("SUMA"));
                DATA_PLATII.setDate(rs.getDate("DATA_PLATII"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }//GEN-LAST:event_SearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide();
        Pagina_de_pornire.main(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
        ShowItem(index);
    }//GEN-LAST:event_jTable1MouseClicked

   
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
            java.util.logging.Logger.getLogger(Viz_asig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viz_asig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viz_asig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viz_asig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viz_asig().setVisible(true);
            }
        });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DATA_PLATII;
    private javax.swing.JTextField NR_ASIGT;
    private javax.swing.JTextField SUMAT;
    private javax.swing.JButton Search;
    private javax.swing.JTextField TIP_ASIGT;
    private javax.swing.JTextField VAL_ASIGT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
