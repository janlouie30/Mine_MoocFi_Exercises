
public class AdvancedAstrology {
    
    public static void printStars(int number) {
        // part 1 of the exercise
        for(int x = 0;x < number; x++) {
            System.out.print("*");
        }
    }

    public static void printSpaces(int number) {
        for(int x = 0; x < number; x++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for(int a = 0; a < size; a++) {
            printSpaces(size - a);
            printStars(a + 1);
            System.out.println("");
        }
    }

    public static void christmasTree(int height) {
        for(int x = 0; x < height; x++) {
            printSpaces(height - x); // This is to print all the spaces in the top 
                                    //  to bottom until the comparison is equal to 
                                    //  0 (ei. x < height - x >> 10 < 10 - 10) where 
                                    //  it will end up as false and proceed to next statement
            printStars(2 * x + 1);
            System.out.println("");
        }
        for(int y = 0;y < 2; y++) {
            printSpaces(height-1);
            printStars(3);
            System.out.println("");                  
        }
        /*
        for(int y = 0;y < 2; y++) {                 --> HEIGHT OF XMAS TREE OR THE ROW
            for(int z = 0; z < (height-1); z++) {   --> PRINT THE SPACES BY HEIGHT (EI. height - 1)
                System.out.print(" ");
            }
            for(int a = 0; a < 3; a++) {            --> PRINT THE STARS
                System.out.print("*");
            }
            System.out.println("");                 --> LINE BREAK
        }
        */
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
        
    }
}
