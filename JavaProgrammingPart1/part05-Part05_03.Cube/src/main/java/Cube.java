public class Cube {
    private int edgeLength;
    private int volume;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
        this.volume = 0;
    }

    public int volume() {
        return this.volume = this.edgeLength * this.edgeLength * this.edgeLength;
    }

    @Override
    public String toString() {
        return "The length of the edge is " + edgeLength + " and the volume " + volume();
    }
}
