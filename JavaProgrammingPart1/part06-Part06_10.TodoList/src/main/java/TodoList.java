import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        for (int x = 0; x < tasks.size(); x++) {
            System.out.println((x + 1) + ": " + tasks.get(x));
        }
    }

    public void remove(int number) {
        this.tasks.remove(number - 1);
    }
}
