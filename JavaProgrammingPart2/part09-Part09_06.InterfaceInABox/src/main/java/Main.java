
public class Main {

    public static void main(String[] args) {
        // test your classes here

        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 10);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Improvement", 0.7);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println();

        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);

        System.out.println();
        Box box = new Box(10);

        box.add(book1);
        box.add(book2);
        box.add(book3);
        box.add(cd1);
        box.add(cd2);
        box.add(cd3);

        System.out.println(box);
        System.out.println(box.weight());
    }

}
