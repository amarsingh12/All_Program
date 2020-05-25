
package String;

import java.util.Scanner;

public class Convert_Decimal_Binary 
{
    private int deci;
    private String bin;
    Convert_Decimal_Binary()
    {
        deci = 0;
        bin = "";
    }
    public void input()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Decimal Number ");
       deci = sc.nextInt();
    }
    public void compute()
    {
      long div,digit;
      for(div = deci ; div>0 ;div = div/2)
      {
         digit = div%2;
         bin = digit+ bin;
      }
      
    }
    public void display()
    {
        System.out.println("Binary... is " + bin);
    }
    public static void main(String[] args)
    {
       Convert_Decimal_Binary obj = new Convert_Decimal_Binary();
       obj.input();
       obj.compute();
       obj.display();
    }
}
