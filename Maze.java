class Maze{
	private static int[][] visited=new int[3][3];
	public static void solveMaze(int[][] arr,int i,int j,int di,int dj,String ans){
		if(i==di && j==dj){
			System.out.println(ans);
			return;
		}

		visited[i][j]=1;
		if(arr[i][j]==0)
			return;
		if(i-1>=0 && visited[i-1][j]!=1){
			
			solveMaze(arr,i-1,j,di,dj,ans+"d");
		}
		if(i+1<arr.length && visited[i+1][j]!=1){
			solveMaze(arr,i+1,j,di,dj,ans+"u");
		}
		if(j-1>=0 && visited[i][j-1]!=1){
			solveMaze(arr,i,j-1,di,dj,ans+"l");

		}
		if(j+1<arr.length && visited[i][j+1]!=1){

			solveMaze(arr,i,j+1,di,dj,ans+"r");
		}
		visited[i][j]=0;
		return;

	}
	
	public static void main(String[] args){
		int[][] arr={{1,1,0},{1,1,1},{1,1,1}};
		solveMaze(arr,0,0,2,2,"");


	}


}
