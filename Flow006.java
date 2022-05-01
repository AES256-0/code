import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Flow006{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String s=bread.readLine();
			int sum=0;
			for(int i=0;i<s.length();i++){
				sum=sum+Integer.parseInt(s.charAt(i));
		

			}
			System.out.println(sum);
		}
	}

}

