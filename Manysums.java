import java.util.*;
import java.io.*;
class Manysums{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			int l=Integer.parseInt(in[0]);
			int r=Integer.parseInt(in[1]);
			System.out.println(2*r-2*l+1);
		}
	}


}
