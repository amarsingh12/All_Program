
package DynamicArray;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args)
    {
     System.out.println("Plz enter any Sentence");
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     char []chars = str.toCharArray();
     int count = 0 ;
     for(char c : chars)
     {
         switch(c)
         {
             case 'a':
             case 'e':
             case 'i':
             case 'o':
             case 'u':
             count++;
             break;
         }
         
     }
        System.out.println("The Vowel no is " + count);
    }
 
}
