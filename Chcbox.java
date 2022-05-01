import java.io.*;
import java.util.*;
class Chcbox{

		
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	private static int[] readInput(int len) throws IOException{
		int[] arr=new int[len+1];
		int i=1;
		StringTokenizer s=new StringTokenizer(bread.readLine());
		while(s.hasMoreTokens()){
			arr[i++]=Integer.parseInt(s.nextToken());
		}
		return arr;
	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int[] arr=readInput(n);
			int first=-1 ,second=-1;
			int max=-1;
			for(int i=1;i<=n;i++){
				if(max<=arr[i]){
					max=arr[i];
					second=i;
				}
			}
			for(int i=1;i<=n;i++){
				if(arr[i]==max){
					first=i;
					break;
				}
			}
			//1 1 1 2 2 2
			//1 1 1 2 2 1
			//1 1 1 1 2 2
			//1 1 1 1 1 2
			//1 1 1 2 1 1
			//1 1 1 1 2 1
			//1 1 1 2 1 2
			//
			//1 1 2 2 1 1
			//1 1 2 1 2 1
			//1 1 2 1 1 2
			//1 2 1 1 1 2
			//
			//2 2 1 1 1 1
			if(first >n/2 &&second>n/2){
				System.out.println(n-second+1);
			}
			else{
				int diff=n/2-first;
				first+=diff;
				second+=diff;
				if(second>n){
					System.out.println("0");
				}
				else{
					System.out.println(n-second);
				}
			}
			


		}


	}
}
