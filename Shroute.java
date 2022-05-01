import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Shroute{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	
	private static int[] readInput(int n,int[] ans) throws IOException{
		int[] arr=new int[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		int start=-1;
		while(st.hasMoreTokens()){
			arr[i]=Integer.parseInt(st.nextToken());
			if(ans!=null){
			if(arr[i]==1){
				start=i;
				ans[i]=0;
			}
			else{
				if(start==-1)
				{
					ans[i]=Integer.MAX_VALUE;
				}
				else{
					ans[i]=i-start;
				}
			}
			}
			i++;
		}
		return arr;
	}
	
	private static int[] readInputB(int n,int[] ans) throws IOException{
		int[] arr=new int[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		int start=-1;
		while(st.hasMoreTokens()){
			arr[i]=Integer.parseInt(st.nextToken());
			if(arr[i]==1)
			{
				System.out.print(0+" ");
			}
		
			else{
				if(ans[arr[i]-1]==Integer.MAX_VALUE){
					System.out.print("-1 ");
				}
				else{
				System.out.print(ans[arr[i]-1]+" ");
				}
			}
			i++;
		}
		return arr;
	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] temp=bread.readLine().split(" ");
			int n=Integer.parseInt(temp[0]);
			int m=Integer.parseInt(temp[1]);
			int ans[]=new int[n];
			int a[]=readInput(n,ans);
			int start=-1;
			for(int i=n-1;i>=0;i--){
				if(a[i]==2){
					start=i;
					ans[i]=0;
				}
				else{
					if(start!=-1){
						int diff=start-i;
						if(diff<ans[i]){
							ans[i]=diff;
						}
					}

				}

			}
			int b[]=readInputB(m,ans);
			System.out.println();
		}

	}

}
