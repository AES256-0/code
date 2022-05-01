import java.io.*;
class Gdog{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] inp=bread.readLine().split(" ");
			int n=Integer.parseInt(inp[0]);
			int k=Integer.parseInt(inp[1]);
			int max=0;
			for(int i=1;i<=k;i++){
				max=Math.max(max,n%i);
				
			}
			System.out.println(max);
		}
	}
}
