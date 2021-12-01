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
    
    public boolean Connect() {
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/access", "root", "pokemon45");
            
            return true;
            
        } catch (ClassNotFoundException | SQLException ex) {
            
            return false;
        
        }
    
    }
    
    public boolean save(Game game) {
    
        try {
            
            Connect();
            
            st = conn.prepareStatement("INSERT INTO GAMES VALUES (?, ?, ?, ?, ?, ?, ?)");
            
            st.setString(1, game.getName());
            st.setString(2, game.getDeveloper());
            st.setDouble(3, game.getLaunchDate());
            st.setString(4, game.getSynopsis());
            st.setDouble(5, game.getValue());
            st.setInt(6, game.getPopularity());
            st.setString(7, game.getSize());
            st.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            
            return false;
            
        }
    
    }
    
    public boolean delete(Game game) {
        
        try {
            
            Connect();
            
            st = conn.prepareStatement("DELETE FROM GAMES WHERE NAME = ?");
            st.setString(1, game.getName());
            st.executeUpdate();
                        
            return true;
            
        } catch (SQLException ex) {
            
             return false;
            
        }
        
    }
    
    public Game consult(String name) {
    
        try {
            
            Connect();
            
            st = conn.prepareStatement("SELECT * FROM GAMES WHERE NAME = ?");
            st.setString(1, name);
            rs = st.executeQuery();
            
            if(rs.next()) {
            
                Game game;
                game = new Game();
                game.setName(rs.getString("name"));
                game.setDeveloper(rs.getString("developer"));
                game.setLaunchDate(rs.getDouble("launchDate"));
                game.setSynopsis(rs.getString("synopsis"));
                game.setValue(rs.getDouble("value"));
                game.setPopularity(rs.getInt("popularity"));
                game.setSize(rs.getString("size"));
                
                return game;
                 
            } else {
            
                return null;
            
            }
                    
            
        } catch (SQLException ex) {
            
            return null;
                        
        }
    
    }
    
    public boolean update(Game game) {
    
        try {
            
            Connect();
            
            st = conn.prepareStatement("UPDATE GAMES SET NAME = ?, DEVELOPER = ?, LAUNCHDATE = ?, SYNOPSIS = ?, VALUE = ?, POPULARITY = ?, SIZE = ?");
            st.setString(1, game.getName());
            st.setString(2, game.getDeveloper());
            st.setDouble(3, game.getLaunchDate());
            st.setString(4, game.getSynopsis());
            st.setDouble(5, game.getValue());
            st.setInt(6, game.getPopularity());
            st.setString(7, game.getSize());            
            st.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {            
            
                return false;
            
        }
        
    
    }

    
}
