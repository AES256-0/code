import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

class Numgame2{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			if(n%4==1){
				System.out.println("ALICE");
			}
			else{
				System.out.println("BOB");
			}
			

		}
	}






}
