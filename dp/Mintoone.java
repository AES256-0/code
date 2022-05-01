import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Mintoone{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int n=Integer.parseInt(bread.readLine());
		int[] arr=new int[n+1];
		System.out.println(minToOne(n,arr));
		System.out.println(iterMinToOne(n));
		System.out.println(minToOne(n));
	}
	private static int minToOne(int n){
		if(n==1){
			return 0;
		}
		int ans=1+minToOne(n-1);
		if(n%2==0){
			ans=Math.min(ans,1+minToOne(n/2));
		}
		if(n%3==0){
			ans=Math.min(ans,1+minToOne(n/3));
	
		}
		return ans;
	}
	private static int minToOne(int n,int[] arr){
		if(n==1){
			return 0;
		}
		if(arr[n]>0){
			return arr[n];
		}
		int ans=1+minToOne(n-1,arr);
		if(n%2==0){
			ans=Math.min(ans,1+minToOne(n/2,arr));
		}
		if(n%3==0){
			ans=Math.min(ans,1+minToOne(n/3,arr));
		}
		arr[n]=ans;
		return ans;
	}
	private static int iterMinToOne(int n){
		int[] arr=new int[n+1];
		arr[1]=0;
		int ans=-1;
		for(int i=2;i<=n;i++){
			ans=1+arr[i-1];
			if(i%2==0){
				ans=Math.min(ans,1+arr[i/2]);
			}
			if(i%3==0){
				ans=Math.min(ans,1+arr[i/3]);
			}
			arr[i]=ans;
		}
		return ans;
	}

}
