import java.util.*;
import java.io.*;
class Flow005{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		int[] arr={1,2,5,10,50,100};
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int ans=0;
			while(n!=0){
				int index=Arrays.binarySearch(arr,n);
				if(index<0){
					index=Math.abs(index)-2;
				}
				ans+=n/arr[index];
				n=n%arr[index];
			}
			System.out.println(ans);
		}
	}
}
