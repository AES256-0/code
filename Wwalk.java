import java.io.*;
import java.util.*;
class Wwalk{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static int[] readInput(int n) throws IOException{
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
			int n=Integer.parseInt(bread.readLine());
			int f[]=readInput(n);
			int s[]=readInput(n);
			long sf=0;
			long ss=0;
			//1 3 3 4      3 1 3 4 5
			// sf==ss and f[i]==s[i] =>ans+=f[i]
			//1 2 4 4      2 1 4 4 5
			long ans=0;
			for(int i=0;i<n;i++){
				sf+=f[i];
				ss+=s[i];
				if(ss==sf && f[i]==s[i]){
					ans+=f[i];
				}
			}
			System.out.println(ans);
	
		}

	}

}
