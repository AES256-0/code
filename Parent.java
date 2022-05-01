import java.util.ArrayList;
import java.util.LinkedList;
class Parent{
	int V;
	ArrayList<ArrayList<Integer>> all=new ArrayList<>();
	public Parent(int v){
		this.V=v;
		for(int i=0;i<v;i++){
			all.add(new ArrayList<>());
		}
	}
	public void addEdge(int u,int v){
		all.get(u).add(v);
		all.get(v).add(u);
	}
	public void DFS(int src){
		int[] visited=new int[V];
		int[] parent=new int[V];
		for(int i=0;i<V;i++){
			parent[i]=-1;
		}
		parent[src]=src;
		LinkedList<Integer> list=new LinkedList<>();
		list.add(src);
		visited[src]=1;
		while(!list.isEmpty()){
			int node=list.pollFirst();
			//visited[node]=1;
			for(int i:all.get(node)){
				if(visited[i]!=1){
					parent[i]=node;
					visited[i]=1;
					list.add(i);
				}
			}
		}
		for(int i=0;i<parent.length;i++){
			System.out.println(i+":"+parent[i]);
		}	


	}
	public static void main(String[] args){
		Parent p=new Parent(4);
		p.addEdge(0,1);
		p.addEdge(0,2);
		p.addEdge(1,3);
		p.DFS(0);


	}


}
