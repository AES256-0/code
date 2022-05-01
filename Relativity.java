import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Relativity{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] input=bread.readLine().split(" ");
			int g=Integer.parseInt(input[0]);
			int c=Integer.parseInt(input[1]);
			System.out.println((c*c)/(2*g));

			
		}

	}
}
