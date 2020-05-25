
package String;

import java.util.Scanner;

public class Piglain {// Meaning divide the string into ur choce and add last with extra string
    public static void main(String[] args)
    {
        System.out.println("PLz Enter any String...........");
      Scanner sc = new Scanner(System.in);
      String str =  sc.nextLine();
      String str1 = str.toUpperCase();
       int i; 
       String r = "";
        
        for( i =0 ;i< str1.length();i++)
        {
                  char ch =  str1.charAt(i);
                  if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
                  {
                      break;
                  }
        }
        String lp = str1.substring(0, i);
        String lp1 = str1.substring(i+1);
         r = lp1 + lp + "AY";
         System.out.println("Piglatin no is  " + r);
        
    }
}
