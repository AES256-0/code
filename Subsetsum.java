import java.util.*;  
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;


class Subsetsums{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int arr[]=new int[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(st.nextToken());
		}
		return arr;
	}
  

  
// Driver code  
public static void main(String args[])  throws IOException
{  
	int t=Integer.parseInt(bread.readLine());
	while(t-->0){
		int n=Integer.parseInt(bread.readLine());
		int[] arr=readInput(n);
		int sum=0;
		int el=0;
		for(int i=0;i<n;i++){
			el+=arr[i];
			sum=sum|arr[i]|el;
		}
		System.out.println(sum);

	}
   	
}  
}  
