public class a07_StringMethods{

    public static void main(String[]args){

        String a="PrakHaR";
        String b=new String("  Just how you do it  ");

        int value=a.length();
        System.out.println("The length of string "+ a+" is: "+ value);

        String lstring=a.toLowerCase();
        System.out.println("The lower case of  "+ a+" is " + lstring );

        String trimming=b.trim();
        System.out.println("Trimming of "+b +" is: "+trimming);

        String str="Hey, how you doing?";
        String substr1=str.substring(5);
        String substr2=str.substring(1,7);

        System.out.println("The substring of "+str+" is substring1: " +substr1);
        System.out.println("substring2: "+substr2);

        String replaced=a.replace('a','e');
        System.out.println("After replacing a with e ");
        System.out.println("Original string: "+ a+" \nReplaced string: " + replaced);

        String replaced2=a.replace("akH","ebi");
        System.out.println("\n\nAfter replacing akh with ebi ");
        System.out.println("Original string: "+ a+" \nReplaced string: " + replaced2);
    
        int [] numbers = {10, 20, 30, 40, 50};
        System.out.println("For loop");
        for(int x : numbers ) {
           System.out.print( x );
           System.out.print(",");
        }
        System.out.println("\n");
           String [] names = {"James", "Larry", "Tom", "Lacy","20"};
      for( String namevar : names ) {
         System.out.print( namevar );
         System.out.print(",");

        }  
    }

}