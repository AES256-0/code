import java.util.*;
import java.io.*;
class Date1{
	public static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			long a=Long.parseLong(in[0]);
			long y=Long.parseLong(in[1]);
			long x=Long.parseLong(in[2]);
			if(a>=y){
				System.out.println(y*x);
			}
			else{
				System.out.println(a*x+1);
			}

		}


	}


}
