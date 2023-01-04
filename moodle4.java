
import java.util.Scanner;
class MyException extends Exception {

    @Override
    public String toString (){
        System.out.println("The balance is less than minimum balance. ");
        return "Cannot procceed";
    }


}
class account{
    private long accno;
    private long balance;
    static long minbalance=10000;

    account(long acn,long bal){
        accno=acn;
        balance=bal;
    }
    public void withdraw(long num){

        balance-=num;
        if (balance<minbalance){
            try{
                balance+=num;
            throw new MyException();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        }

    }
    public void deposit(long num){
        balance+=num;
    }

    long getaccno(){
        return accno;
    }
    long getbalance(){
        return balance;
    }

}

class creditcard extends account{
    private Long cnumber;
    private int pin;
    private int cvv;
    private int expyear;

    creditcard(Long acn,long bal){
       super(acn,bal);
    }
    public void cinput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter credit card number: ");
        cnumber=sc.nextLong();
        System.out.println("Enter your pin: ");
        pin=sc.nextInt();
        System.out.println("Enter your CVV");
        cvv=sc.nextInt();
        System.out.println("Enter your expiry year: ");
        expyear=sc.nextInt();
    }
    public int checkcredit(){
        Long cnumberi;
        int pini;
        int cvvi;
        int expyeari;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your credit card number :");
        cnumberi=sc.nextLong();
        if (cnumberi!=cnumber){
            return 0;
        }
        System.out.println("Enter your pin: ");
        pini=sc.nextInt();
        if (pini!=pin){
            return 0;
        }
        System.out.println("Enter your CVV");
        cvvi=sc.nextInt();
        if (cvvi!=cvv){
            return 0;
        }
        System.out.println("Enter your expiry year: ");
        expyeari=sc.nextInt();
        if (expyeari!=expyear){
            return 0;
        }

        return 1;
    }
}

class loanaccount extends account{
    long amount;
    long interest;

    loanaccount(Long acn,long bal){
        super(acn,bal);
     }

     void interest(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter your interest");
        long interestamt=sc.nextLong();
        interest=interestamt;

        super.withdraw(interestamt);
     }
    }

    


public class moodle4{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your information\n Account number: ");
        Long anum=sc.nextLong();
        System.out.print("Balance: ");
        int balance=sc.nextInt();
        System.out.println("\nThe minimum balance on your account should be INR "+account.minbalance);
        
        account a1=new account(anum,balance);

        System.out.println("Do you have a credit card??  If yes enter 1 ");
        int ccard=sc.nextInt();
        creditcard c1=new creditcard(anum,balance);
        if (ccard==1){
            c1.cinput();
    }

        System.out.print("\nEnter 1 to use credit card\n Enter 2 to use bank account\n Enter 3 to exit\n Your choice:  ");
        int choice=sc.nextInt();
        int res=0;
        if (choice==1){
            if(ccard==1){
                res=c1.checkcredit();
            }
            else{
                System.out.println("You dont have a credit card");
            }
            if (res==0){
                System.out.println("Incorrect information. ");
            }
            else{
                System.out.println("Correct information.Proceeding");
            }
        }
        if(choice==2){
            System.out.println("Enter account number: ");
            long anumi=sc.nextLong();
            if (anumi==a1.getaccno()){
                System.out.println("Correct information.Proceeding ");
                res=1;
            }
            else{
                System.out.println("Inorrect information. ");
            }
        }

        int option=2;
        if (res==1){
        
        do{
        System.out.println("Choose a option: To withdraw-1\nTo deposit-2\nTo display-3\nTo exit-4");
        option=sc.nextInt();

        switch (option){
        case 1:
        System.out.println("Enter amount to withdraw: ");
        int wd=sc.nextInt();
        a1.withdraw(wd);
        break;
        case 2:
        System.out.println("Enter amount to deposit: ");
        int dp=sc.nextInt();
        a1.deposit(dp);
        break;
        case 3:
        long bal=a1.getbalance();
        System.out.println("Your balance is "+ balance);
        break;
    }
}while(option!=4);
}

    System.out.println("Do you have a loan? ");
    int loani=sc.nextInt();

    }
}