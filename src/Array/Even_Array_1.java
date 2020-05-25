package Array;

import java.util.Scanner;

public class Even_Array_1
{
    public static void main(String[] args) 
    {
        System.out.println("------PLz enter array size--------");
        Scanner sc = new Scanner(System.in);
        int i,j=0;
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[a.length];
        System.out.println("............Plz enter any element..........");
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                b[j] = a[i];
                j++;
            }
        }
        System.out.println("Even no. of element in an array" );
        for(i =0 ;i<j ;i++)
        {
            System.out.print(b[i] + "  ");
        }
        
    }
   
}
