public class Book {
    private String author;
    private String name;
    private int pages;

    public Book(String inputAuthor, String inputName, int inputPages) {
        this.author = inputAuthor;
        this.name = inputName;
        this.pages = inputPages;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getPages() {
        return this.pages;
    }

    public String toString() {
        if (pages == 1) {
            return this.author + ", " + this.name + ", " + this.pages + " page";
        }

        return this.author + ", " + this.name + ", " + this.pages + " pages";
    }
}
