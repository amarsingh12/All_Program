
package For_Class;

import java.util.Scanner;

public class Average_Using_Loop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter any no.");
        int s =0,n;
        int x = sc.nextInt();
        for(int i =0 ;i<x ;i++)
        {
           s = s + sc.nextInt();
        }
        n = s/x;
        
        System.out.println("The Average is ....... " + "" + n);
    }
  
}
