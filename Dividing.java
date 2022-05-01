import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Dividing{
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
		int n=Integer.parseInt(bread.readLine());
		int[] arr=readInput(n);
		long sum=0l;
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
		}
		long nsum=((long)n*(n+1)/2);
		//System.out.println(nsum);
		if(sum==nsum){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}
