
package If_Else;

import java.util.Scanner;

public class Capital_Smaller {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        System.out.println("..................Plz Enter any character..............");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch <= 'z')
        {
            System.out.println("Character is Small");
        }
        else if(ch>='A' && ch <= 'Z')
        {
            System.out.println("Character is Capital");
        }
        else
        {
            System.out.println("Anything else");
        }
           
    }
}
