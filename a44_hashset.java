import java.util.HashSet;


public class a44_hashset {
    public static void main(String[] args) {

        HashSet<Integer> myHashSet=new HashSet<>();

        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11); // This element will be ignored

        System.out.println(myHashSet);


    }   
}
