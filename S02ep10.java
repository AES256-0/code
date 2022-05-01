import java.io.*;
import java.util.*;
class S02ep10{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
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
			String[] inp=bread.readLine().split(" ");
			int n=Integer.parseInt(inp[0]);
			int x=Integer.parseInt(inp[1]);
			int k=Integer.parseInt(inp[2]);

			int[] ross=readInput(n);
			int[] russ=readInput(n);
			int count=0;
			for(int i=0;i<n;i++){
				if(Math.abs(ross[i]-russ[i])<=k){
					count++;
				}
				if(count>=x){
					break;
				}
			}
			if(count>=x){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}

		}


	}


}
