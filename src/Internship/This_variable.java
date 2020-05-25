
package Internship;

public class This_variable
{
   int a = 10;
   int b = 20;
   
   void m1(int a, int b)
   {
       int e ;
       System.out.println(this.a + " " +  b);
       System.out.println(d + " " +c);
       System.out.println(e);
   }
    public static void main(String[] args)
    {
       This_variable obj = new This_variable();
       obj.m1(100, 200);
    }
}
