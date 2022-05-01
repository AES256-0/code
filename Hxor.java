import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Hxor{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int infected=0;
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
			String[] meta=bread.readLine().split(" ");
			int n=Integer.parseInt(meta[0]);
			int q=Integer.parseInt(meta[1]);
			int[] arr=readInput(n);
			if(n==2){
				

			}
			else if(n==3){

			}
			else{
				
			}
	

		}
	}
}

