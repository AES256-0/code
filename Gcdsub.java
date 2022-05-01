import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Gcdsub{
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
	public static int gcd(int a,int b){
		if(a==0){
			return b;
		}
		return gcd(b%a,a);
		
	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int[] arr=readInput(n);
			int gc=arr[0];
			for(int i=1;i<n;i++){
				gc=gcd(gc,arr[i]);
				
			}
			if(gc==1){
				System.out.println(arr.length);
			}
			else{
				System.out.println("-1");
			}

		}
	}

}

