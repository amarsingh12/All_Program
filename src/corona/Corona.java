
package corona;
public class Corona 
{
    public static void main(String[] args) {
      int a[] = {4,3,5,2,1,6};
      int max = a[0];
      int min = a[0];
      for(int i=1;i<a.length;i++)
      {
          if(max<a[i])
          {
             max = a[i];
          
          }
          else if(min>a[i])
          {
             min = a[i];
          
          }
      }
        System.out.println("the Largest no in an array is an........." + max);
         System.out.println("the Smallest no in an array is an........." + min);
    }
    
}
