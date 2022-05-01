import java.io.*;
import java.util.*;
class Bfriend{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static long[] readInput(int n) throws IOException{
		long[] arr=new long[n];
		int i=0;
		StringTokenizer  st=new StringTokenizer(bread.readLine());
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
			long a=Long.parseLong(in[1]);
			long b=Long.parseLong(in[2]);
			long c=Long.parseLong(in[3]);
			long[] arr=readInput(n);
			Arrays.sort(arr);
			int ai=Arrays.binarySearch(arr,a);
			int bi=Arrays.binarySearch(arr,b);
			// a x x x b  b x x x a
			// x a x x b  x b x x a
			// x x x a b  x x x b a
			// a b x x x  b a x x x
			// x x a b x  x x b a x
			int index_a=-1*ai-1;
			int index_b=-1*bi-1;
			System.out.println("ai:"+ai+" bi:"+bi);
			System.out.println("index_A:"+index_a+" index_b:"+index_b);
			if(ai!=bi){
				System.out.println(Math.abs(a-b)+c);
			}
			else{
				if(index_a==0 && index_b==0){
					System.out.println(Math.abs(b-arr[0])+Math.abs(a-arr[0])+c);	
				}
				else if(index_a==n && index_b==n){
					System.out.println(Math.abs(b-arr[n-1])+Math.abs(a-arr[n-1])+c);
				}
				else{
					// xxxabx 
					// xxxbax
					long ans1=Math.abs(b-arr[index_b-1])+Math.abs(a-arr[index_a-1])+c;
					long ans2=Math.abs(b-arr[index_b])+Math.abs(a-arr[index_a])+c;
					long min=ans1>ans2?ans2:ans1;
					System.out.println(min);
				}
			}

		}



	}

}
