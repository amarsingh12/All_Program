
package String;

import java.util.Scanner;

public class PreDefinedArray {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
           String str  = sc.nextLine();
           String r = "";
        for(int i =0 ; i< str.length();i++)
        {
                  char ch =  str.charAt(i);
                  if(i%2==0)
                  {
                        ch = Character.toUpperCase(ch);
                  }
                  else
                  {
                      ch = Character.toLowerCase(ch);
                  }
                  
                r = r + ch; 
        }
        System.out.println("The updated String " + r);
    }
  
}
