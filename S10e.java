import java.io.*;
import java.util.*;
class S10e{
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
			int i=0;
			int j=1;
			int ans=1;
			
			while(j<n){
				int min=retMin(i,j-1,arr);
				if(min>arr[j])
					ans++;
				j++;
				if(j>5)
				i++;
			}
			System.out.println(ans);
		}
	}
	public static int retMin(int i,int j,int[] arr){
		int min=Integer.MAX_VALUE;
		for(int k=i;k<=j;k++){
			if(min>arr[k])
				min=arr[k];
		}
		return min;
	}
}
