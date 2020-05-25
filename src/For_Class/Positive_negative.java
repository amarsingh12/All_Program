
package For_Class;

import java.util.Scanner;

public class Positive_negative
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("..............plz enter u seen in series............"); 
        int i,n,sign = -1;
        int t =10;
        n = sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.print(sign*t + " "); 
            t = t+10;
            sign = sign * -1;
        }
        
    }
}
