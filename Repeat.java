import java.util.*;
import java.io.*;
class Repeat{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			int n=Integer.parseInt(in[0]);
			int k=Integer.parseInt(in[1]);
			int s=Integer.parseInt(in[2]);
			int sum=n*n;
			System.out.println((s-sum)/(k-1));

		}


	}
}
