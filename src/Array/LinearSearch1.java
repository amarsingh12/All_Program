
package Array;

import java.util.Scanner;

public class LinearSearch1 
{
    public static void main(String[] args)
    {
        System.out.println("plz enter any array size");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        int i;
        System.out.println("Plz enter Element of array");
        for( i=0 ;i<x ;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(".............Plz enter the number to be Searched...........");
        int key = sc.nextInt();
        int temp=0;
        for( i =0;i<x ;i++)
        {
            if(key==arr[i])
            {
                System.out.println(arr[i]);
                temp++;
            }
        }
        if(temp==0)
        {
            System.out.println("Search Element is not an Array");
        }
        else
        {
            System.out.println("The Duplicate Element is " + temp + " Times");// No of Duplicate item is in a Array.
        }
    }
}
