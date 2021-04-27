
package recursion;
import java.util.Scanner;

public class firstIndexOccurance {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=in.nextInt();
        int key=in.nextInt();
        System.out.println(firstIndex(arr,0,key));
    }
    
    static int firstIndex(int arr[],int n,int key)
    {
        if(n==arr.length)return -1;
        if(arr[n]==key)return n;
        return firstIndex(arr,n+1,key);
    }
}
