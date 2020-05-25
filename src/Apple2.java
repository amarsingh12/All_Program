
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Apple2 {
    public static void main(String[] args)
    {
        int a[] = {2,3,1,2,7,3,3}; 
        Map<Integer,Integer> hm = new HashMap<>();
        for(int no:a)
        {
          Integer count =   hm.get(no);
          if(count==0)
          {
            hm.put(no, 1);
          }
          else
          {
          count = count + 1;
          hm.put(no, count);
          }
          
        }
        
        
    }
    
}
