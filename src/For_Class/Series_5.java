
package For_Class;

import java.util.Scanner;

public class Series_5 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("...........How many term that used in series.........");
        int n = sc.nextInt();
        System.out.println(".........Enter the Value of X:........");
        double x = sc.nextDouble();
        int f=1;
        int sign =-1;
        int p = 1;
        for(int i=1;i<=n;i++)
        {
          f = f*i;
          System.out.print(sign * Math.pow(x, p)/f + " ");
          p++;
          sign = sign*-1;
           
        }
    }
 
}
