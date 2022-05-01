import java.util.*;
import java.io.*;
class BigArray{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			long n=Long.parseLong(in[0]);
			long s=Long.parseLong(in[1]);
			long sum=n*(n+1)/2;
			long diff=sum-s;
			if(1<=diff && diff<=n){
				System.out.println(diff);
			}
			else{
				System.out.println("-1");
			}


		}



	}


}
