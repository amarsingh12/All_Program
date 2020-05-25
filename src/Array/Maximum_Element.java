package Array;

import java.util.Scanner;

public class Maximum_Element 
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("The Element is Array");
      int n = sc.nextInt();
      int i;
      int arr[] = new int[n];
      System.out.println("Enter of numbers Of an Array ");
      for(i=0;i<n;i++)
      {
          arr[i] = sc.nextInt();
      }
      int Max = arr[0];
      int Sec_Max = arr[1];
      for(i=2;i<n;i++)
      {
          if(Max < arr[i])
          { 
            Sec_Max = Max;
            Max   =  arr[i];
          }
      }
        System.out.println("The Max Element is  " + Max + " The Second Max Element is  " + Sec_Max);
    }
    
}
