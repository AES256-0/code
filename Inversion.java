import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

class Inversion{
		
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	private static	int[] readInput(int len) throws IOException{
		int[] arr=new int[len];
		int i=0;
		StringTokenizer s=new StringTokenizer(bread.readLine());
		while(s.hasMoreTokens()){
			arr[i++]=Integer.parseInt(s.nextToken());
		
		}
		return arr;
	}




	public static void main(String[] args){
		int t=Integer.parseInt(bread.readLine());
		for(int i=0;i<t;i++){

			int n=Integer.parseInt(bread.readLine());
			int[] arr=readInput(n);
		
			//2 3 1 4
			//2 4 3 1 n/2
			//2-4
			int count;
			for(int j=0;j<n;j++){




			}


		}


	}
}
