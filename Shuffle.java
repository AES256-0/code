/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.text.DecimalFormat;
import java.io.*;
 
class Main{
	
 public static void main (String[] args) throws java.lang.Exception
 {
	 FastScanner in=new FastScanner();
	 PrintWriter out=new PrintWriter(System.out);
     int t = in.nextInt();
	 while(t-->0)
	 {
	   int n = in.nextInt();
	   int k = in.nextInt();
	   int[] a = new int[n];
	   for(int i = 0;i<n;i++)
	   {
		   a[i] = in.nextInt();
	   }
	   
	   for(int i=0;i<n;i++)
	   {
		   for(int j=i+k;j<n;j=j+k)
			{
			    int temp = 0;
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
	   }
	   int flag = 0;
	   for(int i=0;i<n-1;i++)
	   {
		   if(a[i]>a[i+1])
		   {
		    flag = 1;
		    break;
		   }
	   }
	   if(flag==0)
		   out.println("yes");
	   else
		   out.println("no");
	 }
	 out.close();
 }
 

	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
