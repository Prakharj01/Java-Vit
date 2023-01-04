
import java.util.*;
public class a47_gregorian{

    public static void main(String[] args){

        Calendar a =Calendar.getInstance();
        System.out.println(a.getTime());

        System.out.println(a.get(Calendar.DATE));
        System.out.println(a.get(Calendar.HOUR));
        System.out.println(a.get(Calendar.MINUTE));
        System.out.println(a.get(Calendar.SECOND));
        System.out.println(a.get(Calendar.HOUR_OF_DAY));
        


        GregorianCalendar g=new GregorianCalendar();
        System.out.println(g.isLeapYear(2019));
        System.out.println(g.isLeapYear(2000));


    
    }
}


/*
Gregoran calendar is a subclass of calendar

*/