
public class withou_loop {
    public static void main(String[] args)
   { 
      ab(1); 
  
    }
    public static void ab(int b)
    {
       
       if(b<=10)
       {
           System.out.println(b);
          ab(b+1);
       }
      
      
    }
   
}
