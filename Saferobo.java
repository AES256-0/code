import java.util.*;
import java.io.*;
class Saferobo{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String s=bread.readLine();
			String[] in=bread.readLine().split(" ");
			int sa=Integer.parseInt(in[0]);
			int sb=Integer.parseInt(in[1]);
			int a_ind=s.indexOf("A");
			int b_ind=s.indexOf("B");
			boolean flag=false;
			
			while(a_ind<=b_ind){
				System.out.println(a_ind+" : "+b_ind);
				if(a_ind==b_ind){
					flag=true;
					break;
				}
				a_ind+=sa;
				b_ind-=sb;
			}
			if(flag){
				System.out.println("unsafe");
			}
			else{
				System.out.println("safe");
			}			
		}
	}
}
