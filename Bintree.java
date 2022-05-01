import java.io.*;
import java.util.*;

class Bintree{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		int n=Integer.parseInt(bread.readLine());
		while(n-->0){
			String[] in=bread.readLine().split(" ");
			int i=Integer.parseInt(in[0]);
			int j=Integer.parseInt(in[1]);
			int c=0;
			while(i!=j){
				if(i>j){
					i=i/2;
				}
				else{
					j=j/2;
				}
				c++;
			}
			System.out.println(c);

		}

	}
}

