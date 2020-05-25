
package Array;

import java.util.Scanner;

public class Merge_Array
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       char a[] = {'A','b','c','d'};
       char b[] = {'g','u','h','k','t'};
       int d = a.length + b.length;
       char c[] = new char[d];
       int i;
       for(i=0;i<a.length;i++)
       {
           c[i] = a[i];
       }
        for(i=0;i<b.length;i++)
       {
           c[a.length + i] = b[i];
       }
        System.out.println("The Resultant array is .........");
        for(i=0;i<c.length;i++)
        {
            System.out.print(c[i] + " ");
        }
    }
 
}
