import java.util.*;
import java.io.*;
class Dischar{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String a=bread.readLine();
			boolean[] ch=new boolean[26];
			int count=0;
			for(int i=0;i<a.length();i++){
				if(ch[a.charAt(i)-'a']==false){
					count++;
					ch[a.charAt(i)-'a']=true;
				}
			}
			System.out.println(count);

		}


	}



}
