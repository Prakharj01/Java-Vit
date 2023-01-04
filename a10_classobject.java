
class Bike{
    String color;
    String model;
    long price;
    int insurance;
    Bike(){
        System.out.println("This is a default constructor with no arguments");
    }
    Bike(String col, String mod, long pr,int insure){
        color=col;
        model=mod;
        price=pr;
        insurance=insure;
        long total=price+insurance;
        System.out.println("On road price: "+ total);
    }
}

public class a10_classobject{
    public static void main(String [] args){    
        Bike b1;
        b1=new Bike();
        Bike b2=new Bike("blue","AB123",22000,3000);
    
    } 
}