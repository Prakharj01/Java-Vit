class circle{
    float x;
    float y;
    int radius;
    static int NumberOfCircles;

    static int getNumberOfCircles(){
        return NumberOfCircles;
    }
    circle(){
        NumberOfCircles++;
    }
    circle(float x,float y,int radius){
        NumberOfCircles++;
        this.radius=radius;
        this.x=x;
        this.y=y;
    }

}
public class a11_static{
public static void main(String[]args){
    circle c1=new circle(5,5,10);
System.out.println("Number of circles=: "+ circle.NumberOfCircles);
    circle c2=new circle(5,2,10);
System.out.println("Number of circles=: "+ circle.getNumberOfCircles());
    circle c3=new circle(5,2,10);
System.out.println("Number of circles=: "+ c2.getNumberOfCircles());

}
}