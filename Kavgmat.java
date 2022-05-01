import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Kavgmat{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[][] readInput(int m,int n) throws IOException{
		int[][] arr=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=Integer.parseInt(bread.readLine());
			}
		}
		return arr;
	}
	public static int[][] dp(int[][] arr,int m,int n){
		int[][] cost=new int[m][n];
		for(int i=0;i<n;i++){
			cost[m-1][i]=arr[m-1][i];
		}
		for(int i=0;i<m;i++){
		    	cost[i][n-1]=arr[i][n-1];
		}
	}
	public static void main(String... s) throws IOException{
		int t=Integer.parseInt(bread.readLine());	
		while(t-->0){
			String[] args=bread.readLine().split(" ");
			int m=Integer.parseInt(args[0]);
			int n=Integer.parseInt(args[1]);
			int k=Integer.parseInt(args[2]);
			int[][] arr=readInput(m,n);
			int[][] dp=dp(arr);

		}
	}

}
