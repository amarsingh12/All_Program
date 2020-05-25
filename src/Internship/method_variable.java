
package Internship;
public class method_variable
{
   int a =10;//instance 
   int b =20;
   void m1(int a, int b)//instance//
   {
       System.out.println(a);
       System.out.println(b);
       System.out.println(this.a + "  " +  this.b);//this 
      
   }
   
    public static void main(String[] args) 
    {
        method_variable obj = new method_variable();
        obj.m1(100,200);
        
    }
}
