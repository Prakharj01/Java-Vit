import java.util.Scanner;   //used for userinput
import java.util.*;         //used for date and time
class Shareholder{
    
    String name1;
    long accountno;
    long sharevalue;
    long balance;
    long dividend=0;

    long transactionid;
    Date date;
    double sellvalue;
    double buyvalue;

   
    public void Sharebuy(long buy){
        buyvalue+=buy;
        balance-=buy;
     }
    public Shareholder(String name1,long accountno, long sharevalue,long balance){
        this.name1=name1;
        this.accountno=accountno;
        this.sharevalue=sharevalue;
        this.balance=balance;
    }

    void setdividend(){
        System.out.println("Enter 1 for divided percentage. 2 for dividend in Rs.");
        Scanner one=new Scanner(System.in);
        int choice=one.nextInt();

        if(choice==1){
            System.out.println("Enter percentage: ");
            int prcnt=one.nextInt();
            long div=sharevalue*prcnt/100;
            dividend+=div;
            balance+=dividend;
        }
        if(choice==2){
            System.out.println("Enter divident in Rs");
            int div=one.nextInt();
            dividend+=div;
            balance+=div;
        }
        else{
            System.out.println("Invalid choice");
        }


    }

    void sharebuy(){
        Scanner one=new Scanner(System.in);
        System.out.println("Enter the amount of shares you want to buy: ");
        int amnt=one.nextInt();
        
        
        if(amnt>balance){
            System.out.println("You dont have sufficient funds");
        }
        else{
            sharevalue+=amnt;
            balance-=amnt;
            buyvalue=amnt;
            sellvalue=0;
        }
    }

    void sharesell(){
        Scanner one=new Scanner(System.in);
        System.out.println("Enter the amount of shares you want to sell: ");
        int amnt=one.nextInt();


        if(amnt>sharevalue){
            System.out.println("You dont have sufficient shares");
        }
        else{
            sharevalue-=amnt;
            balance+=amnt;
            sellvalue=amnt;
            buyvalue=0;
        }
    
    }

}
public class a17_moodle2{

    public static void main(String []args){
        Scanner one=new Scanner(System.in);
        int n;
        System.out.println("Enter number of customer");
        n=one.nextInt();
        String name;
        long accountno;
        long sharevalue;
        long balance;
        int transid=100;
        Shareholder sh[];
        sh=new Shareholder[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter shareholder "+(i+1)+ " name : ");
            name=one.next();
            System.out.print("Enter shareholder "+(i+1)+" accountno  : ");
            accountno=one.nextLong();
            System.out.print("Enter shareholder "+(i+1)+"  sharevalue: ");
            sharevalue=one.nextLong();
            System.out.print("Enter shareholder "+(i+1)+" balance : ");
            balance=one.nextLong();
            sh[i]=new Shareholder(name,accountno,sharevalue,balance);
        }
        for(int i=0;i<n;i++){
            System.out.println("For customer " + sh[i].name1);
            sh[i].date=new Date();
            int choice=0;
            do{
                
                System.out.println("Enter 1 for buying or 2 for selling. Enter 3 for dividend Enter 4 to exit. ");
                choice=one.nextInt();
                switch(choice){
                    
                    case 1:
                    sh[i].sharebuy();
                    break;
                    case 2:
                    sh[i].sharesell();
                    break;
                    case 3:
                    sh[i].setdividend();
                    break;
                    case 4:
                    System.out.println("Exiting");
                    break;
                    
                }
                
                
                sh[i].transactionid=transid;
            System.out.println("Tran id\t Shareholder name    Account number\tDate\t\t\t\t Sell value\t Buy value\t Sharevalue\t Divident\t Balance");
            System.out.println(sh[i].transactionid+"\t\t"+sh[i].name1+"\t\t"+sh[i].accountno+"\t"+sh[i].date+"\t\t"+sh[i].sellvalue+"\t\t"+sh[i].buyvalue+"\t\t"+sh[i].sharevalue+"\t\t"+sh[i].dividend+"\t\t"+sh[i].balance);
            transid++;
        }while(choice!=4);

        }

    }
}
