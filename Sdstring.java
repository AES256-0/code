import java.util.*;
import java.io.*;
class Sdstring{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String s=bread.readLine();
			if(s.length()%2!=0){
				System.out.println("-1");
			}
			else{
				int c0=0;
				int c1=0;
				for(int i=0;i<s.length();i++){
					if(s.charAt(i)=='0'){
						c0++;
					}
					else{
						c1++;
					}
				}
				if(c0==0 || c1==0){
					System.out.println("-1");
				}
				else{
					int ans=c1>c0?s.length()/2-c0:s.length()/2-c1;
					System.out.println(ans);
				}
			}
		}
	}
}
