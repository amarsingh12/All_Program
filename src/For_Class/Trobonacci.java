
package For_Class;

import java.util.Scanner;

public class Trobonacci 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz Enter any no.");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 2;
        int d;
        for(int i =0;i<=n;i++)
        {
            System.out.print(a + "  ");
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
    }
  
}
