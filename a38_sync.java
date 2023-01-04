import java.util.Scanner;

class counter{
    public int countern;
    public int ticketsold=0;
    public static int num_tickets=1;

    public synchronized void ticketbook(int num){
        num_tickets-=num;
        ticketsold+=num;
        System.out.println("Successfully Booked "+num+" tickets by counter"+countern+ ".  " + num +" tickets left");
    }


    public class thread1 extends Thread{
        
    }
}

public class a38_sync{
    public static void main(String[] args){
        counter c[]=new counter[3];
        Scanner sc=new Scanner(System.in);

        int i;
        for(i=0;i<3;i++){
            c[i]=new counter();
        (c[i]).countern=1;
    }
        System.out.println("Enter then number of available tickets: ");
        int total=sc.nextInt();

    counter.num_tickets=total;
    System.out.print("There are three counters.\n Enter the counter number you wish to book from.: ");
    int cnum=sc.nextInt();
    
    System.out.println("Enter the number of tickets you wish to book: ");
    int num=sc.nextInt();

    sc.close();
    c[cnum].ticketbook(num);

}
}