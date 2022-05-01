import java.io.*;
import java.util.*;
class Num239{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		int[] ans=new int[100001];
		for(int i=1;i<=100000;i++){
			int r=i%10;
			if(r==2 || r==3 || r==9){
				ans[i]=ans[i-1]+1;
			}
			else{
				ans[i]=ans[i-1];
			}
		}
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			int l=Integer.parseInt(in[0]);
			int r=Integer.parseInt(in[1]);
			int d=ans[r]-ans[l];
			if(l%10==2 || l%10==3 || l%10==9){
				d+=1;
			}
			System.out.println(d);

		}


	}

}
