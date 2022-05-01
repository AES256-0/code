import java.util.*;
import java.io.*;
class Balloon{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			String[] in=bread.readLine().split(" ");
			int[] arr=new int[n];
			int ans=-1,c=0;
			for(int i=0;i<n;i++){
				int num=Integer.parseInt(in[i]);
				if(1<=num &&num<=7)
					c++;
				if(c==7){
					ans=i;
					break;
				}
			}
			System.out.println(ans+1);

		}


	}

}
