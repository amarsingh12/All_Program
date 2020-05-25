
package For_Class;

import java.util.Scanner;

public class Armstrong 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("The ArmStrong ");
        int x,i,div,dig;
        int sum=0;
        System.out.println("plz enter any no for Armstrong.....");
        x= sc.nextInt();
        for(div=x;div>0;div =div/10)
        {
            dig = div%10;
            sum = sum + dig*dig*dig;
        }
        if(sum == x)
        {
            System.out.println("No.is Palidrone");
        }
        else
        {
            System.out.println("No.is not Palidrone");
        }
    }
    
}
