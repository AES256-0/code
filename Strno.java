import java.util.*;
import java.io.*;
class Strno{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			int x=Integer.parseInt(in[0]);
			int k=Integer.parseInt(in[1]);
			// x=1 k=1 0
			// x=2 k=1 1
			// x=3 k=1 1
			// x=1 k=2 0
			// x=2 k=2 0
			// x=3 k=2 1
			// x=4 k=2 1 2 3 4 -1
			// x=5 k=2 1 2 3 4 8 -1
			// x=6 k=3 1 2 3 5 4 8
			if(x<=k){
				System.out.println("0");
			}
			else{
				System.out.println("1");
			}
		}
	}
}
