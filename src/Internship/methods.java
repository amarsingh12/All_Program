
package Internship;
public class methods 
{
    void m1()//instance
    {
        System.out.println("Instance meathod");
    }
    
    static void m2()//static
    {
        System.out.println("Static meathod ");
    }
    
    
    
    public static void main(String[] args)
    {
        methods  obj = new methods();
        m2();
        obj.m1();//instance
    }
}
