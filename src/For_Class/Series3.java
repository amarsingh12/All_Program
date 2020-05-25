package For_Class;

import java.util.Scanner;

public class Series3 
{
    public static void main(String[] args)
    {
      Scanner sc =  new Scanner(System.in);
      double i,x,n,p=1;
      System.out.println(".........How many Terms do you Want???..........");
      n = sc.nextInt();
      System.out.println("........ .Plz Eneter any valuessssssss.........");
      x =sc.nextDouble();
      for(i=1;i<=n;i++)
      {
          System.out.print(Math.pow(x, p) + " "); 
          p++;
      }
      
    }
  
}
