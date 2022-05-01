import java.io.*;
class FLOW018{

	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{

		int t=Integer.parseInt(bread.readLine());
		long[] dp=new long[20+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=20;i++){
			dp[i]=i*dp[i-1];
		}
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			System.out.println(dp[n]);	
		}


	}


}
