
package String;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) 
    {
        System.out.println(".............Enter any String..........");
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
          str = " " + str; 
          String r = "";
        for(int i =0 ; i< str.length();i++)
        {
               char ch = str.charAt(i);
               if(ch == ' ')
               {
                   r = r + ch;// Spacing
                   i++;// first character
                   ch = Character.toUpperCase(str.charAt(i));
               }
               else
               {
                  ch = Character.toLowerCase(str.charAt(i));
               }
               r = r + ch;
        }
        System.out.println(r.substring(1));
    }
 
}
