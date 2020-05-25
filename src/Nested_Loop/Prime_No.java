
package Nested_Loop;

import java.util.Scanner;

public class Prime_No 
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        System.out.println(".......The Prime Number between 10 to 20 is......");
        for(int n =10;n<=20;n++)
        {
            int count = 0;

            for(int i =1;i<=n ;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println(n + "  ");
            }
        }
    }
}
