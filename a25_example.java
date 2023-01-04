
interface Camera{

    void takeSnap();
    void recordVideo();
    default void record4kVideo(){
        System.out.println("Recording 4k video");
    }
}
interface wiFi{
    String[] getNetwork();
    void connectToNetwork(String network);

}
class MyCellPhone{
    void callNumber(long phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickNumber(long phoneNumber){
        System.out.println("Picking "+phoneNumber);
        System.out.println("Connecting");
    }

}
class MySmartPhone extends MyCellPhone implements wiFi, Camera{

    public void takeSnap(){
        System.out.println("Taking Snap");

    }
    public void recordVideo(){
        System.out.println("Recording Video");
    }

    public String [] getNetwork(){
        String [] networklist={"OneVI","Two-5G", "Airtel"};
        System.out.println("Getting Network");
        return networklist;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to Network "+network);
    }
}
class a25_example{
    public static void main(String[] args){
        MySmartPhone ms=new MySmartPhone();

        String ar[]=ms.getNetwork();
        for(String item:ar){
            System.out.println(item);
        }


    }
}
/*
Default methods
*/
