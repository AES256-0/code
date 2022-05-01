import java.util.*;
import java.io.*;
class Delish{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static int[] readInput(int n) throws IOException{
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
			int[] prefix=new int[n];
			int[] suffix=new int[n];
			int[][] sum=
			prefix[0]=arr[0];
			for(int i=1;i<n-1;i++){
				prefix[i]=prefix[i-1]+arr[i];
			}
			suffix[n-1]=arr[n-1];
			for(int i=n-2;i>0;i--){
				suffix[i]=suffix[i+1]+arr[i];
			}
			for(int i:prefix){
				System.out.print(i+" ");
			}
			System.out.println();
			for(int i:suffix){

				System.out.print(i+" ");
			}
			long max=Integer.MIN_VALUE;
			for(int i=0;i<n-1;i++){
				for(int j=i;j<n-1;j++){
					long diff=
				}
			}


		}



	}




}
