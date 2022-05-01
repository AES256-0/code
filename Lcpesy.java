import java.io.*;
import java.util.*;

class Lcpesy{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int n=Integer.parseInt(bread.readLine());
		while(n-->0){
			String a=bread.readLine();
			String b=bread.readLine();
			HashMap<Character,Integer> map=new HashMap<>();
			for(int i=0;i<a.length();i++){
					if(map.containsKey(a.charAt(i))){
						map.put(a.charAt(i),map.get(a.charAt(i))+1);
					}
					else{
						map.put(a.charAt(i),1);
					}

			}
			int ans=0;
			for(int i=0;i<b.length();i++){
				if(map.containsKey(b.charAt(i))){
					int k=map.get(b.charAt(i));
					if(k>0){
						ans++;
						map.put(b.charAt(i),k-1);
						
					}
				}

			}
			System.out.println(ans);

		}


	}


}
