import java.io.*;
class Minpizzas{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] inp=bread.readLine().split(" ");
			long N=Long.parseLong(inp[0]);
			long K=Long.parseLong(inp[1]);
			int i=1;
			while((K*i)%N!=0){
				i++;
			}
			System.out.println(i);
		}
	}
}
