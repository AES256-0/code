import java.io.*;
import java.util.*;

class Kingship{
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
			int[] arr=readInput(n);
			int min=Integer.MAX_VALUE;
			for(int i=0;i<n;i++){
				if(arr[i]<min){
					min=arr[i];
				}
			}
			long sum=0;
			for(int i=0;i<n;i++){
				sum+=((long)min)*arr[i];
			}
			System.out.println(sum-min*min);
		}

	}
}
