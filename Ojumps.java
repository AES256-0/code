import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Ojumps{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		long a=Long.parseLong(bread.readLine());
		long d=6l;
		int rem=(int)(a%d);
		if(rem==0 || rem==1 || rem==3 || rem==6){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}



	}



}
