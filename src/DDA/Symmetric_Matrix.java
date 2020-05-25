
package DDA;
public class Symmetric_Matrix 
{
    public static void main(String[] args)
    {
        System.err.println("Elemnt is a ......."); 
        int arr [][] = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9},
                            };
        System.out.println("Elemnt is.......sum ");
        int r,c,sum =0;
        for(r=0;r<3;r++)
        {
            for(c=0;c<3;c++)
            {
                if(r==0 || r==2 || c==0 || c==2 )
                {
                    sum = sum + arr[c][r];
                }
            }
        }
        System.out.println("The Sum of an Arra  " + sum);
    }
}
