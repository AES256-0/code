import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Cheapfuel{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] imp=bread.readLine().split(" ");
			//X,Y,A,B,K.
			int x=Integer.parseInt(imp[0]);
			int y=Integer.parseInt(imp[1]);
			int a=Integer.parseInt(imp[2]);
			int b=Integer.parseInt(imp[3]);
			int k=Integer.parseInt(imp[4]);
			//x+a x+2a x+3a ... x+4a ==k*x+a*(k*(k+1)/2)
			int sum=k*(k+1)/2;
			int pp=x+a*k;
			int dp=y+b*k;
			if(pp<dp){
				System.out.println("PETROL");
			}
			else if(dp<pp){
				System.out.println("DIESEL");
			}
			else{
				System.out.println("SAME PRICE");
			}
			
		}

	}


}
