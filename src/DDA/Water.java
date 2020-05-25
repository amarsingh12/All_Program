
package DDA;

import java.util.Scanner;

public class Water 
{
    public static void main(String[] args) 
    {
        int arr[][] = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9},
                        };
        
        int r ,c ;
        System.out.println("Original Matrix is.............");
        for(r=0;r<3;r++)
        {
            for(c=0;c<3;c++)
            {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
        
        
        System.out.println("Water Marks is ..............");
        for(r =2 ;r>=0;r--)
        {
            for(c=0;c<3;c++)
            {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
            
        }
    }
}
