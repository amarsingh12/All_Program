package Nested_Loop;

import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter any no.....");
        int x= sc.nextInt();
        int y = sc.nextInt();
        int c = 0;
        int z;
        for(int i=x; i<=y;i++)
        {
            int sum =0;
            
            while(i>0)
            {
               int n = i%10;
               sum = (sum*10) + n;
               i = i/10; 
            
            }
            if(sum == x)
            {
                c++;
            }
       }
      System.out.println("...........No. is   Palidrone......." + c);
        
        
        
    }
}
