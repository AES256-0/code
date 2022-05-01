import java.util.*;
import java.io.*;
class Fastfood{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(st.nextToken());
		}
		return arr;
	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int[] cf=readInput(n);
			int[] cb=readInput(n);
			long[] a=new long[n];
			long[] b=new long[n];
			a[0]=cf[0];
			b[n-1]=cb[n-1];
			for(int i=1;i<n;i++){
				a[i]=a[i-1]+cf[i];
				b[n-1-i]=b[n-1-i+1]+cb[n-1-i];
			}
			long max=Long.MIN_VALUE;
			for(int i=0;i<n-1;i++){
					Math.max(max,a[i]+b[i+1]);
				
			}
			max=Math.max(max,b[0]);
			max=Math.max(max,a[n-1]);
			System.out.println(max);

		}

	}


}
