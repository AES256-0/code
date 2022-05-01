import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Alexnumb{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	public static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		StringTokenizer st=new StringTokenizer(bread.readLine());
		int i=0;
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(st.nextToken());
		}
		return arr;

	}
	public static void main(String... args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int m=Integer.parseInt(bread.readLine());
			//int[] arr=readInput(m);
			m--;
			long n=(long)m;
			long ans=(n*(n+1))/2;
			System.out.println(ans);

		}

	}

}
