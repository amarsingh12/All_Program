
package For_Class;

import java.util.Scanner;

public class Menu_Driven_1 
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     int ch,n,i,f,a,b,c,fact=1;
     System.out.println(".........Select an Option.........");
     System.out.println("1 . Find FActorial of an Number");
      System.out.println("2 . Find Fibonacci of an Number");
      ch = sc.nextInt();
      switch(ch)
      {
          case 1:
              System.out.println("Enter The Number for find out Factorial");
              n = sc.nextInt();
              for(i =1;i<=n;i++)
              {
                 fact = fact * i; 
              }
              System.out.println("The Factorial is :" + fact);
              break;
              
           case 2:
              System.out.println("Enter The Number for find out Fibonacci");
              n = sc.nextInt();
                 int h =0;
                  int j = 1;
              for(i =1;i<=n;i++)
              {
               System.out.print(" " + h + " ");
                int k = h + j;
               h = j;
               j= k;
              }
              break;
           default:
               System.out.println("...........Invalid Choice..............");
              
      }
        
    }
}
