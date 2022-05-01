import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
class Chefzot{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[]  readInput(int n) throws IOException{
		int[] arr=new int[n];
		StringTokenizer ob=new StringTokenizer(bread.readLine());
		int i=0;
		while(ob.hasMoreTokens()){
			arr[i++]=Integer.parseInt(ob.nextToken());			
		}
		return arr;
	}
	public static void main(String[] args) throws IOException{
		int n=Integer.parseInt(bread.readLine());
		int[] arr=readInput(n);
		int max=0;
		int count=0;
		for(int i=0;i<n;i++){
			if(arr[i]!=0){
				count++;
			}
			else{
				max=Math.max(max,count);
				count=0;
			}
		}
		max=Math.max(max,count);

		System.out.println(max);


	}
}

