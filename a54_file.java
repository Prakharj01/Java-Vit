
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class a54_file{
    public static void main(String[] args){

        File myfile=new File("nfile.txt");

        try{
        myfile.createNewFile();
    }
    catch(Exception e){
        System.out.println("Unable to create file");
    }

    try{
    FileWriter fw=new FileWriter("nfile.txt");
        fw.write("Hello man 1.");
        fw.write("Hello man 2.");
        fw.write("Hello man 3.");
        fw.write("Hello man 4.");
        fw.close();
}
catch(Exception e){
System.out.println("Unable to write");
}



FileReader fw=new FileReader("nfile.txt");

    }
}