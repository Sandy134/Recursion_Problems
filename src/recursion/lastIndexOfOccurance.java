
package recursion;

import java.util.Scanner;


public class lastIndexOfOccurance {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
         int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=in.nextInt();
        int key=in.nextInt();
        System.out.println(lastIndex(arr,arr.length-1,key));
    }
    static int lastIndex(int arr[],int n,int key)
    {
        if(n<0)return -1;
        if(arr[n]==key)return n;
        return lastIndex(arr,n-1,key);
    }
    
}
