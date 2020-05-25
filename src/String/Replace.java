
package String;
public class Replace {
    public static void main(String[] args) 
    {
     String s1 = "     15 august is indepedence day";
     String s2 = s1.replace("15 august", "26 January").replace("indepedence", "Republic").trim();
     System.out.println(s2);
    }
   
}
