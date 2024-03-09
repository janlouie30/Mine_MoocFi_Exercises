
public class Greatest {
    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int temp = -9999;
        int[] array = {number1, number2, number3};
        
        for(int x = 0; x < array.length; x++) {
            if(array[x] >= temp) {
                temp = array[x];
                System.out.println(array[x] + " " + temp);
            }
        }
        
        return temp;
    }

    public static void main(String[] args) {
        int result = greatest(-5, -8, -4);
        System.out.println("Greatest: " + result);
    }
}
