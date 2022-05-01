import java.util.*;
import java.io.*;
class Imdb{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			int n=Integer.parseInt(in[0]);
			int k=Integer.parseInt(in[1]);
			int max=-1;
			while(n-->0){
				String[] d=bread.readLine().split(" ");
				if(Integer.parseInt(d[0])<=k && max<Integer.parseInt(d[1])){
					max=Integer.parseInt(d[1]);
				}
	
			}
			System.out.println(max);


		}


	}
}
