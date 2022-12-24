package Udemy;

public class Date {

    // 01 / 01 / 1970 for default date

    // Day / Month / Year

    String Day;
    String Month;
    String Year;


    Date(String day, String month, String year){
        Day = day;
        Month = month;
        Year = year;
    }

    Date(){
        Day = "01";
        Month = "01";
        Year = "1970";

    }

    String FormatDate (){
        return Day + " / " + Month + " / " + Year;
    }

    void Format(){
        System.out.println(FormatDate());
    }


}
