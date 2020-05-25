
import java.util.ArrayList;




public class Collection {
    public static void main(String[] args)
    {
        ArrayList  a1 = new ArrayList();
        a1.add(10);
        a1.add("ratan");
        a1.add(2000);
        a1.add(1.34);
        a1.add(12345);
        a1.add(2, "amar");
        System.out.println(a1);
        
         ArrayList  a2 = new ArrayList(a1);
         a2.add(123456);
         a2.add("singh");
         a2.remove(3);
         System.out.println(a2);
}
}
