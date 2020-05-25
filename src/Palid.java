
public class Palid {
    public static void main(String[] args)
    {
        int U=0,L=0,D=0,S=0;
    String  s = "Yo man Whts up? OMG$#@ I am 5 min Late in 10 ";
    for( int i = 0; i<s.length();i++ )
    {
          char ch  = s.charAt(i);
    
    if(Character.isAlphabetic(ch))
    {
        if(Character.isLowerCase(ch))
        {
            L++;
           
        }
        else
        {
          U++;
        }
        
     
    }
    else if(Character.isDigit(ch))
    {
       D++;
    }
    else 
    {
      S++;
    }
        
    }
    
        System.out.println("The Upper is " + U);
        System.out.println("The Lower is " + L);
        System.out.println("The Digit is " + D);
        System.out.println("The Special is " + S);
    }
 
}
