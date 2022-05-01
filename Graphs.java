import java.io.*;
import java.util.*;
class Graphs{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[][] makeGraph(int vt,int e) throws IOException{
		int[][] arr=new int[vt][vt];
		for(int i=0;i<e;i++){
			System.out.print("u:");
			int u=Integer.parseInt(bread.readLine());
			System.out.print("v:");
			int v=Integer.parseInt(bread.readLine());
			System.out.print("w:");
			int w=Integer.parseInt(bread.readLine());
			arr[u][v]=w;
			arr[v][u]=w;
		
		}
		return arr;
	}

	private static void dfs(int[][] graph,int s,int[] visited){
		//System.out.print(s+" ");
		visited[s]=1;
		for(int i=0;i<graph.length;i++){
			if(graph[s][i]!=0 &&s!=i && visited[i]!=1){
				dfs(graph,i,visited);
			}
		}


	}

	private static void bfs(int[][] graph,int s){
		LinkedList<Integer> list=new LinkedList<>();
		list.add(s);
		boolean[] visited=new boolean[graph.length];
		while(!list.isEmpty()){
			int node=list.pollFirst();
			if(!visited[node]){
				visited[node]=true;
				System.out.print(node+" ");
			}
			for(int i=0;i<graph.length;i++){
				if(graph[node][i]!=0 && node!=i &&!visited[i]){
					list.add(i);
				}
	
			}		
		}
	}
	
	private static boolean  hasPathDfs(int[][] graphs,int s,int u,int v,boolean[] visited){
		if(u==v || s==v){
			return true;
		}
		visited[s]=true;
		for(int i=0;i<graphs.length;i++){
			if(i!=s && graphs[s][i]==1 && !visited[i]){
				return hasPathDfs(graphs,i,u,v,visited);
			}

		}
		return false;
	}



	private static void disconnectDfs(int[][] graphs,int s){
		int[] visited=new int[graphs.length];
		for(int i=0;i<graphs.length;i++){
			if(visited[i]!=1)
			dfs(graphs,i,visited);
			System.out.println();
			
		}

	}

	private static boolean hasPathBfs(int[][] graphs,int u,int v){
		LinkedList<Integer> list=new LinkedList<>();
		list.add(u);
		boolean[] visited=new boolean[graphs.length];
		boolean flag=false;
		visited[u]=true;
		while(!list.isEmpty()){
			int node=list.pollFirst();
			if(node==v){
				return true;
			}
			for(int i=0;i<graphs.length;i++){
				if(i!=node && graphs[node][i]!=0 && !visited[i]){
					list.add(i);
					visited[i]=true;
				}
			}

		}
		return false;

	}
	
	private static String path(int[][] graph,int s,int u,int v,boolean[] visited){
		if(u==v || s==v){
			return String.valueOf(v);
		}
		visited[s]=true;
		for(int i=0;i<graph.length;i++){
			if(i!=s && graph[s][i]==1 && !visited[i] ){
				String p=path(graph,i,u,v,visited);
				if(!p.equals("")){
					return String.valueOf(s)+p;
				}
				return p;
			}

		}
		return "";

	}


	private static String pathBfs(int[][] graph,int u,int v){
		boolean[] visited=new boolean[graph.length];
		LinkedList<Integer> list=new LinkedList<>();
		list.add(u);
		visited[u]=true;
		Map<Integer,Integer> map=new HashMap<>();
		map.put(u,u);
		boolean flag=false;
		while(!list.isEmpty()){
			int node=list.pollFirst();
			for(int i=0;i<graph.length;i++){
				if(i!=node && !visited[i] && graph[node][i]==1){
					visited[i]=true;
					map.put(i,node);
					list.add(i);
					if(i==v){
						flag=true;
						break;	
					}
				}
			}
		}
		if(flag){
			int key=v;
			String ans=String.valueOf(key);
			while(key!=u){
				key=map.get(key);
				ans=String.valueOf(key)+ans;
			}
			return ans;

		}
		return "";
	}

	private static boolean isConnected(int[][] graph){
		LinkedList<Integer> list=new LinkedList<>();
		list.add(0);
		boolean[] visited=new boolean[graph.length];
		visited[0]=true;
		int count=0;
		while(!list.isEmpty()){
			int node=list.pollFirst();
			count++;
			for(int i=0;i<graph.length;i++){
				if(i!=node &&  graph[node][i]==1 && !visited[i]){
					list.add(i);
					visited[i]=true;
					
				}

			}
		}
		if(count==graph.length)
			return true;
		return false;
	}
	


	private static int noOfConnectedIslands(int[][] graph){
		int[] visited=new int[graph.length];
		int count=0;
		for(int i=0;i<graph.length;i++){
			if(visited[i]!=1){
				dfs(graph,i,visited);
				count++;
			}			
		}
		return count;

	}

	private static int count(int[][] graph,int s,int x,int[] visited){
		visited[s]=1;
		int count=0;
		for(int i=0;i<graph.length;i++){
			if(graph[s][i]>x){
				visited[i]=1;
				count++;
			}
		}
		System.out.println("count is:"+count+":"+s);
		for(int i=0;i<graph.length;i++){
			if(i!=s && graph[s][i]>0 && visited[i]!=1){
				count+=count(graph,i,x,visited);
				
			}
		}
		
		return count;

	}


	public static void main(String[] args) throws IOException{
		int v=Integer.parseInt(bread.readLine());
		int e=Integer.parseInt(bread.readLine());
		int[][] graph=makeGraph(v,e);
	//	dfs(graph,0,new int[v]);
	//	System.out.println();
	//	bfs(graph,0);
	//	System.out.println();
	//	disconnectDfs(graph,0);
	/*	System.out.println(hasPathBfs(graph,0,3));
		System.out.println(hasPathDfs(graph,1,1,3,new boolean[graph.length]));
		System.out.println(path(graph,0,0,3,new boolean[graph.length]));
		System.out.println(pathBfs(graph,0,3));*/
		System.out.println(isConnected(graph));
		System.out.println();
		System.out.println(noOfConnectedIslands(graph));
		System.out.println(count(graph,0,1,new int[graph.length]));

	}

}
