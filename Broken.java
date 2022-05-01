import java.io.*;
import java.util.*;
class Broken{
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
			int[] arr=readInput(n);
			boolean ans[]=new boolean[n];
			for(int i=0;i<n-1;i++){
				if(arr[i]!=arr[i+1]){
					ans[i]=true;
					ans[i+1]=true;
				}

			}
			int count=0;
			for(boolean i:ans){
				if(i){
					count++;
				}
			}	

			System.out.println(count);

		}



	}


}
