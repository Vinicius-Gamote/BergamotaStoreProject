package persistence;

public class Game {
    
    private String name;
    private String developer;
    private int launchDate;
    private String synopsis;
    private double value;
    private int popularity;
    private String size;
    
    
    public String getName() {
        
        return name;
        
    }
    
    public void setName(String name) {
    
        this.name = name;
    
    }
    
    public String getDeveloper() {
    
        return developer;
    
    }
    
    public void setDeveloper(String developer) {
    
        this.developer = developer;
    
    }
    
    public int getLaunchDate() {
    
        return launchDate;
    
    }
    
    public void setLaunchDate(int launchDate) {
    
        this.launchDate = launchDate;
    
    }
    
    public String getSynopsis() {
    
        return synopsis;
    
    }
    
    public void setSynopsis(String synopsis) {
    
        this.synopsis = synopsis;
    
    }
    
    public double getValue() {
    
        return value;
    
    }
    
    public void setValue(double value) {
    
        this.value = value;
    
    }
    
    public int getPopularity() {
    
        return popularity;
    
    }
    
    public void setPopularity(int popularity) {
    
        this.popularity = popularity;
    
    }
    
    public String getSize() {
    
        return size;
    
    }
    
    public void setSize(String size) {
    
        this.size = size;
    
    }
    
}

