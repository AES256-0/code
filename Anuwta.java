import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Anuwta{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			// 0 1 2 3 4 5
			// 0-5-0
			// 0-4-1
			// 1-3-2
			// 2-3 21
			// 0 1 2 3 4
			// 0-4-0
			// 0-3-1
			// 1-2 14
			// 0 1 2 3
			// 0-3-0
			// 0-2-1
			// 1-2 10
			System.out.println((n+1)*(n+2)/2-1);

		}
	}

}
