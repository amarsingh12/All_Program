package For_Class;

import java.util.Scanner;

public class Spy_No 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter any no.");
        int x = sc.nextInt();
        int div,sum=0,mul=1,dig;
        for(div = x ; div>0 ;div = div /10)
        {
            dig = div%10;
            sum = sum + dig;
            mul = mul*dig;
            
        }
        if(sum == x && mul == x)
        {
            System.out.println("No. is SPY_NO");  
        }
        else
        {
            System.out.println("no. is not spy");
        }
    }
 
}
