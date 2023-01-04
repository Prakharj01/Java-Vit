class Figure{
double dim1;
double dim2;
Figure(double a, double b){
dim1=a;
dim2=b;
}
Figure(double a){
    dim1=dim2=a;
}
Figure(){
    dim1=dim2=-1;
}
double Area(){
    System.out.println("The shape of the figure is undefined");
    return -1;
}
}
class Rectangle extends Figure{

Rectangle(double a, double b){
    super(a,b);
}
    double Area(){
        System.out.println("Inside Area of the rectangle");
        return dim1*dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);
    }
    double Area(){
        System.out.println("Inside Area of the triangle");
        return dim1*dim2/2;
    }
}



public class a18_polymorphism{
    public static void main(String [] args){
        Figure f=new Figure(7,8);
        Rectangle r=new Rectangle(5,4);
        Triangle t=new Triangle(10,8);
        // Figure figref;
        // figref=r;
        System.out.println("The area of rectangle is " +r.Area());
        System.out.println("The area of triangle is " +t.Area());
         System.out.println("The area of figure is " +f.Area());
    }

}