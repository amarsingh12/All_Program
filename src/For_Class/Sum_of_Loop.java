
package For_Class;

import java.util.Scanner;

public class Sum_of_Loop 
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("plz enter the 5 number");
     int n;
     int s =0;
     
     for(int i=0;i<5;i++)
     {
       n = sc.nextInt();
       s= s + n;
     }
        System.out.println("The Sum is " + s);
    }
}
