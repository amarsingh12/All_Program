
package String;

import java.util.Scanner;

public class Decimal_HexaDecimal
{
     private int deci;
     private String hex;
     public Decimal_HexaDecimal()
     {
         deci = 0;
         hex = "";
     }
     public void input()
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any number");
       deci = sc.nextInt();
     }
     
     public void compute()
     {
      long div,digit;
      for(div = deci;div>0 ;div = div/16)
      {
          digit = div %16;
          hex = (char)(digit<10?digit+48:digit+55) + hex;
      }
     }
     
     public void display()
     {
         System.out.println("Binary is: " + hex);
     }

    public static void main(String[] args) 
    {
        Decimal_HexaDecimal obj = new Decimal_HexaDecimal();
        obj.input();
        obj.compute();
        obj.display();
    }
}
