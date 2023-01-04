import java.util.Scanner;
public class a20_pracques{
    public static void main(String[] args){
        Scanner one=new Scanner(System.in);
    //     //ques1
    // float []a;
    //     a=new float[5];
        // doiuble sum=0;

    //     for(int u=0;u<5;u++ ){
    //     System.out.print("Enter float "+(u+1)+": ");
    //         a[u]=one.nextFloat();
    //        sum+=a[u];
    //     }
    //     System.out.println("The stored array");
    //     for(int u=0;u<5;u++ ){
    //     System.out.println(a[u]);
    //     }
        //Ques 2
        int b[];
        int n;
        System.out.println("Enter the number of items in integer array : ");
        n=one.nextInt();
        b=new int [n];
        
        for(int i=0;i<n;i++){
    System.out.print("Enter element "+(i+1)+" : ");
            b[i]=one.nextInt();

}
System.out.println("Enter element to search in array");
int choice=one.nextInt();
for(int i=0;i<n;i++){
    if (b[i]==choice){
        System.out.println("Element found at index "+ i);
    }
}

        // Practice Problem 4
        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }

        // Practice Problem 5
        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n1 = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n1; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }

        // Practice Problem 6
        int [] arr2 = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for(int e: arr2){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ max);

        // Practice Problem 6
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        
        // Practice Problem 7
        boolean isSorted = true;
        int [] arr3 = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr3.length-1;i++){
            if(arr3[i] > arr3[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }




    }
}

/*
Create an array of 5 floats and calculate their sum.
Write a program to find out whether a given integer is present in an array or not.
Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
Create a Java program to add two matrices of size 2x3.
Write a Java program to reverse an array.
Write a Java program to find the maximum element in an array.
Write a Java program to find the maximum element in a Java array.
Write a Java program to find whether an array is sorted or not.


*/