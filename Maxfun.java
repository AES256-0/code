import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.util.Arrays;


class Maxfun{

	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
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
			int arr[]=readInput(n);
			Arrays.sort(arr);
			int x=arr[0];
			int y=arr[1];
			int z=arr[arr.length-1];
			long sum=0l;
			for(int i=0;i<n-1;i++)
			  sum+=2*(arr[i+1]-arr[i]);
			System.out.println(sum);


		}



	}



}
