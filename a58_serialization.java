import java.io.*;
import java.util.*;

class Student implements Serializable {
    int id;  
 String name;  
 public Student(int id, String name) {  
  this.id = id;  
  this.name = name;  
}
}
public class a58_serialization{
    public static void main(String[] args){
        try{
     Student s1=new Student(211,"Ravi");
     Student s2=new Student(212,"Pravi");

     FileOutputStream f1=new FileOutputStream("fos.txt");
     ObjectOutputStream oos=new ObjectOutputStream(f1);
     oos.writeObject(s1);
     oos.flush();
     oos.close();

     ObjectInputStream ois=new ObjectInputStream(new FileInputStream("fos.txt"));
     Student s3=(Student)ois.readObject();
     System.out.println(s3.id+" "+s3.name);
    }
    catch(Exception e){
        System.out.println(e);
    }


    }
}