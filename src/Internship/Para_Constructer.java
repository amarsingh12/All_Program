
package Internship;
public class Para_Constructer 
{ 
    Para_Constructer()//default constructer
    {
        System.out.println("Default constructor");
    }
    Para_Constructer(int a)//Para constructer 
    {
        System.out.println(a);
    }
    public static void main(String[] args) 
    {
      Para_Constructer obj = new Para_Constructer(10);  
    }
}
