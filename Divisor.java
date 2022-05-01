class Divisor{
	public static void main(String[] args){
		int n=10000;
		int[] arr=new int[n+1];
		arr[1]=1;
		arr[2]=3;
		System.out.println(calculate(arr,n));

	}
	private static int calculate(int arr[],int n){
		if(arr[n]!=0){
			return arr[n];
		}
		int sum=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
				sum+=calculate(arr,i);
			}
		
		}
		arr[n]=sum+n;
		return arr[n];
	}
}
