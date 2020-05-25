
package Internship;
public class Instance_block 
{
    {
        System.out.println("instance block");//run time execute
    }
    static
    {
        System.out.println("static blocks");// compile time execute
    }
    public static void main(String[] args) 
    {
       Instance_block obj = new Instance_block(); 
    }
    
}
