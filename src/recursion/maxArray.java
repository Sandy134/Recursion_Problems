
package recursion;
import java.util.Scanner;

public class maxArray {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=in.nextInt();
        System.out.println(max(arr,1));
        
    }
    static int max(int arr[],int n)
    {
        if(n==arr.length)return 0;
        int subPro=max(arr,n+1);
        if(arr[n]>subPro)return arr[n];
        return subPro;
    }
}
