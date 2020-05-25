
package String;

import java.util.Scanner;

public class MR {
    public static void main(String[] args)
    {
        System.out.println("The String is ............");
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
           String str1 = str.toLowerCase();
        if(str1.startsWith("mr."))
        {
            System.out.println("male");   
        }
        else  if(str1.startsWith("mrs."))
        {
            System.out.println("FeMale");   
        }
        else  if(str1.startsWith("dr."))
        {
            System.out.println("Proffesor");   
        }
         else 
        {
            System.out.println("Chilcd");   
        }
         
    }
  
}
