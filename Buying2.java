import java.util.*;
import java.io.*;
class Buying2{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static int[] readInput(int n) throws IOException{
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
			String[] in=bread.readLine().split(" ");
			int n=Integer.parseInt(in[0]);
			int p=Integer.parseInt(in[1]);
			int[] arr=readInput(n);
			int sum=0,min=Integer.MAX_VALUE;
			for(int i=0;i<n;i++){
				sum+=arr[i];
				if(min>arr[i]){
					min=arr[i];
				}				
			}
			int d=sum/p;
			int r=sum%p;
			if(r<min){
				System.out.println(d);
			}
			else{
				System.out.println("-1");
			}

		}


	}

}
