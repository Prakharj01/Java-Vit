public class a08_problem2{

    public static void main(String[] args){
        String str="Ross Geller";
        String lstr=str.toLowerCase();
        System.out.println(lstr);

        String replacestr=str.replace(' ','_');
        System.out.println(replacestr);

        String letter="Dear <name> thanks a lot";
        String replaceletter=letter.replace("<name>",str);
        System.out.println(replaceletter);
        System.out.println("\nMethod-2\nDear "+str +", Thanks a lot");

        
        String myString = "This string contains  double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        System.out.println("\"Dear Harry, its a pleasure meeting you \"");



    }
}
/*
Write a Java program to convert a string to lowercase.
Write a Java program to replace spaces with underscores.
Write a Java program to fill in a letter template which looks like below:
// letter = “Dear <|name|>, Thanks a lot”

// Replace <|name|> with a string (some name)
Write a Java program to detect double and triple spaces in a string.
Write a program to format the following letter using escape sequence characters.
Letter = “Dear Harry, This Java Course is nice. Thanks”

*/