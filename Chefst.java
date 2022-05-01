import java.io.*;
import java.util.*;
class Chefst{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			long n1=Long.parseLong(in[0]);
			long n2=Long.parseLong(in[1]);
			long m=Long.parseLong(in[2]);
			long min=n1<n2?n1:n2;
			long sum=m*(m+1)/2;
			long subt=sum<min?sum:min;
			System.out.println(n1-subt+n2-subt);



		}



	}


}
