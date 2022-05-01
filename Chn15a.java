import java.io.*;
import java.util.*;
class Chn15a{
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
			String[] inp=bread.readLine().split(" ");
			int n=Integer.parseInt(inp[0]);
			int k=Integer.parseInt(inp[1]);
			int[] arr=readInput(n);
			int count=0;
			for(int i:arr){
				if((i+k)%7==0){
					count++;
				}
			}
			System.out.println(count);


		}


	}

}
