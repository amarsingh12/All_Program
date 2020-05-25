
package For_Class;

import java.util.Scanner;

public class Neon
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Pz Enter no. to check is Neon is or Not");
        int i,div,dig;
        int sum =0;
        int x = sc.nextInt();
        int m = x*x;
        for(div = m ; div>0 ;div = div/10)
        {
            dig = div % 10;
            sum = sum + dig;
        }
        if(sum == x)
        {
            System.out.println("The Number is Neon ");
        }
        else
        {
            System.out.println("Number Neon is not");
        }
                
    }
}
