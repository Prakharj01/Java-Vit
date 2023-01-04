//SCHILDT 7 519 JAVA BOOK
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
public class a52_gregory{
    public static void main(String[] args){

        //The month 0 is January
        //Syntax: new Gregorian Calendar (YEAR,MONTH,DATE)
        //
        GregorianCalendar g=new GregorianCalendar(2020,01,21,10,20,50);
        GregorianCalendar g2=new GregorianCalendar(2021,05,14);
        GregorianCalendar g3=new GregorianCalendar();
        g.add(Calendar.MONTH,1);
        System.out.println(g.getTime());
        
        
        System.out.println(g.get(Calendar.DATE));
        System.out.println(g.get(Calendar.AM_PM));
        System.out.print("Gregorian date: "+ g.getTime());
        
        
        g2.add(Calendar.MONTH,1);
        System.out.println(g2.get(Calendar.DATE));
        System.out.println("Gregorian date: "+ g2.getTime());

        System.out.println(g3.get(Calendar.MONTH));
        g3.clear();
        System.out.println("Month: "+g3.get(Calendar.MONTH));

        
        Date d=new Date();
        d=g2.getTime();
        System.out.println(d);

        GregorianCalendar g4=new GregorianCalendar();

        g4.set(2020,11,24);
        System.out.print(g4.get(Calendar.DATE));
        System.out.print("-"+g4.get(Calendar.MONTH));
        System.out.print("-"+g4.get(Calendar.YEAR));
        
        g5.set(2020,11,24);

        

    }
}