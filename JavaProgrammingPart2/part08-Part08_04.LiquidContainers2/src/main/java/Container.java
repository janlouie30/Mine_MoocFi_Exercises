public class Container {

    private int currentAmount;

    public Container() {
        currentAmount = 0;
    }

    public int contains() {
        return currentAmount;
    }

    public void add(int amount) {
        if (amount > 0) {
            int tempAmount = this.currentAmount + amount;
            if (tempAmount < 100) {
                this.currentAmount += amount;
            } else {
                this.currentAmount = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            int tempAmount = this.currentAmount - amount;
            if (tempAmount > 0) {
                this.currentAmount -= amount;
            } else {
                this.currentAmount = 0;
            }
        }
    }

    public String toString() {
        return currentAmount + "/100";
    }

}
