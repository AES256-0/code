import java.io.*;
import java.util.*;
class Trainset{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			HashMap<String,Integer[]> map=new HashMap<>();
			while(n-->0){
				String[] inp=bread.readLine().split(" ");
				if(!map.containsKey(inp[0])){
					Integer[] count=new Integer[2];
					count[0]=0;
					count[1]=0;
					count[Integer.parseInt(inp[1])]++;
					map.put(inp[0],count);
				}
				else{
					Integer[] count=map.get(inp[0]);
					count[Integer.parseInt(inp[1])]++;
					map.put(inp[0],count);

				}
			}
			Set<String> set=map.keySet();
			int sum=0;
			for(String s:set){
				Integer[]  arr=map.get(s);
				sum+=Math.max(arr[0],arr[1]);
			}
			System.out.println(sum);	

		}
	}
}
