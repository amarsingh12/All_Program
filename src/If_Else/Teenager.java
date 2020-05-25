
package If_Else;

import java.util.Scanner;

public class Teenager {
    public static void main(String[] args) 
    {
       System.out.println("plz Enter ur age");
       Scanner sc = new Scanner(System.in);
           int a =   sc.nextInt();
           if(a>=13 && a<=18)
           {
               System.out.println("Teenager");
           }
           else
           {
               System.out.println("Not an teenager");
           }
       
    }
 
}
