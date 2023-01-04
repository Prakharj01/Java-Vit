
import java.util.Calendar;

public class a46_calendar{
    public static void main(String[] args){
    Calendar a =Calendar.getInstance();

    System.out.println(a.getCalendarType());
    System.out.println(a.getTimeZone());



    Calendar d =Calendar.getInstance();

    System.out.println(d.getCalendarType());
    System.out.println(d.getTimeZone().getID());



    }
}


/*
Calendar class is an abstract class. Therefore we cannot make any instance of the class.
But the calendar class has a static method which gives us a instance of the class getInstance()

*/