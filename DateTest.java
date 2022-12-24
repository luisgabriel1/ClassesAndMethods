package Udemy;
public class DateTest {
    public static void main(String[] args) {

        Date d1 = new Date("22", "02", "2005");

        var d2 = new Date();

        String FormattingDate1 = d1.FormatDate();
        String FormattingDate2 = d2.FormatDate();

        System.out.printf("My birth date is: %s\nMy trip in London is on: %s\n\n", FormattingDate1, FormattingDate2);

        System.out.println(d1.FormatDate());
        System.out.println(d2.FormatDate() + "\n\n");

        d1.Format();
        d2.Format();
    }
}
