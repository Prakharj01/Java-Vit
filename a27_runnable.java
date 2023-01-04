

class runnableinter implements Runnable{
    public void run(){

        for(int i=0;i<100;i++){
        System.out.println("I am a thread 1 implementing runnable.");
    }
    }
}
class runnableinter2 implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("I am a thread 2 implementing runnable. Second");
        }
    }
}


public class a27_runnable{

    public static void main(String[] args){
        runnableinter b1=new runnableinter();
        runnableinter2 b2=new runnableinter2();

        Thread t1=new Thread(b1);
        Thread t2=new Thread(b2);
        t1.start();
        t2.start();
        
    }
}