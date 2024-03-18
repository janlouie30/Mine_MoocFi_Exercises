public class Books {
    
    private String name, pages, year;
    
    public Books(String name, String pages, String year) {
        this.name = name;
        this.pages = pages;
        this.year = year;
    }
    
    @Override
    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.year;
    }
    
    public String getNames() {
        return this.name;
    }
    
    public String getPages() {
        return this.pages;
    }
    
    public String getYear() {
        return this.year;
    }
}
