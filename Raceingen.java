import java.util.*;
import java.io.*;
class Raceingen{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			long x=Long.parseLong(in[0]);
			long r=Long.parseLong(in[1])*60;
			long m=Long.parseLong(in[2])*60;
			long total=Math.min(x,r);
			if(x<r){
				total+=(r-x)*2;
			}
			if(total<=m){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
			
		}


	}

}
