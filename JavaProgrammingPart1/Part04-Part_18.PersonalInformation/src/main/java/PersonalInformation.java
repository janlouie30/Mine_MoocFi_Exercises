public class PersonalInformation {
    
    private String first, last, id;
    
    public PersonalInformation(String first, String last, String id) {
        this.first = first;
        this.last = last;
        this.id = id;
    }
    
    @Override
    public String toString() {
        return this.first + " " + this.last;
    }
    
}
