
package DynamicArray;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enetr ur name");
        String str = sc.nextLine();
        System.out.println(removeDulpicate( str));
    }
    
    public static String removeDulpicate(String str)
    {
           Set<Character> set = new HashSet<>();
           StringBuffer sf = new StringBuffer();
           for(int i=0;i<str.length();i++)
           {
                         Character c   =  str.charAt(i);
                         if(!set.contains(c))
                         {
                             set.add(c);
                             sf.append(c);
                         }
           }
        
        
        
        
        return sf.toString();
        
       
    }
}
