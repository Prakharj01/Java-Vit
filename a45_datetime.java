
import java.util.Date;

public class a45_datetime { 
    public static void main(String[] args) {

        Date d=new Date();

        System.out.println(System.currentTimeMillis()); //time after 1970

        System.out.println("Maximum value of Long is " +Long.MAX_VALUE);
        System.out.println("The date is "+d );
        System.out.println("The year is "+ d.getYear());
    }
    
}
