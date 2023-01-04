
import java.io.*;  
public class a50_bytearray {  
public static void main(String args[])throws Exception{    
      FileOutputStream fout1=new FileOutputStream("f1.txt");    
      FileOutputStream fout2=new FileOutputStream("f2.txt");    
        
      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
      bout.write(65);    
      bout.writeTo(fout1);    
      bout.writeTo(fout2);    
        
      bout.flush();    
      bout.close();//has no effect    
      System.out.println("Success...");    



      byte buf[]={65,66,67,68};
      ByteArrayOutputStream bout = new ByteArrayOutputStream(buf);
    int k=bout.read();
      while(k!=-1){
        char ch = (char) k;  
        System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
        k=bout.read();

      }

     }    
    }   