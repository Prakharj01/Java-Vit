
import java.util.*;
class a63_treeset {
    public static void main(String args[]) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("C");
        ts.add("A");
        ts.add("B"); 
        ts.add("E");
        ts.add("F"); 
        ts.add("D");
        System.out.println(ts);
        System.out.println("First element : " + ts.first());
        System.out.println("Last element : " + ts.last());
        String n="D";
        System.out.println("Element just greater than "  + n + " : " + ts.higher(n));
        System.out.println("Element just lower than "  + n + " : " + ts.lower(n));
        System.out.println("Head Set: "+ts.headSet(n));  
        System.out.println("Head Set: "+ts.tailSet(n)); 


        

        }
    
    }