import java.io.*;
class Frimeet{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] inp=bread.readLine().split(" ");
			long x1=Long.parseLong(inp[0]);
			long x2=Long.parseLong(inp[1]);
			if(x2>x1){
				System.out.println("NO");
			}
			else{
				System.out.println("YES");

			}


		}


	}
}
