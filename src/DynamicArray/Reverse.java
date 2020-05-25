
package DynamicArray;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args)
    {
      String str = " RAM RAM JI JAI MATA DI HAR HAR MAHADEV ";
            String splitArray[] = str.split(" ");
            for(int i =splitArray.length-1 ; i>=0; i-- )
            {
                System.out.print(splitArray[i] + "  ");
                
            }
    }
  
}
