
package Logical_Program;
public class CallByValue_CallbyRerence 
{
    static void fun(int a[])
    {
              a[1] = 9;
    }
    public static void main(String[] args) 
    {
        int arr[] = {4,5,6};
        
        CallByValue_CallbyRerence.fun(arr);
        for(int i =0 ; i< arr.length;i++)
        {
        System.out.println(arr[i]);
        }
        
    }
  
}
