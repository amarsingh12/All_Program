
package If_Else;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);
    int a,b,r;
    int ch;
    System.out.println("Plz eneter ant 2 no for caalculation");
       a = sc.nextInt();
       b = sc.nextInt()
        System.out.println("plz choose any no............");
    System.out.println("Choose 1 for Area ");
    System.out.println("Choose 2 for Perimeter ");
    ch = sc.nextInt();
    switch(ch)
    {
        case 1:
            r = a * b;
            System.out.println("Area is ....." + r);
        break;
        
        case 2:
            r = a  + b;
            System.out.println("Perimeter is ....." + r);
        break;
        default:
            System.out.println("Invalid choice......");
    }
    }
}
