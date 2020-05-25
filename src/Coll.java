
import java.util.ArrayList;
import java.util.Arrays;


public class Coll {
    public static void main(String[] args)
    {
    String[] s = {"aaa","bbb","ccc"};
    ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(s));
    a1.add("ratan");
    a1.add("amar");
    System.out.println(a1);
    
    ArrayList<String> a2 = new ArrayList<String>();
    a2.add("momma");
    a2.add("papaaaa");
    
        String[] s1 = new String[a2.size()];
        a2.toArray(s1);
        for(String ss:s1)
        {
            System.out.println(ss);
        }
    
    }
   
}
