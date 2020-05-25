package String;

import java.util.Scanner;

public class Frequency_Count {
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
    
       System.out.println(".........Plz Enter any String.............");

       String str =   sc.nextLine();
        
       for(char ch = 'a';ch<='z'; ch++)
       {   int count = 0;
           for(int i =0; i<str.length(); i++)
           {
                 char cs = Character.toLowerCase(str.charAt(i));
                 if(ch==cs)
                 {
                     count++;
                 }
           }
           if(count>0)
           {
               System.out.println(ch +" is  " + count );
           }
           
       }
    }
}
