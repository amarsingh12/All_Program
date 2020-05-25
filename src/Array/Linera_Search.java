
package Array;

import java.util.Scanner;

public class Linera_Search 
{
    public static void main(String[] args)
    {
        System.out.println("plz enter any Size of an array");
        Scanner sc = new Scanner(System.in);
         int b = sc.nextInt();
         int a[] = new int[b];
         int i;
         System.out.println("Plz enter aarray");
         for(i =0 ; i< b ;i++)
         {
             int c = sc.nextInt();
             a[i] = c;
         }
         
         for(i =0 ; i< b ;i++)
         {
             System.out.println(a[i]);
         }
         System.out.println("Enter any element to be search");
         int c= sc.nextInt();
         for( i =0 ; i<b ;i++)
         {
             if(c==a[i])
             {
                 System.out.println(a[i]);
                 break;
             }
         }
         if(i==b)
         {
             System.out.println("Search Unsuccessfull");
         }
         else
         {
             System.out.println("The element was found at the indexxx" + i);
         }
    }
   
}
