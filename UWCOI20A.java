import java.io.*;
class UWCOI20A{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException
	{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int max=-1;
			while(n-->0){
				max=Math.max(max,Integer.parseInt(bread.readLine()));
			}
			System.out.println(max);

		}
	}
}
