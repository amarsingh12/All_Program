package Internship;

public class Const_Prob 
{
   int eid;
   String ename;
   float esal;
   Const_Prob()
   {
        eid = 100;
        ename = "amar";
        esal = 1000;
       
   }
   void display()
   {
       System.out.println(eid);
       System.out.println(ename);
       System.out.println(esal);
   }
    public static void main(String[] args)
    {
       Const_Prob obj = new Const_Prob();
       obj.display();
    }
}
