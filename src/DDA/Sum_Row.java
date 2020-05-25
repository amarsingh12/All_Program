
package DDA;
public class Sum_Row 
{
    public static void main(String[] args)
    {
       int mat[][] = 
       {
           {1,2,3,4},
           {5,6,7,8},
           {9,10,11,12}
       };
        int r ,c,s;
        System.out.println("Displaying the sum of Each Column");
        for(c=0;c<4;c++)
        {
            s =0;
            for(r=0;r<3 ;r++)
            {
                s = s + mat[r][c];
            }
            System.out.print(s + " ");
            
        }
        
       
    }
}
