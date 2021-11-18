package views;

import javax.swing.JOptionPane;
import persistence.GamesRegisterDao;
import persistence.Game;

public class GamesRegisterView extends javax.swing.JFrame {

    public GamesRegisterView() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnConsult = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setText("Name");

        lblDeveloper.setText("Developer");

        lblLaunchData.setText("Launch Date");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblSynopsis.setText("Synopsis");

        lblValue.setText("Value");

        lblPopularity.setText("Popularity");

        lblSize.setText("Size");

        jLabel1.setText("Games Register");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnConsult.setText("Consult");
        btnConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSynopsis, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPopularity, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValue, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSize, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSynopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPopularity, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblLaunchData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(txtLaunchDate, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDeveloper)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDeveloper, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsult)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeveloper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeveloper))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLaunchData)
                    .addComponent(txtLaunchDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSynopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSynopsis))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPopularity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPopularity))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSize)
                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnConsult))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(416, 547));
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
            
                JOptionPane.showMessageDialog(null, "Save Error!!!");
            
            }
        } else {
         
            JOptionPane.showMessageDialog(null, "Connection Error!!!");
            
        }
        
        clean();
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    
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
    private javax.swing.JLabel jLabel1;
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
