import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Tavisual{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));	 
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] query=bread.readLine().split(" ");
			int n=Integer.parseInt(query[0]);
			int c=Integer.parseInt(query[1]);
			int q=Integer.parseInt(query[2]);
			while(q-->0){
				String[] lr=bread.readLine().split(" ");
				int l=Integer.parseInt(lr[0]);
				int r=Integer.parseInt(lr[1]);
				if(l<=c && c<=r){
					c=r+l-c;
				}


			}
			System.out.println(c);

		}


	}

}
