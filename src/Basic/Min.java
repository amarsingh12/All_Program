
package Basic;

import java.util.Scanner;

public class Min {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = sc.next();
        
        System.out.println("Plz enter ur  gender");
         char gender = sc.next().charAt(0);
         
         System.out.println("plz enter any age");
         int age = sc.nextInt();
         
         
         System.out.println("Plz Enter Phone no.");
         long phone =  sc.nextLong();
         
         System.out.println(str + " " + gender + " " + age + " " + phone);
        
             
    }
 
}
