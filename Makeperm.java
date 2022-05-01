import java.io.*;
import java.util.*;
class Makeperm{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		int i=0;
		StringTokenizer  st=new StringTokenizer(bread.readLine());
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
			boolean[] b=new boolean[n+1];
			for(int i=0;i<n;i++){
				if(1<=arr[i] && arr[i]<=n){
					b[arr[i]]=true;
				}
			}
			int count=0;
			for(int i=1;i<=n;i++){
				if(!b[i])
					count++;	
			}
			System.out.println(count);
		}
	}
}
