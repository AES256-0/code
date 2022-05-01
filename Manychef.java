import java.util.*;
import java.io.*;
class Manychef{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String in=bread.readLine();
			char[] s=in.toCharArray();
			for(int i=s.length-4;i>=0;i--){
				if(!(s[i]=='C' || s[i]=='?')) continue;
				if(!(s[i+1]=='H'||s[i+1]=='?'))continue;
				if(!(s[i+2]=='E'||s[i+2]=='?'))continue;
				if(!(s[i+3]=='F'||s[i+3]=='?'))continue;
				s[i]='C';
				s[i+1]='H';
				s[i+2]='E';
				s[i+3]='F';
			}
			for(int i=0;i<s.length;i++){
				if(s[i]=='?')
					s[i]='A';
			}
			System.out.println(new String(s));
		

		}


	}

}
