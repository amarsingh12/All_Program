
import java.util.ArrayList;
import java.util.Collections;

public class Coll1 {
  public static void main(String[] args)
{
 ArrayList<String>  a1 = new ArrayList<String>();
 a1.add("ratan");
 a1.add("singh ");
 a1.add("shikha");
 a1.add("amar");
 System.out.println(a1);
 Collections.swap(a1, 1, 3);
    System.out.println(a1);
 
 
  
}
}
