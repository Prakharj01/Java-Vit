
public class a03_operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a ;
        a=4;
        // int b = 6 % a; // Modulo Operator
        // 4.8%1.1 --> Returns Decimal Remainder

        // 2. Assignment Operators
        int b = 9;
        b *= 3;
        System.out.println(b);

        // 3. Comparison Operators
         System.out.println(64<6);

        // 4. Logical Operators
         System.out.println(64>5 && 64>98);
        System.out.println(64>5 || 64>98);

        // 5. Bitwise Operators
        System.out.println(2&3);


        int c=5;
        int d=7;

        int e=(d>c)?d:c;
        System.out.println("The greater number is "+d);

        String name = "James";

        // following will return true since name is type of String
        boolean result = name instanceof String;
        System.out.println( result );
  

        double d2 = 1100.54;  
        long l = (long)d2;  //explicit type casting required  
        int i = (int)l;	//explicit type casting required  
        byte b2=(byte)d2;
    
        System.out.println("Double value "+d2);
        System.out.println("Long value "+l);
        System.out.println("Int value "+i);
        System.out.println("byte value "+b2);

        byte b3 = 42; 
        char c1 = 'a';  
        short s = 1024; 
        int i1 = 50000;
        float f = 5.67f;
         double d3 = .1234;
         System.out.println("The ascii code of char c1 is "+(int)c1);
         System.out.println("The character is "+(char)s);

        double result2 = (f * b3) + (i1 / c1) - (d3 * s);
        System.out.println("result = " + result2);
        //        10
        //        11
        //        ----
        //        10

        

        
    }
}