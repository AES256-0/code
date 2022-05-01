import java.util.ArrayList;
import java.util.Stack;
class Graph{
	ArrayList<ArrayList<Edge>> al=new ArrayList<>();
	int V;
	public static class Edge{
		int src;
		int dst;
		int weight;
		public Edge(int src,int dst,int weight){
			this.src=src;
			this.dst=dst;
			this.weight=weight;

		}


	}
	public Graph(int n){
		this.V=n;
		for(int i=0;i<n;i++){
			al.add(new ArrayList<Edge>());
		}
	}
	public void addEdge(int v,int u,int w){
		al.get(v).add(new Edge(v,u,w));
	}
	public void topSort(int vertex,boolean[] visited,Stack<Integer> stack){
		visited[vertex]=true;
		for(Edge i:al.get(vertex)){
			if(!visited[i.dst]){
				topSort(i.dst,visited,stack);
			}
		}
		stack.push(vertex);
	}
	public int[] topSortUtil(int s){
		boolean[] visited=new boolean[V];
		int[] dist=new int[V];
		for(int i=0;i<V;i++){
			dist[i]=Integer.MAX_VALUE;
		}
		dist[s]=0;
		
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<V;i++){
			if(!visited[i]){
				topSort(i,visited,stack);
			}
		}
		int[] nodes=new int[V];
		int i=0;
		while(!stack.empty()){
			int v=stack.pop();
			if(dist[v]!=Integer.MAX_VALUE){
				for(Edge  e:al.get(v)){
					if(dist[e.dst]>dist[e.src]+e.weight){
						dist[e.dst]=dist[e.src]+e.weight;
					}
				}
			}
		}
		return dist;
	}
	public static void main(String[] args){
		Graph g=new Graph(6);
		g.addEdge(0, 1, 5);
        	g.addEdge(0, 2, 3);
        	g.addEdge(1, 3, 6);
        	g.addEdge(1, 2, 2);
        	g.addEdge(2, 4, 4);
        	g.addEdge(2, 5, 2);
        	g.addEdge(2, 3, 7);
        	g.addEdge(3, 4, -1);
        	g.addEdge(4, 5, -2);
		int[] dist=g.topSortUtil(1);
		for(int i:dist){
			System.out.print(i+" ");
		}
	}


}
