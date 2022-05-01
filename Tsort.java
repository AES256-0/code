import java.io.*;
import java.util.*;
class Tsort{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		int i=0;
		int[] arr=new int[t];
		while(i<t){
			arr[i++]=Integer.parseInt(bread.readLine());
			
		}
		Arrays.sort(arr);
		for(int j:arr){
			System.out.println(j);
		}


	}

}
