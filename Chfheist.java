import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Chfheist{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));   	 public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String qa[]=bread.readLine().split(" ");
			long D=Long.parseLong(qa[0]);
			long d=Long.parseLong(qa[1]);
			long p=Long.parseLong(qa[2]);
			long q=Long.parseLong(qa[3]);
			long x=D/d;
			long r=D%d;
			long sum=x*(2*p+(x-1)*q)/2;
			long last=p+x*q;
			sum=d*sum+last*r;
			System.out.println(sum);
		}

	}
}
