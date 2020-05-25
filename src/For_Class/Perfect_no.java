
package For_Class;

import java.util.Scanner;

public class Perfect_no 
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Plz enter any no");
      int x = sc.nextInt();
      int sum =0;
      for(int i=1;i<x;i++)
      {
          if(x%i==0)
          {
             sum = sum + i; 
          }
      }
        if(sum== x)
        {
            System.out.println("The Factorial no is " + x);
        }
        else
        {
            System.out.println("The No. is Not factorial");
        }
    }
}
