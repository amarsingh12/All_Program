
package For_Class;

import java.util.Scanner;

public class Digit_Sentence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plzz enter any no.");
        int x = sc.nextInt();
        int div,dig,sum =0;
        for(div = x ; div>0;div = div/10)
        {
            dig =  div%10;
            sum = sum*10 + dig;
        }
        for(div = sum ; div >0 ; div = div/10)
        {
            dig = div%10;
            switch(dig)
            {
                case 0:
                        System.out.print("Zero");
                        break;
                case 1:
                        System.out.print("One");
                        break;
                case 2:
                        System.out.print("Two");
                        break;
                case 3:
                        System.out.print("Three");
                        break;
                case 4:
                        System.out.print("Four");
                        break;
                case 5:
                        System.out.print("Five");
                        break;
                case 6:
                        System.out.print("Six");
                        break;
                case 7:
                        System.out.print("Seven");
                        break;
                case 8:
                        System.out.print("Eight");
                        break;
                case 9:
                        System.out.print("Nine");
                        break;
             }
            System.out.print(" ");
        }
        
    }
}
