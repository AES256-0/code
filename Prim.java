import java.util.LinkedList; 
import java.util.TreeSet; 
import java.util.Comparator; 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
  
class prims { 
 private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
   class node1 { 
  
        // Stores destination vertex in adjacency list 
        int dest; 
  
        // Stores weight of a vertex in the adjacency list 
        int weight; 
  
        // Constructor 
        node1(int a, int b) 
        { 
            dest = a; 
            weight = b; 
        } 
    } 
    static class Graph { 
  
        // Number of vertices in the graph 
        int V; 
  
        // List of adjacent nodes of a given vertex 
        LinkedList<node1>[] adj; 
  
        // Constructor 
        Graph(int e) 
        { 
            V = e; 
            adj = new LinkedList[V]; 
            for (int o = 0; o < V; o++) 
                adj[o] = new LinkedList<>(); 
        } 
    } 
  
    // class to represent a node in PriorityQueue 
    // Stores a vertex and its corresponding 
    // key value 
    class node { 
        int vertex; 
        int key; 
    } 
  
    // Comparator class created for PriorityQueue 
    // returns 1 if node0.key > node1.key 
    // returns 0 if node0.key < node1.key and 
    // returns -1 otherwise 
    class comparator implements Comparator<node> { 
  
        @Override
        public int compare(node node0, node node1) 
        { 
            return node0.key - node1.key; 
        } 
    } 
  
    // method to add an edge 
    // between two vertices 
    void addEdge(Graph graph, int src, int dest, int weight) 
    { 
  
        node1 node0 = new node1(dest, weight); 
        node1 node = new node1(src, weight); 
        graph.adj[src].addLast(node0); 
        graph.adj[dest].addLast(node); 
    } 
  
    // method used to find the mst 
    void prims_mst(Graph graph) 
    { 
  	long wt=0l;
        // Whether a vertex is in PriorityQueue or not 
        Boolean[] mstset = new Boolean[graph.V]; 
        node[] e = new node[graph.V]; 
  
        // Stores the parents of a vertex 
        int[] parent = new int[graph.V]; 
  
        for (int o = 0; o < graph.V; o++) 
            e[o] = new node(); 
  
        for (int o = 0; o < graph.V; o++) { 
  
            // Initialize to false 
            mstset[o] = false; 
  
            // Initialize key values to infinity 
            e[o].key = Integer.MAX_VALUE; 
            e[o].vertex = o; 
            parent[o] = -1; 
        } 
  
        // Include the source vertex in mstset 
        mstset[0] = true; 
  
        // Set key value to 0 
        // so that it is extracted first 
        // out of PriorityQueue 
        e[0].key = 0; 
  
        // Use TreeSet instead of PriorityQueue as the remove function of the PQ is O(n) in java. 
        TreeSet<node> queue = new TreeSet<node>(new comparator()); 
  
        for (int o = 0; o < graph.V; o++) 
            queue.add(e[o]); 
  
        // Loops until the queue is not empty 
        while (!queue.isEmpty()) { 
  
            // Extracts a node with min key value 
            node node0 = queue.pollFirst(); 
  
            // Include that node into mstset 
            mstset[node0.vertex] = true; 
	    
  
            // For all adjacent vertex of the extracted vertex V 
            for (node1 iterator : graph.adj[node0.vertex]) { 
  
                // If V is in queue 
                if (mstset[iterator.dest] == false) { 
                    // If the key value of the adjacent vertex is 
                    // more than the extracted key 
                    // update the key value of adjacent vertex 
                    // to update first remove and add the updated vertex 
                    if (e[iterator.dest].key > iterator.weight) { 
                        queue.remove(e[iterator.dest]); 
                        e[iterator.dest].key = iterator.weight; 
		//	wt=wt+iterator.weight;
                        queue.add(e[iterator.dest]); 
                        parent[iterator.dest] = node0.vertex; 
                    } 
                } 
            } 
        } 
  	System.out.println(wt);
        // Prints the vertex pair of mst 
        for (int o = 1; o < graph.V; o++) 
            System.out.println(parent[o] + " "
                               + "-"
                               + " " + o); 
    } 
  private static Integer[] readInput(int d) throws IOException{
		Integer[] arr=new Integer[d];
		StringTokenizer st=new StringTokenizer(bread.readLine());
		int i=0;
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(st.nextToken());
		}
		return arr;
	}

    public static void main(String[] args) throws IOException
    { 
        
	    String[] init=bread.readLine().split(" ");
		int n=Integer.parseInt(init[0]);
		int t=n;
		ArrayList<Integer[]> list=new ArrayList<Integer[]>();
        	Graph graph = new Graph(n); 
        	prims e = new prims(); 
		while(t-->0){
			list.add(readInput(Integer.parseInt(init[1])));
		
		}
		for(int i=0;i<n;i++){
			Integer[] node=list.get(i);
			for(int j=i+1;j<n;j++){
				Integer[] second=list.get(j);
				int sum=0;
				for(int k=0;k<Integer.parseInt(init[1]);k++){
					sum=sum+Math.abs(node[k]-second[k]);

				}
			 
        			e.addEdge(graph, i, j,-1*sum); 
			//	pq.add(new Edge(i,j,-1*sum));
			}
		}

  
        // Method invoked 
        e.prims_mst(graph); 
    } 
} 
