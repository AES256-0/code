class Subsetsum{

	private static void solve(int[] arr,int[] visited,int sum,String ans,int index){
		if(sum==0){
			System.out.println(ans);
			return;
		}
		if(sum<0)
			return;
		visited[index]=1;
		for(int i=0;i<arr.length;i++){
			if(visited[i]!=1){
				solve(arr,visited,sum-arr[i],ans+=" "+String.valueOf(arr[i]),i);
			}	
		}
		visited[index]=0;

	}
	public static void main(String[] args){
		solve(new int[]{15,22,14,26,32,9,16,8},new int[8],53-15,"15 ",0);

	}

}
