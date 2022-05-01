import java.io.*;
class Supchef{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] inp=bread.readLine().split(" ");
			int m=Integer.parseInt(inp[0]);
			int k=Integer.parseInt(inp[1]);
			int n=Integer.parseInt(inp[2]);
			System.out.println(n*k<m?"YES":"NO");
		}
	}

}
