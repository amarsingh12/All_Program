
package If_Else;

import java.util.Scanner;

public class Electricity_Bill1 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls Enter ur Bill");
        int i = sc.nextInt();
        int n;
        if(i<=10000)
        {
           n = (i*10)/100;
            System.out.println(n);
        }
        else
        {
            n= (i*2)/100;
            System.out.println(n);
        }
    }
}
