import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> currentList;

    public TodoList() {
        currentList = new ArrayList<>();
    }

    public void add(String task) {
        currentList.add(task);
    }

    public void print() {
        for (String x : currentList) {
            System.out.println((currentList.indexOf(x) + 1) + ": " + x);
        }
    }

    public void remove(int number) {
        if (!currentList.isEmpty()) {
            if (number == 0) {
                currentList.remove(number);
            } else if (number > 0) {
                currentList.remove(number - 1);
            } else {
                System.out.println("Use only above 1!");
            }
        } else {
            System.out.println("The to do list is empty! Add a task!");
        }
    }
}
