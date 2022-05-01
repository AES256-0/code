import java.util.*;
import java.io.*;
class Mvalue{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static long[] readInput(int n) throws IOException{
		long[] arr=new long[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i++]=Long.parseLong(st.nextToken());
		}
		return arr;
	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			long[] arr=readInput(n);
			//find 2 max and 2 min
			//
			//
			//
		
			Arrays.sort(arr);
			//a*b+a-b =(a-1)*(b+1)+1
			long ans=Long.MIN_VALUE;
			ans=Math.max(ans,(arr[0]-1)*(arr[1]-1)+1);
			ans=Math.max(ans,(arr[n-2]+1)*(arr[n-1]-1)+1);
			System.out.println(ans);
			
			
			
			
			/*	long a=0,b=0,ans=0;
			if(arr[0]<0 && arr[1]<0){
				a=arr[0]*arr[1]+arr[1]-arr[0];
			}
			else if(arr[0]<0 || arr[1]<0){
				a=arr[0]<0?arr[0]*arr[1]+arr[1]-arr[0]:arr[0]*arr[1]+arr[0]-arr[1];
			
			}
			else{
				a=arr[0]*arr[1]+arr[1]-arr[0];
			}	
			if(arr[n-2]<0 && arr[n-1]<0){
				b=arr[n-1]*arr[n-2]+arr[n-2]-arr[n-1];
			}
			else if(arr[n-1]<0 || arr[n-2]<0){
					b=arr[n-1]*arr[n-2]+arr[n-1]-arr[n-2];
			}
			else{
				b=arr[n-1]*arr[n-2]+arr[n-1]-arr[n-2];

			}
			ans=a>b?a:b;
			System.out.println(ans);*/
		}
	}

}
