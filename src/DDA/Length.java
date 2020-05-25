
package DDA;

import java.util.Scanner;

public class Length
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter any number of an");
        int arr[][] = {
                      {3,4,5,29},
                      {4,5,6,89},
                      {6,7,1,5}
                      };
        int r,c,l;
        for(r=0;r<arr.length;r++)
        {
            l = arr[r][0];
            for(c=0;c<arr[0].length;c++)
            {
                if(arr[r][c]>l)
                {
                    l = arr[r][c];
                }
            }
           System.out.println("largest no. in  each row  is " + l);
        }
    }
   
}
