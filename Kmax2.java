import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Kmax2{

		
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int max=Integer.MIN_VALUE;
	private static int[] readInput(int len) throws IOException{
		int[] arr=new int[len];
		int i=0;
		StringTokenizer s=new StringTokenizer(bread.readLine());
		while(s.hasMoreTokens()){
			arr[i]=Integer.parseInt(s.nextToken());
			max=Math.max(arr[i],max);
			i++;
		}
		return arr;
	}


	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			max=Integer.MIN_VALUE;
			int n=Integer.parseInt(in[0]);
			int k=Integer.parseInt(in[1]);
			int[] arr=readInput(n);
			int i=0,j=k-1;
			long ans=0;
			//1 2 3 3 2 3 1
			while(j<n){
				if(arr[j]==max){
					ans+=n-j;	
				}
				j++;
			}
			System.out.println(ans);

		}
	}
}
