import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Adastair{
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
			String[] s=bread.readLine().split(" ");
			int n=Integer.parseInt(s[0]);
			int k=Integer.parseInt(s[1]);
			int[] arr=readInput(n);
			int count=0;
			count=(arr[0]-1)/k;
			for(int i=1;i<n;i++){
				int diff=(arr[i]-arr[i-1]-1);
					count=count+diff/k;	
				
	
			}
			System.out.println(count);
		}

	}


}
