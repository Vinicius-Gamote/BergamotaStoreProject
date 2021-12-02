package views;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GamesView extends javax.swing.JFrame {

    public GamesView() {
        initComponents();
        
        btnClean.setBackground(new Color(1,0,0,0));
        btnSearch.setBackground(new Color(1,0,0,0));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGames = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cmbConsultType = new javax.swing.JComboBox<>();
        btnClean = new javax.swing.JButton();
        lblDeveloper = new javax.swing.JLabel();
        txtDeveloper = new javax.swing.JTextField();
        lblDeveloper1 = new javax.swing.JLabel();
        txtPopularity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Games Details");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 150, -1, -1));

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.setBorder(null);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 103, 40));

        tblGames.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        tblGames.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Developer", "LaunchDate", "Synopsis", "Value", "Popularity", "Size"
            }
        ));
        jScrollPane1.setViewportView(tblGames);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 645, 402));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose your filter:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 31, 185, 24));

        cmbConsultType.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        cmbConsultType.setForeground(new java.awt.Color(255, 255, 255));
        cmbConsultType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "all games", "by Developers", "by Popularity" }));
        getContentPane().add(cmbConsultType, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 24, 260, 30));

        btnClean.setBackground(new java.awt.Color(255, 255, 255));
        btnClean.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        btnClean.setForeground(new java.awt.Color(255, 255, 255));
        btnClean.setText("Clean");
        btnClean.setBorder(null);
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });
        getContentPane().add(btnClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 103, 40));

        lblDeveloper.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lblDeveloper.setForeground(new java.awt.Color(255, 255, 255));
        lblDeveloper.setText("Developer:");
        getContentPane().add(lblDeveloper, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 69, 185, 24));

        txtDeveloper.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        getContentPane().add(txtDeveloper, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 260, 30));

        lblDeveloper1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lblDeveloper1.setForeground(new java.awt.Color(255, 255, 255));
        lblDeveloper1.setText("Popularity:");
        getContentPane().add(lblDeveloper1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 108, 185, 24));

        txtPopularity.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        getContentPane().add(txtPopularity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 112, 260, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/gamesViewDark.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 570));

        setSize(new java.awt.Dimension(727, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        try {
        
            Connection conn;
            PreparedStatement st;
            ResultSet rs;
            String consultType;
            DefaultTableModel tblGame;

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/access", "root", "pokemon45");

            consultType = cmbConsultType.getSelectedItem().toString();

            if(consultType.equalsIgnoreCase("all games")) {

                st = conn.prepareStatement("SELECT * FROM GAMES");
                rs = st.executeQuery();
                tblGame = (DefaultTableModel) tblGames.getModel();

                while(rs.next()) {

                    Object[] data = {
                        rs.getString("name"),
                        rs.getString("developer"),
                        rs.getString("launchDate"),
                        rs.getString("synopsis"),
                        rs.getString("value"),
                        rs.getString("popularity"),
                        rs.getString("size")
                        };

                    tblGame.addRow(data);

                    }

            } else if (consultType.equalsIgnoreCase("by Popularity")) {

                st = conn.prepareStatement("SELECT * FROM GAMES WHERE POPULARITY = ?");
                st.setString(1, txtPopularity.getText());
                rs = st.executeQuery();

                tblGame = (DefaultTableModel) tblGames.getModel();

                while(rs.next()) {

                    Object[] data = {
                        rs.getString("name"),
                        rs.getString("developer"),
                        rs.getString("launchDate"),
                        rs.getString("synopsis"),
                        rs.getString("value"),
                        rs.getString("popularity"),
                        rs.getString("size")
                    };

                    tblGame.addRow(data);

                }

            }

            else if (consultType.equalsIgnoreCase("by Developers")) {

                st = conn.prepareStatement("SELECT * FROM GAMES WHERE DEVELOPER = ?");
                st.setString(1, txtDeveloper.getText());
                rs = st.executeQuery();

                tblGame = (DefaultTableModel) tblGames.getModel();

                while(rs.next()) {

                    Object[] data = {
                        rs.getString("name"),
                        rs.getString("developer"),
                        rs.getString("launchDate"),
                        rs.getString("synopsis"),
                        rs.getString("value"),
                        rs.getString("popularity"),
                        rs.getString("size")
                    };

                    tblGame.addRow(data);

                }

            }
        } catch (ClassNotFoundException | SQLException ex) {
        
             JOptionPane.showMessageDialog(null, "Conection Error!!!");
        
        }
                
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        
        Clean();
        
    }//GEN-LAST:event_btnCleanActionPerformed

    public void Clean() {
        
        DefaultTableModel tblGame = (DefaultTableModel) tblGames.getModel();
        tblGame.getDataVector().removeAllElements();
        tblGame.fireTableDataChanged();
        
    }
    
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
            java.util.logging.Logger.getLogger(GamesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbConsultType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDeveloper;
    private javax.swing.JLabel lblDeveloper1;
    private javax.swing.JTable tblGames;
    private javax.swing.JTextField txtDeveloper;
    private javax.swing.JTextField txtPopularity;
    // End of variables declaration//GEN-END:variables
}
