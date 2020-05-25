
import java.util.ArrayList;


public class abc {
    public static void main(String[] args)
    {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
          a1.add(10);
          a1.add(20);
          
        ArrayList<Integer> a2 = new ArrayList<Integer>(a1);
        a2.add(30);
        a2.add(40);
        
        System.out.println(a2);
        System.out.println(a1);

    }
 
}
