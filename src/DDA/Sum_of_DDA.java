
package DDA;

import java.util.Scanner;

public class Sum_of_DDA 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter any no.");
        int arr[][] = new int[3][2];
        int r,c,sum =0;
        for(r=0;r<3;r++)
        {
            for(c=0;c<2;c++)
            {
                arr[r][c] = sc.nextInt();
                sum = sum + arr[r][c];
            }
        }
        System.out.println("Sum is : " + sum);
    }
    
}
