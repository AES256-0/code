import java.util.*;
import java.io.*;
class Lediv{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(st.nextToken());

	
		}
		return arr;
	}
	public static int gcd(int a,int b){
		if(a==0){
			return b;
		}
		return gcd(b%a,a);
	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
	/*	int[] ans=new int[100001];
		for(int i=1;i<ans.length;i++)
			ans[i]=Integer.MAX_VALUE;
		modifySieve(ans);*/
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int[] arr=readInput(n);
			int g=arr[0];
			for(int i=1;i<n;i++){
				g=gcd(g,arr[i]);
			}
			if(g==1)
				System.out.println("-1");
			else{
				boolean flag=true;
				for(int i=2;i<=Math.sqrt(g);i++){
					if(g%i==0){
						System.out.println(i);
						flag=false;
						break;
					}
				}
				if(flag)
					System.out.println(g);
			}
		}


	}
	public static void modifySieve(int[] arr){
		boolean prime[]=new boolean[arr.length];
		for(int i=2;i<prime.length;i++){
			prime[i]=true;
		}
		for(int i=2;i<=Math.sqrt(arr.length-1);i++){
			if(prime[i]){
				for(int j=i*i;j<=arr.length-1;j+=i){
					prime[j]=false;
					arr[j]=Math.min(arr[j],i);
				}

			}

		}
		
	/*	for(int i=0;i<=arr.length-1;i++)
		System.out.print(arr[i]+" ");
*/
	}
}
