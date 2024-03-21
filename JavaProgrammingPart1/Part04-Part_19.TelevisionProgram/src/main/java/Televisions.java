public class Televisions {
    
    private String name;
    private int duration;
    
    public Televisions(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
    
    @Override
    public String toString() {
        if(duration > 0) {
            return this.name + ", " + this.duration + " minutes";
        } else {
            return this.name + ", " + this.duration + " minute";
        }
    }
    
    public int getTime() {
        return this.duration;
    }
    
}
