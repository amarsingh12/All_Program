package Recursion;
public class Recursive_Function 
{
    public void display(int i,int n)
    {
       if(i==n)
       {
           System.out.println(i);
       }
       else
       {
           System.out.print(i + " ");
           display(i+1,n);
       }
    }
    public static void main(String[] args)
    {
        Recursive_Function obj = new Recursive_Function();
        obj.display(1,5);
    }
    
}
