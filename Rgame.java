import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Rgame{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	private static int[] readInput(int n){
		int[] arr=new int[n+1];
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
			printArray(arr,n+1);
		}

	}
	private static void printArray(int[] arr,int n){


		
	









	}

}
