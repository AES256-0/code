import java.util.*;
import java.io.*;
class Ammeat{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			int n=Integer.parseInt(in[0]);
			long m=Long.parseLong(in[1]);
			String[] data=bread.readLine().split(" ");
			long[] arr=new long[n];
			for(int i=0;i<n;i++){
				arr[i]=Long.parseLong(data[i]);
			}
			Arrays.sort(arr);
			long sum=0;
			int c=0;
			for(int i=n-1;i>=0;i--){
				sum+=arr[i];
				c++;
				if(sum>=m){
					break;
				}
				
			}
			if(sum<m){
				System.out.println("-1");
			}
			else{
				System.out.println(c);
			}

		}


	}


}
