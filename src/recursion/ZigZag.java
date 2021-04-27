
package recursion;
import java.util.Scanner;
public class ZigZag {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        zz(n);
    }
    static void zz(int n)
    {
        if(n==0)return;
        System.out.print(n+" ");
        zz(n-1);
        System.out.print(n+" ");
        zz(n-1);
        System.out.print(n+" ");
    }
}
