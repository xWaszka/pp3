public class MyCalendar {
    static int year = 2023;
    static int month = 11;
    static int day = 4;

    static String myDate(){
        return (String.valueOf(year) + '-' + String.valueOf(month) + '-' + String.valueOf(day));
    }
    
    static int days() {
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        int days = 0;
        for (int i=0;i<month;i++){
            days+=monthDays[i];
        };
        return days+day;
    }
    static String monthName(){
    String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    return monthNames[month-1];
    }
}
