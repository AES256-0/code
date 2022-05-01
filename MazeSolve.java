class MazeSolve{
	
	public static void mazeHelp(int[][] maze,int n,int[][] solution,int x,int y){
		if(x==n-1 && y==n-1){
			solution[x][y]=1;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.print(solution[i][j]+" ");
				}
			}
			System.out.println();
			solution[x][y]=0;
			return;
		}



		if( x>=n || x<0 || y<0 || y>=n || maze[x][y]==0 || solution[x][y]==1)
			return;
		solution[x][y]=1;
		mazeHelp(maze,n,solution,x-1,y);
		mazeHelp(maze,n,solution,x+1,y);
		mazeHelp(maze,n,solution,x,y-1);
		mazeHelp(maze,n,solution,x,y+1);
		solution[x][y]=0;
		return;

	}



	public static void ratInAMaze(int[][] maze,int n){
		int[][] solution=new int[n][n];
		mazeHelp(maze,n,solution,0,0);
	}
	public static void main(String[] args){
		ratInAMaze(new int[][]{{1,1,0},{1,1,1},{1,1,1}},3);
	}

}
