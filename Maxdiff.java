import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;


class Maxdiff{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int sum=0;
	private static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i]=Integer.parseInt(st.nextToken());
			sum=sum+arr[i++];
		}
		return arr;

	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] data=bread.readLine().split(" ");
			int n=Integer.parseInt(data[0]);
			int k=Integer.parseInt(data[1]);
			sum=0;
			int[] arr=readInput(n);
			Arrays.sort(arr);
			int end=arr.length-1;
			int sum1=0,sum2=0;
			for(int i=0;i<k;i++){
				sum1=arr[i]+sum1;
						
			}
			int first=Math.abs(sum1-(sum-sum1));
			while(k-->0){
				sum2=sum2+arr[end--];
			}
			int second=Math.abs(sum2-(sum-sum2));
			
			System.out.println(Math.max(first,second));

			
		}	

	}
}

