
public class Main {

    public static void main(String[] args) {
        // test your program here!

        SimpleDate date2 = new SimpleDate(30, 12, 2015);
        System.out.println();
        System.out.println("The date: " + date2);

        date2.advance();
        System.out.println("After one day: " + date2);

        date2.advance(45);
        System.out.println("After 45 days: " + date2);

        System.out.println();

        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);

        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);

            week = week + 1;
        }

        System.out.println();
        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
        // System.out.println("Try " + date.afterNumberOfDays(790));
        System.out.println();
        SimpleDate now = new SimpleDate(13, 2, 2015);
        SimpleDate afterOneWeek = now;
        afterOneWeek.advance(7);

        System.out.println("Now: " + now);
        System.out.println("After one week: " + afterOneWeek);
    }
}
