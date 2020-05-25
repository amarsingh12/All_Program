
package String;

import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args)
  {
      System.out.println("Enter any String.............");
      Scanner sc = new Scanner(System.in);
      String r = "";
      String str = sc.next();
      for(int i = 0 ; i<str.length();i++)
      {
          char ch = str.charAt(i);
          r = ch + r;
          
      }
       if(r.equalsIgnoreCase(str))
       {
           System.out.println("PAlidroneeeeeeeeeeeeeeeeeee");
       }
       else
       {
           System.out.println("Not an Palidroneeeeeeeeeeeee");
       }
  }
}
