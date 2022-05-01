import java.io.*;
import java.util.*;
class Chefa{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens())
		{
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
			boolean dp[]=new boolean[1024];
			dp[k]=true;

			for(int i=0;i<n;i++){
				for(int j=0;j<1024;j++){
					if(dp[arr[i]^j]){
						dp[j]=true;
					}

				}


			}
			long ans=0;
			for(int i=1023;i>=0;i--){
				if(dp[i]){

					ans=i;
					break;
				}

			}
			System.out.println(ans);
		}

	}
}
