import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
class Xxoorr{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
//	private static HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
	public static int[] readInput(int n,HashMap<Integer,Integer> map) throws IOException{
		int[] arr=new int[n];
		int i=0;
		for(int j=0;j<32;j++){
			map.put(j,0);
		}
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i]=Integer.parseInt(st.nextToken());
			
			for(int j=0;j<32;j++){			// 0011,0110,1010
				if((arr[i]&1<<j)>0){
					map.put(j,map.get(j)+1);
				}
			}
			i++;

		}
		return arr;

	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] input=bread.readLine().split(" ");
			int n=Integer.parseInt(input[0]);
			int k=Integer.parseInt(input[1]);
			HashMap<Integer,Integer> map=new HashMap<>();
			int sum=0;
			int[] arr=readInput(n,map);
			//System.out.println(map);
			Set<Integer> set=map.keySet();
			for(int key:set){
				int d=map.get(key)/k;
				int r=map.get(key)%k;
				sum+=d;
				if(r!=0){
					sum+=1;
				}
			}
			System.out.println(sum);

			
		}

	}
}

