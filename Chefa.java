import java.io.*;
import java.util.*;
class Chefa{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static Integer[] readInput(int n) throws IOException{
		Integer[] arr=new Integer[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens())
		{
			arr[i++]=Integer.parseInt(st.nextToken());
	
		}	
		return arr;
	}
	public static void main(String[] args) throws IOException{

		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			Integer[] arr=readInput(n);
			Arrays.sort(arr, Collections.reverseOrder());
			long sum=0;
			for(int i=0;i<n;i++){
				if(i%2==0){
					sum+=arr[i];
				}	
			}
			System.out.println(sum);
		}

	}
}
