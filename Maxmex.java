import java.util.*;
import java.io.*;

class Maxmex{
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
			int m=Integer.parseInt(in[1]);
			int[] arr=readInput(n);
			Arrays.sort(arr);
			int index=Arrays.binarySearch(arr,m);
			System.out.println("index is:"+index);
			if(index==-1 || index==-1*n){
				System.out.println("0");
			}
			else{
				index=-1*index-1;
				int sum=n-index;
				int st=index-1;
				m=m-1;
				boolean flag=false;
				while(st>=0 && arr[st]==m){
					st--;
					m--;
					sum++;
					flag=true;
				}
				if(flag)
				System.out.println(sum);
				else{
					System.out.println("");
				}

			}


	


		}

	}
}
