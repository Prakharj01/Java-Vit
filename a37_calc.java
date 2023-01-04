import java.util.Scanner;
class Exception1 extends Exception{

    @Override

    public String toString() {
        System.out.println("Input greater than 100000 not allowed");
        return "Input greater";
    }
}
class operation{

    public int addition(int a,int b){
        return a+b;
    }
    public int multiplication(int a,int b){
        return a*b;
    }

    public int division(int a,int b){
        return a/b;
    }

    public int substractions(int a,int b){
        return a-b;
    }

}

public class a37_calc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        operation o1=new operation();
        int choice;
        int num1=0,num2=0;
        int input=1;
        try{
        System.out.println("Enter number 1: ");
        num1=sc.nextInt();
        System.out.println("Enter number 2: ");
        num2=sc.nextInt();
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Invalid input exception");
            input=0;
        }
        
        if(num1>100000 || num2>100000){
            try{
            throw new Exception1();
        }
    
        catch(Exception1 ex1){
            ex1.toString();
            input=0;
        }
    }
        if (input==1){
        System.out.println("Enter the operation: Addition: 1\n Substraction: 2\nMultiplication: \nDivision: 4\n");
        choice=sc.nextInt();

        switch(choice){
            case 1:
            o1.addition(num1,num2);
            break;

            case 2:
            o1.substractions(num1,num2);
            break;
            
            case 3:
            if(num1>7000 || num2>7000){
                try{
                    throw new Exception1();
                }
                catch(Exception ex2){
                    System.out.println("Multiplication above 7000 not possible");
                }
            }
            else{
            o1.multiplication(num1,num2);
        }
            break;

            case 4:
            
            try{

                o1.division(num1,num2);
            }
            catch(ArithmeticException e){
                System.out.println("The divisor cant be zero");
            }
            break;


        }

    }
    sc.close();
}
}
/* You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
        */