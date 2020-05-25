
package For_Class;

import java.util.Scanner;

public class Series_4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sign = -1;
        int p = 1;
        System.out.println("Plz Enter any no.  in a Series.........");
        int n = sc.nextInt();
        System.out.println("Plz enter the value for x............");
        double x = sc.nextDouble();
        for(int i =0;i<n ;i++)
        {
            System.out.print(sign * Math.pow(x, p) + " ");
            p = p+2;
            sign = sign *-1;
        }
        
    }
}
