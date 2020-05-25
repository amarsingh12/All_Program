
package For_Class;

import java.util.Scanner;

public class Menu_driven_2 
{
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int a,b,c,r,ch;
   
    do
    {
        System.out.println("Select an Option");
        System.out.println("1. Find Sum of Two number");
        System.out.println("2. Find Largest of Three number");
        System.out.println("3. Average of Two number");
        System.out.println("4. Exit");
         ch = sc.nextInt();
      
        switch(ch)
        {
            case 1 :
                a = 10;
                b= 20;
                System.out.println("Sum of an  2 no. is " + a+b);
                break;
            case 2 :
                a = 100;
                b= 200;
                System.out.println("Sum of an  2 no. is " + a+b);
                break;
             case 3 :
                a = 1011;
                b= 2011;
                System.out.println("Sum of an  2 no. is " + a+b);
                break;
             case 4 :
                 System.out.println("Exit   ");
                 break;
             default:
                 System.out.println("Invalid no");
             
        
        }
    }
    while(ch!=4);
}
}