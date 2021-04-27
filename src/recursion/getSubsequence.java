
package recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class getSubsequence {
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        String s=in.next();
        ArrayList<String>res=getSubSequence(s);
        System.out.println(res);
        
      
    }
        static ArrayList<String> getSubSequence(String s)
        {
            if(s.length()==0)
            {
                ArrayList<String>bres=new ArrayList<>();
                bres.add("");
                return bres;
            }
            
            char c=s.charAt(0);
            String ros=s.substring(1);
            ArrayList<String>rres=getSubSequence(ros);
            
            ArrayList<String>mres=new ArrayList<>();
            for(String temp:rres)
                mres.add(""+temp);
            for(String temp:rres)
                mres.add(c+temp);
            
            return mres;
        }
}
