import java.io.*;
import java.util.*;
class ExtractUniqueCharacter{
	
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		String s=bread.readLine();
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++){
			map.put(s.charAt(i),0);
		}
		Set<Character> set=map.keySet();
		for(char c:set){
			System.out.print(c);
		}


	}


}
