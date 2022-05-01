import java.util.*;
import java.io.*;
class Anuarm{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int m) throws IOException{
		int[] arr=new int[m];
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
			int m=Integer.parseInt(in[1]);
			int[] arr=readInput(m);
			int min=Integer.MAX_VALUE;
			int max=Integer.MIN_VALUE;
			for(int i=0;i<m;i++){
				if(min>arr[i]){
					min=arr[i];	
				}
				if(max<arr[i]){
					max=arr[i];
				}
			}
			for(int i=0;i<n;i++){
				int a1=Math.abs(i-min);
				int a2=Math.abs(max-i);
				if(a1>a2){
					System.out.print(a1+" ");
				}
				else{
					System.out.print(a2+" ");
				}

			}
			System.out.println();



		}


	}



}
