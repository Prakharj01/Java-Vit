

import java.util.*;
public class a41_arraylist{
public static void main(String[] args){

    ArrayList<Integer> l1=new ArrayList<Integer>();
    ArrayList<Integer> l2=new ArrayList<Integer>(8); //Initial capacity is 8
    l2.add(14);
    l2.add(15);
    l2.add(16);
    l2.add(17);

    l1.add(6);//adds the element in the last
    l1.add(5);
    l1.add(8);
    l1.add(34);
    l1.add(67);
    l1.add(22);

    l1.add(17);

    l1.add(3,99); //adds at specified position
    l1.addAll(3,l2);

        for(int i=0; i<l1.size();i++){
    System.out.print(l1.get(i)+ ",");        
}


System.out.println(l1.contains(34));
System.out.println(l1.indexOf(67));
System.out.println(l1.lastIndexOf(17));
l1.clear();


}
}