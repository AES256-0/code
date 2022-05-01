import java.util.*;
import java.io.*;
class Prfxgd{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String s=bread.readLine();
			String[] in=bread.readLine().split(" ");
			int k=Integer.parseInt(in[0]);
			int x=Integer.parseInt(in[1]);
			int[] count=new int[26];
			int ans=0;
			for(int i=0;i<s.length();i++){
				int c=count[s.charAt(i)-'a'];
				if(c<x){	
						ans++;
						count[s.charAt(i)-'a']+=1;				
				}
				else{
					if(k==0)
						break;
					k--;
	
				}
			}
			System.out.println(ans);

		}


	}

}
