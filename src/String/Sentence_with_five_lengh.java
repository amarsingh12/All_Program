package String;

import java.util.Scanner;

public class Sentence_with_five_lengh {
    public static void main(String[] args)
    {
        System.out.println(".............plz Enter any Sentence............");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str + " ";
        String r = " ";
        int count = 0;
        char  ch;
        System.out.println("The Word Larger than 5 character are: ....");
        for(int i = 0 ;i < str.length();i++)
        {
                 ch = str.charAt(i);
                 if(ch!=' ')
                 {
                   r = r + ch;
                 }
                 else
                 {
                   if(r.length() >=5)
                   {
                       System.out.println(r);
                   }
                   r = "";
                   
                 }
                 
        }
    }
 
}
