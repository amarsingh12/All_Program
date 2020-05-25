
package If_Else;

import java.util.Scanner;

public class Parking
{
    public static void main(String[] args)
    {
        System.out.println("Plz Enter any Parking Hour");
        Scanner sc = new Scanner (System.in);
        int charge = 0;
        int a = sc.nextInt();
        if(a<=1)
        {
            charge = 10;
        }
        else if(a>=2 && a<=5)
        {
           charge = a*2; 
        }
        else if(a>=6 && a<=10)
        {
           charge = a*3 ;
        }
        else
        {
            charge =  a*5; 
        }
        System.out.println("the parking charges is   "+ charge);
    }
}
