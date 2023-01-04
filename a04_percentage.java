import java.util.Scanner;
public class a04_percentage{

    public static void main(String []args){
        Scanner s=new Scanner(System.in);

        int num1,num2,num3,sum;
        System.out.println("Enter marks of subject 1: ");
        num1=s.nextInt();
        System.out.println("Enter marks of subject 2: ");
        num2=s.nextInt();
        System.out.println("Enter marks of subject 3: ");
        num3=s.nextInt();

        sum=num1+num2+num3;
        float avg=sum/3;

        System.out.print("The percentage is " + avg);

    }
}