import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
class Minnotes{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int i=0;
		int[] arr=new int[n];
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(st.nextToken());
		}
		return arr;
	}
	private static int gcd(int a,int b){
		if(a==0){
			return b;

		}
		return gcd(b%a,a);
	}
	private static int findGcd(int[] arr){
		int result=0;
		for(int el:arr){
			result=gcd(result,el);
			if(result==1){
				return 1;
			}
		}
		return result;
	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			if(n==1){
				System.out.println("1");
			}
			else{
			int[] arr=readInput(n);
			int[] prefix=new int[n];
			int[] suffix=new int[n];
			prefix[0]=arr[0];
			for(int i=1;i<n;i++){
				prefix[i]=gcd(prefix[i-1],arr[i]);

			}
			suffix[n-1]=arr[n-1];
			for(int i=n-2;i>=0;i--){
				suffix[i]=gcd(arr[i],suffix[i+1]);

			}
			long sum=0;
			for(int i=0;i<n;i++){
				sum+=arr[i];
			}
			long ans=sum/prefix[n-1];
			for(int i=0;i<n;i++){
				int p=i==0?0:prefix[i-1];
				int s=i==n-1?0:suffix[i+1];
				ans=Math.min(ans,(sum-arr[i])/gcd(p,s)+1);
			}
			System.out.println(ans);
			}
		}


	}


}
