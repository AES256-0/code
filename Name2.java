import java.util.*;
import java.io.*;
class Name1{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] p=bread.readLine().split(" ");
			String parent=p[0]+p[1];
			int n=Integer.parseInt(bread.readLine());
			int[] count=new int[26];
			for(char i:parent.toCharArray()){
				count[i-'a']+=1;
			}
			String c="";
			while(n-->0){
				c+=bread.readLine();
			}
			String ans="YES";
			for(char i:c.toCharArray()){
				count[i-'a']--;
				if(count[i-'a']<0){
					ans="NO";
					break;
				}
			}
			System.out.println(ans);
		}
		


	}


}
