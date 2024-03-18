public class Items {
    
    private String name;
    private String dateTime;
    
    public Items(String inputtedName, String dateTime) {
        this.name = inputtedName;
        this.dateTime = dateTime;
    }
    
    @Override
    public String toString() {
        return this.name + " (created at: " + dateTime + ")";
    }
    
}
