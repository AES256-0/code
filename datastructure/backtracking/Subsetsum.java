class Subsetsum{
	
	private static void solve(int[] arr,int index,int sum,String ans){
		if(sum==0){
			System.out.println(ans);
			return;
		}
		if(index==arr.length)
			return;
		if(sum<0){
			return ;
		}
		solve(arr,index+1,sum-arr[index],ans+" " +String.valueOf(arr[index]));
		solve(arr,index+1,sum,ans);
	}
	
	public static void main(String[] args){

		solve(new int[]{3,34,4,12,5,2},0,30,"");
	}

}
