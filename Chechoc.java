import java.io.*;
import java.util.*;

class Chechoc{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		int i=0;

		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(bread.readLine());
		}
		return arr;
	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] ar=bread.readLine().split(" ");
			int n=Integer.parseInt(ar[0]);
			int m=Integer.parseInt(ar[1]);
			int x=Integer.parseInt(ar[2]);
			int y=Integer.parseInt(ar[3]);
			int[][] arr=new int[n][m];
			int a=-1;
			int b=-1;
			if(n==1 && m==1){
				System.out.println(x);
			}
			else{
			if(x>=y){
				a=y;
				b=0;
			}
			else{
				a=x;
				int rem=y-x;
				//
				if(rem>x)
				{
					b=x;
				}
				else{
					b=rem;
				}
			}
			int first=0,second=0;
			for(int i=0;i<n;i++){
				if(i%2==0){
					first=a;
					second=b;
				}
				else{
					first=b;
					second=a;
				}
				for(int j=0;j<m;j++){
					if(j%2==0){
						arr[i][j]=first;
					}
					else{
						arr[i][j]=second;
					}	
				}
			}
			int sum=0;
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					sum+=arr[i][j];	
				}
				
			}
			System.out.println(sum);
			}
		}



	}


}
