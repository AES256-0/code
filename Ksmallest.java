import java.io.*;
import java.util.*;
class Ksmallest{
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
		int k=Integer.parseInt(bread.readLine());
		PriorityQueue<Integer> pq=new PriorityQueue<>((i,j)->i>j?-1:1);
		for(int i:arr){

			pq.add(i);
			if(pq.size()>k)
				pq.poll();
		}
		System.out.println(pq);
	}

}
