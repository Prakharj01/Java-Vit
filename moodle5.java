import java.util.*;

class Donor{
    public String name=new String();
    public int age;
    public String address=new String();
    public String cnumber=new String();
    public String bgroup=new String();
    public Date d1;


Donor(String n,int a,String ad, String cnum,String bg, Date d){
    name=n;
    age=a;
    ad=address;
    cnumber=cnum;
    bgroup=bg;
    d1=d;
}
}
public class moodle5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of donor in Vellore: ");
        int n=sc.nextInt();
        Donor d[]=new Donor[n];
        String n1=new String();
        for(int i=0;i<n;i++){

            System.out.println("Enter name of donor "+i+1+ ": ");
            n1=sc.next();
            System.out.println("Enter age of donor "+i+1+ ": ");
            a=sc.nextInt();
            System.out.println("Enter address of donor "+i+1+ ": ");
            ad=sc.next();
            System.out.println("Enter contact numbe of donor "+i+1+": ");
            cnum=sc.next();
            System.out.println("Enter blood group of donor "+i+1+ ": ");
            bg=sc.next();
        
        }

    sc.close();
    }
}