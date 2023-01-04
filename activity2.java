package moodle2;

import java.util.Scanner;

class activity2{

    public static void main(String[] args){
       Scanner readinput=new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int num=readinput.nextInt();
        int arr[];
        arr=new int[num];
        int evenpos=0;
        int oddpos=0;
        int even[];
        int odd[];
        even=new int[num];
        odd=new int[num];
        int i=0;
        while(i<num){
            arr[i]=readinput.nextInt();
            if(arr[i]%2==0)
            {
                even[evenpos]=arr[i];
                evenpos++;
            }
            else{
                odd[oddpos]=arr[i];
                oddpos++;

            }
            i++;
        } 
        i=0;       
        System.out.println("\nEven numbers: "+ evenpos+" numbers ");
        while(i<evenpos){
            System.out.println(even[i]);
            i++;
        }
        i=0;       
        System.out.println("\nOdd numbers: "+oddpos+ " numbers");
        while(i<oddpos){
            System.out.println(odd[i]);
            i++;
        }
      
    
    }
}