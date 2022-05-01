import java.io.*;
import java.util.*;
class Chefgr{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static int[] readInput(int n) throws IOException{
		int arr[]=new int[n];
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
			String[] in=bread.readLine().split(" ");
			int n=Integer.parseInt(in[0]);
			int m=Integer.parseInt(in[1]);
			int[] arr=readInput(n);
			int max=Integer.MIN_VALUE;
			for(int i=0;i<n;i++){
				if(max<arr[i])
					max=arr[i];
			}
			int diff=0;
			for(int i=0;i<n;i++){
				diff+=max-arr[i];
			}
			if(m==diff){
				System.out.println("Yes");
			}
			else{
				if(diff>m){
					System.out.println("No");
				}
				else{
					if((m-diff)%n==0){
						System.out.println("Yes");
					}
					else{
						System.out.println("No");
					}
		
				}
			}
		}	


	}

}
