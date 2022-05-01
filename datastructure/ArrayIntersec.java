import java.util.*;
import java.io.*;
class ArrayIntersec{
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
			int n=Integer.parseInt(bread.readLine());
			int[] f=readInput(n);
			int m=Integer.parseInt(bread.readLine());
			int[] s=readInput(m);
			HashMap<Integer,Integer> map=new HashMap<>();
			for(int i:f)
				map.put(i,0);
			for(int j:s)
			{
				if(map.containsKey(j)){
					System.out.print(j);
				}
			}
		}
	}

}
