
import java.io.BufferedReader;


public class Reverse_3 {
    public static void main(String[] args) 
    {
        String str = "ABCD";
        String rev= "";
        int len =   str.length();
       /*for(int i= len-1;i>=0 ;i--)
       {
                    rev =   rev + str.charAt(i);
       }
        System.out.println("THe Reverse String is " + rev + " ");  */
            char[] a  = str.toCharArray();
            for(int i= len-1;i>=0 ;i--)
       {
                    rev =   rev + str.charAt(i);
       }
             System.out.println("THe Reverse String2 is " + rev + " ");
             
           StringBuffer sb = new StringBuffer(str);
           System.out.println(sb.reverse());
            
        
    }
   
}
