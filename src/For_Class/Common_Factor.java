
package For_Class;

import java.util.Scanner;

public class Common_Factor 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i,m,n,a,b;
        System.out.println("Enter the Two number ");
        a = sc.nextInt();
        b = sc.nextInt();
        m = Math.min(a, b);
        System.out.println("The Common Factors are---");
        for(i =1; i<=m ;i++)
        {
            if(a%i==0 && b%i==0)
            {
                System.out.println(i + " ");
            }
        }
        
    }
}
