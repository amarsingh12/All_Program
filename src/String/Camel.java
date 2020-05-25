// camel Change string 
package String;

import java.util.Scanner;

public class Camel {
    public static void main(String[] args)
    {
     System.out.println("Plz enter iny String");
     Scanner sc = new Scanner(System.in);  
     String str =  sc.nextLine();
     char ch1;
     String Str1 ="";
     for(int i =0 ;i< str.length();i++)
     {
        char ch = str.charAt(i);
        if(Character.isUpperCase(ch))
        {
             ch1 = Character.toLowerCase(ch);
        }
        else
        {
             ch1 = Character.toUpperCase(ch);
        }
        
        Str1 = Str1 + ch1;
     }
        System.out.println("The Camel string is " + Str1);
       
    }
   
}
