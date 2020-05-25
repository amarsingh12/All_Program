
package Array;

import java.util.Scanner;

public class Display_Non_Repeating {
    public static void main(String[] args)
    {
       System.out.println("The elemntof an array........");  
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int r ;
        for(int i =0 ; i< 5 ;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The non-repeating value of array is ");
        for(int i =0; i <5 ;i++)
        {
            int temp=0;
                r =   arr[i];
                for(int j =0 ;j<5 ;j++)
                {
                    if( r == arr[j]) 
                    {
                     temp++;   
                    }
                   
                }
                 if(temp==1)
                    {
                        System.out.print(r + "  ");
                    }
        }
    }
}
