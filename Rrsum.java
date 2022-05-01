import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Rrsum{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		String[] temp=bread.readLine().split(" ");
		long n=Long.parseLong(temp[0]);
		int m=Integer.parseInt(temp[1]);
		long min=n+2;
		long middle=2*n+1;
		long max=3*n;
		while(m-->0){
			long c=Long.parseLong(bread.readLine());
			if(c<min ||c>max){
				System.out.println("0");
			}
			else{
				long diff=c-min;
				long ans=c<=middle?c-min+1:max-c+1;
				System.out.println(ans);
				
			}


		}


	}

}
