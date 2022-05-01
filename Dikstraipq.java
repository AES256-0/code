import java.util.*;
class Graph{
	int V;
	ArrayList<ArrayList<Edge>> all=new ArrayList<>();
	TreeMap<SourceWeight,Integer> map=new TreeMap<>((ob1,ob2)->{
			return (ob1.w<ob2.w)?-1:(ob1.w==ob2.w)?0:1;
	});
	public Graph(int v){
		this.V=v;
		for(int i=0;i<v;i++){
			all.add(new ArrayList<Edge>());
		}

	}
	public static class SourceWeight{
		int s;
		int w;
		public SourceWeight(int s,int w){
			this.s=s;
			this.w=w;
		}
	}
	public static class Edge{
		int s;
		int d;
		int w;
		public Edge(int s,int d,int w){
			this.s=s;
			this.d=d;
			this.w=w;
		}

	}
	public void addEdge(int s,int d,int w){
			all.get(s).add(new Edge(s,d,w));		
	}
	public int[] sp(int s){
		boolean[] visited=new boolean[this.V];
		int[] dist=new int[V];
		int[] parent=new int[V];
		for(int i=0;i<V;i++){
			parent[i]=-1;
		}
		parent[s]=s;
		for(int i=0;i<V;i++){
			dist[i]=Integer.MAX_VALUE;
		}
		dist[s]=0;
		map.put(new SourceWeight(s,0),0);
		while(map.size()!=0){
			Map.Entry<SourceWeight,Integer> entry=map.pollFirstEntry();
			SourceWeight key=entry.getKey();
			int value=entry.getValue();
			visited[key.s]=true;
			for(Edge e:all.get(key.s)){
				if(!visited[e.d]){
					int dst=dist[e.s]+e.w;
					if(dst<dist[e.d]){
						dist[e.d]=dst;
						parent[e.d]=e.s;
						map.put(new SourceWeight(e.d,dst),dst);
					}
			
				}
			}
		}
		for(int i=0;i<V;i++){
			System.out.print(parent[i]+" ");
		}
		System.out.println();
		return dist;
	}
	public int[] bf(){
		int[] dist=new int[V];
		for(int i=0;i<V;i++){
			dist[i]=Integer.MAX_VALUE;
		}
		dist[0]=0;
		for(int i=0;i<V-1;i++){
			for(Edge e:all.get(i)){
				int dst=dist[i]+e.w;
				if(dst<dist[e.d]){
					dist[e.d]=dst;
				}	
			}
		}
		for(int i=0;i<V-1;i++){
			for(Edge e:all.get(i)){
				int dst=dist[i]+e.w;
				if(dst<dist[e.d]){
					dist[e.d]=Integer.MIN_VALUE;
				}	
			}
		}
		return dist;
	}
	public static void main(String[] args){
		Graph g=new Graph(7);
		g.addEdge(0,1,4);
		g.addEdge(1,1,-1);
		g.addEdge(1,2,3);
		g.addEdge(2,3,3);
		g.addEdge(2,4,1);
		g.addEdge(0,6,2);
		g.addEdge(6,4,2);
		g.addEdge(3,5,-2);
		g.addEdge(4,5,2);
	//	g.addEdge(1,4,20);
	//	g.addEdge(3,2,3);
		int[] dist=g.bf();
		for(int i:dist){
			System.out.print(i+" ");
		}
	}


}
