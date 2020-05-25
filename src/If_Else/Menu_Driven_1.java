
package If_Else;

import java.util.Scanner;

public class Menu_Driven_1 {
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
        System.out.println("Pls Enter any  Two Numbers  ");
        int a,b,c,ch;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Select an Option....");
        System.out.println("1 Sum");
        System.out.println("2 Product");
        System.out.println("3 Largest");
        System.out.println(".........Plz chose ur Option........");
        ch = sc.nextInt();
        if(ch == 1)
        {
            c = a + b;
            System.out.println("The sum of an element is " + c);
        }
        else if(ch == 2)
        {
            c = a*b;
            System.out.println("The product of n element is " + c);
        }
        else if(ch== 3)
        {
             if(a>b)
             {
                 System.out.println("A is largest  " + a);
             }
             else
             {
                 System.out.println("B is Largest  " + b);
             }
        }
    }
  
}
