package String;

import java.util.Scanner;

public class Palidrone {
    public static void main(String[] args) 
    {
        System.out.println(".........Plz Enter any String.........");
        Scanner sc = new Scanner(System.in);
         String str =    sc.nextLine();
          str = str + " ";
          char ch;
         String str1= "",str2 = "";
         for(int i = 0 ; i<str.length();i++)
         {
              ch = str.charAt(i);
              if(ch!=' ')
              {
                  str1 = str1 + ch;
                  str2 = ch + str2;
              }
             else
              {
               if(str1.equalsIgnoreCase(str2))
                      System.out.println(str1);
               str1 = "";
               str2 = "";
              }
         }
         
    }
}
