import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.PriorityQueue;
import java.util.Collections;
class Lelemon{
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
			String[] in=bread.readLine().split(" ");
			int[] rooms=readInput(Integer.parseInt(in[1]));
			int n=Integer.parseInt(in[0]);
			PriorityQueue<Integer>[] arr=new PriorityQueue[n];
			int i=0;
			while(i<n){
				arr[i]=new PriorityQueue(Collections.reverseOrder());
				String[] da=bread.readLine().split(" ",2);
				StringTokenizer st=new StringTokenizer(da[1]);
				while(st.hasMoreTokens()){
					arr[i].add(Integer.parseInt(st.nextToken()));
				}
				i++;

			}
			long sum=0;
			for(int j:rooms){
				if(arr[j].size()!=0)
				sum+=arr[j].poll();
			}
			System.out.println(sum);
		}
		
	}
}
