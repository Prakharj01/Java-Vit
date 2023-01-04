
import java.util.Calendar;
public class a51_calendar{
    public static void main(String[] args){

        Calendar c1=Calendar.getInstance();
        
        int max = c1.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum days of a week: "+max);
        Calendar calendar = Calendar.getInstance();
          
        int min = calendar.getMinimum(Calendar.DAY_OF_WEEK);
        System.out.println("Minimum number of days in week: " + min);
          
        min = calendar.getMinimum(Calendar.WEEK_OF_YEAR);
        System.out.println("Minimum number of weeks in year: " + min);

        String monthstring[]={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};

        System.out.print("\nDATE- \t");
        System.out.print(c1.get(Calendar.DATE));
        System.out.print("-"+c1.get(Calendar.MONTH));
        System.out.print("-"+c1.get(Calendar.YEAR));
        
        System.out.print("\nDate in another format-");
        System.out.print(monthstring[c1.get(Calendar.MONTH)]);
        System.out.print(" "+c1.get(Calendar.DATE));
        System.out.print(", "+c1.get(Calendar.YEAR));
        

        int a=Calendar.HOUR;
        int b=Calendar.MINUTE;
        int c=Calendar.SECOND;
        System.out.print("\nTime-\t");
        System.out.print(c1.get(a));
        System.out.print(":"+c1.get(b));
        System.out.print(":"+c1.get(c));

        System.out.println("\nUpdating the date and time ");
        
        Calendar c2=Calendar.getInstance();

        c2.set(Calendar.DATE,01);
        c2.set(Calendar.MONTH,06);
        c2.set(Calendar.YEAR,2001);

        System.out.print("DATE- \t");
        System.out.print(c2.get(Calendar.DATE));
        System.out.print("-"+c2.get(Calendar.MONTH));
        System.out.print("-"+c2.get(Calendar.YEAR));

        c2.set(Calendar.HOUR,18);
        c2.set(Calendar.MINUTE,10);
        c2.set(Calendar.SECOND,30);

        System.out.print("\nTime-\t");
        System.out.print(c2.get(a));
        System.out.print(":"+c2.get(b));
        System.out.print(":"+c2.get(c));
        

        System.out.println("\n\nAdding date and time to the object: ");
        System.out.println("15 days before: ");
        c2.add(Calendar.DATE,-15);

        System.out.print("DATE- \t");
        System.out.print(c2.get(Calendar.DATE));
        System.out.print("-"+c2.get(Calendar.MONTH));
        System.out.print("-"+c2.get(Calendar.YEAR));

        c2.add(Calendar.MONTH,-3);
        System.out.print("\n");
        System.out.print(c2.get(Calendar.DATE));
        System.out.print("-"+c2.get(Calendar.MONTH));
        System.out.print("-"+c2.get(Calendar.YEAR));


        
        
    }
}