import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Kol15a{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String s=bread.readLine();
			int sum=0;
			for(int i=0;i<s.length();i++){
				char ch=s.charAt(i);
				if('a'<=ch && ch<='z'){
					continue;
				}
				
				sum=sum+(ch-'0');
			}
			System.out.println(sum);

		}


	}
}

