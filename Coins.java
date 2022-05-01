import java.util.*;
import java.io.*;
class Coins{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		//int t=Integer.parseInt(bread.readLine());
		int t=1;
		// 100
		// 50 33 25
		// 25 11 6



		Map<Integer,Long> map=new HashMap<>();
		map.put(0,0l);
		map.put(1,1l);
		map.put(2,2l);
	//	map.put(3,3l);
	//	map.put(4,4l);
		int n;
			Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
		    int input = sc.nextInt();
		    System.out.println(helper(input,map));
		}


	}
	public static long helper(int n,Map<Integer,Long> map){
		if(n<=2){
			return map.get(n);
		}
		if(map.containsKey(n)){
			return map.get(n);
		}
		long ans=Math.max(n,helper(n/2,map)+helper(n/3,map)+helper(n/4,map));
		map.put(n,ans);
		return ans;
		
	}


}
