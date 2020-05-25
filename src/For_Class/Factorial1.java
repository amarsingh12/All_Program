package For_Class;

import java.util.Scanner;

public class Factorial1 
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n,i,m;
    System.out.println("Plz enter any number");
    n = sc.nextInt();
    System.out.println("plz Enter any..... Factorial");
    m = sc.nextInt();
    for(i=1;i<n;i++)
    {
        if(m%i==0)
        {
            System.out.print("The no   " + i +  " "); 
        }
    }
}
}
