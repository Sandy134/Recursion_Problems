
package recursion;

import java.util.Scanner;

public class LogarathmicPower {
    static int count=0;
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int n=in.nextInt();
        System.out.println(power(x,n));
        System.out.println(count);
    }
    static int power(int x,int n)
    {
        count++;
        if(n==0)return 1;
        int subRes=power(x,n/2);
        int res=subRes*subRes;
        if(n%2==1)res=res*x;
        return res;
    }
}
