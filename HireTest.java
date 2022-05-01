import java.util.*;
import java.io.*;
class HireTest{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			int n=Integer.parseInt(in[0]);
			int m=Integer.parseInt(in[1]);
			in=bread.readLine().split(" ");
			int x=Integer.parseInt(in[0]);
			int y=Integer.parseInt(in[1]);
			StringBuilder sb=new StringBuilder();
			while(n-->0){
				String s=bread.readLine();
				int fc=0;
				int pc=0;
				for(int i=0;i<s.length();i++){
					if(s.charAt(i)=='F'){
						fc++;
					}
					else if(s.charAt(i)=='P'){
						pc++;
					}
				}
				sb.append(fc>=x || (fc==(x-1) &&pc>=y)?"1":0);
				
			}
			System.out.println(sb.toString());

		}



	}


}
