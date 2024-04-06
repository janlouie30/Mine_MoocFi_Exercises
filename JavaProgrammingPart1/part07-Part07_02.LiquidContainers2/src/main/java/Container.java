public class Container {

    private int containerLevel;

    public Container() {
        this.containerLevel = 0;
    }

    public int contains() {
        return this.containerLevel;
    }

    public void add(int amount) {
        if (amount > 0) { // amount must not be negative
            int tempAmount = this.containerLevel + amount; // temporary computation for container
            if (tempAmount < 100 && tempAmount > 0) { // the tempAmount has max of 100 and min of 0
                this.containerLevel += amount; // then container is added ny its given amount
            } else if (tempAmount >= 100) { // if tempAmount is greater than or equal to 100
                this.containerLevel = 100; // the container is 100
            }
        }
        System.out.println();
    }

    public void remove(int amount) {
        if (amount > 0) { // amount must not be negative
            int tempAmount = this.containerLevel - amount;
            if (tempAmount < 100 && tempAmount > 0) { // in between 100 to 0
                this.containerLevel -= amount;
            } else if (tempAmount <= 0) { // if tempAmount is less than or equal to 0
                this.containerLevel = 0; // the container is 0;
            }
        }
        System.out.println();
    }

    public String toString() {
        return this.containerLevel + "/100";
    }
}
