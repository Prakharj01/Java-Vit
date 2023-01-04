import java.util.*;

class custcare{
    String name;
    String phno;
    String query;
    int querynum;
    int solved;

    public String getname(){ 
        return name;
    }
}

public class moodle7{
    public static void main(String[] args){
        List<custcare> c1=new ArrayList<custcare>();
        Scanner sc=new Scanner(System.in);
        custcare []ccarray=new custcare[10];
        int more=1;
        int n=0;
        while(more!=0){
            n++;
            ccarray[n-1]=new custcare();
            System.out.print("Enter customers name: ");
            ccarray[n-1].name=sc.next();
            System.out.print("Enter customers phone number: ");
            ccarray[n-1].phno=sc.next();
            System.out.print("Enter customers query: ");
            sc.next();
            ccarray[n-1].query=sc.nextLine();
            ccarray[n-1].querynum=n;
            System.out.print("Your query number is : "+ccarray[n-1].querynum);
            System.out.print("\nIs your query solved: Enter 0 for not solved, 1 for solved: ");
            ccarray[n-1].solved=sc.nextInt();
            c1.add(ccarray[n-1]);
            System.out.print("\nDo you want to enter details of more customer. Enter 0 for no: ");
            more=sc.nextInt();
        }
        System.out.println("Size of linked list: "+c1.size());

            
        int choice=1;
        while(choice!=0){
            System.out.println("Enter 1 to display a particular query\nEnter 2 to create a new query at given position, \nEnter 3 to remove a query,\nEnter 4 to update the query.\nEnter5 to display the whole log\n 0to quit");
            choice=sc.nextInt();

            switch (choice){
            case 1:
            System.out.println("Enter the querynumber: ");
            int qnum=sc.nextInt();

            System.out.println("Name: "+(c1.get(qnum-1)).name+" Phone number: "+(c1.get(qnum-1)).phno+" Query:"+(c1.get(qnum-1)).query+" querynum: "+(c1.get(qnum-1)).querynum+"Query solved "+(c1.get(qnum-1).solved==0?"No":"Yes"));
            break;
            case 2:
            System.out.println("New Query");
            int priority;
            n++;
            ccarray[n-1].querynum=n;
            System.out.print("Enter customers name: ");
            ccarray[n-1].name=sc.next();
            System.out.print("Enter customers phone number: ");
            ccarray[n-1].phno=sc.next();
            System.out.print("Enter customers query: ");
            ccarray[n-1].query=sc.next();
            System.out.print("Your query number is : "+ccarray[n-1].querynum);
            System.out.print("\nIs your query solved: Enter 0 for not solved, 1 for solved: ");
            ccarray[n-1].solved=sc.nextInt();
            System.out.print("Enter the priority of the query: ");
            priority=sc.nextInt();
            c1.set(priority,ccarray[n-1]);

            break;

            case 3:
                System.out.println("Enter the query num to remove the query: ");
                int qremove=sc.nextInt();
                c1.remove(qremove);
                System.out.println("Query removed");
            break;

            case 4:
                System.out.println("Enter the index to update");
                int index=sc.nextInt();
                System.out.print("Enter the field to update:\n 1 for name\n2 for phoneno\n3 for query\n4for querynum\n5 for solved: ");
                int field=sc.nextInt();
                switch(field){
                    case 1:
                    System.out.print("Enter customers name: ");
                    ccarray[index].name=sc.next();
                    
                    break;
                    case 2:
                    System.out.print("Enter customers phone number: ");
                    ccarray[index].phno=sc.next();
                    break;
                    case 3:
                    System.out.print("Enter customers query: ");
                    ccarray[index].query=sc.next();
                    break;
                    case 4:
                    System.out.print("\nIs your query solved: Enter 0 for not solved, 1 for solved: ");
                    ccarray[index].solved=sc.nextInt();
                    break;
                }
                System.out.println("Query updated");
            break;

            case 5:
            
                for(int i=0;i<c1.size();i++){

            System.out.println("Name: "+(c1.get(i)).name+" Phone number: "+(c1.get(i)).name+" Query:"+(c1.get(i)).query+" querynum: "+(c1.get(i)).querynum+" Solved: "+(c1.get(i).solved==1?"Yes":"No"));
                }
            break;
        }

        }
        sc.close();
    }
}

/*
display
new query with priority
remove


*/