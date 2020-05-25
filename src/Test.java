
import java.util.ArrayList;


public class Test {
    public static void main(String[] args)
    {
      Emp e1 = new Emp(111,"amar"); 
      Emp e2 = new Emp(222,"singh"); 
      Emp e3 = new Emp(333,"bulbul"); 
      Emp e4 = new Emp(444,"kaliii");
      ArrayList<Emp> a1 = new ArrayList<Emp>();
          a1.add(e1);
          a1.add(e2);
          //System.out.println(a1);
      ArrayList<Emp> a2 = new ArrayList<Emp>(a1);
          a2.add(e3);
          a2.add(e4);
          //System.out.println(a2);
        for(Emp e: a2)
        {
            System.out.println(e.eid + " " + e.ename);
        }
       
             
          
    }
   
}
