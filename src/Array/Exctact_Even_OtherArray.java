
package Array;

import java.util.Scanner;

public class Exctact_Even_OtherArray 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter any no......");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[arr.length];
        System.out.println("Plz enter elemnt of an Array");
        for(int i = 0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int j =0;
        for(int i = 0;i<n ;i++)
        {
            if(arr[i]%2 == 0)
            {
              arr1[j] = arr[i];
              j++;
            }
        }
        System.out.println("The Even no Elemnt is............");
        for(int i=0;i<j;i++)
        {
            System.out.println(arr1[i] + "  ");
        }
    }
 
}
