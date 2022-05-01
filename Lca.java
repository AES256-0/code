import java.util.*;
class Lca{
	private static ArrayList<Integer> g[];
	private static int level[],memo[][],log;

	public void dfs(int u,int p){
		memo[u][0]=p;
		for(int i=1;i<=log;i++){
			memo[u][i]=memo[memo[u][i-1]][i-1];

		}
		for(int v:g[u]){
			if(v!=p){
				level[v]=level[u]+1;
				dfs(v,u);
			}
		}
	}
	public static void main(String[] args){
		Lca l=new Lca();
		int n=9;
		g=new ArrayList[n+1];
		for(int i=1;i<10;i++){
			g[i]=new ArrayList();
	
		}
		log=(int)Math.ceil(Math.log(9)/Math.log(2));
		memo=new int[n+1][log+1];
		level=new int[10];
		 for (int i = 0; i <= n; i++)
            Arrays.fill(memo[i], -1);
		 g[1].add(2);
   	         g[2].add(1);
        	 g[1].add(3);
        	 g[3].add(1);
         	 g[1].add(4);
        	 g[4].add(1);
        	 g[2].add(5);
        	 g[5].add(2);
        	 g[3].add(6);
        	 g[6].add(3);
        	 g[3].add(7);
        	 g[7].add(3);
        	 g[3].add(8);
        	 g[8].add(3);
        	 g[4].add(9);
        	 g[9].add(4);
		 l.dfs(1,1);
		 for(int i=1;i<level.length;i++){
			System.out.println(i+":"+level[i]);
		 }
		 for(int i=1;i<=n;i++){
			for(int j=0;j<=log;j++){
				System.out.print(memo[i][j]+" ");
			}
			System.out.println();
	
		 }
	}

}
