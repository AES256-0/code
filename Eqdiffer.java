import java.util.*;
import java.io.*;
class Eqdiffer{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int len) throws IOException{
		int[] arr=new int[len];
		int i=0;
		StringTokenizer s=new StringTokenizer(bread.readLine());
		while(s.hasMoreTokens()){
			arr[i++]=Integer.parseInt(s.nextToken());
		}
		return arr;
	}

	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			Map<Integer,Integer> map=new HashMap<>();
			int[] arr=readInput(n);
			for(int i=0;i<n;i++){
				if(map.containsKey(arr[i])){
					map.put(arr[i],map.get(arr[i])+1);
				}
				else{
					map.put(arr[i],1);
				}
			}
			Set<Integer> set=map.keySet();
			int max=-1;
			for(int j:set){
				max=Math.max(map.get(j),max);
			}
			if(n==1){
				System.out.println("0");
			}
			else if(max==1){
				System.out.println(n==2?0:n-2);
			}
			else if(max==n || max==-1){
				System.out.println("0");
			}
			else{
				System.out.println(n-max);
			}
		}


	}


}
