public class a05_bitwise{
    public static void main(String [] args){

             int a = 60;	/* 60 = 0011 1100 */
             int b = 13;	/* 13 = 0000 1101 */
             int c = 0;

            System.out.println("Value of a is "+a);
            System.out.println("Value of b is "+b);
            System.out.println("Value of c is "+c);
             c = a & b;        
             System.out.println("a & b = " + c );
       
             c = a | b;        
             System.out.println("a | b = " + c );
       
             c = a ^ b; 
            System.out.println("a ^ b = " + c );
             c = ~a; 
             System.out.println("~a = " + c );

      c = a << 2; 
      System.out.println("a << 2 = " + c );
      
            c = a >> 2; 
      System.out.println("a >> 2  = " + c );
      
      
      
          
      
    }
}