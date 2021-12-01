package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginRegisterDao {
    
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    
    public boolean Connect() {
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/access", "root", "pokemon45");
            
            return true;
            
        } catch (ClassNotFoundException | SQLException ex) {
            
            return false;
        
        }
    
    }    
    
    public boolean save(Login login) {
    
        try {
            
            Connect();
            
            st = conn.prepareStatement("INSERT INTO LOGIN VALUES (?, ?, ?)");
                    
            st.setString(1, login.getUser());
            st.setString(2, login.getPassword());
            st.setString(3, login.getPosition());
            st.executeUpdate();
                    
            return true;
            
        } catch (SQLException ex) {
            
            return false;
            
        }
    
    }
    
    public boolean delete(Login login) {
    
        try {
            
            Connect();
            
            st = conn.prepareStatement("DELETE FROM LOGIN WHERE LOGIN = ? ");
            
            st.setString(1, login.getUser());
            st.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {

            return false;
            
        }
    
    }
    
    public Login consult(String user) {
    
        try {
            
            Connect();
            
            st = conn.prepareStatement("SELECT * FROM LOGIN WHERE LOGIN = ? ");
            
            st.setString(1, user);
            rs = st.executeQuery();
            
            if (rs.next()) {
                
                Login login;
                login = new Login();
                
                login.setUser(rs.getString("user"));
                login.setPassword(rs.getString("password"));
                login.setPosition(rs.getString("position"));
                
                return login;
                
            } else {
            
                return null;
            
            }
            
        } catch (SQLException ex) {
            
            return null;
            
        }
    
    }
    
    public boolean update(Login login) {
    
        try {
            
            Connect();
            
            st = conn.prepareStatement("UPDATE LOGIN SET LOGIN = ?, PASSWORD = ?, POSITION = ?");
            st.setString(1, login.getUser());
            st.setString(2, login.getPassword());
            st.setString(3, login.getPosition());
            st.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {            
            
                return false;
            
        }
        
    
    }
    
}
