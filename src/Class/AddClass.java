
package Class;

import java.util.ArrayList;

public class AddClass {
    public static void main(String[] args)
    {
     ArrayList<Integer> a1 =new  ArrayList<Integer>();
     a1.add(100);
     a1.add(200);
     System.out.println("the element of a1 is " + a1);
     
      ArrayList<Integer> a2 =new  ArrayList<Integer>(a1);
      a2.add(300);
      a2.add(400);
      System.out.println("the element of a2 is " + a2);
      
      ArrayList<Integer> a3 =new  ArrayList<Integer>();
      a3.add(300);
      a3.add(400);
      a3.addAll(a2);
      a3.addAll(a1);
      System.out.println("the element of a3 is " + a3);
      
     
    }
  
}
