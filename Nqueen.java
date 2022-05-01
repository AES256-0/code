class Nqueen{
	public static void solveNqueen(int[][] arr,int row){
		if(arr.length==row){
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length;j++){
					System.out.print(arr[i][j]+" ");
				}	
	
			}
			System.out.println();
		
		}
		for(int i=0;i<arr.length;i++){
			if(isPossible(arr,arr.length,row,i)){
				arr[row][i]=1;
				solveNqueen(arr,row+1);
				arr[row][i]=0;

			}
	
		}
		return;	
	}
	public static boolean isPossible(int[][] arr,int n,int row,int col){
		
		for(int i=row-1;i>=0;i--){
			if(arr[i][col]==1){
				return false;
			}
		}
		int i=row-1;
		int j=col-1;
		while(i>=0 && j>=0){
			if(arr[i][j]==1)
				return false;

			i--;
			j--;
		}
		i=row-1;
		j=col+1;
		while(i>=0 &&j<n){
			if(arr[i][j]==1)
				return false;
			i--;
			j++;
		}
		return true;


	}

	public static void main(String[] args){
		int[][] arr=new int[4][4];
		solveNqueen(arr,0);

	}


}
