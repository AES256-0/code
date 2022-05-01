import java.util.*;
import java.io.*;
class Signflip{
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
			String[] in=bread.readLine().split(" ");
			int n=Integer.parseInt(in[0]);
			int k=Integer.parseInt(in[1]);
			int[] arr=readInput(n);
			Arrays.sort(arr);
			long sum=0;
			for(int i=0;i<n;i++){
				if(k>0 && arr[i]<0){
					sum+=Math.abs(arr[i]);
					k--;
				}
				else if(arr[i]>0){
					sum+=Math.abs(arr[i]);
				}		
			}
			System.out.println(sum);
		}
	}
}
