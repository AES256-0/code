import java.io.*;
import java.util.*;
class Chfpln{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens())
		{
			arr[i++]=Integer.parseInt(st.nextToken());
	
		}	
		return arr;
	}
	public static void main(String[] args) throws IOException{

		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int[] arr=readInput(n);
			HashMap<Integer,Integer> map=new HashMap<>();
			for(int i=0;i<n;i++){
				if(map.containsKey(arr[i])){
					map.put(arr[i],map.get(arr[i])+1);
				}
				else{
					map.put(arr[i],1);
				}
			}
			Set<Integer> set=map.keySet();
			long ans=0;
			for(int i:set){
				int rem=i-1;
				int val=map.get(i);
				if(val>=rem){
					ans+=rem;
				}
				else{
					ans+=val;
				}
			}
			System.out.println(ans);
		}

	}
}
