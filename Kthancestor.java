import java.util.*;
class Kthancestor{
	static ArrayList<Integer> graph[];
	static int log, memo[][],level[];
	private static void dfs(int s,int p){
		memo[s][0]=p;
		for(int i=1;i<log;i++){
			memo[s][i]=memo[memo[s][i-1]][i-1];
			if(memo[s][i]==-1)
				break;
		}
		for(int v:graph[s]){
			if(v!=p){
				level[v]=level[s]+1;
				dfs(v,s);
			}

		}	
	}
	private static int kthAncestor(int node,int k){
		if(level[node]<k)
			return -1;

		for(int i=0;i<log;i++){
			if((k &(1<<i))!=0){
				node=memo[node][i];
			}

		}
		return node;

	}
	public static void main(String[] args){
		int n=6;
		level=new int[n];
		graph=new ArrayList[n];
		log=0;
		while((1<<(log+1))<=n){
			log++;
		}
		System.out.println("log is:"+log);
		memo=new int[n][log];
		for(int i=0;i<n;i++){
			Arrays.fill(memo[i],-1);
		}
		for(int i=0;i<n;i++){
			graph[i]=new ArrayList();
		}
		graph[0].add(1);
		graph[0].add(2);
		graph[1].add(3);
		graph[1].add(4);
		graph[2].add(5);
		dfs(0,0);
		for(int i=0;i<n;i++){
			for(int j=0;j<log;j++){
				System.out.print(memo[i][j]+" ");

			}
			System.out.println();

		}
		System.out.println(kthAncestor(5,3));


	}



}
