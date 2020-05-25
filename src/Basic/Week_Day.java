
package Basic;

import java.util.Scanner;

public class Week_Day
{
    public static void main(String[] args) 
    {
        System.out.println("Plz Enter the No. Of Days");
        Scanner sc = new Scanner(System.in);
          int x = sc.nextInt();
          double y = (double)x/7;
          int z  = x %7;
          System.out.println("The no . Week is  " +y+ "  The no Of days  " + z );
    }
  
}
