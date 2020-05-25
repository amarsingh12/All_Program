package DynamicArray;

import java.util.Scanner;

public class FourApril {
    public static void main(String[] args)
   {
     Scanner sc = new  Scanner(System.in);
     System.out.println("Enter the number...");
     int number = sc.nextInt();
     
     int lastDigit = number%10;
     
     int firstNumber = number;
     while(firstNumber>10)
     {
        firstNumber = firstNumber/10; 
     }
       System.out.println("First number " + firstNumber);
       System.out.println("Last Date " + lastDigit);
       
     
       
    }
   
}
