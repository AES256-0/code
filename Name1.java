import java.util.*;
import java.io.*;
class Name1{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] p=bread.readLine().split(" ");
			String parent=p[0]+p[1];
			HashMap<Character,Integer> map=new HashMap<>();
			for(int i=0;i<parent.length();i++){
				if(map.containsKey(parent.charAt(i))){
					map.put(parent.charAt(i),map.get(parent.charAt(i))+1);
				}
				else{
					map.put(parent.charAt(i),1);
				}
			}
			int n=Integer.parseInt(bread.readLine());
			String c="";
			while(n-->0){
				c+=bread.readLine();
			}
			
			HashMap<Character,Integer> child=new HashMap<>();
			for(int i=0;i<c.length();i++){
				if(child.containsKey(c.charAt(i))){
					child.put(c.charAt(i),child.get(c.charAt(i))+1);
				}
				else{
					child.put(c.charAt(i),1);
				}		
			}
			Set<Character> set=child.keySet();
			String ans="YES";
			for(char i:set){
				if(!map.containsKey(i)||child.get(i)>map.get(i)){
					ans="NO";
					break;
				}
			}
			System.out.println(ans);
		}
		


	}


}
