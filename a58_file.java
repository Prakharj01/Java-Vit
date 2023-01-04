import java.io.File;   
import java.io.IOException;
class a58_file{  
    public static void main(String[] args) throws IOException{  
        // Creating file object  
        File f0 = new File("FileOperationExample.txt");  
        if (f0.exists()) {  
            // Getting file name  
            System.out.println("The name of the file is: " + f0.getName());  
            // Getting path of the file   
            System.out.println("\nThe absolute path of the file is: " + f0.getAbsolutePath());     
   
            // Checking whether the file is writable or not  
            System.out.println("\nIs file writeable?: " + f0.canWrite());
   
            // Checking whether the file is readable or not  
            System.out.println("\nIs file readable " + f0.canRead());
   
            // Getting the length of the file in bytes  
            System.out.println("\nThe size of the file in bytes is: " + f0.length());
            
            System.out.println("is " + (f0.isDirectory() ? "" : "not" + " a directory"));
            System.out.println(f0.isFile() ? "is normal file" : "might be a named pipe");
            System.out.println(f0.isAbsolute() ? "is absolute" : "is not absolute");
            System.out.println("File last modified: " + f0.lastModified());
            System.out.println("File size: " + f0.length() + " Bytes");

        } else {  
            System.out.println("\nThe file does not exist.");
            f0.createNewFile();
            System.out.println("\nThe file is created");
        }
        
        int i=System.in.read();//returns ASCII code of 1st character  
        System.out.println((char)i);//will print the character  
        System.out.println(i);//will print the ascii code of 1st character  

    }  
}  