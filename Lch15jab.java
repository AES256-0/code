import java.io.*;
import java.util.HashMap;
import java.util.Set;
class Lch15jab{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String s=bread.readLine();
			HashMap<Character,Integer> map=new HashMap<>();
			for(int i=0;i<s.length();i++){
				if(map.containsKey(s.charAt(i))){
					map.put(s.charAt(i),map.get(s.charAt(i))+1);
				}
				else{
					map.put(s.charAt(i),1);
				}	
			}
			int n=s.length();
			Set<Character> set=map.keySet();
			boolean flag=false;
			for(char c:set){
				if(map.get(c)==n-map.get(c)){
					flag=true;
					break;
				}
			}
			System.out.println(flag?"YES":"NO");



		}




	}


}
