import java.util.*;
import java.io.*;
class Sumpower{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			int n=Integer.parseInt(in[0]);
			int k=Integer.parseInt(in[1]);
			String s=bread.readLine();
			int[] diff=new int[n-1];
			for(int i=0;i<n-1;i++){
				diff[i]=s.charAt(i)!=s.charAt(i+1)?1:0;
			}
			long cost=0;
			long sum=0;
			for(int i=0;i<k;i++)
				cost+=diff[i];
			sum+=cost;
			for(int i=0;i<n-k-1;i++){
				cost-=diff[i];
				cost+=diff[k+i];
				sum+=cost;
			}
			//aabbcc:wq
			//
			//aab-abb-bbc-bcc
			//a a b
			//a b b
			//b b c
		/*	int i=1;
			int j=k;
			long ans=0;
			while(j<n){
			
				ans+=count(i,j,s);
				i++;
				j++;
			}*/
			System.out.println(sum);
		}
	}
	public static long count(int i,int j,String s){
		long ans=0;
		for(int k=i;k<=j;k++){
			if(s.charAt(k-1)!=s.charAt(k))
				ans++;
		}
		return ans;

	}


}
