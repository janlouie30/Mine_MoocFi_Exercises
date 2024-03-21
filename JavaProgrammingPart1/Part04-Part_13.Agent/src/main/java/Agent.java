public class Agent {
    
    private String first, last;
    
    public Agent(String firstName, String lastName) {
        this.first = firstName;
        this.last = lastName;
    }
    
    public String toString() {
        return "My name is " + this.last + ", " + this.first + " " + this.last;
    }
}
