class Nqueen{
	
	private static void solve(int[][] graph,int n,int s){
		if(s==n)
		{
			for(int i=0;i<graph.length;i++){
				for(int j=0;j<graph[i].length;j++){
					System.out.print(graph[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		for(int i=0;i<n;i++){
			if(possible(graph,s,i)){
				graph[s][i]=1;
				solve(graph,n,s+1);
				graph[s][i]=0;
			}
		}
	}

	private static boolean possible(int[][] graph,int i,int j){
		int row=i-1;
		while(row>=0){
			if(graph[row][j]==1)
				return false;
			row--;
		}
		row=i;
		int col=j;
		while(row>=0 && col>=0){

			if(graph[row][col]==1){
				return false;
			}
			row--;
			col--;
		}
		row=i;
		col=j;
		while(row>=0 && col<graph.length){
			if(graph[row][col]==1)
				return false;
			row--;
			col++;
		}

		return true;

	}
	public static void main(String[] args){
		int n=8;
		solve(new int[n][n],n,0);
	}


}
