
package Array;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) 
    {
       Scanner sc  = new Scanner(System.in);
       String a[] = {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
        System.out.println("Plz Enter Months");
        int x = sc.nextInt();
        if(x>=1 && x<=12)
        {
            System.out.println("The  Month is  " + a[x-1]);
        }
       
        
        
    }
   
}
