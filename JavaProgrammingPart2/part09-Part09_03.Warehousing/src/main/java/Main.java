

public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);
        juice.printAnalysis();

        System.out.println();

        ProductWarehouseWithHistory pwh = new ProductWarehouseWithHistory("coffee",10,5);
        pwh.addToWarehouse(5);
        pwh.takeFromWarehouse(7);
        System.out.println(pwh.getBalance());
    }

}
