import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Set;

class FirstNonRepeat{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		String s=bread.readLine();
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++){
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}else{
				map.put(s.charAt(i),1);
			}
		}
		Set<Character> set=map.keySet();
		boolean flag=false;
		for(Character c:set){
			if(map.get(c)==1){
				System.out.println(c);
				flag=true;
				break;
			}
		}
		if(!flag){
			System.out.println(s.charAt(0));
		}

	}
}
