
package Array;

import java.util.Scanner;

public class Average {
    public static void main(String[] args)
    {
     
        Scanner sc = new Scanner(System.in);
        int n,i,num = 0;
        double m;
        String str;
        System.out.println("plz enter ur no.");
        n = sc.nextInt();
        int no[] = new int[n];
        for( i =0; i< n;i++)
        {
         no[i] = sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            num = num + no[i];
        }
        
        m = num/n;
        System.out.println("The Average is " + m);
        
        
        
    }
  
}
