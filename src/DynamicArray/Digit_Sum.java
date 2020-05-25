
package DynamicArray;

import java.util.Scanner;

public class Digit_Sum {
    public static void main(String[] args) 
    {
     Scanner sc = new Scanner(System.in);    
        System.out.println("plz enter any numer");
        int sum =0;
        int digit =0;
        int num = sc.nextInt();
        while(num>0)
        {
         digit = num%10;
         sum = sum+  digit;
         num = num/10;
        }
        System.out.println("Sum of digit is...." + sum );
    }
 
}
