import java.util.Random;
import java.util.Scanner;

public class a12_rockpaper{

    public static void main(String []args){
Random number1=new Random();
Scanner one=new Scanner(System.in);
int comp=(number1.nextInt(3));

System.out.println("Enter your choice\n1 for rock\n2 for paper\n3 for scissor: ");
int user=one.nextInt();

if (user==comp){
System.out.print("Its a draw." );
}
else if((user==1 && comp==3) || (user==2 && comp==1) || (user==3 && comp==2)){
System.out.println("Congoo. 😁 You won");
}
else{
    System.out.println("Alas.😕 Computer won");
}

if(comp==1){
System.out.print("Computer choose rock. ");
}

else if(comp==2){
System.out.print("Computer choose paper. ");
}

else{
System.out.print("Computer choose scissor. ");
}

if(user==1){
System.out.print(" You choose rock");
}

else if(user==2){
System.out.print(" You choose paper");
}

else if(user==3){
System.out.print(" You choose scissor");
}
}
}