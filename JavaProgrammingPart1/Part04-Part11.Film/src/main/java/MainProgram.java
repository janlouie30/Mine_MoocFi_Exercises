import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Film chipmunks = new Film("Alvin and the Chipmunks: The Squealkquel", 0);
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("How old are you?");
        int age = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        
        if(age >= chipmunks.ageRating()) {
            System.out.println("You may watch the film " + chipmunks.name());
        } else {
            System.out.println("You may not watch the film " + chipmunks.name());
        }
    }
}
