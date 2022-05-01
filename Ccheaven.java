import java.util.*;
import java.io.*;
class Ccheaven{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int l=Integer.parseInt(bread.readLine());
			String s=bread.readLine();
			int c0=0,c1=0;
			
			boolean flag=false;
			for(int i=0;i<l;i++){
				if(s.charAt(i)=='0')
					c0++;
				if(s.charAt(i)=='1')
					c1++;
				if(c1>=c0){
					flag=true;
					break;
				}
			}
			if(flag){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}

		}

	}


}
