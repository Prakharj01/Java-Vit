
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class a49_file{
    public static void main(String[] args){

        File myfile=new File("hello.txt");
        try{
        myfile.createNewFile();
    }
    catch(Exception e){
        System.out.println("File open failed");
        e.printStackTrace();
    }
    try{
    FileWriter fw=new FileWriter("hello.txt");
    fw.write("HELLO BUDDY 1..!\n"); 
    fw.write("HELLO BUDDY 2..!\n"); 
    fw.write("HELLO BUDDY 3..!\n"); 
    fw.write("HELLO BUDDY 4..!\n");
    fw.write("HELLO BUDDY 5..!"); 
    fw.close();
    }
    catch(Exception e){
        System.out.println("File write failed");
    }
    
    //Reading a file
    File mf=new File("hello.txt");
    try{
    Scanner sc=new Scanner(mf);
    int i=0;
    while(sc.hasNextLine()){
        i++;
        String line=sc.nextLine();
        System.out.println(i+" \t"+line+"\n");
    }
    sc.close();
}
catch(Exception e){
    System.out.println("File read failed");
}

File nf=new File("hello.txt");
if(nf.delete()){
    System.out.println("I have deleted: ");
}
else{
    System.out.println("Some problem occurred while deleting the file");
}
}
}