import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

class Sakona{
		
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	private static	TreeMap<Integer,Integer> readInput(int len) throws IOException{
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
		StringTokenizer s=new StringTokenizer(bread.readLine());
		while(s.hasMoreTokens()){
			int token=Integer.parseInt(s.nextToken());
			if(map.containsKey(token)){
				map.put(token,map.get(token)+1);

			}
			else{
				map.put(token,1);
			}
		
		}
		return map;
	}

	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		for(int i=0;i<t;i++){
		String[] info=bread.readLine().split(" ");
		int Z=Integer.parseInt(info[1]);
		TreeMap<Integer,Integer> power=readInput(Integer.parseInt(info[0]));
		int count=0;
		while(true){
			Integer last_key=power.lastKey();
			Z=Z-last_key;
			int rem=power.get(last_key)-1;
			if(rem==0){
				power.remove(last_key);
			}
			else{
			power.put(last_key,rem);
			}
			int new_key=last_key/2;
			if(new_key!=0){
			if(power.containsKey(new_key)){
				power.put(new_key,power.get(new_key)+1);

			}
			else{
				power.put(new_key,1);
			}
			
			}
			count++;
			if(Z<=0 || power.size()==0){
				break;
			}
			}
		
	
		if(Z<=0){
		System.out.println(count);
		}
		else{
			System.out.println("Evacuate");
		
		
		}

		}
	}

	

}
