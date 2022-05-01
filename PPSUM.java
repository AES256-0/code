import java.io.*;
class PPSUM{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] inp=bread.readLine().split(" ");
			int D=Integer.parseInt(inp[0]);
			int N=Integer.parseInt(inp[1]);
			long sum=N;
			while(D-->0){
				sum=(sum+1)*sum/2;
			}
			System.out.println(sum);
		}
	}

}
