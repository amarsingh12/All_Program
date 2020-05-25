
package String;

import java.util.Scanner;

public class Count_Words {
    public static void main(String[] args)
    {
        System.out.println("Plz Enter any string"); 
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 1  ;
        for(int i = 0 ;i< str.length();i++)
        {
             char ch =  str.charAt(i);
                if(Character.isWhitespace(ch))
                {
                    count++;
                }
        }
        System.out.println("The total no. is Sentence is " + count);
    }
   
}
