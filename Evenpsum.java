import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Evenpsum{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] meta=bread.readLine().split(" ");
			long a=Long.parseLong(meta[0]);
			long b=Long.parseLong(meta[1]);
			long pair=a*b/2;
			if(a%2!=0&&b%2!=0){
				pair++;
			}
		
			System.out.println(pair);



		}
	}

}
