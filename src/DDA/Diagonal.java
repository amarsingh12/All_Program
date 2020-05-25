
package DDA;

import java.util.Scanner;

public class Diagonal 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Plz enter Row and Column in a Matrix.......");
       int m,n,r,c;
       m = sc.nextInt();
       n = sc.nextInt();
       int arr[][] = new int[m][n];
       System.out.println("Plz Enter ay Elemnt in a Matrix");
       for(r=0;r<m;r++)
       {
          for(c=0;c<n;c++)
          {
              arr[r][c] = sc.nextInt();
          }
       }
        for(r=0;r<m;r++)
       {
          for(c=0;c<n;c++)
          {
              System.out.print(arr[r][c] + " ");
          }
           System.out.println();
       }
        for(r=0;r<m;r++)
       {
          for(c=0;c<n;c++)
          {
              if(r==c)
              {
              System.out.println(arr[r][c] + " ");
              }
      
              else if(r + c == 2)
              {
              System.out.print("  " + arr[r][c] + "");
              }
          }
           
       }
       
    }
}
