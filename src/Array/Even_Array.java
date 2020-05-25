package Array;

import java.util.Scanner;

public class Even_Array {
    public static void main(String[] args) 
    {
        System.out.println("Enter any Array Size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[arr.length];
        int arr2[] = new int[arr.length];
        System.out.println("Enter any Element of an Array");
        for(int i =0 ; i<arr.length;i++)
        { 
            int c = sc.nextInt();
            arr[i] = c; 
        }
        
        int j=0;
        int k=0;
        int i;
        for( i =0 ; i<arr.length;i++)
        { 
            if(arr[i]%2==0)
            {
                arr1[j] = arr[i];
                j++;
            }
        }
         
        for( i =0 ; i<arr.length;i++)
        { 
            if((arr[i]%2)!=0)
            {
                arr2[k] = arr[i];
                k++;
            } 
        }
         System.out.println("Even no is............." + j);
         for(i=0;i<j;i++)
         {
             
             System.out.print(arr1[i] + "  ");
             
         }
         
         System.out.println("ODD no is............." + k);
         for(i=0;i<k;i++)
         {
             
             System.out.print(arr2[i] + "  ");
             
         }
    }
}
