import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class J7{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] inp=bread.readLine().split(" ");
			int p=Integer.parseInt(inp[0]);
			int a=Integer.parseInt(inp[1]);
			double l=(p-Math.sqrt(p*p-24*a))/12;
			double d=l*a/2-l*l*p/4+l*l*l;
			System.out.println(Math.round(d*100.0)/100.0);
	
		}

	}

}
