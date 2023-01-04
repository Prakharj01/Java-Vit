
import java.util.Scanner;
class Booking
{

    static int total = 10;

    synchronized void seats(int tobook)
    {
        System.out.println(Thread.currentThread().getName() + " entered.");
        System.out.println("Total : " + total + " Requested seats : " + tobook);
        if (total >= tobook)
        {
            System.out.println("There are ample seats. Book now. ");
            try
            {
                Thread.sleep(100);    
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread interrupted");
            }
            System.out.println(tobook + " seats counterd.");
            total = total - tobook;
        }
        else
        {
            System.out.println("Seats are already booked.");
        }
        System.out.println(Thread.currentThread().getName() + " leaving.");
        System.out.println("----------------------------------------------");
    }
        }

class Person extends Thread
{
    Booking counter;
    int tobook;

    public Person(Booking counter, int tobook)
    {
        this.counter = counter;
        this.tobook = tobook;
    }

    @Override
    public void run()
    {
        counter.seats(tobook);
    }
}

class booking
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the available seats: ");
        int av=sc.nextInt();
        Booking.total=av;
        Booking counter = new Booking();
        System.out.println("Enter the seats to be booked for person1: ");
        int num1=sc.nextInt();
        Person thread1 = new Person(counter, num1);
        System.out.println("Enter the seats to be booked for person2: ");
        int num2=sc.nextInt();
        Person thread2 = new Person(counter, num2);
        System.out.println("Enter the seats to be booked for person3: ");
        int num3=sc.nextInt();
        Person thread3 = new Person(counter, num3);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
