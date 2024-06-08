public class Organism implements Movable {

    private int posX;
    private int posY;

    public Organism(int x, int y) {
        posX = x;
        posY = y;
    }

    @Override
    public String toString() {
        return "x: " + posX + "; y: " + posY;
    }

    @Override
    public void move(int dx, int dy) {
        posX += dx;
        posY += dy;
    }
    
}
