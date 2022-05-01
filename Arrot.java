import java.util.*;
import java.io.*;
class Arrot{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static long mod=(long)1e9+7;
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
		int n=Integer.parseInt(bread.readLine());
		int[] arr=readInput(n);
		int q=Integer.parseInt(bread.readLine());
		int[] qr=readInput(q);
		long ans=0;
		long sum=0;
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
		}
		sum%=mod
		if(sum<0){
			sum+=mod;
		}
		for(int i=1;i<=q;i++){
			 sum=sum*2;
			 if(sum>=mod){
				sum-=mod;
			 }
			 System.out.println(sum);
		}
		



	}


}
