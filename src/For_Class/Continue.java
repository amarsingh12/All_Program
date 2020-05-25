
package For_Class;

import java.util.Scanner;

public class Continue 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int age ,i,sum =0;
        double avg ;
        System.out.println("plzenter 5 person age");
        for(i = 0;i<5;i++)
        {
           age = sc.nextInt();
           if(age<0)
           {
               i--;
               System.out.println("U Enter an Wrong Age");
               continue;
           }
          sum = sum + age;
        }
        avg = (double)sum/5;
        System.out.println("The Average Age is.........." + avg);
    }
 
}
