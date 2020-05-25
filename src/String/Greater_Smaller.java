
package String;

import java.util.Scanner;

public class Greater_Smaller {// find out number of week day
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      String DayName[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println("........Plz Enter any Number.......");
      int in = sc.nextInt();
       if(in<1 || in>7)
       {
           System.out.println("Invalid Day Number");
       }
       else
       {
           System.out.println("The date is ........." + DayName[in-1]);
       }

           
    }
  
}
