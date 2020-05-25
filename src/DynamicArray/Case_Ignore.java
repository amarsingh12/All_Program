package DynamicArray;

import java.util.Scanner;

public class Case_Ignore {
    public static void main(String[] args) 
    {
       System.out.println("plz enter any string");
       Scanner sc = new Scanner(System.in); 
       String str = sc.nextLine();
       String r ="";
       for(int i =0 ; i<str.length();i++)
       {
               char ch = str.charAt(i);
               if(Character.isLowerCase(ch))
                    ch  = Character.toUpperCase(ch);
               else if(Character.isUpperCase(ch))
                    ch  = Character.toLowerCase(ch);
                r = r +ch;        
       }
        System.out.println("THe case sensitive is "  + r);
       
       
    }
}
