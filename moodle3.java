import java.util.Scanner;
class sales{

    String carmodel;
    String color;
    String enginetype;
    String fueltype;
    String dod;
    long price;

    int stock;
    Scanner one=new Scanner(System.in);
    void newsale(){
        System.out.print("Enter carmodel: ");
        carmodel=one.next();
        System.out.print("Enter color: ");
        color=one.next();
        System.out.print("Enter enginetype: ");
        enginetype=one.next();
        System.out.print("Enter fueltype: ");
        fueltype=one.next();
        System.out.print("Enter date of delivery: \n");
        dod=one.next();
        System.out.print("Enter price");
        price=one.nextLong();
        System.out.print("Enter stock ");
        stock=one.nextInt();

        pricecheck();
    }

    void pricecheck(){
        System.out.println("Enter price paid: ");
        long paid=one.nextLong();
        if(paid>price/2){
            System.out.println("Your order is confirmed. The order is being processed");
            stockcheck();
        }
        else{
            System.out.println("The price paid is less. Please pay atleast half the price");
        }

    }
void stockcheck(){
    delivery d=new delivery();
    porder po=new porder();
    sales s=new sales();
    s=this;
    if(stock>=1){
        System.out.println("The car is in stock. ");
        d.display(s);
    }
    else{
        System.out.println("The car is out of stock. It is undergoing production");
        po.display(s);
    }
}

}
class delivery{
String ownername;
String carmodel;
String color;
String fueltype;
String dod;
Scanner sc=new Scanner(System.in);

void display(sales s){
    System.out.println("Enter owner name: ");
    ownername=sc.next();

    carmodel=s.carmodel;
    color=s.color;
    fueltype=s.fueltype;
    dod=s.dod;

System.out.println("Ownername\tCar-model\tColor\tFueltype\tDoD");
System.out.println(ownername+"\t"+carmodel+"\t"+color+"\t"+fueltype+"\t"+dod);

}

}

class porder{
    String pbranch;
    String saddress;
    String carmodel;
    String color;
    String enginetype;
    String dod;
    long price;

    Scanner sc=new Scanner(System.in);

    void display(sales s){
        
        
        carmodel=s.carmodel;
        color=s.color;
        enginetype=s.enginetype;
        price=s.price;
        System.out.print("Enter production branch: ");
        pbranch=sc.nextLine();
        System.out.println("Enter showroom address ");
        saddress=sc.nextLine();
        System.out.print("Enter showroom address: ");
        System.out.println(" pbranch\t saddress\t Carmodel\t color\t enginetype\t dod\tprice");
        System.out.println(pbranch+"\t"+ saddress+"\t"+ carmodel+"\t"+ color+"\t"+ enginetype+"\t"+ dod+"\t"+price);    
    }
    
}


public class moodle3{
    public static void main(String[] args){
    
        sales num=new sales();
        num.newsale();

    }
}