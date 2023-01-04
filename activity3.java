import java.util.Scanner;

class activity3{

    public static void main(String []args){
       Scanner readinput=new Scanner(System.in);

        int []arr;
        int num;
        System.out.println("Enter the number of digits in the array: ");
        num=readinput.nextInt();
        int resarr[];
        resarr=new int [num];
        arr=new int[num];

        int i=0;
        int ires=0;
        int jres=num-1;
        while (i<num){
            arr[i]=readinput.nextInt();
            if (arr[i]==0){
                resarr[ires]=0;
                ires++;
            }
            else if (arr[i]==1){
                resarr[jres]=1;
                jres--;
            }
            i++;
        }
        i=0;
        System.out.println("Resultant Array after segregating: ");
while(i<num){
    System.out.print(resarr[i]);
    i++;
}
    }
}