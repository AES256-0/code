import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Eita{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] input=bread.readLine().split(" ");
			int d=Integer.parseInt(input[0]);
			int x=Integer.parseInt(input[1]);
			int y=Integer.parseInt(input[2]);
			int z=Integer.parseInt(input[3]);
			int a1=7*x;
			int a2=y*d+(7-d)*z;
			System.out.println(a1>a2?a1:a2);


		}


	}



}
