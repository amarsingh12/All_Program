
package String;

import java.util.Scanner;
// Counting an Capital letter in a String
public class Count_Capital_no {
    public static void main(String[] args)
   {
       System.out.println("Plz Enter Any String");
       Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
        int count = 0;
        for(int i =0; i<str.length();i++)
        {
           char  ch = str.charAt(i);
            if(Character.isUpperCase(ch)) // isUpperCase(return boolean) && toUpperCase(return Character)
            {
               count++;
            }
        }
        System.out.println("The total no of Capital Character is " + count);
        
    }
}
