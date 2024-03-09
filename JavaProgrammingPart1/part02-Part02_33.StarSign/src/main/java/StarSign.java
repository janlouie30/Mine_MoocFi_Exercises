
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(4, 2);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
        
    }

    public static void printStars(int number) {
        // first part of the exercise
        for(int x = 0;x < number; x++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        for(int x = 0;x < size; x++){
            System.out.print("*");
            for(int y = 1; y < size; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        for(int x = 0;x < height; x++){
            System.out.print("*");
            for(int y = 1; y < width; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        for(int x = 0;x < size; x++){
            System.out.print("*");
            for(int y = 0;y < x; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
