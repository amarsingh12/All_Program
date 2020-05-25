
package String;

import java.util.Scanner;

public class Vowels {
    //Vowel Count.............
    public static void main(String[] args)
    {
        System.out.println("PLZ Enter any String.............");
        Scanner sc = new Scanner(System.in);
           String str   =  sc.nextLine();
          
           int count = 0;
           for(int i =0 ; i < str.length();i++)
           {
               char ch = str.charAt(i);
               char ch1 = Character.toLowerCase(ch);// convert into lower character
               
               if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')
               {
                  count++; 
               }
           }
           System.out.println("The Total No. is Vowel is........"  + count);
           
    }
    }
