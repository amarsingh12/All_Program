
package If_Else;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Plz Enter any String");
        ch = sc.next().charAt(0);
        if(ch>=65 && ch<=90)
        {
            ch += 32;
        }
        else if(ch>=97 && ch<=122)
        {
            ch -= 32;
        }
        System.out.println(ch);
    }
}
