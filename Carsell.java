import java.io.*;
import java.util.*;
class Carsell{
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
			int n=Integer.parseInt(bread.readLine());
			int[] arr=readInput(n);
			// 1 2 3 3  - 3 2 0 0 -1 1 1 0
			Arrays.sort(arr);
			long sum=0;
			int j=0;
		       for(int i=n-1;i>=0;i--){
			 	int diff=arr[i]-j++;
				if(diff<0)
					diff=0;
				sum=(sum%1000000007+diff%1000000007)%1000000007;
		       }	 
		 	System.out.println(sum);      

		}


	}


}
