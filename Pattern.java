class Pattern{
	private static void f(int n){
		if(n==0){
			return;
		}
		for(int i=0;i<n;i++){
			System.out.print("* ");
		}
		System.out.println();
		f(n-1);
	}
	private static StringBuilder fn(int n){
		if(n==1){
			return new StringBuilder("* ");
		}
		return fn()

	}

	public static void main(String[] args){
		int n=4;
		f(4);

	}
}
