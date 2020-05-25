
package Array;

import java.util.Scanner;

public class Eliminate_Duplicate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,ns=0,k;
        System.out.println("Plz Enter Size of an Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[arr.length];
        System.out.println("Plz Enter Any Element of an Array");
        for(i=0 ; i< n ;i++)
        {
            arr[i] = sc.nextInt();
        }
        int j=0;
        for(i=0;i<n;i++)
        {
          ns = arr[i];
          for(k=0;k<j;k++)
          {
              if(ns == arr[k])
                  break;
          }
          if(k == j)
          {
             arr1[j] = ns;
             j++;
          }
        }
        System.out.println("The Distinct Element of an Array is");
        for(i=0;i<j;i++)
        {
            System.out.print(arr1[i] + "  ");
        }
        
    }
   
}
