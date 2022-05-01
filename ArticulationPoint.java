import java.util.*;

class Graph{
	int V;
	ArrayList<ArrayList<Integer>> all=new ArrayList<>();
	int time=0;
	public static final int NIL=-1;
	public Graph(int v){
		this.V=v;
		for(int i=0;i<v;i++){
			all.add(new ArrayList<>());
		}
	}
	public void addEdge(int u,int v){
		all.get(u).add(v);
		all.get(v).add(u);
	}
	public void APUtil(int u,boolean[] visited,int[] disc,int[] low,int[] parent,boolean[] ap){
		int children=0;
		visited[u]=true;
		disc[u]=++time;
		low[u]=disc[u];
		for(int v:all.get(u)){
			if(!visited[v]){
				children++;
				parent[v]=u;
				APUtil(v,visited,disc,low,parent,ap);
				low[u]=Math.min(low[u],low[v]);
				if(parent[u]==NIL && children>1){
					ap[u]=true;
				}
				if(parent[u]!=NIL && low[v]>=disc[u])
					ap[u]=true;
		

			}
			else if(v!=parent[u]){
				low[u]=Math.min(low[u],disc[v]);
			}

		}


	}

	public void bridgeUtil(int u,boolean[] visited,int[] disc,int[] low,int[] parent){
		visited[u]=true;
		disc[u]=++time;
		low[u]=time;
		for(int v:all.get(u)){
			if(!visited[v]){
				parent[v]=u;
				bridgeUtil(v,visited,disc,low,parent);
				low[u]=Math.min(low[u],low[v]);
				if(disc[u]<low[v]){
					System.out.println(u+" "+v);
				}

			}
			else if(v!=parent[u]){
				low[u]=Math.min(low[u],disc[v]);
			}


		}

	
	
	
	
	
	}
	void bridge()
    {
        // Mark all the vertices as not visited
        boolean visited[] = new boolean[V];
        int disc[] = new int[V];
        int low[] = new int[V];
        int parent[] = new int[V];


        // Initialize parent and visited, and ap(articulation point)
        // arrays
        for (int i = 0; i < V; i++)
        {
            parent[i] = NIL;
            visited[i] = false;
        }

        // Call the recursive helper function to find Bridges
        // in DFS tree rooted with vertex 'i'
        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                bridgeUtil(i, visited, disc, low, parent);
    }


	 void AP()
    {
        // Mark all the vertices as not visited
        boolean visited[] = new boolean[V];
        int disc[] = new int[V];
        int low[] = new int[V];
        int parent[] = new int[V];
        boolean ap[] = new boolean[V]; // To store articulation points

        // Initialize parent and visited, and ap(articulation point)
        // arrays
        for (int i = 0; i < V; i++)
        {
            parent[i] = NIL;
            visited[i] = false;
            ap[i] = false;
        }

        // Call the recursive helper function to find articulation
        // points in DFS tree rooted with vertex 'i'
        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                APUtil(i, visited, disc, low, parent, ap);

        // Now ap[] contains articulation points, print them
        for (int i = 0; i < V; i++)
            if (ap[i] == true)
                System.out.print(i+" ");
    }

    // Driver method
    public static void main(String args[])
    {
        // Create graphs given in above diagrams
        System.out.println("Articulation points in first graph ");
        Graph g1 = new Graph(8);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(2, 3);
        g1.addEdge(3, 4);
        g1.addEdge(2, 5);
        g1.addEdge(5, 6);
        g1.addEdge(5, 7);
        g1.addEdge(6, 7);
	g1.bridge();
        System.out.println();
    }

}
