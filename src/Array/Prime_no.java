
package Array;

import java.util.Scanner;

public class Prime_no
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7};
        int l = arr.length;
        int n;
        System.out.println("prime no are");
        for(int i = 0 ;i<l;i++)
        {
            int temp =0;
           n = arr[i];
           for(int j =1 ;j<=n;j++)
           {
               if(n%j==0)
               {
                   temp++;
               }
           }
            if(temp==2)
            {
                System.out.println("prime" + n);
            }
        }
    }
}
