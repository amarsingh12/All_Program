package For_Class;

import java.util.Scanner;

public class Prime_No
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.println("Plz Enter Prime no. as u want"); 
        n = sc.nextInt();
        int count =1;
        for(i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count == 2)
        {
            System.out.println("The Prime no is " + count);
        }
        
    }
 
}
