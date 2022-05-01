class Power{
	private static long f(int n,int b){
		if(b==0){
			return 1;
		}
		return n*f(n,b-1);
	}
	private static long optF(int n,int b){
		if(b==0){
			return 1;
		}
		long ret=optF(n,b/2);
		return b%2!=0?n*ret*ret:ret*ret;
	}
	public static void main(String[] args){
		int n=8;
		int b=2;
		System.out.println(f(n,b));
		System.out.println(optF(n,b));
	
	}
}
