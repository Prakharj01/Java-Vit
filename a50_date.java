// JAVA SCHILDT 7 BOOK PAGE 510
import java.util.Calendar;
import java.util.Date;
public class a50_date{

    public static void main(String[] args){

        Date d1=new Date();
        Date d2=new Date(4000);
        Date d3=new Date(2010,0,24);
        Date d4=new Date(2010,11,24);
        Date d5=new Date(2008,5,13,14,56,30);
        System.out.println(d1); 
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d1.after(d2));
        System.out.println(d2.after(d1));
        
        System.out.println(d1.before(d2));
        System.out.println(d2.before(d1));
        int c = d1.compareTo(d2);
        
        System.out.println(c);
        System.out.println(d1.getTime());
        System.out.println(d2.hashCode());
        
        d2.setTime(40000);
        System.out.println(d2);

        System.out.println(d1.toString());
        
        



    }
}
