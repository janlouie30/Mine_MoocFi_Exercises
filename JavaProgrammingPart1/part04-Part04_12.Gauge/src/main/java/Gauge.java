public class Gauge {

    private int value;

    public Gauge() {
        this.value = 0;
    }

    public void increase() {
        if (this.value < 5) {
            this.value++;
        }
    }

    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }

    public int value() {
        return this.value;
    }

    public boolean full() {
        boolean isItFive;
        if (this.value == 5) {
            return isItFive = true;
        } else {
            return isItFive = false;
        }
    }
}
