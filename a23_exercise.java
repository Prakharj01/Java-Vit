
//question 1
class circle{
    double radius;

    circle(double r){
        radius=r;
        System.out.println("Circle parameterised constructor");
    }
    double area(){
        return Math.PI*radius*radius;
    }
}

class cylinder extends circle{
    double height;
    cylinder(double r,double h){
        super(r);
        System.out.println("Cylinder parameterised constructor");
        height=h;
    }

    double csa(){
        return Math.PI*2*radius*height;
    }

    double tsa(){
        return this.csa()+Math.PI*radius*radius*2;
    }

}

//question 2
class rectangle{
protected double length;
protected double breadth;

double area(){
    return length*breadth;
}
void setdim(double l,double b){
    length=l;
    breadth=b;
}
double getl(){
    return length;
}
double getb(){
    return breadth;
}
}
class cuboid extends rectangle{
private double height;
cuboid(double l,double b, double h){
    setdim(l,b);
    height=h;
}

double volume(){
    return this.area()*height;
}
}

public class a23_exercise{
    public static void main(String[] args){
         circle objc = new circle(12);
         cylinder obj = new cylinder(12, 4);
        
         System.out.println("Area of circle is "+ objc.area());
         System.out.println("CSA of cylinder is "+obj.csa());
         System.out.println("TSA of cylinder is "+obj.tsa());


         //question 2,4
         cuboid c=new cuboid(3,4,5);
         System.out.println("Volume of cuboid is "+c.volume());


    }
}

/*
Create a class circle and use inheritance to create another class cylinder from it
Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible 
Create a method for area and volume in 1 
create methods for area & volume in 2 also create getters and setters 
What is the order of constructor execution for the following inheritance hierarchy 
                    Base 
                                
                   Derived 1
                                    
                   Derived 2

Derived obj = new Derived 2( ); 
Which constructor(s) will be executed & in what order?
*/