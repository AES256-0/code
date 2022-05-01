import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Coconut{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] q=bread.readLine().split(" ");
			int a=Integer.parseInt(q[0]);
			int b=Integer.parseInt(q[1]);
			int X=Integer.parseInt(q[2]);
			int Y=Integer.parseInt(q[3]);
			float m=(float)Math.ceil((float)X/a);
			float n=(float)Math.ceil((float)Y/b);
			System.out.println((int)n+(int)m);

		}

	}


}

