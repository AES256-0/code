import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Tachstck{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		String[] meta=bread.readLine().split(" ");
		int n=Integer.parseInt(meta[0]);
		int d=Integer.parseInt(meta[1]);
		int[] arr=new int[n];
		int t=0;
		while(t<n){
			arr[t++]=Integer.parseInt(bread.readLine());
		}
	 	t=0;
		Arrays.sort(arr);
		int count=0;
		while(t<n-1){
			if(arr[t+1]-arr[t]<=d){
				count++;
				t=t+2;
			}
			else{
				t++;
			}
		}
		System.out.println(count);




	}





}
