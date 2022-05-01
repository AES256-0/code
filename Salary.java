import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.TreeSet;
import java.util.StringTokenizer;
import java.util.Arrays;

class Salary{
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
		//	Arrays.sort(arr);
			int count=0;
			/*while(arr[0]!=arr[n-1]){
				for(int i=0;i<n-1;i++){
					arr[i]=arr[i]+1;
				}
				Arrays.sort(arr);
				count++;

			}*/
			int min=arr[0];
			for(int i:arr){
				if(min>i){
					min=i;
				}
			}
			for(int i:arr){
				count+=i-min;
			}
		
			System.out.println(count);
		}
	}


}
