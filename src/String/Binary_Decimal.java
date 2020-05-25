package String;

import java.util.Scanner;

public class Binary_Decimal
{
    private int deci;
    private String bin;
   public Binary_Decimal()
    {
        deci = 0;
        bin = "";
    }
   public void input()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Plz Enter any number ");
       bin = sc.nextLine();
   }
   
   public void compute()
   {
       int i,l,p,digit;
       l = bin.length();
       p= l-1;
       for(i=0;i<l;i++)
       {
           digit = bin.charAt(i) -48;
           deci += digit *(int)Math.pow(2, p);
           p--;
       }
   }
   
   public void display()
   {
       System.out.println("Decimal is  " + deci);
   }
    public static void main(String[] args)
    {
       Binary_Decimal obj = new Binary_Decimal();
        obj.input();
        obj.compute();
        obj.display();
    }
   
}
