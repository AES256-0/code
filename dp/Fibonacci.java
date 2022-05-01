import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Fibonacci{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int n=Integer.parseInt(bread.readLine());
		int[] arr=new int[n+1];
		System.out.println(iterfib(n));
		System.out.println(dpfib(n,arr));
		System.out.println(fib(n));
	}
	private static int fib(int n){
		if(n==1 || n==0){
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
	private static int dpfib(int n,int[] arr){
		if(n==1|| n==0){
			return n;
		}
		if(arr[n]>0){
			return arr[n];
		}
		int out=dpfib(n-1,arr)+dpfib(n-2,arr);
		arr[n]=out;
		return out;
	}
	private static int iterfib(int n){
		int first=0;
		int second=1;
		int num=-1;
		for(int i=2;i<=n;i++){
			 num=first+second;
			first=second;
			second=num;
			
		}
		return num;
	}
}
