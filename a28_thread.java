

class mythread extends Thread{

    public mythread(String name){
        super(name);

    }
    public void run(){
        System.out.println("Thank you");

    }
}
class mythread2 implements Runnable{

    public mythread2(Runnable r){
        }
    public mythread2(Runnable r, String name){
        super(name);
        
    }
}
public class a28_thread{
    public static void main(String[] args){

        mythread t1= new mythread("Contructor for t1");

        mythread t2= new mythread("Constructor for t2");

        t1.start();
        System.out.println("The id of the thread t1 is: "+t1.getId());
        System.out.println("The name of thread t1 is : "+t1.getName());
        
        System.out.println("The id of the thread t2 is: "+t2.getId());
        System.out.println("The name of thread t2 is : "+t2.getName());
    }
}