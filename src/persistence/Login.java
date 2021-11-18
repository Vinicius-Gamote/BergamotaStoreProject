package persistence;

public class Login {
    
    private String user;
    private String password;
    private String confirmPassword;
    
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
    
    public String getConfirmPassword () {
    
        return confirmPassword;
    
    }
    
    public void setConfirmPassword(String confirmPassword) {
    
        this.confirmPassword = confirmPassword;
        
    }
    
}
