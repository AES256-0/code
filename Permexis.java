import java.util.*;
import java.io.*;
class Permexis{
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
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int[] arr=readInput(n);
			Arrays.sort(arr);
			boolean flag=true;
			for(int i=0;i<n-1;i++){
				if(!(Math.abs(arr[i]-arr[i+1])<=1)){
					flag=false;
					break;
				}
			}
			String ans=flag?"YES":"NO";
			System.out.println(ans);

		}
		
	}
}
