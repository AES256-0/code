/* package codechef; // don't place package name! */

 /* import java.util.*;
import java.lang.*;
import java.io.*;

 Name of the class has to be "Main" only if the class is public. 
class Codechef
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		   long n=Long.parseLong(br.readLine());
		   long sum=1;
		   if(n>=1)
		    sum=sum+  ((n-2)*(n-1));
		    
		    System.out.println(sum);
		
		}
	}
} */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OddSum
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int T = Integer.parseInt(bufferedReader.readLine());
        
        while(T-->0)
        {
            long N = Long.parseLong(bufferedReader.readLine());
            long sum=1;
            
if(N==1){
   int  b=1;
    out.println(b);
}
            
          else 
          {
              sum = sum + (N-2)*(N-1);
                out.println(sum);
          }

        
       //  System.out.println(sum);
        }
        
       out.close();
        
        
    }
}
