
package If_Else;

import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args)
    {
     System.out.println("Plz enter any Electricty Bill");
     Scanner sc = new Scanner(System.in);
     int x = sc.nextInt();
     Double Bill;
     if(x<100)
     {
        Bill = x*2.5; 
     }
     else if(x>=100 && x<=200)
     {
       Bill = x*5.5;
     }
     else
     {
       Bill = x * 7.5;
     }
        System.out.println("Ur Bill is  " + Bill);
            
    }
  
}
