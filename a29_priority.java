class mythread1 extends Thread{

    public mythread1(String name){
        super(name);
    }
    public void run(){
        while(true){
        System.out.println("Hello I am a thread with name: "+ this.getName());
    }

    }
}


public class a29_priority{

public static void main(String[] args){
    mythread1 t1=new mythread1 ("Prakhar1");
    mythread1 t2=new mythread1 ("Prakhar2 (max priority)");
    mythread1 t3=new mythread1 ("Prakhar3");
    mythread1 t4=new mythread1 ("Prakhar4");
    mythread1 t5=new mythread1 ("Prakhar5");

    // t1.start();
    // t2.start();
    // t3.start();
    // t4.start();
    // t5.start();
    //This means we have no particular order of the threads.
    System.out.println("AFTER SETTING THE PRIORITY\n");
    t2.setPriority(Thread.MAX_PRIORITY);
    t1.setPriority(Thread.MIN_PRIORITY);
    
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();

}
}