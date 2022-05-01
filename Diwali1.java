import java.util.*;
import java.io.*;
class Diwali1{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			long p=Long.parseLong(in[0]);
			long a=Long.parseLong(in[1]);
			long b=Long.parseLong(in[2]);
			long c=Long.parseLong(in[3]);
			long x=Long.parseLong(in[4]);
			long y=Long.parseLong(in[5]);
			// anar= x*a+b
			// chakri=y*a+c
			// max=a*(x+y)+b+c
			// p=55 a=1 b=3 c=3 x=4 y=5
			// 25 50
			long cost_a=x*a+b;
			long cost_c=y*a+c;
			long min=Math.min(cost_a,cost_c);
			System.out.println(p/min);
			
		}

	}

}
