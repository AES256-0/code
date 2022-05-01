import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
import java.io.*;
class Maxand{

		
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	private static int[] readInput(int len) throws IOException{
		int[] arr=new int[len];
		int i=0;
		StringTokenizer s=new StringTokenizer(bread.readLine());
		while(s.hasMoreTokens()){
			arr[i++]=Integer.parseInt(s.nextToken());
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
			long[] count=new long[32];
			for(int i=0;i<n;i++){
				for(int j=0;j<32;j++){
					if((arr[i]&1<<j)!=0){
						count[j]++;
					}
				}
			}
			long[] c=new long[32];
			for(int i=0;i<32;i++){
				c[i]=count[i]*(1<<i);
			}
			HashSet<Integer> set=new HashSet<>();
			System.out.println(Arrays.toString(c));
			while(k-->0){
				int indx=-1;
				long max=-1;
				for(int i=0;i<c.length;i++){
					if(!set.contains(i) &&c[i]>max){
						max=c[i];
						indx=i;	
					}
				}
				if(indx!=-1)
				set.add(indx);
			}	
			long sum=0;
			System.out.println(set);
			for(int num:set){
				sum+=(1<<num);
			}
			System.out.println(sum);

		}
	}
}
