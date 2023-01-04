abstract class base{
    int var=5;
    public base(){
        System.out.println("This is a constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class child extends base{
 public void greet(){
    System.out.println("Good Morning");
}
}
abstract class child2 extends base{
    void th(){
        System.out.println("I am good");
        
        //no need to declare greet() since the class is abstract
    }
}
class child3 extends child2{
    public void greet(){
        System.out.println("This is another abstract class");
    }   
}


public class a21_abstract{

    public static void main(String []args){

        child c=new child ();
        base b=new child();
        c.greet();
        System.out.println("Value of var is "+c.var);
        // child2 ch=new child2();
        // ch.th();
    }
}

/*
abstract is something declared without an implementation

an abstract method is a method with no function. it can be made in only a abstract class

the derived class from an abstract class must be abstract or must overwrite the abstract function


abstract class is not a real class. that means we cannot make a object of abstract class. but we can make a oject of the derived classes. all the methods and variables of abstract class is accessed from the derived class object



*/