import java.io.*;
class SLOOP{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] inp=bread.readLine().split(" ");
			int a=Integer.parseInt(inp[0]);
			int b=Integer.parseInt(inp[1]);
			System.out.println(a/b);
		}
	}
}
