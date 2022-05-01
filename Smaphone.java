import java.io.*;
import java.util.Arrays;
class Smaphone{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int c=Integer.parseInt(bread.readLine());
		long[] arr=new long[c];
		int i=0;
		int k=c;
		while(k-->0){
			arr[i++]=Long.parseLong(bread.readLine());
		}
		Arrays.sort(arr);
		long max=0;
		for(i=0;i<arr.length;i++){
			max=Math.max(max,arr[i]*(c-i));
		}
		System.out.println(max);
	}
}
