import java.util.Scanner;

public class a06_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = new String("Harry");
        String name2 = "Harry";
        System.out.print("The name is: ");
        System.out.print(name2);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f\n", a, b);
        System.out.format("The value of a is %d and value of b is %f\n", a, b);
        System.out.println("Enter a string: ");
       String st = sc.next();
       System.out.println(st);
        
       char ch[]={'h','e','l','l','o'};
       String st4=new String(ch);

       System.out.println("The string is "+st4);


       StringBuffer sb = new StringBuffer("Hello");
       System.out.println("buffer before = " + sb);
       System.out.println("charAt(1) before = " + sb.charAt(1));
       sb.setCharAt(1, 'i');
       sb.setLength(2);
       System.out.println("buffer after = " + sb);
       System.out.println("charAt(1) after = " + sb.charAt(1));
       System.out.println("buffer = " + sb);
       System.out.println("length = " + sb.length());
       System.out.println("capacity = " + sb.capacity());
       
       StringBuffer sb3=new StringBuffer("Hello");
       String sb2="yo baby";
        sb3.insert(2,'p');
        System.out.println("the string is "+sb3);
        sb3.insert(2,sb2);
        System.out.println("the string is "+sb3);

        System.out.println("Changing the whole string");
    StringBuffer sb4 = new StringBuffer("I Java!");
	sb4.insert(0, "like ");
    sb4.setLength(4);
	System.out.println(sb4);
       
    }
}