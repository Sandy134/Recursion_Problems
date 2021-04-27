
package recursion;
import java.util.Scanner;

public class Recursion {

  
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int res=findPow(a,b);
        System.out.println(res);
                       
                        
        
    }
    static int findPow(int a,int b)
    {
        if(b==0)return 1;
        return findPow(a,b-1)*a;
    }
    
}
