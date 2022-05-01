import java.io.*;
import java.util.*;
class Three{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String s=bread.readLine();
			//aaabbb 
			//aabbb
			//aaaab
			//aaabbcc
			//aaabbbcc
			//
			//
			//abcccddddd
			int[] arr=new int[26];
			for(int i=0;i<s.length();i++){
				arr[s.charAt(i)-'a']+=1;
			}
			int ans=0;
			for(int i:arr){
				ans+=i/2;
			}
			System.out.println(Math.min(s.length()/3,ans));


		}


	}

}
