package views;

import java.awt.Color;
import javax.swing.JOptionPane;
import persistence.GamesRegisterDao;
import persistence.Game;

public class GamesRegisterView extends javax.swing.JFrame {

    public GamesRegisterView() {
        initComponents();
        
        btnConsult.setBackground(new Color(1,0,0,0));
        btnDelete.setBackground(new Color(1,0,0,0));
        btnSave.setBackground(new Color(1,0,0,0));
        btnUpdate.setBackground(new Color(1,0,0,0));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        lblDeveloper = new javax.swing.JLabel();
        lblLaunchData = new javax.swing.JLabel();
        txtLaunchDate = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtDeveloper = new javax.swing.JTextField();
        txtSynopsis = new javax.swing.JTextField();
        txtPopularity = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        lblSynopsis = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        lblPopularity = new javax.swing.JLabel();
        lblSize = new javax.swing.JLabel();
        txtValue = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnConsult = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Games Register");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 60, 20));

        lblDeveloper.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblDeveloper.setForeground(new java.awt.Color(255, 255, 255));
        lblDeveloper.setText("Developer");
        getContentPane().add(lblDeveloper, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, 20));

        lblLaunchData.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblLaunchData.setForeground(new java.awt.Color(255, 255, 255));
        lblLaunchData.setText("Launch Date");
        getContentPane().add(lblLaunchData, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 70, -1));
        getContentPane().add(txtLaunchDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 300, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 300, -1));
        getContentPane().add(txtDeveloper, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 300, -1));

        txtSynopsis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSynopsisActionPerformed(evt);
            }
        });
        getContentPane().add(txtSynopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 300, 60));
        getContentPane().add(txtPopularity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 300, -1));
        getContentPane().add(txtSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 300, -1));

        lblSynopsis.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblSynopsis.setForeground(new java.awt.Color(255, 255, 255));
        lblSynopsis.setText("Synopsis");
        getContentPane().add(lblSynopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 60, 30));

        lblValue.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblValue.setForeground(new java.awt.Color(255, 255, 255));
        lblValue.setText("Value");
        getContentPane().add(lblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 70, 20));

        lblPopularity.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblPopularity.setForeground(new java.awt.Color(255, 255, 255));
        lblPopularity.setText("Popularity");
        getContentPane().add(lblPopularity, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 70, 20));

        lblSize.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblSize.setForeground(new java.awt.Color(255, 255, 255));
        lblSize.setText("Size");
        getContentPane().add(lblSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 60, 20));
        getContentPane().add(txtValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 300, -1));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 100, 30));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 110, 40));

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, -1));

        btnConsult.setBackground(new java.awt.Color(255, 255, 255));
        btnConsult.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        btnConsult.setForeground(new java.awt.Color(255, 255, 255));
        btnConsult.setText("Consult");
        btnConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsult, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/gamesManagementDark.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 483, 504));

        setSize(new java.awt.Dimension(499, 512));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

        public void clean() {
    
        txtName.setText("");
        txtDeveloper.setText("");
        txtLaunchDate.setText("");
        txtSynopsis.setText("");
        txtValue.setText("");
        txtPopularity.setText("");
        txtSize.setText("");
    
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        Game game;
        GamesRegisterDao gamesDao;
        boolean result;
        
        game = new Game();
        game.setName(txtName.getText());
        game.setDeveloper(txtDeveloper.getText());
        game.setLaunchDate(Double.parseDouble(txtLaunchDate.getText()));
        game.setSynopsis(txtSynopsis.getText());
        game.setValue(Double.parseDouble(txtValue.getText()));
        game.setPopularity(Integer.parseInt(txtPopularity.getText()));
        game.setSize(txtSize.getText());
        
        gamesDao = new GamesRegisterDao();
        result = gamesDao.Connect();
        
        if(result == true) {
        
            result = gamesDao.save(game);
            
            if(result == true) {
            
                JOptionPane.showMessageDialog(null, "Saved Data!");
                
            } else {
            
                JOptionPane.showMessageDialog(null, "Save Error!!!");
            
            }
        } else {
         
            JOptionPane.showMessageDialog(null, "Connection Error!!!");
            
        }
        
        clean();
                       
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        Game game;
        GamesRegisterDao gamesDao;
        boolean result;
        
        game = new Game();
        game.setName(txtName.getText());
        
        gamesDao = new GamesRegisterDao();
        result = gamesDao.Connect();
        
        if(result == true) {
        
            result = gamesDao.delete(game);
            
            if(result == true) {
            
                JOptionPane.showMessageDialog(null, "Game Deleted!!!");
            
            } else {
            
                JOptionPane.showMessageDialog(null, "Error when try to delete!");
                }
            } else {
                    
                    JOptionPane.showMessageDialog(null, "Connection Error!!!");
                    
                }
            
        clean();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultActionPerformed
        
        Game game;
        GamesRegisterDao gamesDao;
        boolean result;
        String name;
        
        name = txtName.getText();
        
        gamesDao = new GamesRegisterDao();
        result = gamesDao.Connect();
        
        if(result == true) {
        
            game = gamesDao.consult(name);
            
            if (game != null) {
            
                txtName.setText(game.getName());
                txtDeveloper.setText(game.getDeveloper());
                txtLaunchDate.setText(String.valueOf(game.getLaunchDate()));
                txtSynopsis.setText(game.getSynopsis());
                txtValue.setText(String.valueOf(game.getValue()));
                txtPopularity.setText(String.valueOf(game.getPopularity()));
                txtSize.setText(game.getSize());
            
            } else {
            
                JOptionPane.showMessageDialog(null, "Game not found!");
            
            } 
            
        } else {
            
                    JOptionPane.showMessageDialog(null, "Connection Error!");
                    
            }
        
    }//GEN-LAST:event_btnConsultActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        Game game;
        GamesRegisterDao gamesDao;
        boolean result;
        
        game = new Game();
        game.setName(txtName.getText());
        game.setDeveloper(txtDeveloper.getText());
        game.setLaunchDate(Double.parseDouble(txtLaunchDate.getText()));
        game.setSynopsis(txtSynopsis.getText());
        game.setValue(Double.parseDouble(txtValue.getText()));
        game.setPopularity(Integer.parseInt(txtPopularity.getText()));
        game.setSize(txtSize.getText());
        
        gamesDao = new GamesRegisterDao();
        result = gamesDao.Connect();
        
        if(result == true) {
        
            result = gamesDao.update(game);
            
            if(result == true) {
            
                JOptionPane.showMessageDialog(null, "Updated Data!");
                
            } else {
            
                JOptionPane.showMessageDialog(null, "Update Error!!!");
            
            }
        } else {
         
            JOptionPane.showMessageDialog(null, "Connection Error!!!");
            
        }
        
        clean();
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSynopsisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSynopsisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSynopsisActionPerformed

    
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
            java.util.logging.Logger.getLogger(GamesRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamesRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamesRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamesRegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamesRegisterView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsult;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDeveloper;
    private javax.swing.JLabel lblLaunchData;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPopularity;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblSynopsis;
    private javax.swing.JLabel lblValue;
    private javax.swing.JTextField txtDeveloper;
    private javax.swing.JTextField txtLaunchDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPopularity;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtSynopsis;
    private javax.swing.JTextField txtValue;
    // End of variables declaration//GEN-END:variables
}
