import java.util.*;
import java.io.*;
class Cook82c{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static PriorityQueue<Long> readInput(int n) throws IOException{
		PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			pq.add(Long.parseLong(st.nextToken()));
		}
		return pq;
	}
	public static void main(String[] args) throws IOException{
		String[] in=bread.readLine().split(" ");
		int n=Integer.parseInt(in[0]);
		int m=Integer.parseInt(in[1]);
		PriorityQueue<Long> pq=readInput(n);
		//System.out.println(pq);
		int count=0;
		while(m-->0){
			int q=Integer.parseInt(bread.readLine());
			long p=-1;
		
			while(count<q){
				//System.out.println("ppp"+pq);
				p=pq.poll();
				pq.add(p/2);
				count++;
			}
			System.out.println(p);
			//pq.add(p/2);
		}

	}


}
