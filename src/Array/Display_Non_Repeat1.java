package Array;

import java.util.Scanner;

public class Display_Non_Repeat1 
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("plz enter size of an array.");
            int n,m;
            n = sc.nextInt();
            int arr[] = new int[n];
            int l = arr.length;
            System.out.println("Plz enter any no");
            for(int i =0 ;i<l ;i++)
            {
                arr[i] = sc.nextInt();
            }
            for(int i =0; i <l;i++)
            {
                int temp = 0 ;
                  m = arr[i];  
                  for(int j= 1 ;j<l ;j++)
                  {
                      if(m == arr[i])
                      {
                         temp++; 
                      }
                  }
                  if(temp>2)
                  {
                      System.out.println("The duplicate element is" + m);
                  }
                  else 
                  {
                      System.out.println("The distinct element is " + m);
                  }
            }
            
           
            
        
    }
 
}
