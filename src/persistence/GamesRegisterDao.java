package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import views.GamesRegisterView;
import java.sql.ResultSet;


public class GamesRegisterDao {
    
    Connection conn;
    PreparedStatement st;
    GamesRegisterView gr;
    ResultSet rs;
    
    public boolean Connect(){
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/access", "root", "pokemon45");
            
            return true;
            
        } catch (ClassNotFoundException | SQLException ex) {
            
            return false;
        
        }
    
    }
    
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
    
    public boolean delete(User user) {
        
        try {
            
            Connect();
            
            st = conn.prepareStatement("DELETE FROM GAMES WHERE NAME = ?");
            st.setString(1, user.getName());
            st.executeUpdate();
                        
            return true;
            
        } catch (SQLException ex) {
            
             return false;
            
        }
        
    }
    
    public User consult(String name){
    
        try {
            
            Connect();
            
            st = conn.prepareStatement("SELECT * FROM GAMES WHERE NAME = ?");
            st.setString(1, name);
            rs = st.executeQuery();
            
            if(rs.next()) {
            
                User user;
                user = new User();
                user.setName(rs.getString("name"));
                user.setDeveloper(rs.getString("developer"));
                user.setLaunchDate(rs.getDouble("launchDate"));
                user.setSynopsis(rs.getString("synopsis"));
                user.setValue(rs.getDouble("value"));
                user.setPopularity(rs.getInt("popularity"));
                user.setSize(rs.getString("size"));
                
                return user;
                 
            } else {
            
                return null;
            
            }
                    
            
        } catch (SQLException ex) {
            
            return null;
                        
        }
    
    }
    
    public boolean update(User user) {
    
        try {
            Connect();
            
            st = conn.prepareStatement("UPDATE GAMES SET NAME = ?, DEVELOPER = ?, LAUNCHDATE = ?, SYNOPSIS = ?, VALUE = ?, POPULARITY = ?, SIZE = ?");
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

    
}
