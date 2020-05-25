
package String;

import java.util.Scanner;

public class Vowels_with_Name {
    public static void main(String[] args)
    {
        System.out.println("Plz enter any String..............");
        Scanner sc = new Scanner(System.in);
        String name[] = new String[5];
        for(int i =0;i<name.length;i++)
        {
               name[i] = sc.nextLine();
        }
        System.out.println("Name of the Vowels in a String are..........");
        for(int i =0;i<name.length;i++)
        {
            char ch =  Character.toLowerCase(name[i].charAt(0));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                System.out.println("The Vowel string is " + name[i]);
            }
            
        }
    }
}
