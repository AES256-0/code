import java.io.*;
import java.util.*;
class Permut2{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int[] arr=new int[n+1];
		int i=1;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(st.nextToken());

		}
		return arr;
	}

	public static void main(String[] args) throws IOException{
	
		while(true){
			int n=Integer.parseInt(bread.readLine());
			if(n==0)
				break;
			int[] arr=readInput(n);
			int[] sec=new int[n+1];
			for(int i=1;i<=n;i++){
				sec[arr[i]]=i;
			}
			String ans="ambiguous";
			for(int i=1;i<=n;i++){
				if(arr[i]!=sec[i])
				{
					ans="not ambiguous";
					break;
				}
			}
			System.out.println(ans);

			

		}




	}


}
