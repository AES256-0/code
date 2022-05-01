import java.io.*;
import java.util.*;
class MergeKarray{
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
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int[] arr=readInput(n);
			for(int i:arr)
			pq.add(i);

		}
		System.out.println(pq);
		while(pq.size()!=0){
			System.out.print(pq.poll()+" ");
		}

	}
	
}
