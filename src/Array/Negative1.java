 package Array;

import java.util.Scanner;

public class Negative1
{
    public static void main(String[] args)
    {
        System.out.println("Plz enter Size any Array");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int arr[] = new int[m];
        System.out.println("Plz enter Element of an Array....");
        for(int i =0;i<m;i++)
        {
          arr[i] = sc.nextInt();
        }
       
        int temp1 =0;
        for(int i= 0;i<m ;i++)
        { 
           int temp =0;
           int x =  arr[i];
           
            if(x<0)
            {
               temp++;
            }
           
           if(temp==1)
           {
               temp1++;
            System.out.print("The Value is   " + x );
           }
        }
        System.out.println("The Total no of Negative Element.......  " + temp1);
    
        
    }
    
}
