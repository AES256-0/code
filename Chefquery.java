import java.io.*;
import java.util.*;
class Chefquery{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static long[] readInput(int len) throws IOException{
		long[] arr=new long[len+1];
		int i=1;
		StringTokenizer s=new StringTokenizer(bread.readLine());
		while(s.hasMoreTokens()){
			arr[i++]=Long.parseLong(s.nextToken());
		}
		return arr;
	}


	public static void main(String[] args) throws IOException{
		String[] in=bread.readLine().split(" ");
		int n=Integer.parseInt(in[0]);
		int q=Integer.parseInt(in[1]);
		long[] arr=readInput(n);
		while(q-->0){
			String[] d=bread.readLine().split(" ");
			int qt=Integer.parseInt(d[0]);
			if(qt==1){
				long l=Long.parseLong(d[1]);
				long r=Long.parseLong(d[2]);
				long x=Long.parseLong(d[3]);
				for(long i=l;i<=r;i++){
					arr[(int)i]+=(x+i-l)*(x+i-l);
				}
			}
			else{
				System.out.println(arr[Integer.parseInt(d[1])]);
			}

		}
	}
}
