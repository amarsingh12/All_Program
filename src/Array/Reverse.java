 package Array;

import java.util.Scanner;

public class Reverse 
{
    public static void main(String[] args)
    {
         int n, m;
        System.out.println("............plz Enter any Array. no......");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Plzz enter any array element");
        for(int i = 0; i< n ;i++)
        {
             arr[i] = sc.nextInt();
        }
        
        int l = arr.length;
        System.out.println(l);
        for(int j = l-1 ; j>=0; j--)
        {
            System.out.println("The Reversed Array is  " + arr[j] + " ");
        }
    }
   
}
