
package For_Class;

import java.util.Scanner;

public class Automorphic
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enter any no......");
        int x = sc.nextInt();
        int dig,div,rem;
        int count =0;
        for( div = x;div >0; div= div/10)
        {
           count++;
        }
        div = (int)Math.pow(10, count);
        dig = x*x;
        rem = dig%div;
        if(rem==x)
        {
            System.out.println("AutoMorphism");
        }
        else
        {
            System.out.println("Not an Automorh");
        }
    }
    
}
