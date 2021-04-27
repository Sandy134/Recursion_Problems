
package recursion;
import java.util.Scanner;
public class Palindromestring {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        System.out.println(isPal(str.toCharArray(),0,str.length()-1));
    }
    static boolean isPal(char pal[],int s,int e)
    {
        if(s>=e)return true;
        if(pal[s]!=pal[e])return false;
        return isPal(pal,s+1,e-1);
        
    }
    
}
