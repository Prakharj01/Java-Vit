
import java.util.*;
import java.io.*;
public class a55_file {
	public static void main(String args[]) throws IOException {
		FileOutputStream f1=new FileOutputStream("Hello.dat");
		DataOutputStream d1=new DataOutputStream(f1);

		d1.writeDouble(27.78);

		d1.close();

		FileInputStream f2=new FileInputStream("Hello.dat");
		DataInputStream d2=new DataInputStream(f2);

		double dp=d2.readDouble();
		System.out.println(dp);
	
		d2.close();
	}
}