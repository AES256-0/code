import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Cdqu5{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	/*public static long  solveDp(int n,long[] dp){
		for(int i=4;i<=n;i++){
			dp[i]=dp[i-2]+dp[i-3];
		}


	}*/
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			long[] dp=new long[n+1];
			if(n==1){
				System.out.println(0);
			}
			else if(n==2){
				System.out.println(1);
			}
			else if(n==3){
				System.out.println(1);
			}
			else{
			
			dp[1]=0;
			dp[2]=1;
			dp[3]=1;
			//System.out.println(solveDp(n,dp));
			for(int i=4;i<=n;i++){
				dp[i]=(dp[i-2]+dp[i-3])%1000000009;
			}
			System.out.println(dp[n]);
			}
		}

	}



}
