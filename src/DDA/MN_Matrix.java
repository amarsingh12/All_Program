
package DDA;

import java.util.Scanner;

public class MN_Matrix 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Plz enter any Matrix Element");
       int m ,n,r,c;
       m = sc.nextInt();
       n = sc.nextInt();
       int arr[][] = new int[m][n];
       for(r=0;r<m;r++)
       {
           for(c=0;c<n;c++)
           {
               arr[r][c] = sc.nextInt();
           }
       }
        System.out.println("MATRIX is.............");
        for(r=0;r<m;r++)
       {
           for(c=0;c<n;c++)
           {
               System.out.print(arr[r][c] + " ");
           }
           System.out.println();
       }

        
    }
 
}
