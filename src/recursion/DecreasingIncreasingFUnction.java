
package recursion;
import java.util.*;
public class DecreasingIncreasingFUnction {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        pdi(n);
    }
    static void pdi(int n)
    {
        if(n==0){
            System.out.println();
            return; 
        }
       
        pdi(n-1);
        System.out.print(n+" ");
         System.out.print(n+" ");
    }
}
