
package DDA;
public class Mirror_Image 
{
    public static void main(String[] args)
    {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
                 };
        int r,c;
        System.out.println("The Mirror Image is");
        for(r=0;r<3;r++)
        {
            for(c=2;c>=0;c--)
            {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
       
    }
}
