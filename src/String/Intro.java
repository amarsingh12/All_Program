
package String;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) 
   {
       System.out.println("Enter ur Name");
       Scanner sc = new Scanner(System.in);
         String str =  sc.next();// nextLine() ----- used in mulple string and next() is used in single string
         System.out.println("ur name is " + str);
       
    }
  
}
