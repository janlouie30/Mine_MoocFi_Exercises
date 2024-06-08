

public class Main {

    public static void main(String[] args) {
        // You can test your program here
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        System.out.println("DEBUG: " + coffeeBox);
        coffeeBox.add(new Item("Pirkka", 5));
        System.out.println("DEBUG: " + coffeeBox);
        coffeeBox.add(new Item("Kopi Luwak", 5));
        System.out.println("DEBUG: " + coffeeBox);
        coffeeBox.add(new Item("Kopiko", 0));
        System.out.println("DEBUG: " + coffeeBox);

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));
        System.out.println(coffeeBox.isInBox(new Item("Kopiko")));

        System.out.println();

        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo",5));
        System.out.println("DEBUG: " + box);
        box.add(new Item("Pirkka",5));
        System.out.println("DEBUG: " + box);

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));

        System.out.println();

        MisplacingBox misbox = new MisplacingBox();
        misbox.add(new Item("Saludo",5));
        System.out.println("DEBUG: " + misbox);
        misbox.add(new Item("Pirkka",5));
        System.out.println("DEBUG: " + misbox);

        System.out.println(misbox.isInBox(new Item("Saludo")));
        System.out.println(misbox.isInBox(new Item("Pirkka")));
    }
}
