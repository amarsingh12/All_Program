
package String;

import java.util.Scanner;

public class RollNo_Student {
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);
        int rollno[] = new int[5];
        String name[] = new String[5];
        int i;
         System.out.println("Enter the  5 Roll no and name of an 5 Student");
         for( i =0 ; i<5;i++)
         {
            rollno[i] = sc.nextInt();
            name[i] = sc.nextLine();            
         }
         System.out.println("Roll\tName");
         for(i =0 ; i<5 ;i++)
         {
             System.out.println(rollno[i] + "\t" + name[i] );
         }
    }
    
}
