package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import views.GamesRegisterView;


public class GamesRegisterDao {
    
    Connection conn;
    PreparedStatement st;
    GamesRegisterView gr;
    
    public boolean Connect(){
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/access", "root", "pokemon45");
            
            return true;
            
        } catch (ClassNotFoundException | SQLException ex) {
            
            return false;
        
        }
    
    }

/*    
    public void clean() {
    
        gr.txtName.setText("");
        gr.txtDeveloper.setText("");
        gr.txtLaunchDate.setText("");
        gr.txtSynopsis.setText("");
        gr.txtValue.setText("");
        gr.txtPopularity.setText("");
        gr.txtSize.setText("");
    
    }
*/    

    public boolean save(User user) {
    
        try {
            
            Connect();
            
            st = conn.prepareStatement("INSERT INTO GAMES VALUES (?, ?, ?, ?, ?, ?, ?)");
            
            st.setString(1, user.getName());
            st.setString(2, user.getDeveloper());
            st.setDouble(3, user.getLaunchDate());
            st.setString(4, user.getSynopsis());
            st.setDouble(5, user.getValue());
            st.setInt(6, user.getPopularity());
            st.setString(7, user.getSize());
            st.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            
            return false;
            
        }
    
    }
    
    /*
    public boolean delete(User user) {
        
        try {
            Connect();
            
            st = conn.prepareStatement("DELETE FROM GAMES WHERE NAME = ?");
            st.setString(1, gr.txtName.getText());
            st.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Game Deleted!");
            
        } catch (SQLException ex) {
            
             return false;
            
        }
        
    }
*/
    
}
