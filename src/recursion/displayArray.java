
package recursion;
import java.util.Scanner;
public class displayArray {
    
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        display(arr,0);
    }
    static void display(int arr[],int n)
    {
        if(n==arr.length)return;
        System.out.print(arr[n]+" ");
        display(arr,n+1);
    }
    
}
