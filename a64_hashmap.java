import java.util.*;
class a64_hashmap{
 public static void main(String args[]){ 
 	Map<Integer,String> map=new HashMap<Integer,String>(); 
	map.put(100,"A"); 
    map.put(102,"R"); 
 	map.put(101,"V"); 
 	//Elements can traverse in any order 
 	 for(Map.Entry m:map.entrySet()){ 
 		 System.out.println(m.getKey()+" "+m.getValue()); 
 	 } 
 } 
}