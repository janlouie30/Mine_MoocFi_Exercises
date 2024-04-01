
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money a = new Money(10, 0);
        Money b = new Money(3, 0);
        Money c = new Money(5, 0);

        System.out.println(a.lessThan(b)); // false
        System.out.println(b.lessThan(c)); // true

        System.out.println();

        Money firstMoneyObject = new Money(10, 50);
        Money secondMoneyObjecy = new Money(2, 0);
        Money tennerMinusTwoEuros = firstMoneyObject.minus(secondMoneyObjecy);
        System.out.println(tennerMinusTwoEuros.euros());
    }
}
