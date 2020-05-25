
public class Sum_of_Reverse {
    public static void main(String[] args)
    {
     int a = 1234;
    int  sum =0;
     while(a!=0)
     {
      int  b= a%10;
       a = a/10;
       System.out.print( b);
       sum = sum + b;
         
         
     }
        System.out.println();
        System.out.println("the sum of Array is  " + sum);
    }
  
}
