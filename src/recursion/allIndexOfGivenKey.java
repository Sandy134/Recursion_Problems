
package recursion;
import java.util.Scanner;

public class allIndexOfGivenKey {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=in.nextInt();
        int key=in.nextInt();
        displayAllIndex(arr,0,key);
    }
    static void displayAllIndex(int arr[],int n,int key)
    {
        if(n==arr.length)return;
        if(arr[n]==key)System.out.print(n+" ");
        displayAllIndex(arr,n+1,key);
    }
}
