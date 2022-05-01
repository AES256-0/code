import java.util.*;
import java.io.*;
class Difstr{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			StringBuilder sb=new StringBuilder();
			int i=0;
			while(n-->0){
				String s=bread.readLine();
				sb.append(s.charAt(i)=='1'?"0":"1");
				i++;
			}
			System.out.println(sb.toString());
			



		}



	}


}
