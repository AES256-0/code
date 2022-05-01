import java.io.*;
import java.util.*;
class FBMT{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			Map<String,Integer> map=new HashMap<>();
			if(n==0){
				System.out.println("Draw");
			}
			else if(n==1){
				String ans=bread.readLine();
				System.out.println(ans);
			}
			else{
			while(n-->0){
				String key=bread.readLine();
				if(map.containsKey(key)){
					map.put(key,map.get(key)+1);
				}
				else{
					map.put(key,1);
				}	

			}
			Set<String> set=map.keySet();
			ArrayList<String> list=new ArrayList<>(set);
			String a=list.get(0);
			String b=list.get(1);
			if(map.get(a)>map.get(b)){
				System.out.println(a);
			}
			else if(map.get(a)<map.get(b)){
				System.out.println(b);
			}
			else{
				System.out.println("Draw");
			}
			}
		}
	}
}
