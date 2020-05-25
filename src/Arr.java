
import java.util.Scanner;


public class Arr {
    public static void main(String[] args) {
        System.out.println("Plz enter array size");
         Scanner sc = new Scanner(System.in);
         
        String[] a = new String[sc.nextInt()];
        
        System.out.println("Plz enter any no.");
       
        for(int i= 0 ; i<a.length ; i++)
        {
            a[i] = sc.next();
        }
        System.out.println("plz enter any no........");
        for(int i= 0 ; i<a.length ; i++)
        {
            System.out.println(a[i]);
        }
        
        
        
 
}
}