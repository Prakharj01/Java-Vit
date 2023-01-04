import java.util.Scanner;

public class a02_userinput{
    public static void main(String[] args){
        Scanner readinput= new Scanner(System.in);

        System.out.println("Taking input from the user");
        System.out.println("Taking input 1 from the user: ");
        int a=readinput.nextInt();
        System.out.println("Taking input 2 from the user: ");
        int b=readinput.nextInt();
        int sum= a+b;
        
        System.out.print("The sum is: " );
        System.out.println(sum);

        //Identifying whether a literal is interger or not
        System.out.println("Enter number to check whether its a integer");
        boolean b1=readinput.hasNextInt();
        String str= readinput.next();
        System.out.println(b1);
        
        System.out.println("Enter the string:");
        str= readinput.next();
        System.out.println(str);

        readinput.close();
    }
}

/*
String str=readinput.next();
reads only a word (till a space is encountered);

String str=readinput.nextLine();
reads a whole string till you press enter


*/