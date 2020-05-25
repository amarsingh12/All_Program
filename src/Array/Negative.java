
package Array;

import java.util.Scanner;

public class Negative
{
    public static void main(String[] args)
    {
        System.out.println("plz eneter anr array size");
        Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int a[] = new int[n];
          System.out.print("Plz enter any array element  ");
          for(int i =0 ;i<n ;i++)
          {
              int c = sc.nextInt();
              a[i] = c;
          }
          int temp = 0;
          for(int i =0 ;i<n ;i++)
          {
              if(a[i]<0)
              {
                  temp++;
              }
          }
            System.out.println("The total no. is negative is " + temp );
    }
}
