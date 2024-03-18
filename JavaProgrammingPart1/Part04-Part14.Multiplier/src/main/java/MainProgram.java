public class MainProgram {

    public static void main(String[] args) {
        Multiplier multiplyByThree = new Multiplier(3);
        
        System.out.println("MultiplyByThree.multiply(2)" + multiplyByThree.multiply(2));
        
        Multiplier multiplyByFour = new Multiplier(4);
        System.out.println("MultiplyByFour.multiply(2)" + multiplyByFour.multiply(2));
        System.out.println("MultiplyByThree.multiply(1)" + multiplyByThree.multiply(1));
        System.out.println("MultiplyByFour.multiply(1)" + multiplyByFour.multiply(1));
    }
}
