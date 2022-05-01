import java.util.*;
import java.io.*;
class Lepermut{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static int[] readInput(int n) throws IOException{
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
			int a=0;
			for(int i=0;i<n-1;i++){
				if(arr[i]>arr[i+1])
					a++;
			}
			int b=0;
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(arr[i]>arr[j])
						b++;
				}
			}
			if(a==b){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}

		}

	}
}
