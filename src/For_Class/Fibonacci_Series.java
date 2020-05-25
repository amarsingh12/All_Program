
package For_Class;

import java.util.Scanner;

public class Fibonacci_Series
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Plz enter The Value of an N in fabonacci no");
       int a=0,c,i,n;
       int b =1;
       n = sc.nextInt();
       for(i=1; i<=n ; i++)
       {
          System.out.print(a + "  ");
          c = a + b;
          a = b;
          b = c;
          
       }
    }
}
