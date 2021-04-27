
package recursion;
import java.util.Scanner;

public class MatrixPAths {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        System.out.println(totalPaths(m,n));
    }
    static int totalPaths(int m,int n)
    {
        if(m==1 || n==1)return 1;
        return totalPaths(m-1,n)+totalPaths(m,n-1);
    }
}
