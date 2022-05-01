class Ratmaze{

	private static boolean isSafe(int[][] maze,int i,int j){
		if(i>=0 && j>=0 && j<maze.length && i<maze.length && maze[i][j]==1)
			return true;
		return false;

	}

	private static void solve(int[][] maze,int[][] visited,int i,int j,int n){
			if(i==n-1 && j==n-1){
				visited[i][j]=1;

				for(int k=0;k<n;k++){
					for(int m=0;m<n;m++){
						System.out.print(visited[k][m]+" ");
					}
					System.out.println();

				}
				System.out.println();
				return;
			}
			visited[i][j]=1;
			if(isSafe(maze,i-1,j)){
				if(visited[i-1][j]!=1){			
					solve(maze,visited,i-1,j,n);
				}

			}
			if(isSafe(maze,i+1,j)){
				if(visited[i+1][j]!=1){
				solve(maze,visited,i+1,j,n);
				}
			}
			
			if(isSafe(maze,i,j-1)){
				if(visited[i][j-1]!=1){
				solve(maze,visited,i,j-1,n);
				}
			}
			
			if(isSafe(maze,i,j+1)){
				if(visited[i][j+1]!=1){
				solve(maze,visited,i,j+1,n);
				}
			}
			visited[i][j]=0;
					
	}
	public static void main(String[] args){

		int n=4;
		int[][] v=new int[n][n];
		int[][] maze={{1,0,0,0},
			{1,1,0,1}
		,{0,1,0,0},
			{1,1,1,1}};
		v[0][0]=1;
		solve(maze,v,0,0,n);
	}

}
