import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Error{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String a="010";
			String b="101";
			String s=bread.readLine();
			if(s.contains(a)||s.contains(b)){
				System.out.println("Good");
			}
			else{

				System.out.println("Bad");
			}


		}
	}


}
