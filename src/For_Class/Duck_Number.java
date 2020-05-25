
package For_Class;

import java.util.Scanner;

public class Duck_Number 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz Enter any No to Check It is Duck or not");
        int x,i,m,div;
        int digit ;
         x = sc.nextInt();
         for(div=x; div>0;div = div/10)
         {
            digit = div%10;
            if(digit == 0)
            {
                  break;
            }
         }
        if(div == 0)
        {
            System.out.println("Not an DUCK no.");
        }
        else
        {
            System.out.println("DUCK no.");
        }
    }
    
}
