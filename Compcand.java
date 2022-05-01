import java.io.*;
class Compcand{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] inp=bread.readLine().split(" ");
			int N=Integer.parseInt(inp[0]);
			int K=Integer.parseInt(inp[1]);
			if(N%K==0){
				System.out.println(N/K);
			}
			else{
				System.out.println("-1");
			}
		}
	}
}

