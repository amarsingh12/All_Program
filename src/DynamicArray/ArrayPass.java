package DynamicArray;
public class ArrayPass {
     public static void  ab(String[] color)
     {
         for(int  i = 0 ;i<= color.length-1 ;i++)
         {
         System.out.println(color[i]);  
         }
     }
    
    public static void main(String[] args)
    {
      String[] colors = {"Amr","bulbul","mom","divya"}; 
      ab(colors);
    }
}
