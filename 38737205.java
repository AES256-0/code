import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.HashSet;
import java.util.ArrayList;
class Ddimmst{
	private static long totalsum;
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static Integer[] readInput(int d) throws IOException{
		Integer[] arr=new Integer[d];
		StringTokenizer st=new StringTokenizer(bread.readLine());
		int i=0;
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(st.nextToken());
		}
		return arr;
	}
				                        								

	public static void  main(String[] args) throws IOException{
		String[] init=bread.readLine().split(" ");
		int n=Integer.parseInt(init[0]);
		int t=n;
		int edges[]=new int[n];
		ArrayList<Integer[]> list=new ArrayList<Integer[]>();
		while(t-->0){
			list.add(readInput(Integer.parseInt(init[1])));
		
		}
		int c=0;
		for(int i=0;i<n;i++){
			Integer[] node=list.get(i);
			for(int j=0;j<n;j++){
				Integer[] second=list.get(j);
				int sum=0;
				for(int k=0;k<Integer.parseInt(init[1]);k++){
					sum=sum+Math.abs(node[k]-second[k]);

				}
				edges[j]=-1*sum;
			}
			prims(edges,n);
		}
		System.out.println(totalsum);
	//	prims(edges,n);

	}
	private static void prims(int[] edges,int n){
		int parent[]=new int[n];
		int weights[]=new int[n];
		boolean visited[]=new boolean[n];

		for(int l=0;l<n;l++){

			visited[l]=false;
			weights[l]=Integer.MAX_VALUE;

		}
		parent[0]=-1;
		weights[0]=0;
		for(int i=0;i<n;i++){
			int minVertex=findMinVertex(weights,visited,n);
			visited[minVertex]=true;
			for(int j=0;j<n;j++){
				if(edges[j]!=0 && !visited[j]){
					if(edges[j]<weights[j]){
						weights[j]=edges[j];
						parent[j]=minVertex;
					}
				}
			}
		}
		int sum=0;
		for(int k=0;k<n;k++){
			sum=sum+weights[k];
		}
		totalsum=totalsum-1*sum;
	//	System.out.println(-1*sum);



	}
	private static int findMinVertex(int[] weights,boolean[] visited,int n){
		int minVertex=-1;
		for(int i=0;i<n;i++){
			if(!visited[i] && (minVertex==-1 || weights[i]<weights[minVertex])){

				minVertex=i;

			}
		}
			return minVertex;
	}

}
