
package recursion;
import java.util.Scanner;
public class JosephusProblem {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        System.out.println(survived(n,k));
    }
    static int survived(int n,int k)
    {
        if(n==1)return 0;
        return (survived(n-1,k)+k)%n;
        
    }
}
