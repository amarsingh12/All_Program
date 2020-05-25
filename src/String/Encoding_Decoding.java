
package String;

import java.util.Scanner;

public class Encoding_Decoding 
{
    private String s,es,ds;
    public Encoding_Decoding()
    {
     s = "";
     es ="";
     ds ="";
    }
    public void input()
    {
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter the String in UpperCase");
      s = sc.nextLine().toUpperCase();
    }
    
    public void encode()
    {
     int i,l;
     char ch;
     l = s.length();
     for(i=0;i<l;i++)
     {
         ch = s.charAt(i);
         ch += 7;
         if(ch>90)
         {
         ch -= 26;
         }
         es +=ch;
     }
    }
    
    public void decode()
    {
     int i,l;
     char ch;
     l = es.length();
     for(i=0;i<l;i++)
     {
         ch = es.charAt(i);
         ch -=7;
         if(ch<65)
         {
             ch +=26;
         }
         ds +=ch;
     }
    }
    public void display()
    {
        System.out.println("Encoded String is " + es);
        System.out.println("Decoded String is " + ds);
    }
    
    
    public static void main(String[] args)
    {
          Encoding_Decoding  obj = new Encoding_Decoding();
          obj.input();
          obj.encode();
          obj.decode();
          obj.display();
    }
}
