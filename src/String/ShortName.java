
package String;

import java.util.Scanner;

public class ShortName {
    public static void main(String[] args)
    {
     System.out.println("Enter the Full Name");
     Scanner sc = new Scanner(System.in);
     String str =  sc.nextLine();
      int i =    str.indexOf(' ');
      int i1 = str.lastIndexOf(' ');
          String s1 =  str.substring(0, i);
          String s2 = str.substring(i+1,i1);
          String s3 = str.substring(i1 +1);
          System.out.println("The First name " + s1);
           System.out.println("The Middle name " + s2);
            System.out.println("The Last name " + s3);
          System.out.println(s1.charAt(0) + ". " + s2.charAt(0) + ". " + s3.charAt(0));
          
}
}
