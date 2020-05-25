
package If_Else;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args)
    {
        System.out.println("plz enter any String");
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
        for(int i =0; i< str.length();i++)
        {
           char ch = Character.toLowerCase(str.charAt(i));
           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
           {
               System.out.println("String is  ");
           }
           else
           {
               System.out.println("String is not Vowel");
           }
        }
    }
 
}
