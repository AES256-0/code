class Party{
	private static int solve(int n){
		if(n==1 || n==2)
			return n;
		return solve(n-1)+(n-1)*solve(n-2);


	}
	
	public static void main(String[] args){
		int n=10;
		System.out.println(solve(n));

	}


}
