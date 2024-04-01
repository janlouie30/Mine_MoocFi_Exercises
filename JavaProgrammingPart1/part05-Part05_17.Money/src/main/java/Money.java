
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros, this.cents);

        int totalEuros = this.euros() + addition.euros();
        int totalCents = this.cents() + addition.cents();

        newMoney = new Money(totalEuros, totalCents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        int thisTotal = this.euros() * 100 + this.cents();
        int comparedTotal = compared.euros() * 100 + compared.cents();

        if (thisTotal < comparedTotal) {
            return true;
        }

        return false;
    }

    public Money minus(Money decreaser) {
        Money newMoney = new Money(this.euros, this.cents);

        int thisTotal = this.euros() * 100 + this.cents();
        int decreaserTotal = decreaser.euros() * 100 + decreaser.cents();

        int difference = thisTotal - decreaserTotal;

        if (difference < 0) {
            difference = 0;
        }

        int diffEuros = difference / 100;
        int diffCents = difference % 100;

        if (diffCents < 0) {
            diffEuros -= 1;
            diffCents += 100;
        }

        newMoney = new Money(diffEuros, diffCents);

        return newMoney;
    }
}
