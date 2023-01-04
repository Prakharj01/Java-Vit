

public class a31_exception{
    public static void main(String[] args){
        int a=500;
        int b=0;
        //WITHOUT TRY AND CATCH
            // int c=a/b;
            // System.out.println("The value of c is "+ c);

        //     //WITH TRY AND CATCH
        try{
            int c=a/b;
            System.out.println("The value of c is "+ c);
        }
        catch(Exception e){
            System.out.println("The divide is not possible. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}


/*
Syntax error-
When complex finds something wrong with our program, it throws a syntax error

*/