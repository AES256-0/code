import java.util.*;
import java.io.*;
class Amsgame1{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(st.nextToken());

		}
		return arr;
	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int[] arr=readInput(n);
			int gcd=arr[0];
			for(int i=1;i<n;i++){
				gcd=gcd(gcd,arr[i]);

			}
			System.out.println(gcd);

		}

	}
	public static int gcd(int a,int b){
		if(a==0){
			return b;
		}
		return gcd(b%a,a);

	}
}
