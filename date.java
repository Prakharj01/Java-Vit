import java.time.*; // import the LocalDate class

import java.util.*;
public class date{
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); // Create a date object
    System.out.println(myObj); // Display the current date

    LocalTime myObjTime=LocalTime.now();
    System.out.println(myObjTime);

    LocalDateTime myObj = LocalDateTime.now();
    System.out.println(myObj);
    
        Date d2=new Date(2022,24,11,14,20,10);
        System.out.println(d2);
        

  }
}