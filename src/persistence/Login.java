package persistence;

public class Login {
    
    private String user;
    private String password;
    private String position;
    
    public String getUser () {
        
        return user;
        
    }
    
    public void setUser (String user) {
    
        this.user = user;
    
    }
    
    public String getPassword () {
    
        return password;
    
    }
    
    public void setPassword (String password) {
    
        this.password = password;
        
    }
    
    public String getPosition () {
    
        return position;
        
    }
    
    public void setPosition (String position) {
        
        this.position = position;
    
    }
    
}
