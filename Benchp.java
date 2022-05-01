import java.util.*;
import java.io.*;
class Benchp{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(st.nextToken());
		}
		return arr;
	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			int n=Integer.parseInt(in[0]);
			int w=Integer.parseInt(in[1]);
			int rod=Integer.parseInt(in[2]);
			int[] arr=readInput(n);
			long sum=0;
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
			for(Integer i:set){
				int v=map.get(i);
				if(v>=2){
					sum+=2*(((long)v/2)*i);
				}
			}
			sum+=rod;
			if(sum>=w){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");

			}



		}


	}


}
