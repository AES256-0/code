import java.util.*;
import java.io.*;
class Prosum{
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
		int t=Integer.parseInt(bread.readLine().trim());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine().trim());
			int[] arr=readInput(n);
			//0 0 1 1 2 2 2 3 4 3 5
			int c1=0,c2=0,c0=0;
			for(int i=0;i<n;i++){
				if(arr[i]==0){
					c0++;
				}
				else if(arr[i]==1){
					c1++;
				}
				else if(arr[i]==2){
					c2++;
				}
			}

			//nC2=n*(n-1)/2
			long left=n-c1-c2-c0;
			long cal=left*(left-1)/2;
			System.out.println(cal+c2*left);

		}




	}


}
