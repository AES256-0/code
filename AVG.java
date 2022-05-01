import java.io.*;
import java.util.*;
class AVG{
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
			String[] inp=bread.readLine().split(" ");
			int n=Integer.parseInt(inp[0]);
			int k=Integer.parseInt(inp[1]);
			int v=Integer.parseInt(inp[2]);
			int[] arr=readInput(n);
			int sum=0;
			for(int i: arr){
				sum+=i;
			}
			int mult=(k+n)*v;
			int diff=mult-sum;
			if(diff<=0 || diff%k!=0){
				System.out.println("-1");
			}
			else{
				System.out.println(diff/k);
		
			}


		}


	}


}
