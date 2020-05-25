
package String;

import java.util.Scanner;
//Program of full name and short name
public class Mid_name {
    public static void main(String[] args) 
    {
        System.out.println("plz enter any First Name");   
        Scanner sc = new Scanner(System.in);
        String str  = sc.next();
        System.out.println("plz enter any Middle  Name");   
        String str1 = sc.next();
        System.out.println("plz enter any Last Name");  
        String str2 = sc .next();
        System.out.println("The Full Name is " + str + " " + " " + str1 + " " + str2);
        System.out.println("And Short Name is " + str.charAt(0) + "." + str1.charAt(0) + "." + str2.charAt(0));
    }
}
