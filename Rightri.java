import java.io.*;
import java.util.*;
class Rightri{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		int ans=0;
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			int x1=Integer.parseInt(in[0]);
			int y1=Integer.parseInt(in[1]);
			int x2=Integer.parseInt(in[2]);
			int y2=Integer.parseInt(in[3]);
			int x3=Integer.parseInt(in[4]);
			int y3=Integer.parseInt(in[5]);
			int a=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
			int b=(x2-x3)*(x2-x3)+(y2-y3)*(y2-y3);
			int c=(x1-x3)*(x1-x3)+(y1-y3)*(y1-y3);
			if(a+b==c || b+c==a || c+a==b){
				ans++;
			}

		}
		System.out.println(ans);



	}



}
