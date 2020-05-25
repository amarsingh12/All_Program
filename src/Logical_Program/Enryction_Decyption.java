package Logical_Program;

import java.util.Scanner;

public class Enryction_Decyption 
{
    public static void main(String[] args) 
    {
        int shift;
        int l,i;
        char ch;
        String rs ="";
        Scanner sc  =new Scanner(System.in);
        System.out.println(".......PLz Enter any Encrypted Text....."); 
        String str = sc.nextLine();
        System.out.println("....Plz Enter any No is Encoded Text...........");
        shift = Integer.parseInt(sc.nextLine());
        if(shift >26 || shift<1)
        {
            System.out.println(".........Plz enter any valid no between 1 to 26........");  
        }
        else
        {
                   str = str.replace(" ", "");
                    l =  str.length();
                    for(i = 0 ; i<l;i++)
                    {
                          ch = str.charAt(i);
                          ch+=   (shift -1);
                          if(ch>90)
                          {
                           ch-= 26;
                          }
                          rs+= ch;
                    }
                   rs = rs.replace("QQ", " ").trim();
                   System.out.println("Decoded Text:  " + rs);
                    
                    
        }
    }
  
}
