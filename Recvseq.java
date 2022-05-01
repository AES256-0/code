import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Recvseq{	
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int len) throws IOException{
		int[] arr=new int[len];
		int i=0;
		StringTokenizer s=new StringTokenizer(bread.readLine());
		while(s.hasMoreTokens()){
			arr[i++]=Integer.parseInt(s.nextToken());
		}
		return arr;
	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0)
		{
			int n=Integer.parseInt(bread.readLine());
			int[] arr=readInput(n);
			// 1 3 10 7
			// 2 4 5 7 9
			long diff=arr[1]-arr[0];
			int i=0;
			for(i=2;i<n;i++){
				if(diff!=(arr[i]-arr[i-1])
			}
		}
	}

}
