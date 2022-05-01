import java.util.*;
import java.io.*;
class PairSum{
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
		int n=Integer.parseInt(bread.readLine());
		int[] arr=readInput(n);
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i :arr){
			map.put(i,0);
		}
		int count=0;
		for(int j:arr){
			if(map.containsKey(-1*j)){
				map.remove(j);
				count++;	
			}
		}
		System.out.println(count);
	}
}
