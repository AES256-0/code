import java.util.*;
import java.io.*;
class Distcode{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String s=bread.readLine();
			Set<String> set=new HashSet<>();
			for(int i=0;i<s.length()-1;i++){
				String a=s.substring(i,i+2);
				if(!set.contains(a)){
					set.add(a);
				}
			}
			System.out.println(set.size());

		}


	}

}
