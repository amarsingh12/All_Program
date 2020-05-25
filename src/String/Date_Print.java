
package String;

import java.util.Scanner;

public class Date_Print {
    public static void main(String[] args)
    {
        System.out.println("Plz enter any stringsssss");  
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.equalsIgnoreCase("Monday"))
            System.out.println("The Day Number is " + 1);
        else if(str.equalsIgnoreCase("Tuesday"))
            System.out.println("The Day Number is " + 2);
        else  if(str.equalsIgnoreCase("Wednesday"))
            System.out.println("The Day Number is " + 3);
        else  if(str.equalsIgnoreCase("Thursday"))
            System.out.println("The Day Number is " + 4);
        else if(str.equalsIgnoreCase("friday"))
            System.out.println("The Day Number is " + 5);
        else if(str.equalsIgnoreCase("Saturday"))
            System.out.println("The Day Number is " + 6);
        else if(str.equalsIgnoreCase("Sunday"))
            System.out.println("The Day Number is " + 7);
        else
            System.out.println("The day is not Exists...........");
            
        
    }
}
