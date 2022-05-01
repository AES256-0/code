import java.util.*;
import java.io.*;
class Zoz{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int arr[]=new int[n];
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
			String[] in=bread.readLine().split(" ");
			int n=Integer.parseInt(in[0]);
			int k=Integer.parseInt(in[1]);
			int[] arr=readInput(n);
			long sum=0;
			for(int i=0;i<n;i++){
				sum+=arr[i];
			}
			int c=0;
			for(int i=0;i<n;i++){
				if(sum-arr[i]<arr[i]+k)
					c++;
			}
			System.out.println(c);

		}


	}

}
