
package recursion;
import java.util.Scanner;

public class PowerSet {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        totalSubSequences(s,0,"a");
    }
    static void totalSubSequences(String s,int i,String cur)
    {
            if(i==s.length())
            {
                System.out.print(cur);
                System.out.println();
                return;
            }
            totalSubSequences(s, i+1, cur+s.charAt(i));
            totalSubSequences(s, i+1, cur);
    }
}
