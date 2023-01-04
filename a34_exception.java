
import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }
    public String getMessage() {
        return "I am getMessage()";
    }
}
class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }
    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct";
    }
}
public class a34_exception{
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        sc.close();
        if (a<9){
            try{
                 throw new MyException();
                //throw new ArithmeticException("This is an exception message. ");
            }
            catch (MyException e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }

        try{
            int c=34/0;
            System.out.println(c);

        }
        catch(Exception f){
            String stre=f.toString();
            System.out.println("\n"+stre);
            System.out.println(f.getMessage());
        }
    }
}
