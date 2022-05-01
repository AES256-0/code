import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

class Spcandy{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] meta=bread.readLine().split(" ");
			long c=Long.parseLong(meta[0]);
			long s=Long.parseLong(meta[1]);
			if(s==0){
				System.out.println("0 "+c);
			}
			else if(c==0){
				System.out.println("0 0");
			}
			else{
				long d=c/s;
 				long r=c%s;
				System.out.println(d+" "+r);
			}			

		}
	}
}

