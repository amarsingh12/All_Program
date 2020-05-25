
package String;

import java.util.Scanner;

public class Lexicographic {
    public static void main(String[] args) 
    {
        System.out.println("plz enter any First String");
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("plz enter any second String");
        String str1 = sc.nextLine();
        int r = str.compareToIgnoreCase(str1);
        if(r==0)
        {
            System.out.println("The String is equal...........");
        }
        else if(r>0)
        {
            System.out.println("The Biggest  String is ..  " + str1);
        }
        else
        {
            System.out.println("The Smallest String is....." + str);
        }
        
        
    }
}
