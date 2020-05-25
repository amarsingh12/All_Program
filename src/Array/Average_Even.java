
package Array;

import java.util.Scanner;

public class Average_Even {
    public static void main(String[] args) 
    {
        System.out.println("plz enter any array size");
        Scanner sc = new Scanner(System.in);
             int a =   sc.nextInt();
             int b [] = new int[a];
             int d ;
             System.out.println("plz enter an  element of an array");
             for(int i = 0 ; i<a;i++)
             {
               int g = sc.nextInt();
               b[i] = g; 
             }
             int v=0,n=0;
             for(int i =0 ;i<a;i++)
             {
                 if(b[i]%2 ==0)
                 {
                    v++;
                    n = n + b[i];
                 }
             }
             d = n/v;
             System.out.println("The element is  " + n + " The average no. is " + d) ;
    }
  
}
