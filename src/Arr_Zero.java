
public class Arr_Zero {
    public static void main(String[] args) {
       int a[] = {1,0,6,0,3,4,0,2};
       aa(a);
        
    }
    
    public static void aa(int[] a)
    {
       int b = a.length;
       int count = 0;
        System.out.println("Length of an Array is  "+b );
        for(int i=0;i<b;i++)
        {
           if(a[i]%2==0)
           {
           a[count++] = a[i];
           }
        
        else
        {
            a[count++] = 0;
        }
        }
         for(int i=0;i<b;i++)
         {
             
          System.out.print(a[i] + " " );
          
             
         }
        
    
    }
}
