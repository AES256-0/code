import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;

class Restore{
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
			int[] b=new int[n];
			b[n-1]=4000000;
			int cou=3999999;
			for(int i=n-2;i>=0;i--){
				if(arr[i]-1!=i){
					
						b[i]=b[arr[i]-1];		
				}
				else{
					
						b[i]=cou--;
					
				}
			}
			for(int i=0;i<n;i++){
				System.out.print(b[i]+" ");
			}
			System.out.println();



		}





	}
}

