package DDA;

import java.util.Scanner;

public class Basic_Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         int mat[][]= new int[3][2];
         int r,c;
        System.out.println("Plz enter any number.......");
        for(r=0;r<3;r++)
        {
           for(c =0;c<2;c++)
           {
              mat[r][c] = sc.nextInt();
           }
        }
        System.out.println("The Matrix is......");
           for(r=0;r<3;r++)
        {
           for(c =0;c<2;c++)
           {
               System.out.print(mat[r][c] + " ");
           }
            System.out.println();
        }
       
    }
}
