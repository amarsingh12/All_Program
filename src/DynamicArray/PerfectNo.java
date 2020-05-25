
package DynamicArray;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter any no ");
    int number  = sc.nextInt();
    for(int i = 1 ;i<number;i++)
    {
        if(i*i==number)
        {
            System.out.println("This is Perfect no. " + i);
        }
    }
    }
  
}
