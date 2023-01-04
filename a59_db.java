
/*
STEPS
1. import the package - 
2. load and register the driver
        a.load      - mysql driver, connector
        b. register
    
3. establish the connection
4. create the statement
    a. normal statement
    b. prepare statement
    c. collable statement
    
5. execute the query
6. process results
7. close
*/
import java.lang.*;
import java.time.Period;
public class a59_db{
    public static void main(String []args){

        String s="-25";
        String s2="25.32";
        int a=Integer.parseInt(s);
        double l=Double.parseDouble(s2);
        String age="P18Y14M5D";
        Period p = Period.parse(age);
        System.out.println(a);
        System.out.println(l);
        System.out.println(p.getYears()+" Years "+p.getMonths()+" Month "+p.getDays()+" Date ");


        
    }
}