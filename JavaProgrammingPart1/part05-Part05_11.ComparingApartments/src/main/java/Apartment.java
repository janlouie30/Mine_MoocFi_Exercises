
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int firstPrice = this.pricePerSquare * this.squares;
        int comparedPrice = compared.pricePerSquare * compared.squares;

        if (firstPrice > comparedPrice) {
            return firstPrice - comparedPrice;
        } else {
            return comparedPrice - firstPrice;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int firstPrice = this.rooms * (this.pricePerSquare * this.squares);
        int secondPrice = compared.rooms * (compared.pricePerSquare * compared.squares);
        if (secondPrice < firstPrice) {
            return true;
        }
        return false;
    }
}
