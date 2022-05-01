import java.io.*;
import java.util.*;
class Examcht{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			int a=Integer.parseInt(in[0]);
			int b=Integer.parseInt(in[1]);
			// 3 4-1
			// 4 5-1 
			// 2 3
			// 2 4-1 2 
			// 2 5-1
			// 2 6-1 2 4
			// 2 7-1,5
			//
			int max=a>b?a:b;
			int ans=0;
			int d=Math.abs(a-b);
			for(int i=1;i<=Math.sqrt(Math.abs(a-b));i++){
				if(d%i==0)
				{
					if(d/i==i){
						ans++;
					}
					else{
						ans+=2;
					}	
				}
			}
			System.out.println(ans);

		}

	}
	public int gcd(int a,int b){
		if(a==0){
			return b;
		}
		return gcd(b%a,a);

	}

}
