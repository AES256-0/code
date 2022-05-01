import java.util.*;
import java.io.*;
class Grid{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			char[][] inp=new char[n+1][n+1];
			for(int i=1;i<=n;i++){
				String s=bread.readLine();
				for(int j=1;j<=n;j++){
					inp[i][j]=s.charAt(j-1);
				}
			}
			int[][] RayX=new int[n+1][n+1];
			int[][] RayY=new int[n+1][n+1];
			for(int i=1;i<=n;i++){
				for(int j=n;j>=1;j--){
		
					if( inp[i][j] =='.'){	
						RayX[i][j] = (j!=n)?RayX[i][j+1]:1;
					}
					else {
						RayX[i][j] = 0;
					}	
		
					if ( inp[j][i] == '.' ) {
						RayY[j][i] = (j!=n)?RayY[j+1][i]:1;
					}
					else{ 
						RayY[j][i] = 0;
					}
				}
			}
			int sum=0;
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					if ( RayX[i][j] == 1 && RayY[i][j] == 1)	
						sum++;
				}
			}
			System.out.println(sum);

			/*int[][] dp=new int[n][n];
			dp[n-1][n-1]=ch[n-1][n-1]=='#'?0:1;
			for(int j=n-2;j>=0;j--){
				dp[n-1][j]=ch[n-1][j]=='#'?0:dp[n-1][j+1];
				dp[j][n-1]=ch[j][n-1]=='#'?0:dp[j+1][n-1];
			}
			/*for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.print(dp[i][j]+" ");
				}
				System.out.println();
			}*/
		/*	for(int i=n-2;i>=0;i--){
				for(int j=n-2;j>=0;j--){
					if(dp[i+1][j]==1 &&dp[i][j+1]==1){
						dp[i][j]=1;
					}
					else{
						dp[i][j]=0;
					}

				}
			}*/
			//. . .
			//. . #
			//. . .
			//dp[n-2][n-2]=
			/*int ans=0;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					
					if(solve(i,j,n,ch))ans++;
					
				}
			}
			System.out.println(ans);*/


		}


	}
	public static boolean solve(int i,int j,int n,char[][] ch){
		for(int k=i;k<n;k++){
			if(ch[k][j]=='#')
				return false;
		}
		for(int k=j;k<n;k++){
			if(ch[i][k]=='#')
				return false;
		}	
		return true;
	

	}


}
