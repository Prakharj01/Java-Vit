
import java.io.*;  
import java.util.Scanner;

public class prac4 {  
    public static void main(String args[])throws Exception{  
        File myfile=new File("textout.txt");
       
        try{
            myfile.createNewFile();
        }
        catch(Exception e){
            System.out.println("File open failed");
            e.printStackTrace();
        }
        
        try{
            FileWriter fw=new FileWriter(myfile);
            fw.write("Hello Buddy 1..!\n");
            fw.write("Hello Buddy 2..!\n");
            fw.write("Hello Buddy 3..!\n");
            fw.write("Hello Buddy 4..!\n");
            fw.write("Hello Buddy 5..!\n");
            fw.close();

        }
        catch (IOException e){
            System.out.println(e);
        }


        try{
            FileReader fr=new FileReader("textout.txt");
            Scanner sc=new Scanner(fr);
            int i=0;
            while(sc.hasNextLine()){
                String line=sc.nextLine();       
                System.out.println(i+" \t"+line+"\n");
                i++;
            }
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("File read failed");
        }


FileReader fr2=new FileReader(myfile);
BufferedReader br=new BufferedReader(fr2);

String s=br.readLine();
while(s!=null){
System.out.println(s);
s=br.readLine();
}
fr2.close();

fr2=new FileReader(myfile);
BufferedReader br2=new BufferedReader(fr2);

int i=br2.read();    
while(i!=-1){  
System.out.print("\n"+(char)i);  
i=br2.read();
}  
br2.close();    
fr2.close();

    }
}    