
package Array;

import java.util.Scanner;

public class Sum_of_Array {
    public static void main(String[] args)
    {
        System.out.println(".........How many element for an Array......");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int a[] = new int[n];
        int b =0;
        System.out.println("Plz write an elemt in an array");
        for(int i =0;i<n;i++)
        {
               int t =  sc.nextInt();
               a[i] = t;
               b = b + a[i];
        }
        System.out.println("............The sum of an array ........." + b);
        
        
        
    }
   
}
