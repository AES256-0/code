import java.util.*;
import java.io.*;
class L56game{
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
			int n=Integer.parseInt(bread.readLine());
			int[] arr=readInput(n);
			if(n==1){
				System.out.println("1");
			}
			else{
				int even=0,odd=0;
				for(int i:arr){
					if(i%2!=0){
						odd++;
					}
				}
				int ans=odd%2!=0?2:1;
				System.out.println(ans);
				// 1 3 5 7 4 6
				// 4  12 10
				// 16 10
				// 26   even-even 1
				// 1 3 5 4 odd-odd 2
				// 4 5 4
				// 8 5
				// 1 3 5 6 2 odd even 2
				// 4 5 8
				// 12 5
				//1 3 4 6 8 even odd 1
				//4 10 8
				//1

			}
		}
	}
}
