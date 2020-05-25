
package For_Class;

import java.util.Scanner;

public class Largest_in_Loop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Largest no is in a Loop");
        int l,n;
        l = sc.nextInt();
        for(int i =0;i<=9;i++)
        {
            n = sc.nextInt();
            if(n>l)
            {
                   l=n;
            }
        }
        System.out.println("The Largest no.in an Array is " + l);
        
    }
}
