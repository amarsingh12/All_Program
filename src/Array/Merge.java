
package Array;

import java.util.Scanner;

public class Merge 
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      char a[] = {'a','b','c','d','e','f'};
      char b[] = {'g','h','i','j','k','m'};
      int i;
      char c[] = new char[a.length+b.length];
      for(i = 0 ; i< a.length ;i++)
      {
          c[i] = a[i];
      }
      
       for(i = 0 ; i< b.length ;i++)
      {
          c[a.length + i] = b[i];
      }
     
       for( i = 0 ; i<c.length ;i++)
      {
          System.out.print(c[i] + "  ");
      }

      
      
    }
    
}
