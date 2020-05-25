
package For_Class;

import java.util.Scanner;

public class Display_Series
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        for(int i =0;  i<5 ;i++)
        {
            System.out.print(t + "  ");
            t = t*10 +1;
        }
    }
 
}
