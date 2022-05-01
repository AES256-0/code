import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
class Chefston{
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
			String[] dt=bread.readLine().split(" ");
			int n=Integer.parseInt(dt[0]);
			int k=Integer.parseInt(dt[1]);
			int[] a=readInput(n);
			int[] b=readInput(n);
			long sum=0l;
			long max=-1;
			for(int i=0;i<n;i++){
				int d=k/a[i];
				long pr=(long)d*b[i];
				if(max<pr){
					max=pr;
				}
			}
			System.out.println(max);



		}

	}
}
