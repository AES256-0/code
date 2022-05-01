import java.io.*;
class Twonms{

	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] inp=bread.readLine().split(" ");
			int a=Integer.parseInt(inp[0]);
			int b=Integer.parseInt(inp[1]);
			int n=Integer.parseInt(inp[2]);
			//a=a*2^n
			//b=b*2^n
			//a=a*2^(n/2+1)
			//b=b*2^n/2
			if(n%2==0){
				System.out.println(a>b?a/b:b/a);
			}
			else{
				a=2*a;
				System.out.println(Math.max(a,b)/Math.min(a,b));
			}
		}


	}

}
