class Fib{
	public static int fib(int n){
		if(n==1 || n==0)
			return 1;
		return fib(n-1)+fib(n-2);
	}
	public static int memFib(int n,int[] arr){
		if(n==1|| n==0)
			return 1;
		if(arr[n]!=0)
			return arr[n];
		int a=memFib(n-1,arr);
		int b=memFib(n-2,arr);
		arr[n]=a+b;
		return arr[n];

	}
	public static int dpFib(int n,int[] arr){
		return arr[n];
	}

	public static void main(String[] args){

		//System.out.println(fib(50));
		System.out.println(memFib(50,new int[51]));
		int[] arr=new int[51];
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<=50;i++){
			arr[i]=arr[i-1]+arr[i-2];
			
		}
		System.out.println(dpFib(50,arr));

	}

}
