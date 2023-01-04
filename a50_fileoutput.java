
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class a50_fileoutput{
    public static void main(String[] args){
try{
FileOutputStream fout=new FileOutputStream("textout.txt");
//writes the character corresponding to the integer
fout.write(68);
byte arr[]=new byte[]{65,66,67,68};
//writing the whole byte array
fout.write(arr);
System.out.println("success");

String str="\nDada we love you. ";
byte b[]=str.getBytes();
System.out.println(b);
fout.write(b);
fout.close();
}
catch(Exception e){
System.out.println(e);
}

try{
FileInputStream fin=new FileInputStream("textout.txt");
int i=fin.read();
System.out.println((char)i);

fin.close();
}
catch(Exception e){
System.out.println(e);
}

System.out.println("\n-----------------\nReading all characters ");

try{
    FileInputStream fin2=new FileInputStream("textout.txt");
    
    int j=fin2.read();

    while(j!=-1){

        System.out.print((char)j);
        j=fin2.read();
    }
}
catch(Exception e){
    System.out.println(e);
}


    }
}