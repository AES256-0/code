import java.io.*;
class CHFRICH{

	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{

		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] inp=bread.readLine().split(" ");
			int a=Integer.parseInt(inp[0]);
			int b=Integer.parseInt(inp[1]);
			int x=Integer.parseInt(inp[2]);
			System.out.println((b-a)/x);
		}
	}

}
