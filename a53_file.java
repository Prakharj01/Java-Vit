import java.io.File;
   public class a53_file {
     static void p(String s) {
       System.out.println(s);
     }
     public static void main(String args[]) {
       File f1 = new File("file practice");
       p("File Name: "+f1.getName());
       p("File path: "+f1.getPath());
       p("File absolute path: "+f1.getAbsolutePath());
       p("Parent: "+f1.getParent());
       p(f1.exists()? "Yeah exists baby ": "Aww, it does not exist.");
       p(f1.canWrite()? "Yeah you can write inside it ":"No it isnt writable");
       p(f1.canRead()?"Yeah it is readable":"Non readable");
       p(f1.isDirectory()?"Yeah it is a directory":"Not a directory");
       p(f1.isFile()?"Yeah it is a file":"Not a file");
       p(f1.isAbsolute()?"It is absolute":"Nah not absolute");
       p("File last modified: " + f1.lastModified());
       p("File size: " + f1.length() + " Bytes\n\n");


       String dirname="/Users/prakharjain/Documents/Code";
       File f2=new File(dirname);

       System.out.println(f2.isDirectory()?"It is a directory":"No not a directory");
    
       if (f2.isDirectory()) {
        System.out.println("Directory of " + dirname);
       }


        String s[] = f2.list();
       for(int i=0;i<s.length;i++){
           File f3=new File(dirname+"/"+s[i]);
           if(f3.isDirectory()){
               System.out.println(s[i]+"is a directory");
           }
           else{
               System.out.println(s[i]+"is a file");
           }
       }

       
     }
}
  