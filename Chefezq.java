import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Chefezq{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	private static long[] readInput(int n) throws IOException{  
		long[] arr=new long[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){

			arr[i++]=Long.parseLong(st.nextToken());

		}
		return arr;


	}
	public static void main(String[] args) throws IOException{

		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] data=bread.readLine().split(" ");
			long k=Long.parseLong(data[1]);
			int n=Integer.parseInt(data[0]);
			long[] arr=readInput(n);
			int i=0;
			long    count=0l;
			while(arr[i]>=k && i!=n-1){
				arr[i+1]=arr[i+1]+arr[i]-k;
				i++;
				count++;

			}
			count=arr[i]<k?count:count+(long)arr[i]/k;
			System.out.println(count+1);


		}

	}

}
