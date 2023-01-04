
class Account
{
	String name;
    int accounttype;
	int accountnumber;
    float balance;
	public Account(String name, int act, int acn, float bal)
	{
	this.name=name;
	this.accounttype=act;
	this.accountnumber=acn;
	this.balance=bal;
}public void Deposit( int x)
{
	balance +=x;
}
public void Withdraw(int x)
{
	balance-=x;
}

public void enquire()
	{
	System.out.println("\nName: "+ name+"\nAccount type: "+accounttype+"\nAccount number: "+accountnumber+ "\nBalance: "+balance);
}
public void icalculate(){
	
}
}

public class a09_classobject{
public static void main(String []args)
{
Account AC1=new Account("arun",1, 1234, 100);
Account AC2=new Account("ar",2, 123, 100);
Account AC3=new Account("arn",2, 12, 100);
	AC1.Deposit(500);
	AC2.Deposit(500);
     AC3.Deposit(500);

	AC1.Withdraw(500);
	AC2. Withdraw(400);
	AC3. Withdraw(400);
    AC1.enquire();
    AC2.enquire();
    AC3.enquire();
    
}
}


