import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> daHerd;

    public Herd() {
        daHerd = new ArrayList<>();
    }

    @Override
    public String toString() {
        String result = "";
        for(Movable x : daHerd) {
            if(x == daHerd.get(daHerd.size()-1)) {
                result += x.toString();
            } else {
                result += x.toString() + "\n";
            }
        }
        return result;
    }

    public void addToHerd(Movable movable) {
        daHerd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable x : daHerd) {
            x.move(dx, dy);
        }
    }
}