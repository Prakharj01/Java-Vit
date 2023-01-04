interface bicycle{
    int a=20;
    void applybrake(int decrement);
    void speedup(int increment);
}
class Avon implements bicycle{
    int speed;
public void applybrake(int decrement){
    speed=speed-decrement;
    System.out.println("The speed is "+ speed);
}
public void speedup(int increment){
    speed=speed+increment;
    System.out.println("The speed is "+ speed);
}
}

public class a22_interface{
    public static void main(String[] args){

        Avon bi1=new Avon();
        bi1.speed=10;
        System.out.println(bi1.a);
        bi1.speedup(2);
        System.out.println(bi1.a);

    }
}

/*
group of related methods with empty bodies

we cant extend mulitple abstract class but we can implement multiple interface at same time

*/