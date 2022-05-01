import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Carrange{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] inp=bread.readLine().split(" ");
			int p=Integer.parseInt(inp[0]);
			int m=Integer.parseInt(inp[1]);
			int v=Integer.parseInt(inp[2]);
			int ans=(m+1-p)*v;
			System.out.println(ans);
		}


	}


}
