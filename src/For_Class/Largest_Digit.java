
package For_Class;

import java.util.Scanner;

public class Largest_Digit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("pl enter ny no......");
        int div,i,n;
        int x = sc.nextInt();
         int max = -1;

        for( div =x ;div>0;div = div/10)
        {
           n = div%10;
           if(n>max)
           {
               max = n;
           }
        }
        System.out.println("The Maximum Digit is......." + max);
    }
  
}
