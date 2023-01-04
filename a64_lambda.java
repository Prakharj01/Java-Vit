interface addable{
    int add(int a,int b);
}

public class a64_lambda{
    public static void main(String[] args){

        addable a1=(a,b)->(a+b);
        System.out.println(a1.add(20,30));
        
    }
}