package If_Else;

import java.util.Scanner;

public class Capital_letter {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char ch ;
        System.out.println("............Enter a character........");
        ch = sc.next().charAt(0);
        if(ch>='A' && ch<='Z')
        {
            System.out.println("...............String letter is capital...........");
        }
        else
        {
            System.out.println(".....String is not Capital..............");
        }
    }
}
