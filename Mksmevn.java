import java.util.*;
import java.io.*;
class Mksmevn{

		
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	private static int[] readInput(int len) throws IOException{
		int[] arr=new int[len];
		int i=0;
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
			long sum=0;
			boolean flag=false;
			for(int i:arr){
				if(i==2){
					flag=true;	
				}
				sum+=i;
			}
			if(sum%2==0){
				System.out.println("0");
			}
			else{
				if(flag){
					System.out.println("1");
				}
				else{
					System.out.println("-1");
				}
			
			}		
		}
	}
}
