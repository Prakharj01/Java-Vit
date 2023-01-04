import java.util.Scanner;

public class a33_exception{

    public static void main(String[] args){
        int marks[]=new int [3];
        marks[0]=35;
        marks[1]=80;
        marks[2]=20;
        System.out.println("The maximum index is 2.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array index");
        int index= sc.nextInt();

        System.out.println("Enter the number you want to divide the value with: ");
        int number=sc.nextInt();

        try{
            System.out.println("The value at array index "+index+" is "+ marks[index]);
            System.out.println("The value after dividing is "+ marks[index]/number);
        }
        catch(ArithmeticException e){
            System.out.println("Some error occured. The value of divisor is zero.");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Some error occured. INDEX OUT OF BOUND");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some unknown error occured.");
            System.out.println(e);
        }
        sc.close();
        }
        }


