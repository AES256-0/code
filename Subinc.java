import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Subinc{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static int[] readInput(int n) throws IOException{
		int[] arr=new int[n+1];
		int i=1;
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
			int[] dp=new int[n+1];
			dp[n]=0;
			for(int i=n-1;i>0;i--){
				if(arr[i]<=arr[i+1]){
					dp[i]=dp[i+1]+1;
				}
				else{
					dp[i]=0;
				}
			}
			long sum=0l;
			for(int i=1;i<=n;i++){
				System.out.println("dp:"+dp[i]);
				sum+=dp[i];
			}
			sum+=n;
			System.out.println(sum);


		}


	}


}
