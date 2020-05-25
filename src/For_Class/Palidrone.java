
package For_Class;

import java.util.Scanner;

public class Palidrone
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(".....Plz Enter any No. to Check whether no. is Palidrone....");
        int x = sc.nextInt();
        int sum = 0;
        int div,dig;
        for(div =x;div >0;div = div/10)
        {
            dig = div%10;
            sum = sum*10 + dig; 
        }
        if(sum == x)
        {
            System.out.println("The no.is Palidrone......");
        }
        else
        {
            System.out.println("The No.is not Palidrone.......");
        
        }
    }
    
}
