import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedHashMap;
import java.util.Set;
class Attic{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){

			String s=bread.readLine();
			int count=0;
			int time=0;
			LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='.'){
					count++;
				}
				else{
					if(count!=0){
						map.put(count,0);
						count=0;
					}


				}	
			}
			if(count!=0){
				map.put(count,0);
			}
			Set<Integer> set=map.keySet();
			int max=-1;
			for(int i: set){
				if(max<i){
					time++;
					max=i;
				}

			}
			System.out.println(time);
		}


	}
}
