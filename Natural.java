class Natural{
	private static void solve(int n){
		if(n==0){
			return;
		}
		System.out.println(n);
		solve(n-1);
		if(n!=1)
		System.out.println(n);
	}
	public static void main(String[] args){
		solve(5);

	}


}
